package ex02;

public class ContaCorrente {
	
	private int numeroConta;
	private String nomeCorrentista;
	private Double saldo;
	
	public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
	}
	
	public String alterarNome(String novoNome) {
		this.nomeCorrentista = novoNome;
		return nomeCorrentista;
	}
	
	public void depositar(int valor) {
		saldo += valor; 
	}
	
	public void sacar(int valor) {
		saldo -= valor; 
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public String getNomeCorrentista() {
		return nomeCorrentista;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
