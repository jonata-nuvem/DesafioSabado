package desafio;

public class Desafio1 {

	public static void main(String[] args) {
			vetor_casa(1);
			vetor_qtd(1);
			vetor_soma(1);

	}

	private static void vetor_casa(int a) {
		int[] b = new int[64];
		int casa = a;
		
		for (int c = 0; c <= 63; c++) {
			b[c] = casa;
			casa += 1;
		}
		
		for (int c = 0; c <= 63; c++) {
			System.out.println("Casa =  " + b[c] + " ");
		}
	}
	private static void vetor_qtd(int d) {
		double[] e = new double[64];
		double qtd = d;
		
		for (int f = 0; f <= 63; f++) {
			e[f] = qtd;
			qtd = qtd*2;
		}
		
		for (int f = 0; f <= 63; f++) {
			System.out.println("Qtd: " + e[f] + " ");
		}
	}
	private static void vetor_soma(double i) {
		double[] x = new double[64];
		double soma = i;
		
		for (int j = 0; j <= 63; j++) {
			x[j] = soma;
			soma += 1;
		}
		
		for (int j = 0; j <= 63; j++) {
			System.out.println(" - Soma: " + x[j] + " ");
//			System.out.println("Casa =  " + b[c] + " " + "Qtd: " + e[f] + " " + " - Soma: " + x[j] + " ");
			}
	}
}
