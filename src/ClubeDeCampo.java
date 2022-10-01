import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/* Exercício  10:
 * Aluno: Pedro Augusto Dias de Lima             - Matrícula: 20210026400 
 * Aluno: Jorge Alberto Macedo Costa de Oliveira - Matrícula: 20210026886
 */

public class ClubeDeCampo {

    private static class Pessoa {
        private int idade;
        private double altura;

        private Pessoa(int idade, double altura) {
            this.idade = idade;
            this.altura = altura;
        }

        private int getIdade() {
            return this.idade;
        }

        private double getAltura() {
            return this.altura;
        }
    }

    public static void main(String[] args) {
        int quantidadePessoas = 0;
        ArrayList<Pessoa> listPessoas = new ArrayList<Pessoa>();

        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Informe a quantidade de pessoas, não podendo ultrapassar 10: ");
                quantidadePessoas = sc.nextInt();
            } while (quantidadePessoas > 10 || quantidadePessoas <= 0);

            for (int i = 0; i < quantidadePessoas; i++) {
                System.out.println("Informe a idade: ");
                int idadeAux = sc.nextInt();
                System.out.println("Digite a altura: ");
                double alturaAux = sc.nextDouble();

                listPessoas.add(new Pessoa(idadeAux, alturaAux));
            }

            System.out.println("Altura média para pessoas com até 10 anos: " + listPessoas.stream()
                    .filter(pessoa -> pessoa.getIdade() <= 10)
                    .reduce(0.0, (sum, pessoa) -> sum + pessoa.getAltura(), Double::sum)
                    / listPessoas.stream()
                            .filter(pessoa -> pessoa.getIdade() <= 10).toArray().length);

            System.out.println("Altura média para pessoas de 11 a 15 anos: " + listPessoas.stream()
                    .filter(pessoa -> pessoa.getIdade() > 10 && pessoa.getIdade() <= 15)
                    .reduce(0.0, (sum, pessoa) -> sum + pessoa.getAltura(), Double::sum)
                    / listPessoas.stream()
                            .filter(pessoa -> pessoa.getIdade() > 10 && pessoa.getIdade() <= 15).toArray().length);

            System.out.println("Altura média para pessoas de 16 a 21 anos: " + listPessoas.stream()
                    .filter(pessoa -> pessoa.getIdade() > 15 && pessoa.getIdade() <= 21)
                    .reduce(0.0, (sum, pessoa) -> sum + pessoa.getAltura(), Double::sum)
                    / listPessoas.stream()
                            .filter(pessoa -> pessoa.getIdade() > 15 && pessoa.getIdade() <= 21).toArray().length);

            System.out.println("Altura média para pessoas de 16 a 21 anos: " + listPessoas.stream()
                    .filter(pessoa -> pessoa.getIdade() > 21)
                    .reduce(0.0, (sum, pessoa) -> sum + pessoa.getAltura(), Double::sum)
                    / listPessoas.stream()
                            .filter(pessoa -> pessoa.getIdade() > 21).toArray().length);
        }
    }
}
