import java.util.Scanner;

public class Exercicio_006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] medias = new double[10];
        int quantidadeAprovados = 0;

        for (int aluno = 0; aluno < 10; aluno++) {
            double soma = 0;

            System.out.println("\nNotas do aluno " + (aluno + 1) + ":");

            for (int nota = 0; nota < 4; nota++) {
                System.out.println("Digite a " + (nota + 1) + "ª nota: ");
                soma += sc.nextDouble();
            }

            medias[aluno] = soma / 4;

            if (medias[aluno] >= 7.0) {
                quantidadeAprovados++;
            }
        }

        System.out.println("\nMédias dos alunos:");

        for (int i = 0; i < medias.length; i++) {
            System.out.printf("Aluno %d: %.2f%n", i + 1, medias[i]);
        }

        System.out.println(
            "\nQuantidade de alunos com média maior ou igual a 7,0: "
            + quantidadeAprovados
        );

        sc.close();
    }
}
