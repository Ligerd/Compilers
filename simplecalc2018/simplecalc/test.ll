declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strp = constant [4 x i8] c"%d\0A\00"
@strs = constant [3 x i8] c"%d\00"
define i32 @main() nounwind{
%x = alloca i32
%1 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32* %x)
%y = alloca i32
%2 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32* %y)
%a = alloca i32
%3 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32* %a)
%4 = load i32, i32* %x
%5 = load i32, i32* %y
%6 = load i32, i32* %a
%7 = add i32 %6, %5
%8 = add i32 %7, %4
%z = alloca i32
store i32 %8, i32* %z
%9 = load i32, i32* %z
%10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %9)
ret i32 0 }

