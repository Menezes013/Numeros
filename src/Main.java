import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, s=0;
        String resp;

        Scanner type = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");
            n = type.nextInt();

            s += n; // s = s + n;
            System.out.print("Quer continuar? [S/N] ");
            resp = type.next();

        } while (resp.equals("s"));
        System.out.println("A soma de todos os valores é " + s);
    }
}