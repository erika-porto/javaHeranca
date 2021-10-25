
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia,int numero) {
		super(agencia,numero); //chamando o construtor da classe mãe com seus parâmetros
	}
	
//	criando método que adiciona 0.20 ao valor de saque
	@Override  
	public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override   //método deposita adicionado , pq o método deposita na classe mãe é abstract
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		//1% do valor do saldo
		return super.saldo * 0.01;
	}
}
