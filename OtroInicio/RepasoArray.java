/** Importacion de la clase Scanner. */
import java.util.Scanner;

public class RepasoArray {
// Repaso del tema <Array>.
// Te estaras preguntando ¿Que es un <Array>, bien, aqui te lo explico, un <Array> es una estructura de datos ¿Y que es una estructura de datos? se le conoce asi a aquello que perimite organizar la infomacion de manera mas organizada y eficiente, bueno, ya sabiendo esto, te sigo explicando que es un <Array>, este nos permite almacenar multiples elementos del mismo usando el mismo nombre.
// Aqui te muestro un ejemplo de como funciona.

    /** Declaracion y creacion del Array.*/
    static int numero[] = new int[5];
    /** Creacion del objeto Sacanner. */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese cinco numeros a invertir: ");
        /** Ciclo for que incia desde la posicion "0" e ira aumentando de posicion confome se ingrese un numero, terminara el ciclo hasta que "i" sea mayor de "5".*/
        for (int i = 0; i < numero.length; i++) {
            /** Se registran y almacenan los datos solicitados*/
            numero[i] = scan.nextInt();
        }
        System.out.println("Numeros en orden inverso:");
        /** Declaracion de la variable con valor 4. */
        int resultado = 4;
        /** Mientras resustaldo sea mayor o igual a 0 el cuclo se estara ejecutando. */
        while (resultado >= 0) {
            /** Imprime los nuemro de manera inversa a la que se ingresaron. */
            System.out.println(numero[resultado]);
            /** Decrementa de pocionion iniciando desde el ultmimo valor que fue incresando*/
            resultado--;
        }
    }
}