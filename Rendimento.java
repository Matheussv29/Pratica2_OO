package br.com.newton.poo.aula3.ex2;

import java.text.NumberFormat;
public class Rendimento {
	private double investInicial;
	private double taxaRendimento;	
	private int numMeses;
	
	public Rendimento(double investInicial, double taxaRendimento, int numMeses) {
		super();
		this.investInicial = investInicial;
		this.taxaRendimento = taxaRendimento;
		this.numMeses = numMeses;
	}

	public double getInvestInicial() {
		return investInicial;
	}

	public void setInvestInicial(double investInicial) {
		this.investInicial = investInicial;
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public int getNumMeses() {
		return numMeses;
	}

	public void setNumMeses(int numMeses) {
		this.numMeses = numMeses;
	}
	
	public void calculaRendimento() {
		double rendimentoMes;
		rendimentoMes=getInvestInicial(); //Rendimento começa com o valor inicial!
		System.out.println("Valor Inicial:" + NumberFormat.getCurrencyInstance().format(getInvestInicial()));
		System.out.println("Taxa de Juros:" + NumberFormat.getPercentInstance().format(getTaxaRendimento()/100));
		for(int i=0;i<getNumMeses();i++) {
			rendimentoMes=rendimentoMes*getTaxaRendimento()/100+rendimentoMes;
			System.out.printf("Mês " + (i+1) + ": " + NumberFormat.getCurrencyInstance().format(rendimentoMes));
			
			
		}
	}

}
