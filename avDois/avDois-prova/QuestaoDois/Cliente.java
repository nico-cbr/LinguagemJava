public class Cliente {
  private String nome;
  private String endereco;
  private int cpf;
  private int telefone;

  // getter para o nome
  public String getNome() {
    return nome;
  }

  // Setter para o noome
  public void setNome(String nome) {
    this.nome = nome;
  }

  // getter para a endereco
  public String getEndereco() {
    return endereco;
  }

  // setter para a endereco
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  // getter para a cpf
  public int getCpf() {
    return cpf;
  }

  // setter para a cpf
  public void setCpf(int cpf) {
    this.cpf = cpf;
  }

  // getter para telefone
  public int getTelefone() {
    return telefone;
  }

  // getter para a endereco
  public void setTelefone(int telefone) {
    this.telefone = telefone;
  }
}