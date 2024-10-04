import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Solicitando o primeiro numero
    // System.out.print("Digite um número: ");
    // double number = scanner.nextDouble();

    // if (number > 0) {
    // System.out.println("O número é positivo");
    // } else if (number == 0) {
    // System.out.println("O número é igual a 0");
    // } else {
    // System.out.println("O número é negativo");
    // }
    // ;

    // exercicio 2
    System.out.print("Digite o primeiro número: ");
    int numberOne = scanner.nextInt();

    System.out.print("Digite o segundo número: ");
    int numberTwo = scanner.nextInt();

    // comparando os dois numeros
    if (numberOne == numberTwo) {
      System.out.println("Os números são iguais");
    } else if (numberOne > numberTwo) {
      System.out.println("O número um é maior que o número dois");
    } else {
      System.out.println("O número um é menor que o número dois");
    }
    ;
  }
}