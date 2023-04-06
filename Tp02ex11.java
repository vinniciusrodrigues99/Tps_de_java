/* Isabelly Barbosa Gonçalves
* Vinnicius
*11. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
*sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
*calcular e exibir determinante da matriz.*/

import java.util.Scanner;

public class Tp02ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Lendo a ordem da matriz
        System.out.print("Digite a ordem da matriz: ");
        int ordem = sc.nextInt();
        
        // Criando a matriz
        double[][] matriz = new double[ordem][ordem];
        
        // Lendo os elementos da matriz
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.printf("Digite o elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextDouble();
            }
        }
        
        // Calculando o determinante
        double determinante = calcularDeterminante(matriz);
        
        // Exibindo o resultado
        System.out.printf("O determinante da matriz é: %.2f", determinante);
        
        sc.close();
    }
    
    public static double calcularDeterminante(double[][] matriz) {
        int ordem = matriz.length;
        double determinante = 0;
        
        // Caso base: matriz 1x1
        if (ordem == 1) {
            determinante = matriz[0][0];
        }
        else {
            // Escolhendo a primeira linha como referência
            for (int j = 0; j < ordem; j++) {
                // Calculando o cofator
                double cofator = Math.pow(-1, 1 + j + 1) * matriz[0][j];
                
                // Criando a matriz reduzida
                double[][] reduzida = new double[ordem - 1][ordem - 1];
                int k = 0;
                for (int i = 1; i < ordem; i++) {
                    for (int l = 0; l < ordem; l++) {
                        if (l != j) {
                            reduzida[k][l < j ? l : l - 1] = matriz[i][l];
                        }
                    }
                    k++;
                }
                
            }
        }
        
        return determinante;
    }
}


