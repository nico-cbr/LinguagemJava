public class Main {
  public static void main(String[] args) {
    int meuInt = 10;
    double meuDouble = meuInt;

    System.out.println("Valor do meuInt: " + meuInt);
    System.out.println("Valor do meuDouble após o casting: " + meuDouble);

    // Casting explicito
    double outroDouble = 9.35;
    int outroInt = (int) outroDouble;

    System.out.println("Valor do outroDouble: " + outroDouble);
    System.out.println("Valor do outroInt após o casting: " + outroInt);
  }
}