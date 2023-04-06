/* Isabelly Barbosa Gonçalves
* Vinnicius Oliveira Rodrigues
*Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
*digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
*valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.*/

import java.util.Scanner;

public class Tp02ex7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[][] matriz = new int[3][4];

    System.out.println("Digite 12 valores:");

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = input.nextInt();
      }
    }

    System.out.println("Digite uma constante multiplicativa:");
    int constante = input.nextInt();

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] *= constante;
      }
    }

    System.out.println("Valores da matriz após a multiplicação:");

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }
}