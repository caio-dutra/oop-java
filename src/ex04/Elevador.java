package ex04;

public class Elevador {
	
	private int andarAtual;
	private int totalAndar;
	private int capacidade;
	private int totalPessoas;
	
	public void inicializa(int capacidade, int totalAndar) {
		this.capacidade = capacidade;
		this.totalAndar = totalAndar;
		System.out.println("----- Elevador -----");
		System.out.println("Capacidade: " + capacidade);
		System.out.println("Total de andares: " + totalAndar);
	}
	
	public void entra(int pessoas) {
		if (capacidade > (totalPessoas + pessoas)) {
			this.totalPessoas += pessoas;
			System.out.printf("\n*Entraram %s pessoas.*\n", pessoas);
		}else {
			System.out.println("\nElevador lotado! Espere o próximo.");
		}
	}
	
	public void sai(int pessoas) {
		if (capacidade > 0) {
			totalPessoas -= pessoas;
			System.out.printf("\n*Sairam %s pessoas.*\n", pessoas);
		}else {
			System.out.println("\n*Elevador vazio!*");
		}
	}
	
	public void sobe(int andar) {
		if (andarAtual != totalAndar) {
			andarAtual += andar;
			System.out.printf("*Subimos %s andares.*\n", andar);
		}else {
			System.out.println("\n*Já estamos no último andar!*");
		}
	}
	
	public void desce(int andar) {
		if (andarAtual >= 0) {
			andarAtual -= andar;
			System.out.printf("\n*Descemos %s andares.*\n", andar);
		}else { 
			System.out.println("\nJá estamos no Térreo!");
		}
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getTotalAndar() {
		return totalAndar;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public int getTotalPessoas() {
		return totalPessoas;
	}
}
