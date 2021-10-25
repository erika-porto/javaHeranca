
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia,int numero) {
		super(agencia,numero); //chamando o construtor da classe m�e com seus par�metros
	}
	
//	criando m�todo que adiciona 0.20 ao valor de saque
	@Override  
	public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override   //m�todo deposita adicionado , pq o m�todo deposita na classe m�e � abstract
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		//1% do valor do saldo
		return super.saldo * 0.01;
	}
}
