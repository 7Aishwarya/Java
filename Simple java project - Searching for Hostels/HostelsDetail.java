package hostel;

import javax.swing.*; 
import hostel.First; 
import java.awt.event.*;    

public class HostelsDetail  
{    
     HostelsDetail(String name, String about, String rooms, String transport, String facilities, String price)
     {    
        JFrame f= new JFrame(name);    
        final JLabel label = new JLabel();            
        label.setHorizontalAlignment(JLabel.CENTER);    
        label.setSize(800,700);    
        JCheckBox checkbox1 = new JCheckBox("About " + name);    
        checkbox1.setBounds(150,50, 150,50);    
        JCheckBox checkbox2 = new JCheckBox("Rooms");
        checkbox2.setBounds(150,100, 150,50);
        JCheckBox checkbox3 = new JCheckBox("Transport");    
        checkbox3.setBounds(150,150, 150,50);  
        JCheckBox checkbox4 = new JCheckBox("Facilities");    
        checkbox4.setBounds(150,200, 150,50);  
        JCheckBox checkbox5 = new JCheckBox("Price");    
        checkbox5.setBounds(150,250, 150,50);  
            
        f.add(checkbox1); f.add(checkbox2); f.add(checkbox3);f.add(checkbox4);f.add(checkbox5);
        f.add(label);    
        checkbox1.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
                label.setText((e.getStateChange()==1? about :"unchecked"));    
             }    
          });    
        checkbox2.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
                label.setText((e.getStateChange()==1? rooms :"unchecked"));    
             }    
          });    
        checkbox3.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label.setText((e.getStateChange()==1? transport :"unchecked"));    
            }    
         });    
        checkbox4.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label.setText((e.getStateChange()==1? facilities :"unchecked"));    
            }    
         });    
        checkbox5.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label.setText((e.getStateChange()==1? price :"unchecked"));    
            }    
         });  
        JButton b=new JButton("GO BACK");  
        b.setBounds(70,400, 90,30);  
        f.add(b);  
       
       
        b.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) 
            {      
            	First obj = new First();
            	 
                obj.call();
                f.setVisible(false);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
      
            }  
    }); 
        
        JButton b1=new JButton("EXIT");  
        b1.setBounds(350,400, 90,30);  
        f.add(b1);  
       
       
        b1.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) 
            {      
                f.setVisible(false);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }  
    }); 
        
        
          
       // JScrollBar s=new JScrollBar();  
        //s.setBounds(200,500, 100,50);  
       // f.add(s); 
       
         
          
        
        f.setSize(600,600);    
        f.setLayout(null);    
        f.setVisible(true);   
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }    
public static void main(String args[])    
{    
    new HostelsDetail("","","","","","");    
}    
}   