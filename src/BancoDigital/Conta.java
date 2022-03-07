package BancoDigital;

import java.util.List;

public class Conta {
	private static final int AGENCIA = 1;
	private static int PROXIMO = 1000;
	int agencia = 1;
	int conta;
	double saldo;
	String tipoConta;
	String cliente;

	Conta(String nome, String tipoConta) {
		this.agencia = Conta.AGENCIA;
		this.conta = PROXIMO++;
		this.cliente = nome;
		this.tipoConta = tipoConta;
		this.saldo = 0;
	}

	public double sacar(double valor) {
		return saldo -= valor;
	}

	public double depositar(double valor) {
		return saldo += valor;
	}

	public static void imprimirDados(List<Conta> listaClientes) {

		for (Conta cont: listaClientes) {
			System.out.println("Cliente: " + cont.cliente);
			System.out.println("Ag "+ cont.agencia);
			System.out.println("Conta" + cont.conta);
			System.out.println(cont.tipoConta);
			System.out.println("R$ " + cont.saldo);
		}
	}

}
