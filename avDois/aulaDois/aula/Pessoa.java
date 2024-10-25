public class Pessoa {
  private String nome;
  private int idade;
  private String cidade;
  private int salario;
  private String cidadeNatal;

  // getter para o nome
  public String getNome() {
    return nome;
  }

  // Setter para o noome
  public void setNome(String nome) {
    this.nome = nome;
  }

  // getter para a idade
  public int getIdade() {
    return idade;
  }

  // setter para a idade
  public void setIdade(int idade) {
    this.idade = idade;
  }

  // getter para a cidade
  public String getCidade() {
    return cidade;
  }

  // setter para a cidade
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  // getter para salario
  public int getSalario() {
    return salario;
  }

  // setter para salario
  public void setSalario(int salario) {
    this.salario = salario;
  }

  // getter para cidadeNatal
  public String getCidadeNatal(){
    return cidadeNatal;
  }

  // setter para cidadeNatal
  public void setCidadeNatal(String cidadeNatal){
    this.cidadeNatal = cidadeNatal;
  }
  
}