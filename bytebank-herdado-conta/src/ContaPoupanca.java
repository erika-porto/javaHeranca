
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia,int numero) { 
		super(agencia,numero); // chamando o construtor j� criado na classe m�e com seus par�metros
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}
}
