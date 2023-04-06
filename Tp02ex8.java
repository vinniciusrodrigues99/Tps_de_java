/* Isabelly Barbosa Gonçalves
* Vinnicius
*Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
*digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
*valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
*correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
*colunas.*/

import java.util.Scanner;

public class Tp02ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrizOriginal = new int[3][4];
        int[][] matrizMultiplicada = new int[3][4];

        // Entrada de dados na matriz original
        System.out.println("Digite 12 valores para a matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrizOriginal[i][j] = sc.nextInt();
            }
        }

        // Entrada da constante multiplicativa
        System.out.println("Digite a constante multiplicativa:");
        int constante = sc.nextInt();

        // Multiplicação da matriz original pela constante
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrizMultiplicada[i][j] = matrizOriginal[i][j] * constante;
            }
        }

        // Exibição das matrizes
        System.out.println("\nMatriz original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizOriginal[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz multiplicada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizMultiplicada[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
