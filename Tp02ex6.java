/* Isabelly Barbosa Gonçalves
* Vinnicius Oliveira Rodrigues
*Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela. */

public class Tp02ex6 {
    
    public static void main(String[] args) {
      String[][] matriz = new String[2][3];
  
      matriz[0][0] = "Ana";
      matriz[0][1] = "Beto";
      matriz[0][2] = "Carla";
      matriz[1][0] = "Daniel";
      matriz[1][1] = "Elisa";
      matriz[1][2] = "Fernanda";
  
      System.out.println("Nomes na matriz:");
  
      for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
          System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
      }
    }
  }