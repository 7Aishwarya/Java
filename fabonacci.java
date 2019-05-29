//program to print fabonacci series using loop

import java.util.Scanner;

class fabonacci

{

public static void main(String args[])

{

int i,n,a,b,c;

System.out.println("Enter the value of n: ");

Scanner scan = new Scanner(System.in);

n=scan.nextInt();

a=0;

b=1;

System.out.println(a);

System.out.println(b);

for(i=1;i<n-1;i++)

{

c=a+b;

System.out.println(c);

a=b;

b=c;

}

}

}


