
//Gerente é um funcionario , herda as mesmas coisas da class Funcionario
public class Gerente extends Funcionario implements Autenticavel{
	private AutenticacaoUtil autenticador; //criando uma variável do tipo AutenticacaoUtil
	
	public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

//	bonificação do gerente mudou para receber o salario dele + a % que o funcionario recebe 
	public double getBonificacao() {
		System.out.println("Chamando o método bonificação do GERENTE");
		return super.getSalario(); // importante chamar o método para que qualquer alteração do valor da bonificação 
		//altere todos os códigos
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
