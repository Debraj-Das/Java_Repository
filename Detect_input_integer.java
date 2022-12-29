import java.util.Scanner;

public class Detect_input_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = sc.hasNextInt() ;
        System.out.println(check);
        sc.close();
    }
}
