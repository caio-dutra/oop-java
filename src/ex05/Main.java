package ex05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Disciplina ingles = new Disciplina();
		
		ingles.setNome("Caio");
		ingles.setMatricula(121619);
		ingles.setNotaProva1(4.5);
		ingles.setNotaProva2(6.5);
		ingles.setNotaTrabalho(2.5);
		
		Double media = ingles.media();
		Double provaFinal = ingles.provaFinal();
		
		System.out.printf("Média do aluno: %.1f \n", media);
		System.out.printf("Nota necessária para a prova final: %.1f \n", provaFinal);
		
		scan.close();
	}
}
