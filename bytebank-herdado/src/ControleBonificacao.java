//treinando polimorfismo
public class ControleBonificacao {
	
	private double soma; // para realizar a soma de todas as bonificacoes
	
//	//método para gerente
//	public void registra(Gerente g) {
//		double boni = g.getBonificacao();
//		this.soma = this.soma + boni;
//	}
	
	//método para funcionários, queremos ter apenas um método que resolva para todos
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
//	//método para editor de vídeo
//	public void registra(EditorVideo ev) {
//		double boni = ev.getBonificacao();
//		this.soma = this.soma + boni;
//	}
	
//	MÉTODO DEVOLVE A SOMA DE TODAS AS BONIFICAÇÕES
	public double getSoma() {
		return soma;
	}
}
