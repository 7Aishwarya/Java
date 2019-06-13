package hostel;
import javax.swing.*; 
import java.awt.*;  
import java.awt.event.*;
import hostel.DialogExample;

public class First 
{
	public static JDialog d; 
	
	public void call()
	{
    JFrame f= new JFrame("HOSTEL");  
    JLabel l1,l2,l3,l4,l5,l6;  
    l1=new JLabel("-------------HOSTELS IN DEHRADUN-------------");  
    l1.setBounds(10,10, 400,50);  
    l2=new JLabel("1. Vatika Girls Hostel");  
    l2.setBounds(20,40, 300,30);  
    l3=new JLabel("2. Vatika Boys Hostel");  
    l3.setBounds(20,60, 300,30);  
    l4=new JLabel("3. Aman Residency (Boys)");  
    l4.setBounds(20,80, 300,30);  
    l5=new JLabel("4. Sarthak Boys Hostel");  
    l5.setBounds(20,100, 300,30);  
    l6=new JLabel("5. Pride Girls Hostel");  
    l6.setBounds(20,120, 300,30);  
    f.add(l1); f.add(l2); f.add(l3); f.add(l4); f.add(l5); f.add(l6); 
    f.setSize(300,300);  
    f.setLayout(null);  
    f.setVisible(true);
    String country[]={"Vatika Girls Hostel","Vatika Boys Hostel","Aman Residency (Boys)","Sarthak Boys Hostel","Pride Girls Hostel"};        
    JComboBox cb=new JComboBox(country);    
    cb.setBounds(30, 190,170,30);    
    f.add(cb);        
    f.setLayout(null);    
    f.setSize (400,500);    
    f.setVisible(true);  
	
    JButton b=new JButton(new ImageIcon("C:\\Users\\Aishwarya\\Pictures\\Saved Pictures\\images.jpg"));    
    b.setBounds(60,230,90, 30);    
    f.add(b);    
    b.addActionListener ( new ActionListener()  
    {  
        public void actionPerformed( ActionEvent e )  
        {  
             f.setVisible(false);  
        	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	// new DialogExample();
        }  
    }); 
    b.addActionListener(new ActionListener() {  
        public void actionPerformed(ActionEvent f) {       
String data = (String) cb.getItemAt(cb.getSelectedIndex());
//System.out.println(data);
if(data.equals("Vatika Girls Hostel")==true)
{
	details obj1= new details();
	obj1.VatikaGirls();
}
if(data.equals("Vatika Boys Hostel")==true)
{
	details obj2= new details();
	obj2.VatikaBoys();
}
if(data.equals("Aman Residency (Boys)")==true)
{
	details obj3= new details();
	obj3.aman_residency();
}
if(data.equals("Sarthak Boys Hostel")==true)
{
	details obj4= new details();
	obj4.sarthak();
}
else if(data.equals("Pride Girls Hostel")==true)
{
	details obj5= new details();
	obj5.pride();
}
}  
});
    
    JButton b1=new JButton("EXIT");  
    b1.setBounds(275,410, 90,30);  
    f.add(b1);  
   
   
    b1.addActionListener(new ActionListener() {  
        public void actionPerformed(ActionEvent e) 
        {      
            f.setVisible(false);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }  
}); 
       
   // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //f.dispose();
    //JSecondFrame secondFrame = new JSecondFrame();
    }
	
    public static void main(String args[])  
    { 
    	First obj=new First();
    	obj.call();
    } 

}

