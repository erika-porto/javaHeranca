
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia,int numero) { 
		super(agencia,numero); // chamando o construtor já criado na classe mãe com seus parâmetros
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}
}
