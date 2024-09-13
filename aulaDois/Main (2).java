import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    // Criando uma instancia do scanner
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quantos numeros você quer? ");
    int tamanho = scanner.nextInt();

    Integer[] numeros = new Integer[tamanho];

    for (int i = 0; i < tamanho; i++) {
      System.out.print("Digite o número " + (i + 1) + ": ");
      numeros[i] = scanner.nextInt();
    }

    Arrays.sort(numeros, Collections.reverseOrder());

    for (int i = 0; i < tamanho; i++) {
      System.out.print(numeros[i] + " ");
    }
    scanner.close();
  }
}