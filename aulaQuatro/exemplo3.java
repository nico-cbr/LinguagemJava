import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String num1;
    Double num2;
    String operacao;

    System.out.print("""

             ███████████████████████████████████████████████████████████████████
             █─▄▄▄─██▀▄─██▄─▄███─▄▄▄─█▄─██─▄█▄─▄████▀▄─██▄─▄▄▀█─▄▄─█▄─▄▄▀██▀▄─██
             █─███▀██─▀─███─██▀█─███▀██─██─███─██▀██─▀─███─██─█─██─██─▄─▄██─▀─██
             ▀▄▄▄▄▄▀▄▄▀▄▄▀▄▄▄▄▄▀▄▄▄▄▄▀▀▄▄▄▄▀▀▄▄▄▄▄▀▄▄▀▄▄▀▄▄▄▄▀▀▄▄▄▄▀▄▄▀▄▄▀▄▄▀▄▄▀


        """);

    System.out.print("Digite o primeiro numero: ");
    num1 = scanner.nextLine();
    try {
      int numero = Integer.parseInt(num1);
      System.out.println("Digite a operação (+, -, /, *)");
      operacao = scanner.next();

      System.out.print("Digite o segundo numero: ");
      num2 = scanner.nextDouble();

      // Realizando a operação escohida pelo metodo calculo

      System.out.println("Resultado = " + calculo(numero, operacao, num2));

      System.out.print("""


               ████████████████████████████████
               █▄─█─▄██▀▄─██▄─▄███▄─▄▄─█▄─██─▄█
               ██▄▀▄███─▀─███─██▀██─▄█▀██─██─██
               ▀▀▀▄▀▀▀▄▄▀▄▄▀▄▄▄▄▄▀▄▄▄▄▄▀▀▄▄▄▄▀▀
          """);

      scanner.close();
    } catch (NumberFormatException e) {
      System.out.println("Por favor digite um número!");
    }
  }

  public static Double calculo(int num1, String operacao, Double num2) {
    Double res = 0.0;
    if (operacao.equals("+")) {
      res = num1 + num2;
    } else if (operacao.equals("-")) {
      res = num1 - num2;
    } else if (operacao.equals("/")) {
      res = num1 / num2;
    } else if (operacao.equals("*")) {
      res = num1 * num2;
    }
    return res;
  }
}