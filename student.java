/*Write a program to accept 10 students marks in an array, arrange it in ascending order, convert into the following grades and print marks and grades in tabular form.
Between 40 and 50 PASS
Between 51 and 75 MERIT
and above DISTINCTION*/


import java.util.Scanner;

public class student

{

public static void main(String args[])

{

int marks[]= new int[10];

int i,j;

int temp;

String t;

String[] grade= new String[10];

Scanner scanner = new Scanner(System.in);

System.out.print("Enter marks of 10 students:\n");

for(i=0;i<10;i++)

{

marks[i]=scanner.nextInt();

if(marks[i]<40)
grade[i]="Fail";

else if(marks[i]>=40 && marks[i]<=50)

grade[i]="Pass";

else if(marks[i]>=51 && marks[i]<=75)

grade[i]="Merit";

else
grade[i]="Distinction";

}

for(i=0;i<10;i++)
{

for(j=i+1;j<10;j++){

if(marks[i]>marks[j])

{temp=marks[i];

t=grade[i];

marks[i]=marks[j];

grade[i]=grade[j];

marks[j]=temp;

grade[j]=t;

}
}
}


System.out.println("\nMarks\tGrade");

for(j=0;j<10;j++)

{
System.out.println(marks[j]+"\t"+grade[j]);

}


}
}

