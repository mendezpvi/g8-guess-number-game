import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int secretNumber;
    int userNumber;
    int attempts = 5;

    secretNumber = random.nextInt(0, 101);

    System.out.println("*****************");
    System.out.println("ADIVINA EL NÚMERO");
    System.out.println("*****************");

    do {
      System.out.print("\nIngrese un número (1-100): ");
      userNumber = scanner.nextInt();

      if (userNumber > secretNumber) {
        System.out.printf("%d es mayor que el número secreto\n", userNumber);
      } else if (userNumber < secretNumber) {
        System.out.printf("%d es menor que el número secreto\n", userNumber);
      } else {
        System.out.println("\n**************");
        System.out.println("¡ACERTASTE! 🥳");
        break;
      }

      attempts--;
    } while (attempts > 0);

    if (attempts == 0) {
      System.out.println("\n************************************");
      System.out.printf("¡FALLASTE! El número secreto era %d", secretNumber);
    }

    scanner.close();
  }
}
