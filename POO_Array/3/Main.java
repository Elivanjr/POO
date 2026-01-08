public class Main {
	public static void main (String[] args) {
		Agenda agenda = new Agenda("Turne Mundial", 20);
		Pessoa p1 = new Pessoa("Maya", 4, 7, "1234-5678");
		
		agenda.adicionaPessoa(p1);
		agenda.removePessoa(p1);
	}
}

