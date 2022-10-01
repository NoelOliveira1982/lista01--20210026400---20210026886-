/* Exercício  7:
 * Aluno: Pedro Augusto Dias de Lima             - Matrícula: 20210026400 
 * Aluno: Jorge Alberto Macedo Costa de Oliveira - Matrícula: 20210026886
 */


package Questao7;

import java.util.Random;

public class pesquisaMercado {
	public static void main(String[] args) {
		
		int homem = 0, mulher = 0, sim = 0, nao = 0;
		Random aleatorio = new Random();
		
		for (int i = 1; i <= 2000; i++) {
			
			if (aleatorio.nextBoolean() == true) {
				homem++;
			} else {
				mulher++;
			}
		}
		for (int i = 1; i <= 2000; i++) {
			
			if (aleatorio.nextBoolean() == true) {
				sim++;
			} else {
				nao++;
			}
		}
		
		System.out.println("A) Número de pessoas que responderam 'sim':  " + sim);
		System.out.println("B) Número de pessoas que responderam 'nao':  " + nao);
		System.out.printf("C) Porcentagem de pessoas do sexo feminino: %d porcento%n", (mulher * 100) / 2000 );
		System.out.printf("D) Porcentagem de pessoas do sexo masculino: %d porcento%n", (homem * 100) / 2000 );
		
	}
}
