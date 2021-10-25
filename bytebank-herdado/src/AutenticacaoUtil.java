//criada para retirar repetição de execução de métodos nas classes Administrador , Gerente e Cliente 
public class AutenticacaoUtil {

		private int senha;
		
		public void setSenha(int senha) {
			this.senha = senha;
		}
		
		public boolean autentica(int senha) {
			if(this.senha == senha) {
				return true;
			}else {
				return false;
			}
		}
}
