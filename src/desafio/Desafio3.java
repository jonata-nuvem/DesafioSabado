package desafio;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		Scanner leTeclado = new Scanner(System.in);
		System.out.println("Por favor digite uma frase: ");
		String x = leTeclado.next();
		int total = 0;

		int nome = x.length();
		System.out.println("tamanho = " + nome);

		for (int contador = 0; contador < x.length(); contador++) {
			char ch = x.charAt(contador);// charAt() = � um m�todo que que retorna apenas um caractere localizado em um
											// �ndice indicado por mim dentro da minha String.
			String x1 = String.valueOf(ch);// valueOf() = � um m�todo que recebe qualquer tipo primitivo, no caso deste
											// meu c�digo, o tipo primitivo � "char", e converte ele em String.

			if (x1.equalsIgnoreCase("a")) {
				total = total + 1;
			}
		}
		System.out.println(total);
		leTeclado.close();
	}
}