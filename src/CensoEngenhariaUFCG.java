import java.util.ArrayList;
import java.util.Scanner;

public class CensoEngenhariaUFCG {

    private static class Aluno {
        private char sexo;
        private int quantidadeVestibularesPrestados;

        protected Aluno(char sexo, int quantidadeVestibularesPrestados) {
            this.sexo = sexo;
            this.quantidadeVestibularesPrestados = quantidadeVestibularesPrestados;
        }

        protected char getSexo() {
            return sexo;
        }

        protected int getQuantidadeVestibularesPrestados() {
            return quantidadeVestibularesPrestados;
        }
    }

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int quantidadeAlunos = 0;
            ArrayList<Aluno> listAlunos = new ArrayList<Aluno>();

            System.out.println("Informe a quantidade de alunos que prestaram vestibular: ");
            quantidadeAlunos = sc.nextInt();

            for (int i = 0; i < quantidadeAlunos; i++) {
                System.out.println("Informe o sexo do aluno: ");
                char sexoAux = sc.next().charAt(0);
                if (sexoAux == 'x') {
                    break;
                }
                System.out.println("Informe a quantidade de vezes que prestou o vestibular: ");
                int quantidadeAux = sc.nextInt();
                listAlunos.add(new Aluno(sexoAux, quantidadeAux));
            }

            System.out.println(
                    "A porcentagem de alunos que passaram foi: " + (listAlunos.size() / quantidadeAlunos) + "%");
            System.out.println("A porcentagem de alunos do sexo M que passaram foi: "
                    + listAlunos.stream().filter(aluno -> aluno.getSexo() == 'M').toArray().length);
            System.out.println("A porcentagem de alunos que prestaram, no mínimo, três vestibulares foi: " + listAlunos
                    .stream().filter(aluno -> aluno.getQuantidadeVestibularesPrestados() >= 3).toArray().length);
        }
    }
}
