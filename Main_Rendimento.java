package br.com.newton.poo.aula3.ex2;

import java.util.Scanner;

public class Main_Rendimento {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor inicial do Rendimeto:");
		double vrInicial = ler.nextDouble();
		
		System.out.println("Digite a taxa de juros:");
		double txJuros = ler.nextDouble();
		
		System.out.println("Digite o numero de meses para o Rendimento:");
		int numMeses = ler.nextInt();
		
		Rendimento r1 = new Rendimento (vrInicial, txJuros, numMeses);
		r1.calculaRendimento();
ler.close();
	}

}
