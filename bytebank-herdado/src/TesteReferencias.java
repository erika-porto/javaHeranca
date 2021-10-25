
public class TesteReferencias {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		Funcionario f = new Gerente();
		f.setSalario(2000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Funcionario d=new Designer();
		d.setSalario(2000.0);
		
		
		ControleBonificacao controle = new ControleBonificacao(); //criando objeto controleBonificacao q será registrado
		controle.registra(g1); //passando o novo objeto para ser registrado
		controle.registra(f);
		controle.registra(ev);
		controle.registra(d);
		System.out.println(controle.getSoma());
		
		
		
	}

}
