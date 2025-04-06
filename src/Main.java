/**
 * DESAFÍO: JUEGO DE ADIVINACIÓN
 */

// 1. Importar las herramientas
import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Crear instancias
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    // 2. Declarar las variables
    int secretNumber;
    int userNumber;
    int attempts = 5;

    // 3. Generar el número aleatorio
    secretNumber = random.nextInt(0, 101);

    // 4. Mensaje de bienvenida
    System.out.println("*****************");
    System.out.println("ADIVINA EL NÚMERO");
    System.out.println("*****************");

    // 5. Ejecutar el bucle mientras haya intentos disponibles
    do {
      System.out.print("\nIngrese un número (1-100): "); // Solicita un número al usuario
      userNumber = scanner.nextInt();

      // 6. Comparar el número ingresado con el número secreto
      if (userNumber > secretNumber) {
        System.out.printf("%d es mayor que el número secreto\n", userNumber);
      } else if (userNumber < secretNumber) {
        System.out.printf("%d es menor que el número secreto\n", userNumber);
      } else {
        System.out.println("\n**************");
        System.out.println("¡ACERTASTE! 🥳");
        break; // Si el usuario acertó, termina el bucle
      }

      attempts--;
    } while (attempts > 0);

    // 7. Si se acabarón los intentos, mostrar el número secreto
    if (attempts == 0) {
      System.out.println("\n************************************");
      System.out.printf("¡FALLASTE! El número secreto era %d", secretNumber);
    }

    // 8. Cerrar el scanner para liberar recursos
    scanner.close();
  }
}
