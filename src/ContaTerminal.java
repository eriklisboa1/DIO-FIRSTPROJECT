import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o numero da agencia");
        String nunAg = scanner.nextLine();
        System.out.println("Qual numero da conta?");
        int conta = scanner.nextInt();
        System.out.println("Qual seu nome?");
        String nome = scanner.next();
        System.out.println("Qual seu saldo?");
        double saldo = scanner.nextDouble();

        System.out.println("Ola "+nome+" obrigado por criar uma conta na nossa agencia. Seus dados é:\nAgencia: "+nunAg+"\nConta: "+conta+"\nSaldo: "+saldo);

    }
}
