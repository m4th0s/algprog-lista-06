import java.util.Scanner;

public class Exercicio_007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;
        long multiplicacao = 1;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = sc.nextInt();

            soma += numeros[i];
            multiplicacao *= numeros[i];
        }

        System.out.println("\nNúmeros digitados:");

        for (int numero : numeros) {
            System.out.println(numero + " ");
        }

        System.out.println("\nSoma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);

        sc.close();
    }
}
