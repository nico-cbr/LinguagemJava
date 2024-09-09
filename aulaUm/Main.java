// exemplo 3: operações matematicas parte 3

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // entrada de dados
    System.out.print("Digite o primeiro numero: ");
    double num1 = scanner.nextDouble();

    System.out.print("Digite o segundo numero: ");
    double num2 = scanner.nextDouble();

    // processando dados
    double res = num1 * num2;

    // Saida de dados
    System.out.println("O resultado da multiplicação dos números informados é igual a: " + res);
    scanner.close();
  }
}