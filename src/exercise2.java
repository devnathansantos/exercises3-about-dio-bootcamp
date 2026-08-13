import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Leitura dos valores de entrada
            System.out.println("Digite o valor do saldo em conta:");
            String saldoInput = scanner.nextLine();
            System.out.println("Digite o valor do saque que deseja realizar:");
            String saqueInput = scanner.nextLine();
            int saldo = Integer.parseInt(saldoInput.trim());
            int valorSaque = Integer.parseInt(saqueInput.trim());

            // Verifica se o valor do saque é inválido
            if (valorSaque <= 0) {
                System.out.println("Valor invalido");
                return;
            }

            // Verifica se há saldo suficiente
            if (valorSaque > saldo) {
                System.out.println("Saldo insuficiente");
                return;
            }

            System.out.println("Saque realizado com sucesso!");
            System.out.println(saldo - valorSaque);

        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida");
        }

        scanner.close();
    }
}