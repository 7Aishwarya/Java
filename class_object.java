//program using classes and objects in java

class operations

{

void add(int x,int y)

{

int z;

z=x+y;

System.out.println("Sum of " +x+" and "+y +" is: " +z);

}

void subtract(int a, int b)

{

int c;

c=a-b;

System.out.println("Subtraction of " +a+" and "+b +" is: " +c);

}

}

class class_object

{

public static void main(String args[])

{

operations obj = new operations();

obj.add(5,2);

obj.subtract(5,2);

}

}
