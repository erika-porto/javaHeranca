
public class TesteContas {

	public static void main(String[] args) {
		
//  CRIANDO CONTA CORRENTE
		ContaCorrente cc= new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
//	CRIANDO CONTA POUPAN�A
		ContaPoupanca cp= new ContaPoupanca(222,222);
		cp.deposita(200.0);
		
//		TESTANDO M�TODO TRANSFERE
		cc.transfere(10.0, cp);
		System.out.println("cc : " + cc.getSaldo());
		System.out.println("cp : " + cp.getSaldo());
	}

}
