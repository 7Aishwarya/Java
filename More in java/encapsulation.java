//Encapsulation

public class encapsulation
{  
    private String name; 
    private int roll; 
    private int age; 
    public int getage()  
    {  return age; 
    }   
    public String getname()  
    { return name; 
    }    
    public int getroll()  
    {  return roll; 
    }  
    public void setage( int newage) 
    { age = newage; 
    }   
    public void setname(String newname) 
    { name = newname; 
    }  
    public void setroll( int newroll)  
    {  roll = newroll; 
    } 

 public static void main (String[] args)  
    { 
        encapsulation obj = new encapsulation();   
        obj.setname("Aishwarya"); 
        obj.setage(21); 
        obj.setroll(5);  
        System.out.println("name: " + obj.getname()); 
        System.out.println("age: " + obj.getage()); 
        System.out.println("roll: " + obj.getroll());       
    } 
}