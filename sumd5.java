//program to find the sum of all integers greater than 40 and less than 250 that are divisible by 5

import java.util.Scanner;

public class sumd5

{

public static void main(String args[])

{

Scanner scanner = new Scanner(System.in);
 
int i,total=0;

for(i=41;i<250;i++)

{

if(i%5==0)

total=total+i;

}

System.out.println("Sum = "+total);

}

}

