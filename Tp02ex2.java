/* 
 * 
 *Isabelly Barbosa Gonçalves
 *Vinnicius Oliveira Rodrigues

*Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
*erro, se necessário. Após a digitação, exibir:
*a. O maior valor;
*b. A soma dos valores;
*c. A média aritmética dos valores.
*/

import java.util.Scanner;

public class Tp02ex2 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int[] valores = new int[10];
    int maiorValor = Integer.MIN_VALUE;
    int somaValores = 0;

    for (int i = 0; i < 10; i++) {
      int valor;
      do {
        System.out.print("Digite o " + (i+1) + "º valor positivo: ");
        valor = ler.nextInt();
        if (valor < 0) {
          System.out.println("Valor inválido! Digite um valor positivo.");
        }
      } while (valor < 0);
      
      valores[i] = valor;
      if (valor > maiorValor) {
        maiorValor = valor;
      }
      somaValores += valor;
    }

    double mediaValores = (double) somaValores / 10.0;

    System.out.println("O maior valor digitado foi: " + maiorValor);
    System.out.println("A soma dos valores digitados foi: " + somaValores);
    System.out.println("A média aritmética dos valores digitados foi: " + mediaValores);
  }
}

