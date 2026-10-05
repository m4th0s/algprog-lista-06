import java.util.Scanner;

public class Exercicio_004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] caracteres = new char[10];
        StringBuilder consoantes = new StringBuilder();
        int quantidadeConsoantes = 0;

        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º caractere: ");
            caracteres[i] = sc.next().toLowerCase().charAt(0);

            char caractere = caracteres[i];

            boolean ehLetra = caractere >= 'a' && caractere <= 'z';
            boolean ehVogal = caractere == 'a' ||
                              caractere == 'e' ||
                              caractere == 'i' ||
                              caractere == 'o' ||
                              caractere == 'u';

            if (ehLetra && !ehVogal) {
                quantidadeConsoantes++;
                consoantes.append(caractere).append(' ');
            }
        }

        System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);
        System.out.println("Consoantes lidas: " + consoantes);

        sc.close();
    }
}
