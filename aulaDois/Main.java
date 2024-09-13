import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Instanciando o objeto scanner
    // fazendo 1ª entrada de dados
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quantos números você desejar inserir? ");
    int tamanho = scanner.nextInt();

    // Criando uma array para armazenar os numeros
    // processando dados
    int[] numeros = new int[tamanho];

    // preenchendo array
    // processando dados com entradas de dados
    for (int i = 0; i < tamanho; i++) {
      System.out.print("Digite o número " + (i + 1) + ": ");
      numeros[i] = scanner.nextInt();
    }
    ;

    // exibindo valores array
    // saida de dados
    System.out.println("Você inseriu os números: ");
    for (int i = 0; i < tamanho; i++) {
      System.out.print(numeros[i] + " ");
    }
    ;
    scanner.close();
  }
}