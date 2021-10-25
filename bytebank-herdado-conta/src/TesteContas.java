
public class TesteContas {

	public static void main(String[] args) {
		
//  CRIANDO CONTA CORRENTE
		ContaCorrente cc= new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
//	CRIANDO CONTA POUPANÇA
		ContaPoupanca cp= new ContaPoupanca(222,222);
		cp.deposita(200.0);
		
//		TESTANDO MÉTODO TRANSFERE
		cc.transfere(10.0, cp);
		System.out.println("cc : " + cc.getSaldo());
		System.out.println("cp : " + cp.getSaldo());
	}

}
