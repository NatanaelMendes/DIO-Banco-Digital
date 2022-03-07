package BancoDigital;

import java.util.Scanner;

public class Cliente {

	public static String setNome() {
		String nome;
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o nome do cliente:");
		nome = scan.next();
		return nome;
	}
}
