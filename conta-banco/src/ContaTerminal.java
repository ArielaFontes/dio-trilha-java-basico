import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (//criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da Conta !");
            int conta = scanner.nextInt();

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Sua agência é 0810");

            System.out.println("Seu saldo é de 599,13");

            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é 0810, conta " + conta +" e seu saldo 599,13 já está disponível para saque.");
        }
    }
}