/* Exercício  3:
 * Aluno: Pedro Augusto Dias de Lima             - Matrícula: 20210026400 
 * Aluno: Jorge Alberto Macedo Costa de Oliveira - Matrícula: 20210026886
 */

import java.util.Scanner;

public class consumoCombustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input;

		float tempo_gasto, velocidade;

		System.out.print("Digite o tempo gasto no percurso em horas: ");
		input = new Scanner(System.in);
		tempo_gasto = input.nextFloat();

		System.out.print("Digite a velocidade média em Km/h: ");
		input = new Scanner(System.in);
		velocidade = input.nextFloat();

		float distancia = tempo_gasto * velocidade;
		float litros_usados = distancia / 12;

		System.out.printf("Velocidade média: %.2fKm/h %n", velocidade);
		System.out.printf("Tempo gasto na viagem: %.2f horas%n", tempo_gasto);
		System.out.printf("Distancia percorrida: %.2fKm%n", distancia);
		System.out.printf("Quantidade de litros utilizados na viagem: %.2f litros%n", litros_usados);

	}

}
