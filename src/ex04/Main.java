package ex04;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Elevador elevador = new Elevador();
		
		elevador.inicializa(25, 10);
		elevador.entra(8);
		elevador.sobe(7);
		elevador.sai(4);
		
		elevador.sobe(2);
		elevador.sai(4);
		elevador.entra(5);
		
		elevador.desce(9);
		elevador.desce(5);
		
		scan.close();
	}
}
