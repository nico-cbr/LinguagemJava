import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    // 1- Criação de uma arrays
    int[] numbers = { 5, 2, 4, 1, 3, 0 };
    System.out.println("Meu array de números: " + Arrays.toString(numbers));

    // 2- Acessando um elemento pelo index
    System.out.println("O elemento da posição 2 é: " + numbers[2]);

    // -3 modificando um valor especifico no array
    numbers[5] = 6;
    System.out.println("O novo valor da posição 5 é: " + Arrays.toString(numbers));

    // 4- Criando uma array de string
    String[] frutas = { "Pêra", "Maçã", "Banana", "Manga", "Melancia", "Goiaba", "Uva", "Abacate" };
    for (int i = 0; i < frutas.length; i++) {
      System.out.println("Fruta " + (i + 1) + ": " + frutas[i]);
    }
    System.out.println("-------------------------------");

    // 5- Instanciando um array de strings
    String[] carros = new String[4];

    // ADicionando valor ao array
    carros[0] = "Corsa 2000";
    carros[1] = "Gol quadrado 1995";
    carros[2] = "Uno 2010";
    carros[3] = "SW4 2020";

    for (int i = 0; carros.length > i; i++) {
      System.out.println(" Carro " + (i + 1) + ": " + carros[i]);
    }
    System.out.println("---------------------");

    // 6- Ordenando uma array em ordem crescen
    Arrays.sort(numbers);
    System.out.println("Array ordenada: " + Arrays.toString(numbers));

    Integer[] numeros = { 4, 2, 6, 8, 1, 5, 9 };
    Arrays.sort(numeros, Collections.reverseOrder());
    System.out.println("Array ordenada em decrescente: " + Arrays.toString(numeros));

    System.out.println("---------------------");

    // 7- Buscando um elemento no Array pelo metodo binarySearch
    int index = Arrays.binarySearch(numbers, 5);
    if (index >= 0) {
      System.out.println("Valor encontrado na posição: " + index);
    } else {
      System.out.println("Valor não encontrado");
    }
    System.out.println("---------------------");

    // 8- Preencher uma array com um deterinado valor
    int[] lista = new int[5];
    Arrays.fill(lista, 1);
    System.out.println("Lista Preenchida: " + Arrays.toString(lista));
  }
}