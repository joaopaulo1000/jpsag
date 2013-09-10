public class Pessoa {

	private Integer idPessoa;
	private String nome;
	private String email;
	public Integer getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void acao(){
		System.out.println("Alterado na web. Agora SIM!!!");	
	}
	
	public void acao3(){
		System.out.println("Teste 003");
	}
	
	public void acao02(){
		System.out.println("Ol�, meu nome �: " + getNome() + ", e meu email �: " + getEmail());
	}
	
	public void ultimoTeste(){
		System.out.println("Este e o ultimo teste de hoje!");
	}
	
}
