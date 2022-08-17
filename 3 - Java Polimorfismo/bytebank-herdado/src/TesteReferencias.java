
public class TesteReferencias {
	public static void main(String[] args) {
		Gerente ge1 = new Gerente();
		ge1.setNome("marcos");
		ge1.setSalario(5000.0);
		
		EditorVideo ev1 = new EditorVideo();
		ev1.setSalario(2500.0);
		
		Designer de1 = new Designer();
		de1.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(ge1);
		controle.registra(ev1);
		controle.registra(de1);
		
		System.out.println(controle.getSoma());
	}	
}
