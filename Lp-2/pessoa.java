import java.util.Date;
public class Pessoa {
	private String nome;
	private String cpf;
	private Date data_nascimento;
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf(){
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.nome = cpf;
	}
	
	public Date getDataNascimento(){
		return this.data_nascimento;
	}

	public void setDataNascimento(Date data_nascimento) {
		this.nome = data_nascimento;
	}
}
