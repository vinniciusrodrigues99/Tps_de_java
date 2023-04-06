/* Isabelly Barbosa Gonçalves
* Vinnicius
*Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
*sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
*calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
*colunas).*/

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularMatrixException;

import java.util.Scanner;

public class Tp02ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da ordem da matriz
        int order;
        do {
            System.out.print("Digite a ordem da matriz (no máximo 10): ");
            order = scanner.nextInt();
        } while (order <= 0 || order > 10);

        // Entrada dos elementos da matriz
        double[][] matrixData = new double[order][order];
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                matrixData[i][j] = scanner.nextDouble();
            }
        }

        // Cálculo da matriz inversa
        try {
            RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
            RealMatrix inverseMatrix = matrix.inverse();

            // Exibição das matrizes na tela
            System.out.println("Matriz original:");
            printMatrix(matrix);
            System.out.println("Matriz inversa:");
            printMatrix(inverseMatrix.getData());
        } catch (SingularMatrixException e) {
            System.out.println("A matriz é singular, não possui inversa!");
        }
    }

    // Método para imprimir uma matriz na tela
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
