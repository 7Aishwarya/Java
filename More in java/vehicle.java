//method overloading

class vehicle

{

void car()

{

System.out.println("car by default");

}

void car(int x)

{

System.out.println("car 1");
}
void car(int x,int y)

{

System.out.println("car 2");
}



public static void main(String args[])

{

vehicle v = new vehicle();

v.car();

v.car(1);
v.car(1,2);
}

}
