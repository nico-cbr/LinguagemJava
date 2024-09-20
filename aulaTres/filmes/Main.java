
public class Main {
  public static void main(String[] args) {
    Filmes filme1 = new Filmes("Vingadores: Ultimato", 2019, 180);
    Filmes filme2 = new Filmes("Senhor dos Anéis", 2001, 178);
    Filmes filme3 = new Filmes("Não Olhe para cima", 2021, 150);
    Filmes filme4 = new Filmes("Oppenheimer", 2023, 180);
    Filmes filme5 = new Filmes("Avatar: O Caminho da Água", 2022, 189);

    System.out.println(filme1.exibirInfo());
    System.out.println(filme2.exibirInfo());
    System.out.println(filme3.exibirInfo());
    System.out.println(filme4.exibirInfo());
    System.out.println(filme5.exibirInfo());
  }
}