// Definir a classe Pessoa
class Pessoa {
  // atributos da classe
  String nome;
  int idade;

  // Constructor para inicializer os atributos
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // Metodo para exibir as informações de Pessoa
  public void exibirInformacoes() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("");
  }
}

public class Main {
  public static void main(String[] args) {
    // Criando um objeto Pessoa
    Pessoa pessoaUm = new Pessoa("Demetrio", 37);
    Pessoa pessoaDois = new Pessoa("Nicoly Carvalho", 18);
    Pessoa pessoaTres = new Pessoa("Tauã", 18);
    Pessoa pessoaQuatro = new Pessoa("Enzo", 18);
    Pessoa pessoaCinco = new Pessoa("Jhonatam", 17);
    Pessoa pessoaSeis = new Pessoa("Laura", 16);

    pessoaUm.exibirInformacoes();
    pessoaDois.exibirInformacoes();
    pessoaTres.exibirInformacoes();
    pessoaQuatro.exibirInformacoes();
    pessoaCinco.exibirInformacoes();
    pessoaSeis.exibirInformacoes();
  }
}