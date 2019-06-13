import java.io.*;  
public class BufferedWriterExample {  
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("C:\\Users\\Aishwarya\\java\\io\\testout.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome Aishwarya");  
    buffer.close();  
    System.out.println("Success");  
    }  
}  