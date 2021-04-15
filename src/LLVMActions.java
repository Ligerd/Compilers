
import java.util.HashMap;
import java.util.Stack;


enum VarType{ INT, REAL, VARIABLE , UNKNOWN }

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

//    @Override
//    public void exitValue(MyGrammarParser.ValueContext ctx) {
//        if( ctx.ID() != null ){
//            String ID = ctx.ID().getText();
//            if( variables.contains(ID) ) {
//                LLVMGenerator.load( ID );
//                stack.push( "%"+(LLVMGenerator.reg-1) );
//            } else {
//                error(ctx.getStart().getLine(), "unknown variable "+ID);
//            }
//        }
//        if( ctx.INT() != null ){
//            stack.push( ctx.INT().getText() );
//        }
//    }

//    @Override public void exitValuForVariable(MyGrammarParser.ValuForVariableContext ctx) {
//        System.out.println(stack.pop().name);
//        System.out.println("sajkdjaTEST");
//        if(ctx.value().getText()!=null){
//            System.out.println(ctx.value());
//            String ID = ctx.value().getText();
//            if(variables.containsKey(ID) && variables.get(ID)==VarType.INT){
//                LLVMGenerator.load_i32( ID );
//                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
//            }else if(variables.containsKey(ID) && variables.get(ID)==VarType.REAL){
//                LLVMGenerator.load_i32( ID );
//                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) );
//            }else{
//                error(ctx.getStart().getLine(), "unknown variable "+ID);
//            }
//        }
//    }
    
    
    @Override
    public void exitAssign(MyGrammarParser.AssignContext ctx) {
        String ID = ctx.ID().getText();
        System.out.println(ID);
        Value v = stack.pop();
        System.out.println(v.name);
        variables.put(ID, v.type);
        if( v.type == VarType.INT ){
            LLVMGenerator.declare_i32(ID);
            LLVMGenerator.assign_i32(ID, v.name);
        }
        if( v.type == VarType.REAL ) {
            LLVMGenerator.declare_double(ID);
            LLVMGenerator.assign_double(ID, v.name);
        }
    }

    @Override
    public void exitAdd(MyGrammarParser.AddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        System.out.println(v2.type);
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
    public void exitMinus(MyGrammarParser.MinusContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.sub_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.sub_double(v1.name, v2.name);
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
    public void exitDiv(MyGrammarParser.DivContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.div_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.div_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) );
            }
        } else {
            error(ctx.getStart().getLine(), "mult type mismatch");
        }
    }

    @Override
    public void exitProg(MyGrammarParser.ProgContext ctx) {
        System.out.println( LLVMGenerator.generate() );
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
    public void exitInt(MyGrammarParser.IntContext ctx) {
        System.out.println(ctx.INT().getText());
        stack.push( new Value(ctx.INT().getText(), VarType.INT) );
    }

    @Override
    public void exitReal(MyGrammarParser.RealContext ctx) {
        stack.push( new Value(ctx.REAL().getText(), VarType.REAL) );
    }

    @Override
    public void exitIdentifiers(MyGrammarParser.IdentifiersContext ctx) {
        System.out.println(ctx.ID().getText());
        stack.push( new Value(ctx.ID().getText(), VarType.VARIABLE) );
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

    @Override
    public void exitRead(MyGrammarParser.ReadContext ctx) {
        String ID = ctx.ID().getText();
    }

    void error(int line, String msg){
        System.err.println("Error, line "+line+", "+msg);
        System.exit(1);
    }
}
