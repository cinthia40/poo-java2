package poo_java1;

public class PessoaFisica extends Cliente {
	
	private String cpf;

	public PessoaFisica(String nome, String produto, double valorTotal, double pagamento, double troco, String cpf) {
		super(nome, produto, valorTotal, pagamento, troco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {
		System.out.println("A cliente "+getNome()+" comprou o produto "+getProduto()+" que custou "+getValorTotal()+" e pagou "+getPagamento()+".");
		System.out.println("O troco foi: "+getTroco());
		System.out.println("Seu CPF é "+cpf);
	}

}
