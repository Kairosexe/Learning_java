import java.util.Scanner;

public class NumImpares {
    public static void main(String[] args) {

        /** Creacion del objeto Sacanner. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero entero positivo: ");
        /**
         * Declaracion de la variable "numeros" con valor que el usuario ingrese, usando
         * el objeto "Scanner".
         */
        int numeros = scan.nextInt();
        /**
         * Declaracion de la variable "suma" con valor "0".
         */
        int suma = 0;

        /**
         * Ciclo for que incia desde la posicion "1" e ira aumentando de uno en uno y
         * finalizara hasta el el valor que se la haya declarado a "numeros".
         */
        for (int i = 1; i <= numeros; i++) {
            /**
             * Si el residuo de la divicion de "i" entre "2" y no es igual a cero, es un
             * numero impar.
             */
            if ((i % 2) != 0) {
                /**
                 * Imprime "i" en una cadena de numeros que va incremenado hasta
                 * llegar al limite que le fue declarado.
                 */
                System.out.println("Los numeros impares son: " + i);
                /**
                 * Su funcion es ser un acumulador, por cada numero que se imprima, "suma" lo va
                 * acumulando para sumarlo.
                 */
                suma = suma + i;
            }

        }
        /** Imprime la suma de todos lo numeros impares. */
        System.out.println("La suma es: " + suma);
        /** Cierra el objeto "Scanner". */
        scan.close();
    }
}