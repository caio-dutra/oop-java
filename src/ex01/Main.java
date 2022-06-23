package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		
		p.setNome("Caio");
		p.setAnoNascimento(2001);
		p.setAltura(1.82);
		
		p.imprimirDados();
		
		int idade = p.calcularIdade();
		
		System.out.println("Idade: " + idade);
		
		scan.close();
	}

}
