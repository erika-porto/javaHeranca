
//Gerente � um funcionario , herda as mesmas coisas da class Funcionario
public class Gerente extends Funcionario implements Autenticavel{
	private AutenticacaoUtil autenticador; //criando uma vari�vel do tipo AutenticacaoUtil
	
	public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

//	bonifica��o do gerente mudou para receber o salario dele + a % que o funcionario recebe 
	public double getBonificacao() {
		System.out.println("Chamando o m�todo bonifica��o do GERENTE");
		return super.getSalario(); // importante chamar o m�todo para que qualquer altera��o do valor da bonifica��o 
		//altere todos os c�digos
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
