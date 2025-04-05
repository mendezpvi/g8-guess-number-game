# **Desafío: Juego de adivinación**

🎯 ***Enunciado:***  
Crea un programa que simule un juego de adivinanzas. El programa debe generar un número aleatorio entre 0 y 100, y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos. En cada intento, el programa debe informar si el número ingresado por el usuario es mayor o menor que el número generado.

💡 ***Consejos***:
+ Para generar un número aleatorio en Java: `new Random().nextInt(100)`;
+ Utiliza el `Scanner` para obtener los datos del usuario.
+ Utiliza una variable para contar los intentos.
+ Utiliza un bucle para controlar los intentos.
+ Utiliza la instrucción `break` para salir del bucle.

## ✅ ***Solución*** :muscle:

### 🧠 *Paso 1: Entender el problema*
1. Generar un número aleatorio entre 0 y 100.
1. Pedir al usuario que adivine el número.
1. Permitir un máximo de 5 intentos.
1. Informar al usuario si el número ingresado es mayor o menor que el número secreto.

### ⚒️ *Paso 2: Herramientas a utilizar*
| Requisito | Herramienta |
| --- | --- |
| Número aleatorio (0-100) | `Random` |
| Entrada del usuario | `Scanner` |
| Repetición de intentos | `while` |
| Comparar los números | `if`, `else if` |
| Mostrar mensajes al usuario | `print`, `printf`, `println` |

📂 [***Adivina el número***](./src/Main.java) :point_left: