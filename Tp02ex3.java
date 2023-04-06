/* Isabelly Barbosa Gonçalves
* Vinnicius Oliveira Rodrigues
*Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
*números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
*satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
*digitação dos “N” valores, exibir:
*a. O maior valor;
*b. O menor valor;
*c. A soma dos valores;
*d. A média aritmética dos valores;
*e. A porcentagem de valores que são positivos;
*f. A porcentagem de valores negativos;
*Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
*programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o
*programa em função dessa resposta. */

import java.util.Scanner;

public class Tp02ex3{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n;
    do {
      System.out.print("Digite a quantidade de números (entre 1 e 19): ");
      n = input.nextInt();
      if (n <= 0 || n >= 20) {
        System.out.println("Valor inválido! Digite um valor entre 1 e 19.");
      }
    } while (n <= 0 || n >= 20);

    int[] valores = new int[n];
    int maiorValor = Integer.MIN_VALUE;
    int menorValor = Integer.MAX_VALUE;
    int somaValores = 0;
    int qtdePositivos = 0;
    int qtdeNegativos = 0;

    for (int i = 0; i < n; i++) {
      System.out.print("Digite o " + (i+1) + "º valor: ");
      int valor = input.nextInt();
      
      valores[i] = valor;
      if (valor > maiorValor) {
        maiorValor = valor;
      }
      if (valor < menorValor) {
        menorValor = valor;
      }
      somaValores += valor;
      if (valor > 0) {
        qtdePositivos++;
      } else if (valor < 0) {
        qtdeNegativos++;
      }
    }

    double mediaValores = (double) somaValores / (double) n;
    double pctPositivos = (double) qtdePositivos / (double) n * 100.0;
    double pctNegativos = (double) qtdeNegativos / (double) n * 100.0;

    System.out.println("O maior valor digitado foi: " + maiorValor);
    System.out.println("O menor valor digitado foi: " + menorValor);
    System.out.println("A soma dos valores digitados foi: " + somaValores);
    System.out.println("A média aritmética dos valores digitados foi: " + mediaValores);
    System.out.println("A porcentagem de valores positivos foi: " + pctPositivos + "%");
    System.out.println("A porcentagem de valores negativos foi: " + pctNegativos + "%");

    System.out.print("Deseja executar novamente? (S/N) ");
    String resposta;
    do {
      resposta = input.next();
      if (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
        System.out.print("Resposta inválida! Digite \"S\" para sim ou \"N\" para não: ");
      }
    } while (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N"));

    if (resposta.equalsIgnoreCase("S")) {
      main(args);
    }
  }
}
