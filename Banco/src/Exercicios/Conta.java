package Exercicios;

//ctrl + n para criar uma nova classe
public class Conta {
	protected double saldo;
	private String nome;
	private int agencia;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
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
		// syso + crtl + barra
		System.out.println(nome);
		System.out.println(agencia);
		System.out.println(saldo);

	}

}
