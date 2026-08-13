import java.util.Scanner;

// Classe Conta com saldo encapsulado
class Conta {
    private int saldo;

    public Conta(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(int valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(int valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    public int getSaldo() {
        return saldo;
    }
}

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o saldo inicial da conta:");
        int saldoInicial = Integer.parseInt(scanner.nextLine());
        Conta conta = new Conta(saldoInicial);

        while (true) {
            System.out.println("Deseja depositar ou sacar?");
            String comando = scanner.nextLine().trim();

            if (comando.equals("fim")) {
                break;
            }

            String[] partes = comando.split(" ");
            String operacao = partes[0];
            int valor = Integer.parseInt(partes[1]);

            if (operacao.equals("depositar")) {
                conta.depositar(valor);
            } else if (operacao.equals("sacar")) {
                conta.sacar(valor);
            }
        }

        System.out.println(conta.getSaldo());

        scanner.close();
    }
}