
public class CalculadorImposto {
	 private double totalImposto;
	 
//método q registra que recebe o Tributavel como parâmetro, todos que implementarem a interface Tributavel
	//pode ser utilizável por meio desse método
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		
		//para a soma do total de impostos 
		this.totalImposto += valor;
	}
	
// método para retornar o total de impostos recolhidos
	public double getTotalImposto() {
		return totalImposto;
	}
}
