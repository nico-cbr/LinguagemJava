// Exemplo 1: entrada de saida de dados

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Criando um objeto scanner, para ler o teclado
    Scanner scanner = new Scanner(System.in);

    // Solicitando o nome do usuario
    System.out.print("Digite o seu nome: ");
    String nome = scanner.nextLine();

    // Solicitando a idade do usuario
    System.out.print("Digite o sua idade: ");
    String idade = scanner.nextLine();

    // Exibindo o que o usuario digitou
    System.out.println("Olá " + nome + ", Sua idade informada é: " + idade);

    // fechando o scanner
    scanner.close();
  }
}