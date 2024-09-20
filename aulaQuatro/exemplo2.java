import java.util.Scanner;

// comparando tipos primitivos que serao informados pelo usuario

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    // Solicitando um dado de entrada
    System.out.print("Digite alguma coisa: ");
    String dadoInf = entrada.nextLine();

    // Tentando converter o valor digitado em um inteiro
    try {
      int numero = Integer.parseInt(dadoInf);
      System.out.println("Você digitou um inteiro: " + numero);
    } catch (NumberFormatException e) {
      System.out.println("Você digitou uma string (texto)");
    }

    entrada.close();
  }
}