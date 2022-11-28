public class main {
	public static void main(String[] args) {
		Aluno i = new Aluno("cafu ronaldo", "123.987.129-00", new Date());
		System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + i.nome);
		System.out.println("CPF: " + i.cpf);
		System.out.println("Data de nascimento: " + i.data_nascimento.toString());
	}
