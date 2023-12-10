import java.util.Scanner;

public class NumImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeros = scan.nextInt();

        System.out.println("Ingresa un numero entero positivo: ");
        for (int i = 1; i < numeros; i++) {
            System.out.println("Los numeros son " + i);
        }

        scan.close();
    }
}