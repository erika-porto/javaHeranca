//treinando polimorfismo
public class ControleBonificacao {
	
	private double soma; // para realizar a soma de todas as bonificacoes
	
//	//m�todo para gerente
//	public void registra(Gerente g) {
//		double boni = g.getBonificacao();
//		this.soma = this.soma + boni;
//	}
	
	//m�todo para funcion�rios, queremos ter apenas um m�todo que resolva para todos
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
//	//m�todo para editor de v�deo
//	public void registra(EditorVideo ev) {
//		double boni = ev.getBonificacao();
//		this.soma = this.soma + boni;
//	}
	
//	M�TODO DEVOLVE A SOMA DE TODAS AS BONIFICA��ES
	public double getSoma() {
		return soma;
	}
}
