//contrato Autenticavel
   //quem asinar esse contrato precisa implementar os m�todos
       //m�todo setSenha e metodo autentica
public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
}
