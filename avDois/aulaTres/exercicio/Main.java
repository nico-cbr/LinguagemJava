public class Main {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("João", 25, "444.555.666-66");
    Pessoa pessoa2 = new Pessoa("Marta", 22, "555.666.777-77");
    Pessoa pessoa3 = new Pessoa("João", 25, "444.555.666-66");

    System.out.println("A pessoa é igual a pessoa2? " + pessoa1.equals(pessoa2));

    System.out.println("A pessoa é igual a pessoa2? " + pessoa1.equals(pessoa3));
  }
}