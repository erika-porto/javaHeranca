
public class Cliente implements Autenticavel {
//	private int senha; pode ser eliminado pq estamos chamando a classe de AutenticaUtil
	private AutenticacaoUtil autenticador; //criando uma variável do tipo AutenticacaoUtil
	
	//criando novo construtor que recebera objeto AutenticacaoUtil
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha); // estou dizendo que eu deleguei a funcao de setar a Senha para autenticador
		//que é do tipo AutenticacaoUtil que traz os metodos dentro da classe
	}

	@Override
	public boolean autentica(int senha) {
//		RETIRADA DO CÓDIGO ABAIXO DEVIDO A CRIAÇÃO DA CLASSE AutenticacaoUtil que traz o metodo setSenha e autentica 
//		if (this.senha == senha) {
//			return true;
//		} else {
//			return false;
//		}
		
		return this.autenticador.autentica(senha);//delegando a funcao de autenticar a classe AutenticacaoUtil chamando a variavel autenticador

	}

}
