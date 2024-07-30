import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in).useLocale(Locale.ENGLISH);

        clearConsole();
        System.out.println("Abertura de conta");

        System.out.print("Digite o numero da conta: ");
        int numeroConta = input.nextInt();

        System.out.print("Digite o código da ageência: ");
        String codigoAgencia = input.next();
        input.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = input.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = input.nextDouble();

        clearConsole();

        System.out.println("Olá, ".concat(nomeCliente).concat(","));
        System.out.println("obrigado por criar uma conta em nosso banco, sua agência é ".concat(codigoAgencia)
                            .concat(", sua conta " + numeroConta + " e seu saldo de r$" + saldoInicial + " ")
                            .concat("já está disponível para saque."));


        input.close();

    }

    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
