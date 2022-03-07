package BancoDigital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<Conta> listaClientes = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int entrada;
		String nome;
		double valor;
		boolean resultado = true;

		while (resultado) {
			Menu.printarMenu();
			entrada = scan.nextInt();

			switch (entrada) {
			case 1:
				Conta contaC = new Conta(Cliente.setNome(), "Corrente");
				listaClientes.add(contaC);
				break;
			case 2:
				Conta contaP = new Conta(Cliente.setNome(), "Poupança");
				listaClientes.add(contaP);
				break;
			case 3:
				nome = Cliente.setNome();
				Menu.printarValor();
				valor = scan.nextDouble();
				for (Conta cont : listaClientes) {
					if (cont.cliente == nome) {
						cont.saldo += cont.sacar(valor);
					}
				}
				break;
			case 4:
				nome = Cliente.setNome();
				Menu.printarValor();
				valor = scan.nextDouble();
				for (Conta cont : listaClientes) {
					if (cont.cliente == nome) {
						cont.saldo += cont.depositar(valor);
					}
				}
				break;
			case 5:
				break;
			case 6:
				nome = Cliente.setNome();
				for (Conta cont : listaClientes) {
					if (cont.cliente == nome) {
						System.out.println("Cliente: " + cont.cliente);
						System.out.println("Ag "+ cont.agencia);
						System.out.println("Conta" + cont.conta);
						System.out.println(cont.tipoConta);
						System.out.println("R$ " + cont.saldo);
					}
				}
				break;
			case 77:
				Conta.imprimirDados(listaClientes);
				break;
			case 0:
				System.out.println("Obrigado!");
				resultado = false;
				break;
			default:
				System.out.println("Menu indisponível");
				break;
			}

		}
	}

}
