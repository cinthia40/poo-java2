package poo_java1;

public class PessoaJuridica extends Cliente {
	
	private String cnpj;

	public PessoaJuridica(String nome, String produto, double valorTotal, double pagamento, double troco, String cnpj) {
		super(nome, produto, valorTotal, pagamento, troco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		System.out.println("A cliente "+getNome()+" comprou o produto "+getProduto()+" que custou "+getValorTotal()+" e pagou "+getPagamento()+".");
		System.out.println("O troco foi: "+getTroco());
		System.out.println("Seu CNPJ é "+cnpj);
	}

}
