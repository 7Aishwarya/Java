//program to implement a command line calculator

import java.util.Scanner;

class calculator

{

      public static void main(String a[])

      {

            int n,x,y,s;

            System.out.println("Enter your choice number: \n 1. Add\n 2. Subtract\n 3. Multiply\n 4. Divide\n 5. Mod\n");

            n=Integer.parseInt(a[0]);

            x=Integer.parseInt(a[1]);

            y=Integer.parseInt(a[2]);

            switch(n)

            {   

            case 1:
 
            s=x+y;

            System.out.println("sum of " + x + " and " + y +" is " +s);

            break;
 
           case 2: 
  
          s=x-y;
  
          System.out.println("subtraction of " + x + " and " + y +" is " +s);

            break;
  
          case 3: 

            s=x*y;

            System.out.println("multiplication of " + x + " and " + y +" is " +s);
 
           break;

            case 4: 
 
           s=x/y;

            System.out.println("division of " + x + " and " + y +" is " +s);

            break;

            case 5:
 
            s=x%y;

            System.out.println("mod of " + x + " and " + y +" is " +s);

            break;

            default: break;
 
           }

      }

}
