/* Exercício  5:
 * Aluno: Pedro Augusto Dias de Lima             - Matrícula: 20210026400 
 * Aluno: Jorge Alberto Macedo Costa de Oliveira - Matrícula: 20210026886
 */

package Questao5;

import java.util.Random;

public class eleicaoSindical {
	public static void main(String[] args) {
		
		Random geradorAleatorio = new Random();
		
		int candidato_A = 0, candidato_B = 0, candidato_C = 0, branco = 0, nulo = 0, voto;
		int total_eleitores = 150;
		
		for (int i = 1; i <= 150; i++ ) {
			
			voto = geradorAleatorio.nextInt(5);
			
			if (voto == 0) {
				nulo++;
			} else if (voto == 1) {
				
		    	branco++;
		    } else if (voto == 2) {
		    	
		    	candidato_A++;
		    } else if (voto == 3) {
		    	
		    	candidato_B++;
		    } else if (voto == 4) {
		    	
		    	candidato_C++;
		    }
			
		}
		
		int votos_validos = candidato_A + candidato_B + candidato_C;
		
		System.out.println("Número total de eleitores: " + total_eleitores);
		System.out.printf("Porcentagem de votos válidos: %d porcento%n", (votos_validos * 100) / 150);
		System.out.printf("Porcentagem de votos no candidato A: %d porcento%n", (candidato_A * 100) / 150);
		System.out.printf("Porcentagem de votos no candidato B: %d porcento%n", (candidato_B * 100) / 150);
		System.out.printf("Porcentagem de votos no candidato C: %d porcento%n", (candidato_C * 100) / 150);
		System.out.printf("Porcentagem de votos nulos: %d porcento%n", (nulo * 100) / 150);
		System.out.printf("Porcentagem de votos em branco: %d porcento%n", (branco * 100) / 150);
		
		
		}
}
