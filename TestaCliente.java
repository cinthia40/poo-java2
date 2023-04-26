package poo_java1;


public class TestaCliente {
	public static void main(String[] args) {
		PessoaFisica cliente1 = new PessoaFisica ("Carla","Vestido",79,85,6, "XXX.XXX.XXX-XX");
		PessoaFisica cliente2 = new PessoaFisica ("Beatriz","Tênis",90,90,0, "YYY.YYY.YYY-YY");
		PessoaJuridica cliente3 = new PessoaJuridica ("Carla","Vestido",79,85,6, "XX.XXX.XXX/XXXX-XX");
		PessoaJuridica cliente4 = new PessoaJuridica ("Beatriz","Tênis",90,90,0, "YY.YYY.YYY/YYYY-YY");
		    
		cliente1.visualizar();
		cliente2.visualizar();
		cliente3.visualizar();
		cliente4.visualizar();

}
}
