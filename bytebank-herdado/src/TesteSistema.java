
public class TesteSistema {

	public static void main(String[] args) {
		Autenticavel cliente = new Cliente();
		cliente.setSenha(222);
		
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);

	}

}
