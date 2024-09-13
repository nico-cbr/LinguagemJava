import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    // Criando uma instancia do scanner
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quantos numeros você quer? ");
    int tamanho = scanner.nextInt();

    int[] numeros = new int[tamanho];

    for (int i = 0; i < tamanho; i++) {
      System.out.print("Digite o número " + (i + 1) + ": ");
      numeros[i] = scanner.nextInt();
    }

    Arrays.sort(numeros);

    for (int i = 0; i < tamanho; i++) {
      System.out.print(numeros[i] + " ");
    }
    scanner.close();
  }
}