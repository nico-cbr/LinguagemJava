// Exemplo 2: operações matematicas!

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Criando um objeto scanner
    Scanner scanner = new Scanner(System.in);

    // Entrada de dados
    System.out.print("Digite o primeiro número: ");
    double num1 = scanner.nextDouble();

    System.out.print("Digite o segundo número: ");
    double num2 = scanner.nextDouble();

    // processando dados
    double soma = num1 + num2;

    // saida de dados
    System.out.println("A some dos dois números informados é: " + soma);
    scanner.close();
  }
}