import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência! ");
        String agencia = scn.next();
        System.out.println("Digite o número da conta! ");
        int numero = scn.nextInt();
        System.out.println("Qual o seu nome? ");
        String nome = scn.next();
        System.out.println("Digite o saldo: ");
        double saldo = scn.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é \n" +
                "%s, sua conta é %d e seu saldo de %.2f já está disponível para saque.", nome,
                agencia, numero, saldo);
    }

}
