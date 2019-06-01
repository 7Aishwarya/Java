//inheritance

import java.util.Scanner;


class scs

{

public String name, sapid;

public scs()

{
System.out.println("Belongs to school of computer science");

}

public void display(String name, String sapid)

{
System.out.println("Name:" +name+ "  sapid:" +sapid);

}

}



class department extends scs

{
public void cybernatics()

{
System.out.println("Works in Cybernatics Department");

}

public void virtualization()

{
System.out.println("Works in Virtualization Department");

}

}



class game extends scs

{public void cricket()

{
System.out.println("Plays cricket");

}

public void badminton()

{
System.out.println("plays badminton");

}

}


public class inheritance

{
public static void main(String[] args)

{

int n,a;

Scanner scan=new Scanner(System.in);

department obj=new department();

game o=new game();

System.out.println("Enter the name and sapid of the faculty:");

obj.name=scan.nextLine();

obj.sapid=scan.nextLine();

System.out.println("Select department number of the faculty:\n1.Cybernatics\n2.Virtualization");

n=scan.nextInt();

System.out.println("Select the game: \n1.Cricket\n2.Badminton");

a=scan.nextInt();

obj.display(obj.name,obj.sapid);

if(n==1)

{

obj.cybernatics();

if(a==1)
o.cricket();

if(a==2)
o.badminton();

}

if(n==2)

{

obj.virtualization();

if(a==1)
o.cricket();

if(a==2)
o.badminton();

}

}
}
