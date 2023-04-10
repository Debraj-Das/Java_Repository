import java.io.FileInputStream;
import java.util.Scanner;

public class Template {
        public static void main(String[] args) throws Exception{
            FileInputStream input = new FileInputStream("input.txt");
            Scanner sc = new Scanner(input);
            
            
    
            sc.close();
            input.close();
            return ;
    }
    
}
