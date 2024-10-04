import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // menu de opções
    System.out.println("Escolha uma opção: ");
    System.out.println("1. Calcular a área do quadrado");
    System.out.println("2. Calcular a área do círculo");
    int escolha = scanner.nextInt();

    switch (escolha) {
      case 1:
        // calculando a area do quadrado
        System.out.println("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();
        double areaQuadrado = lado * lado;
        System.out.printf("A area do quadrado é: %.2f", areaQuadrado);
        break;
      case 2:
        // Calculando a area do circulo
        System.out.println("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        double areaCirculo = Math.PI * (raio * raio);
        System.out.printf("A área do círculo é: %.2f%n", areaCirculo);
        break;

      default:
        // opção invalida
        System.out.println("Opção invalida");
        break;
    }
    scanner.close();
  }
}