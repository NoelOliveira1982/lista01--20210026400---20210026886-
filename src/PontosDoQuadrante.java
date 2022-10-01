import java.util.ArrayList;
import java.util.Scanner;

/* Exercício  11:
 * Aluno: Pedro Augusto Dias de Lima             - Matrícula: 20210026400 
 * Aluno: Jorge Alberto Macedo Costa de Oliveira - Matrícula: 20210026886
 */

public class PontosDoQuadrante {

    private static class Ponto {
        private double x;
        private double y;

        private Ponto(double x, double y) {
            this.x = x;
            this.y = y;
        }

        private int getQuadrante() {
            if (x == y) {
                return 0;
            }
            if (x > 0 && y > 0) {
                return 1;
            }
            if (x < 0 && y > 0) {
                return 2;
            }
            if (x < 0 && y < 0) {
                return 3;
            }
            return 4;
        }
    }

    public static void main(String[] args) {
        int quantidadeVetores = 0;
        ArrayList<Ponto> listPontos = new ArrayList<Ponto>();

        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Informe a quantidade de pessoas, não podendo ultrapassar 10: ");
                quantidadeVetores = sc.nextInt();
            } while (quantidadeVetores > 10 || quantidadeVetores <= 0);

            for (int i = 0; i < quantidadeVetores; i++) {
                System.out.println("Informe x: ");
                double xAux = sc.nextDouble();
                System.out.println("Digite y: ");
                double yaAux = sc.nextDouble();

                listPontos.add(new Ponto(xAux, yaAux));
            }

            for (Ponto ponto : listPontos) {
                System.out.println(
                        "Este vetor (" + ponto.x + ", " + ponto.y + ") está no quadrante: " + ponto.getQuadrante());
            }
        }
    }
}
