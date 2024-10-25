import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o nome do cliente: ");
    String nome = scanner.nextLine();

    System.out.print("Digite a cidade que reside: ");
    String cidade = scanner.nextLine();

    System.out.print("Digite a cidade natal: ");
    String cidadeNatal = scanner.nextLine();

    System.out.print("Digite a idade do cliente: ");
    int idade = scanner.nextInt();

    System.out.print("Digite o salário: ");
    int salario = scanner.nextInt();

    Pessoa pessoa = new Pessoa();
    pessoa.setNome(nome);
    pessoa.setIdade(idade);
    pessoa.setCidade(cidade);
    pessoa.setSalario(salario);
    pessoa.setCidadeNatal(cidadeNatal);

    System.out.println("Nome: " + pessoa.getNome());
    System.out.println("Idade: " + pessoa.getIdade());
    System.out.println("Cidade: " + pessoa.getCidade());
    System.out.println("Salario: " + pessoa.getSalario());
    System.out.println("Cidade natal: " + pessoa.getCidadeNatal());

    scanner.close();
  }
}