import java.util.Scanner;

public class Exercicio_005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];

        int quantidadePares = 0;
        int quantidadeImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                pares[quantidadePares] = numeros[i];
                quantidadePares++;
            } else {
                impares[quantidadeImpares] = numeros[i];
                quantidadeImpares++;
            }
        }

        System.out.println("\nVetor original:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\n\nVetor de números pares:");

        for (int i = 0; i < quantidadePares; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\n\nVetor de números ímpares:");

        for (int i = 0; i < quantidadeImpares; i++) {
            System.out.print(impares[i] + " ");
        }

        sc.close();
    }
}
