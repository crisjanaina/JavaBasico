package br.com.afrodev.oi;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		//System.out.println(c.realizarMultiplicacao(10));
		
		//System.out.println(c.realizaSoma(10));
		
		//System.out.println(Calculadora.valorPadraoSomaInteiro);
		
		byte b = 100;
		short s = 32; // - 32000 até 32000
		int i = 30; // - 2147483648 até 2147483648
		long l = 20l;// - 9223372036854775808 até 9223372036854775808
		
		char ch =  30; // 'a'
		
		//System.out.println(ch);
		
		
		
		float f = 10.3443f; // 6
		double d = 12.343d; // 15
		boolean bol = true; // valores true ou false
		

		
		Scanner sc = new Scanner(System.in);
		
		String nome =sc.nextLine();
		System.out.println(nome);
		float numF = sc.nextFloat();
		System.out.println(numF);
		int num1 = sc.nextInt();
		System.out.println(num1);
		byte byte1 = sc.nextByte();
		System.out.println(byte1);
		long lgl = sc.nextLong();
		System.out.println(lgl);
		boolean bl = sc.nextBoolean();
		System.out.println(bl);
		double num2 = sc.nextDouble();
		System.out.println(num2);
		
		
	}

}
