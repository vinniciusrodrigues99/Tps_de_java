/* Isabelly Barbosa Gonçalves
* Vinnicius
*Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela. */

public class Tp02ex5 {
    public static void main(String[] args) {
      int[][] matriz = new int[3][2];
  
      matriz[0][0] = 1;
      matriz[0][1] = 2;
      matriz[1][0] = 3;
      matriz[1][1] = 4;
      matriz[2][0] = 5;
      matriz[2][1] = 6;
  
      System.out.println("Valores da matriz:");
  
      for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
          System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
  