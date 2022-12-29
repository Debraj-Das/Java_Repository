import java.util.Scanner;

public class Convert_kilo_to_miles {
    public static void main(String[] args) {
        System.out.print("Enter the Kilometer :: ");
        Scanner sc = new Scanner(System.in);
        double kilo = sc.nextDouble();
        System.out.println(kilo+" is mile of "+(0.62137119*kilo));
        sc.close();
    }
}
