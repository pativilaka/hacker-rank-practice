import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a%2 == 1){
            System.out.println("Weird");
        } else if((a >= 2) && (a < 5)){
            System.out.println("Not Weird");
        } else if((a >= 6) && (a <= 20)){
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        sc.close();
    }
}