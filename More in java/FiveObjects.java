//constructor overloading

class FiveObjects

{

int a;

FiveObjects()

{

a=5;

System.out.println("Default constructor called. Value of a = "+a);

}

FiveObjects(int x)

{

a=x;

System.out.println("Parameterized constructor called. Value of a = "+a);

}



public static void main(String args[])

{

FiveObjects obj1 = new FiveObjects();

FiveObjects obj2 = new FiveObjects(1);

FiveObjects obj3 = new FiveObjects(2);

FiveObjects obj4 = new FiveObjects(3);

FiveObjects obj5 = new FiveObjects(4);

}

}
