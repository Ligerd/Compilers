
import java.util.HashMap;
import java.util.Stack;


enum VarType{ INT, REAL, UNKNOWN }

class Value{
    public String name;
    public VarType type;
    public Value( String name, VarType type ){
        this.name = name;
        this.type = type;
    }
}

public class LLVMActions extends MyGrammarBaseListener {

    HashMap<String, VarType> variables = new HashMap<String, VarType>();
    Stack<Value> stack = new Stack<Value>();

    @Override
    public void exitAssign(MyGrammarParser.AssignContext ctx) {
        String ID = ctx.NAME().getText();
        System.out.println(ID);
        System.out.println(ctx.ASSIGN().getText());
        if(ctx.expression().term(0).REAL()==null) {
            System.out.println("HELLO ");
        }
        System.out.println();
//        System.out.println(ctx.expression().term(0).integer().INTEGER());
//        System.out.println(ctx.value().REAL());
//        String INT = ctx.value().getText();
//        System.out.println(ctx.value().getText());
//        if( ! variables.contains(ID) ) {
//            variables.add(ID);
//            LLVMGenerator.declare(ID);
//        }
//        LLVMGenerator.assign(ID, INT);
    }

    @Override
    public void exitAdd(MyGrammarParser.AddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.add_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.add_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) );
            }
        } else {
            error(ctx.getStart().getLine(), "add type mismatch");
        }
    }


    @Override
    public void exitMult(MyGrammarParser.MultContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.mult_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.mult_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) );
            }
        } else {
            error(ctx.getStart().getLine(), "mult type mismatch");
        }
    }


    @Override
    public void exitToint(MyGrammarParser.TointContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.fptosi( v.name );
        stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
    }

    @Override
    public void exitToreal(MyGrammarParser.TorealContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.sitofp( v.name );
        stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) );
    }


    @Override
    public void exitProg(MyGrammarParser.ProgContext ctx) {
        System.out.println( LLVMGenerator.generate() );
    }

    @Override
    public void exitInt(MyGrammarParser.IntContext ctx) {
        stack.push( new Value(ctx.INT().getText(), VarType.INT) );
    }

    @Override
    public void exitReal(MyGrammarParser.RealContext ctx) {
        stack.push( new Value(ctx.REAL().getText(), VarType.REAL) );
    }

    @Override
    public void exitPrint(MyGrammarParser.PrintContext ctx) {
        String ID = ctx.ID().getText();
        VarType type = variables.get(ID);
        if( type != null ) {
            if( type == VarType.INT ){
                LLVMGenerator.printf_i32( ID );
            }
            if( type == VarType.REAL ){
                LLVMGenerator.printf_double( ID );
            }
        } else {
            error(ctx.getStart().getLine(), "unknown variable "+ID);
        }
    }

    void error(int line, String msg){
        System.err.println("Error, line "+line+", "+msg);
        System.exit(1);
    }


}
