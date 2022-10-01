/* Exercício  4:
 * Aluno: Pedro Augusto Dias de Lima             - Matrícula: 20210026400 
 * Aluno: Jorge Alberto Macedo Costa de Oliveira - Matrícula: 20210026886
 */

import java.util.Scanner;

public class volumeEsfera {
	public static void main(String[] args) {
		Scanner input;
		float raio;

		System.out.print("Digite o valor do raio da esfera em centímetros: ");
		input = new Scanner(System.in);
		raio = input.nextFloat();
		System.out.printf("O volume dessa esfera é: %.2f cm", (4 * Math.PI * Math.pow(raio, 3)) / 3);

	}

}
