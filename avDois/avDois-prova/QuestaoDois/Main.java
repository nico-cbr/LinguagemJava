import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do cliente: ");
    String nome = scanner.nextLine();
    System.out.println("Digite o endereco do cliente: ");
    String endereco = scanner.nextLine();
    System.out.println("Digite o CPF do cliente: ");
    int cpf = scanner.nextInt();
    System.out.println("Digite o telefone do cliente: ");
    int telefone = scanner.nextInt();
    System.out.println("");
    // Criando cadastro do novo cliente
    Cliente cliente = new Cliente();
    cliente.setNome(nome);
    cliente.setEndereco(endereco);
    cliente.setCpf(cpf);
    cliente.setTelefone(telefone);
    // System.out.println("Lista de cadastros: ");
    // listando todos os clientes
    System.out.println("Nome: " + cliente.getNome());
    System.out.println("Endereco: " + cliente.getEndereco());
    System.out.println("cpf: " + cliente.getCpf());
    System.out.println("telefone: " + cliente.getTelefone());

    scanner.close();
  }
}