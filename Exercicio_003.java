import java.util.Scanner;

public class Exercicio_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("\nNotas digitadas:");

        for (double nota : notas) {
            System.out.println(nota);
        }

        System.out.printf("Média: %.2f%n", media);

        sc.close();
    }
}
