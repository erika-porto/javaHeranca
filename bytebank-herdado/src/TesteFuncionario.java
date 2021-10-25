
public class TesteFuncionario {
	public static void main(String[] args) {
//		criando o primeiro funcionario
		Funcionario nico= new Gerente();
		
		nico.setNome("Nico Steppat");
		nico.setCpf("3333333333-9");
		nico.setSalario(2600.0);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
}
