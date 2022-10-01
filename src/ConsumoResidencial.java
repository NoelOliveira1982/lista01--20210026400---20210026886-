/* Exercício  2:
 * Aluno: Pedro Augusto Dias de Lima             - Matrícula: 20210026400 
 * Aluno: Jorge Alberto Macedo Costa de Oliveira - Matrícula: 20210026886
 */

package Questao2;

import java.util.Scanner;

public class ConsumoResidencial {

	public static void main(String[] args) {

		Scanner input;
		double salario, quilowatts;
		
		System.out.print("Digite o valor do salario: ");
		input = new Scanner(System.in);
		salario = input.nextDouble();
		
		System.out.print("Digite a quantidade de quilowatts gasta pela residencia: ");
		input = new Scanner(System.in);
		quilowatts = input.nextDouble();
		
		double valorQuilowatt = salario * 1/5;
		double valorSerPago = valorQuilowatt * quilowatts;
		double valorDesconto = (valorSerPago - (valorSerPago * 0.15));
		
		System.out.printf("O valor, em reais, de cada quilowatt: %.2f R$%n", (float)valorQuilowatt);
		System.out.printf("O valor, em reais, a ser pago por essa residência: %.2f R$%n", (float)valorSerPago);
		System.out.printf("O valor a ser pago por essa residência com um desconto de 15 porcento: %.2f R$%n", (float)valorDesconto);
	}

}
