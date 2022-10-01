import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class RhEmpresa {

    private static class Funcionario {
        private String nome;
        private double salario;

        private Funcionario(String nome, double salario) {
            this.nome = nome;
            this.salario = salario;
        }

        private double getSalario() {
            return this.salario;
        }

        private String getNome() {
            return this.nome;
        }
    }

    public static void main(String[] args) {
        int quantidadeFuncionarios = 0;
        ArrayList<Funcionario> listFuncionarios = new ArrayList<Funcionario>();

        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Informe a quantidade de funcionários, não podendo ultrapassar 79: ");
                quantidadeFuncionarios = sc.nextInt();
            } while (quantidadeFuncionarios >= 80);

            for (int i = 0; i < quantidadeFuncionarios; i++) {
                System.out.println("Informe o nome: ");
                String nomeAux = sc.next();
                System.out.println("Digite o salário: ");
                double salarioAux = sc.nextDouble();

                listFuncionarios.add(new Funcionario(nomeAux, salarioAux));
            }

            Funcionario funcionarioComMaiorSalario = listFuncionarios.stream()
                    .max(Comparator.comparing(Funcionario::getSalario)).get();

            System.out.printf("Maior salário: %.2f", funcionarioComMaiorSalario.getSalario());
            System.out.println("Nome de todos os funcionários com o maior salário: " + listFuncionarios.stream()
                    .filter(funcionario -> funcionario.getSalario() == funcionarioComMaiorSalario.getSalario())
                    .reduce("", (funcionarioString, funcionario) -> funcionarioString + ", " + funcionario.getNome(),
                            String::concat));

        }
    }
}
