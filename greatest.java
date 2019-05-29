//program to find the greatest of two numbers

import java.util.Scanner;

public class greatest
{

public static void main(String args[])
{

int a,b,big;

Scanner scan=new Scanner(System.in);

System.out.println("Enter two numbers: ");

a=scan.nextInt();

b=scan.nextInt();

if(a>b)

{

big=a;

}

else

{

big=b;

}

System.out.println("Grestest of two numbers is: " +big);

}

}
