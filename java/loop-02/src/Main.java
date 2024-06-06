import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        for (int i=0; i < q; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int aux = a;
            for (int j=0; j < n; j++){
                aux += Math.pow(2,j) * b;
                System.out.print(aux + " ");
            }

            System.out.println();

        }

        sc.close();
    }
}