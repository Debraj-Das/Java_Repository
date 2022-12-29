import java.util.Scanner;

public class deb {
    public static void main(String[] args) {
        // System.out.print("Hello Java, ");
        // System.out.println("I am happy to start coding with you");
        // int x = 0 ;
        // System.out.println(x);
        // ++x ;
        // System.out.println(x);
        // System.out.println("nice to meet all of you");

        // System.out.print("Sum of the those three integer is :: ");
        // byte a = 3 ;
        // byte b = 89 ;
        // byte c = 43 ;
        // int sum = a+b+c ;
        // System.out.println(sum);
        // System.out.println(Character.SIZE);

        // for(char a = 0 ; a < 100000 ; ++a)
        // System.out.println(a);
        // char a = 'e' ;
        // for(int i = 0 ; i<200 ; ++i)
        // System.out.println((char)i);

        // char a = ' ';
        // System.out.println(a);  // sout for System.out.println()
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Subject marks :: ");
        // int arr[] = new int[5] ;
        int sum = 0 ;
        for(int i = 0;i < 5 ; ++i){
            System.out.print((i+1)+") ");
            sum += sc.nextInt();
        }
        System.out.println(sum/5.0);
        sc.close();
    }
}
