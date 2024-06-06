import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < q; i++) {

            String a = sc.nextLine();
            System.out.println(whoCanFit(a));

        }

        sc.close();

    }
        static String whoCanFit (String numString){

            String resposta = "";

            try {
                Long a = Long.parseLong(numString);
                resposta = numString + resposta.concat(" can be fitted in: \n");

                if ((a >= Byte.MIN_VALUE) && (a <= Byte.MAX_VALUE)) {
                    resposta = resposta.concat("* byte \n* short \n* int \n* long");

                } else if ((a >= Short.MIN_VALUE) && (a <= Short.MAX_VALUE)) {
                    resposta = resposta.concat("* short \n* int \n* long");

                } else if ((a >= Integer.MIN_VALUE) && (a <= Integer.MAX_VALUE)) {
                    resposta = resposta.concat("* int \n* long");

                } else {
                    resposta = resposta.concat("* long");
                }
            } catch (NumberFormatException e) {
                resposta = numString + resposta.concat(" can't be fitted anywhere.");
            }

            return resposta;
        }
    }