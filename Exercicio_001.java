import java.util.Scanner;

public class Exercicio_001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros digitados:");

        for (int numero : numeros) {
            System.out.println(numero);
        }

        sc.close();
    }
}
