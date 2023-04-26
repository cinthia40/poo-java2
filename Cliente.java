package poo_java1;

import java.text.NumberFormat;

public class Cliente {
	
	private String nome;
	private String produto;
	private double valorTotal;
	private double pagamento;
	private double troco;
	
	
	public Cliente(String nome, String produto, double valorTotal, double pagamento, double troco) {
		super();
		this.nome = nome;
		this.produto = produto;
		this.valorTotal = valorTotal;
		this.pagamento = pagamento;
		this.troco = troco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getPagamento() {
		return pagamento;
	}

	public void setPagamento(double pagamento) {
		this.pagamento = pagamento;
	}

	public double getTroco() {
		return troco;
	}

	public void setTroco(double troco) {
		this.troco = troco;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valorTotal+pagamento+troco);
		return formatoMoeda;
	}

	public void visualizar() {
		
		
	}
	
	

}