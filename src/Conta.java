

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total ++;
		System.out.println("O total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta " + this.numero);
		
	}
	
	public void deposita (double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere (double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			// destino.saldo += valor; (pode ser dessa forma tbm)
			destino.deposita(valor); // utilizando o método deposita dentro do método transfere
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	
	// dependendo da regra de negocio do banco o setNumero pode ser dispensado (se o numero for um atributo imutável)
	//public void setNumero(int numero) {
	//	this.numero = numero;
	//}
	
	
	
	public int getAgencia() {
		return this.agencia;
	}
	
	// dependendo da regra de negocio do banco o setAgencia pode ser dispensado (se a agencia for um atributo imutável)
	//public void setAgencia(int agencia) {
	//	this.agencia = agencia;
	//}
	
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	// método estático; mostra o total de contas criadas
	public static int getTotal() {
		return Conta.total;
	}
	
	
	
	
	
	
	

}
