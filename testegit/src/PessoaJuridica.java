public class PessoaJuridica {
	private Pessoa pessoa;
	private String cnpj;
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	public void acao(){
		System.out.println("O nome da empresa e: " + pessoa.getNome());
	}
}
