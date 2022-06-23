package ex02;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente minhaConta = new ContaCorrente(3, "Caio", 0);
		
		minhaConta.alterarNome("Carlos");
		minhaConta.depositar(500);
		minhaConta.sacar(200);
		
		System.out.println("Nome: " + minhaConta.getNomeCorrentista());
		System.out.println("Número da conta: " + minhaConta.getNumeroConta());
		System.out.println("Saldo: " + minhaConta.getSaldo());
	}
}
