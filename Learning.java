import java.io.FileInputStream;
import java.util.Scanner;

public class Learning {
    public static void main(String[] args) throws Exception {
        // input take from files 
        // if you want to take input from console then input place system.in write
        FileInputStream input = new FileInputStream("input.txt");
        Scanner sc = new Scanner(input);

        int i = sc.nextInt();

        while (i>0) {
            System.out.println(i);
            i-- ;
        }

        sc.close();
        input.close();
        return;
    }

}
