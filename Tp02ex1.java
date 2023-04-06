/*Isabelly Barbosa Gonçalves
Vinnicius Oliveira Rodrigues

Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor:
*/
import java.util.Scanner;

public class Tp02ex1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int primeiroValor, segundoValor;
    do {
      System.out.print("Digite o primeiro valor: ");
      primeiroValor = input.nextInt();

      System.out.print("Digite o segundo valor (maior que o primeiro): ");
      segundoValor = input.nextInt();
    } while (segundoValor <= primeiroValor);

    System.out.println("Valores digitados: " + primeiroValor + " e " + segundoValor);
  }
}