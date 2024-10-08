import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int numeroSecreto = random.nextInt(100) + 1;
    int tentativa = 1;
    int chute;
    boolean acertou = false;

    System.out.println(
        """
            ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
            ─██████████████─████████████───██████████─██████──██████─██████████─██████──────────██████─██████──██████─██████████████─██████─
            ─██░░░░░░░░░░██─██░░░░░░░░████─██░░░░░░██─██░░██──██░░██─██░░░░░░██─██░░██████████──██░░██─██░░██──██░░██─██░░░░░░░░░░██─██░░██─
            ─██░░██████░░██─██░░████░░░░██─████░░████─██░░██──██░░██─████░░████─██░░░░░░░░░░██──██░░██─██░░██──██░░██─██░░██████████─██░░██─
            ─██░░██──██░░██─██░░██──██░░██───██░░██───██░░██──██░░██───██░░██───██░░██████░░██──██░░██─██░░██──██░░██─██░░██─────────██░░██─
            ─██░░██████░░██─██░░██──██░░██───██░░██───██░░██──██░░██───██░░██───██░░██──██░░██──██░░██─██░░██████░░██─██░░██████████─██░░██─
            ─██░░░░░░░░░░██─██░░██──██░░██───██░░██───██░░██──██░░██───██░░██───██░░██──██░░██──██░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░██─
            ─██░░██████░░██─██░░██──██░░██───██░░██───██░░██──██░░██───██░░██───██░░██──██░░██──██░░██─██░░██████░░██─██░░██████████─██████─
            ─██░░██──██░░██─██░░██──██░░██───██░░██───██░░░░██░░░░██───██░░██───██░░██──██░░██████░░██─██░░██──██░░██─██░░██────────────────
            ─██░░██──██░░██─██░░████░░░░██─████░░████─████░░░░░░████─████░░████─██░░██──██░░░░░░░░░░██─██░░██──██░░██─██░░██████████─██████─
            ─██░░██──██░░██─██░░░░░░░░████─██░░░░░░██───████░░████───██░░░░░░██─██░░██──██████████░░██─██░░██──██░░██─██░░░░░░░░░░██─██░░██─
            ─██████──██████─████████████───██████████─────██████─────██████████─██████──────────██████─██████──██████─██████████████─██████─
            ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
            """);

    while (!acertou) {
      // Solicitando o numero ao user (entrada de dados)
      System.out.println("Tentativa número: " + tentativa);
      System.out.print("Digite um número de um a cem: ");
      chute = scanner.nextInt();

      // verificando se o numero é maior/menor que o Nsecreto(processamento de dados)
      if (chute == numeroSecreto) {
        System.out.println("""
            Parabéns (っ ͡• ₃ ͡•)っ🎔
            Você acertou o número secreto!! seu número de tentativas foi:""" + " " + tentativa);
        acertou = true;
      } else if (chute > numeroSecreto) {
        System.out.println("O número secreto é menor ☜ ( ͠•  ͟ʖ ͠• )");
      } else {
        System.out.println("O número secreto é maior ☜ ( ͠•  ͟ʖ ͠• )");
      }
      System.out.println("");
      tentativa++;
    }

    scanner.close();
  }
}