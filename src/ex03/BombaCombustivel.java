package ex03;

public class BombaCombustivel {
	
	private String tipoCombustivel;
	private Double valorPorLitro;
	private Double quantidadeCombustivel;
	
	public Double abastecerPorValor(Double valor) {
		Double litrosAbastecidos = valor / valorPorLitro;
		quantidadeCombustivel -= litrosAbastecidos;
		return litrosAbastecidos;
	}
	
	public Double abastecerPorLitros(Double litrosParaAbastecer) {
		Double precoSerPago = litrosParaAbastecer * valorPorLitro;
		quantidadeCombustivel -= litrosParaAbastecer;
		return precoSerPago;
	}
	
	
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public Double getValorPorLitro() {
		return valorPorLitro;
	}
	public Double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public void setValorPorLitro(Double valorPorLitro) {
		this.valorPorLitro = valorPorLitro;
	}
	public void setQuantidadeCombustivel(Double quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
}
