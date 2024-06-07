import java.util.Scanner;

public class Main {

    static int b;
    static int h;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        b = sc.nextInt();
        h = sc.nextInt();

        if ((b > 0) && (h > 0)){
            System.out.println(b*h);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

        sc.close();
    }
}