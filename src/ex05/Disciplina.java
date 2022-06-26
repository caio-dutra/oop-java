package ex05;

public class Disciplina {
	
	private String nome;
	private int matricula;
	private Double notaProva1;
	private Double notaProva2;
	private Double notaTrabalho;
	
	public Double media() {
		return ((notaProva1*2.5) + (notaProva2*2.5) + (notaTrabalho*2)) / (2.5 + 2.5 + 2) ;
	}

	public Double provaFinal() {
		if (media() >= 7) {
			return 0d;
		}else {
			return 7 - media();
		}
	}
	
	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public Double getNotaProva1() {
		return notaProva1;
	}

	public Double getNotaProva2() {
		return notaProva2;
	}

	public Double getNotaTrabalho() {
		return notaTrabalho;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setNotaProva1(Double notaProva1) {
		this.notaProva1 = notaProva1;
	}

	public void setNotaProva2(Double notaProva2) {
		this.notaProva2 = notaProva2;
	}

	public void setNotaTrabalho(Double notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
	
}
