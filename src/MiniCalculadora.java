/* Exercício  1:
 * Aluno: Pedro Augusto Dias de Lima             - Matrícula: 20210026400 
 * Aluno: Jorge Alberto Macedo Costa de Oliveira - Matrícula: 20210026886
 */

import java.util.Scanner;

public class MiniCalculadora {

	public static void main(String[] args) {

		float Numero1, Numero2;
		Scanner input;

		System.out.print("Digite um numero real: ");
		input = new Scanner(System.in);
		Numero1 = input.nextFloat();

		System.out.print("Digite outro numero real: ");
		input = new Scanner(System.in);
		Numero2 = input.nextFloat();

		System.out.println();
		System.out.printf("A) A soma dos dois números é: %.2f%n", Numero1 + Numero2);
		System.out.printf("B) A subtração do primeiro pelo segundo: %.2f%n", Numero1 - Numero2);
		System.out.printf("C) A multiplicação dos dois números: %.2f%n", Numero1 * Numero2);
		System.out.printf("D) O quociente inteiro da divisão do primeiro pelo segundo: %d%n",
				(int) (Numero1 / Numero2));
		System.out.printf("E) O resto da divisão do primeiro pelo segundo: %.2f%n", (Numero1 % Numero2));
		System.out.printf("F) A raiz quadrada do segundo número: %.2f%n", Math.sqrt(Numero2));
		System.out.printf("G) O primeiro número elevado ao quadrado: %.2f%n", Math.pow(Numero1, 2));

	}

}
