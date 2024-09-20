// Definir a classe pessoa
class Pessoa {
  // Atributos da classe
  String nome;
  int idade;

  // Constructor para inializar os atributos
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // Método para exibir as innformações de Pessoa
  public void exibirInformacoes() {
    System.out.println("nome: " + nome);
    System.out.println("idade: " + idade);
  }
}

public class Main {
  public static void main(String[] args) {
    // Criando um objeto Pessoa
    Pessoa pessoa1 = new Pessoa("Tauã ", 18);
    Pessoa pessoa2 = new Pessoa("Nicoly ", 18);
    Pessoa pessoa3 = new Pessoa("Demetrio", 37);
    Pessoa pessoa4 = new Pessoa("Enzo", 18);
    Pessoa pessoa5 = new Pessoa("Laura", 16);
    Pessoa pessoa6 = new Pessoa("Suelem", 18);
    Pessoa pessoa7 = new Pessoa("Miguel", 17);
    Pessoa pessoa8 = new Pessoa("Iasmin", 17);
    Pessoa pessoa9 = new Pessoa("Marissa", 18);
    Pessoa pessoa10 = new Pessoa("Taisa", 18);
    Pessoa pessoa11 = new Pessoa("Jhonathan", 18);
    Pessoa pessoa12 = new Pessoa("Sofia", 18);

    pessoa1.exibirInformacoes();
    pessoa2.exibirInformacoes();
    pessoa3.exibirInformacoes();
    pessoa4.exibirInformacoes();
    pessoa5.exibirInformacoes();
    pessoa6.exibirInformacoes();
    pessoa7.exibirInformacoes();
    pessoa8.exibirInformacoes();
    pessoa9.exibirInformacoes();
    pessoa10.exibirInformacoes();
    pessoa11.exibirInformacoes();
    pessoa12.exibirInformacoes();
  }
}