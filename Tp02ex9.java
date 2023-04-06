/* Isabelly Barbosa Gonçalves
* Vinnicius
*Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
*sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
*elementos, calcular e exibir a matriz transposta.*/

import java.util.Scanner;

public class Tp02ex9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = entrada.nextInt();
        
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = entrada.nextInt();
        
        int[][] matriz = new int[linhas][colunas];
        
        // Loop para digitar os elementos da matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o elemento da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        // Exibe a matriz original
        System.out.println("\nMatriz original:");
        exibeMatriz(matriz);
        
        // Calcula e exibe a matriz transposta
        int[][] transposta = calculaMatrizTransposta(matriz);
        System.out.println("\nMatriz transposta:");
        exibeMatriz(transposta);
    }
    
    // Método para calcular a matriz transposta
    public static int[][] calculaMatrizTransposta(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[][] transposta = new int[colunas][linhas];
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        
        return transposta;
    }
    
    // Método para exibir a matriz na tela
    public static void exibeMatriz(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
