package br.com.afrodev.oi.primeirasemana;

public class SomandoValores {

	public static void main(String[] args) {

		int a = 10;
		int b = 15;

		int soma = a + b;

		System.out.println(a + "+" + b + "=" + soma);

		if (a > b) {
			soma += 2;
			System.out.println("Ocorreu um ajuste no valor da soma pois " + a + " > " + b);
		} else {
			soma -= 5;
			System.out.println("Ocorreu um ajuste no valor da soma pois " + a + " < " + b);
		}
		
	}

}
