import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
public class TryWithResource {  
    public static void main(String[] args) throws FileNotFoundException { 
       FileOutputStream fileOutputStream = new FileOutputStream("beginnersbook.txt");
       try{
            String TryWithResource = "We are writing this line in the output file."; 
            byte bytes[] = TryWithResource.getBytes();       
            fileOutputStream.write(bytes);      
            System.out.println("The given String is written in the file successfully");           
       }catch(Exception e) {  
            System.out.println(e);  
        }         
    }  
}


