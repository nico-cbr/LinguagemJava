
// aproximando nº PI
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int iteracoes;
    double pi = 0.0;

    System.out.print("Digite o numero de iterações: ");
    iteracoes = scanner.nextInt();

    // Iniciando processo de aproximação
    for (int i = 0; i <= iteracoes; i++) {
      if (i % 2 == 0) {
        pi += 1.0 / (2 * i + 1);
        System.out.println("Iteração: " + i + ":" + pi);
      } else {
        pi -= 1.0 / (2 * i + 1);
        System.out.println("Iteração: " + i + ":" + pi);
      }
    }
    pi *= 4; // multiplicando o resultado por 4
    System.out.println("O número aproximado foi: " + pi);
    scanner.close();
  }
}