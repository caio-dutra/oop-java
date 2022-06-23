package ex01;

import java.time.LocalDate;

public class Pessoa {
	
	private LocalDate dataAtual = LocalDate.now();
	private int anoAtual = dataAtual.getYear();

	private String nome;
	private int anoNascimento;
	private Double altura;
	
	public void imprimirDados() {
		System.out.println("nome: " + nome);
		System.out.println("Data de nascimento: " + anoNascimento);
		System.out.println("altura: " + altura);
	}
	
	public int calcularIdade() {
		return anoAtual - anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public Double getAltura() {
		return altura;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	
}
