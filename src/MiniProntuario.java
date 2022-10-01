import java.util.Scanner;

/* Exercício  14:
 * Aluno: Pedro Augusto Dias de Lima             - Matrícula: 20210026400 
 * Aluno: Jorge Alberto Macedo Costa de Oliveira - Matrícula: 20210026886
 */

public class MiniProntuario {
    public static void main(String[] args) {
        double[][] matriz = geraMatriz(24, 4);
        double[][] mediasDaMatriz = calculaMedia(matriz);

        for (int i = 0; i < mediasDaMatriz.length; i++) {
            for (int j = 0; j < mediasDaMatriz.length; j++) {
                System.out.println("A media do paciente " + i + " é: " + mediasDaMatriz[i][j]);
                if (mediasDaMatriz[i][j] == getMaiorValorMatriz(mediasDaMatriz)) {
                    System.out.println("Este (" + i + ") é o com maior média.");
                }
            }
        }
    }

    public static double getMaiorValorMatriz(double[][] array) {
        double maiorValor = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                maiorValor = array[i][j] > maiorValor ? array[i][j] : maiorValor;
            }
        }
        return maiorValor;
    }

    public static double[][] calculaMedia(double[][] matriz) {
        double[][] media = new double[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                media[j][i] += matriz[j][i] / matriz[i].length;
            }
        }

        return media;
    }

    public static double[][] geraMatriz(int linha, int coluna) {

        double[][] matriz = new double[linha][coluna];
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    System.out.println("Insira o valor da m[" + i + "][" + j + "]: ");
                    matriz[i][j] = sc.nextDouble();
                }
            }
        }
        return matriz;
    }
}
