package ex03;

public class Main {

	public static void main(String[] args) {

		BombaCombustivel bomba = new BombaCombustivel();
		
		bomba.setTipoCombustivel("Gasolina");
		bomba.setValorPorLitro(4.59);
		bomba.setQuantidadeCombustivel(500.0);
		
		Double abastecido1 = bomba.abastecerPorValor(100.0);
		Double abastecido2 = bomba.abastecerPorLitros(50.0);
		
		bomba.setValorPorLitro(5.59);
		Double abastecido3 = bomba.abastecerPorLitros(50.0);
	}
}
