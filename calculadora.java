import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int multiplo = 5;
        int numero = 0;

        while (numero != 10) {
            System.out.println("Ingresa un numero:");
            numero = scan.nextInt();
            System.out.println(multiplo * numero);

        }
        scan.close();
    }
}
