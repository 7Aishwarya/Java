abstract class draw 
{
abstract void rectangle();
//Method Over-riding

abstract void circle();
abstract void triangle();
}
class shape extends draw()
{
void rectangle()
{
System.out.println("Rectangle");
}
void circle()
{
System.out.println("Circle");
}
void triangle()
{
System.out.println("Triangle");
}
public static void main(String args[])
{
draw obj=new shape();
obj.triangle();
}
}