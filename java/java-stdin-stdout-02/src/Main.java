import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        sc.close();
    }
}