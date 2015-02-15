package Aula;

//ctrl + n para criar uma nova classe
public class Conta {
	private double saldo;
	private String nome;
	private int agencia;
	
	//ctrl + 3 + gcuf
	// Gerenate Constructor using field
	public Conta(String nome, int agencia, double saldo) {
		//pode tirar o super que é opcional
		//super();
		this.nome = nome;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void imprime() {
		//syso + crtl + barra
		System.out.println(nome);
		System.out.println(agencia);
		System.out.println(saldo);
		
	}
	
	

}
