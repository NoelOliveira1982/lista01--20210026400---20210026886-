import java.util.Scanner;

/* Exercício  12:
 * Aluno: Pedro Augusto Dias de Lima             - Matrícula: 20210026400 
 * Aluno: Jorge Alberto Macedo Costa de Oliveira - Matrícula: 20210026886
 */

public class CalculadoraAvancada {
    public static void main(String[] args) {
        int escolha = 0, num = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            num = sc.nextInt();
            do {
                System.out.println(
                        "Escolha uma das opções: \n1- DOBRO\n2- TRIPLO\n3- METADE\n4- QUADRADO\n5- CUBO\n6- RAIZ QUADRADA\n7- RAIZ CÚBICA\n8- MÓDULO\n9- INVERSO\n0- SAIR");
                escolha = sc.nextInt();
                switch (escolha) {
                    case 0:
                        break;
                    case 1: {
                        System.out.println("O dobro de " + num + " é: " + multiplica(num, 2));
                        break;
                    }
                    case 2: {
                        System.out.println("O triplo de " + num + " é: " + multiplica(num, 3));
                        break;
                    }
                    case 3: {
                        System.out.println("O triplo de " + num + " é: " + multiplica(num, 0.5));
                        break;
                    }
                    case 4: {
                        System.out.println("O quadrado de " + num + " é: " + multiplica(num, num));
                    }
                    case 5: {
                        System.out.println("O cubo de " + num + " é: " + multiplica(num, num, num));
                        break;
                    }
                    case 6: {
                        System.out.println("A raiz quadrada de " + num + " é: " + Math.sqrt(num));
                        break;
                    }
                    case 7: {
                        System.out.println("A raiz cúbica de " + num + " é: " + Math.cbrt(num));
                        break;
                    }
                    case 8: {
                        System.out.println("O módulo de " + num + " é: " + Math.abs(num));
                        break;
                    }
                    case 9: {
                        System.out.println("O inverso de " + num + " é: " + 1 / num);
                        break;
                    }

                }
            } while (escolha != 0);
        }
    }

    public static double multiplica(double... num1) {
        double produto = 1;
        for (double d : num1) {
            produto *= d;
        }
        return produto;
    }
}
