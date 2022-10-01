import java.util.Scanner;
import java.util.stream.IntStream;

/* Exercício  13:
 * Aluno: Pedro Augusto Dias de Lima             - Matrícula: 20210026400 
 * Aluno: Jorge Alberto Macedo Costa de Oliveira - Matrícula: 20210026886
 */

public class OperacoesMatrizes {

    public static void main(String[] args) {
        double[][] matriz = geraMatriz(3, 3);

        System.out.println("A média  aritmética dos elementos abaixo da diagonal principal é: "
                + mediaMatrizAbaixoDiagonalPrincipal(matriz));
        System.out.println("A soma dos elementos acima da diagonal principal é: "
                + somaMatrizAcimaDiagonalPrincipal(matriz));
        System.out.println("A média  aritmética dos elementos da diagonal principal é: "
                + mediaMatrizDiagonalPrincipal(matriz));
        System.out.println("O menor elemento da matriz é: " + getMenorValorMatriz(matriz));
        System.out.println("O valor da soma dos elementos da matriz é: " + somaElementosMatriz(matriz));
    }

    public static double somaElementosMatriz(double[][] array) {
        double soma = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                soma += array[i][j];
            }
        }
        return soma;
    }

    public static double getMenorValorMatriz(double[][] array) {
        double menorValor = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                menorValor = array[i][j] < menorValor ? array[i][j] : menorValor;
            }
        }
        return menorValor;
    }

    public static double mediaMatrizAbaixoDiagonalPrincipal(double[][] array) {
        double media = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j + 1) {
                    media += array[i][j];
                }
            }
        }
        return media / IntStream.range(0, array.length).sum();
    }

    public static double mediaMatrizDiagonalPrincipal(double[][] array) {
        double media = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    media += array[i][j];
                }
            }
        }
        return media / array.length;
    }

    public static double somaMatrizAcimaDiagonalPrincipal(double[][] array) {
        double soma = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j - 1) {
                    soma += array[i][j];
                }
            }
        }
        return soma;
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
