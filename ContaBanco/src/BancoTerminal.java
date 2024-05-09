import java.util.Locale;
import java.util.Scanner;

public class BancoTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("");
        System.out.println("X--------------------X");
        System.out.println("");

        System.out.println("Digite o número da sua conta: ");
        int conta = scanner.nextInt();
        System.out.println("");

        System.out.println("Digite o número da sua agência: ");
        String agencia = scanner.next();
        System.out.println("");

        System.out.println("Digite seu primeiro nome: ");
        String nome = scanner.next();
        System.out.println("");

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        System.out.println("");

        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("");

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque!");
        System.out.println("");
        System.out.println("X--------------------X");
        System.out.println("");
    }
}
