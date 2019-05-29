//java program to accept 10 numbers in an array and compute the square of these numbers. And then print the sum of these numbers

import java.util.Scanner;

public class SqSum

{

public static void main(String args[])

{

Scanner scanner = new Scanner(System.in);
 
int n[]= new int[10];

int sq[]= new int[10];

int i,total=0;

System.out.println("Enter 10 numbers:");

for(i=0;i<10;i++)

{

n[i]=scanner.nextInt();

sq[i]=n[i]*n[i];

total=total+sq[i];

}

System.out.println("Sum of squares of 10 numbers= "+total);

}

}
