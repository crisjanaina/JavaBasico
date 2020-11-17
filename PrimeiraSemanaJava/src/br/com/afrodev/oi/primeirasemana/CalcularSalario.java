package br.com.afrodev.oi.primeirasemana;

import java.text.DecimalFormat;

public class CalcularSalario {
	
	public static void main(String[] args) {
		
		float salarioBruto = 2530; 
		float vendasDoMes = 3000;
		
		float comissaoMes = vendasDoMes * 1/10;
		float salarioTotal = salarioBruto + comissaoMes;
		DecimalFormat df =  new DecimalFormat("0.00");
		System.out.println("O salário total do funcionário é: " + df.format(salarioTotal));
		 
	}

}
