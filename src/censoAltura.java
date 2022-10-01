/* Exercício  6:
 * Aluno: Pedro Augusto Dias de Lima             - Matrícula: 20210026400 
 * Aluno: Jorge Alberto Macedo Costa de Oliveira - Matrícula: 20210026886
 */

package Questao6;


public class censoAltura {
	public static void main(String[] args) {
		double altura[] = {1.56, 1.76, 1.72, 1.67, 1.89, 2.00, 1.93, 1.59, 1.83, 1.98, 1.71, 1.67, 1.49, 1.69, 
							1.82, 1.94, 1.55, 1.78, 1.66, 1.88} ;
		char sexo[] = {'M','F', 'M', 'M', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'F', 'M', 'M', 'F', 'M', 'F'};
		double maior = 0;
		double menor = 0;
		double somaAltura = 0;
		int qtd_homens = 0;
		double aux = 0;
		
		//Maior e menor altura
		for (int i = 0; i <= 19; i++) {
			if (altura[i] > maior) {
				maior = (altura[i]);
			}
		}
		aux = maior;
		for (int i = 0; i <= 19; i++) {
			if (altura[i] < aux) {
				menor = altura[i];
				aux = menor;
			}
		}
		// Media de altura das mulheres
		for (int i = 0; i <= 19; i++) {
			if (sexo[i] == 'F') {
				somaAltura = somaAltura + altura[i];
			}
		}
		double media_altura = somaAltura / 10;
		//Quantidade de homens
		for (int i = 0; i <= 19; i++) {
			if (sexo[i] == 'M') {
				qtd_homens++;
			}
		}
		
		System.out.println("A maior altura: " + maior);
		System.out.println("A menor altura: " + menor);
		System.out.printf("A média da altura das mulheres: %.2f%n", media_altura);
		System.out.println("A Quantidade de homens: " + qtd_homens);
		
	}
	                                       

}
