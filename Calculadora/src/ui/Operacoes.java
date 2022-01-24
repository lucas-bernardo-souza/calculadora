package ui;

public class Operacoes {
	private double opUm;
	private double opDois;

	public Operacoes() {
		super();
	}

	public double getOpUm() {
		return opUm;
	}

	public void setOpUm(double opUm) {
		this.opUm = opUm;
	}

	public double getOpDois() {
		return opDois;
	}

	public void setOpDois(double opDois) {
		this.opDois = opDois;
	}
	
	public double soma() {
		return opUm + opDois;
	}
	
	public double divisao() {
		return opUm / opDois;
	}
	
	public double multiplicacao() {
		return opUm * opDois;
	}
	
	public double subtracao() {
		return opUm - opDois;
	}
}
