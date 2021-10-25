
public class CalculadorImposto {
	 private double totalImposto;
	 
//m�todo q registra que recebe o Tributavel como par�metro, todos que implementarem a interface Tributavel
	//pode ser utiliz�vel por meio desse m�todo
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		
		//para a soma do total de impostos 
		this.totalImposto += valor;
	}
	
// m�todo para retornar o total de impostos recolhidos
	public double getTotalImposto() {
		return totalImposto;
	}
}
