import java.util.Scanner;

public class EjemploDiagrama {

    public static void main(String[] args) {
        int numeros[] = new int[5];

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa 5 numeros.");
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = scan.nextInt();

            if (i >= 0) {
                System.out.println("Intentalo de nuevo.");
                continue;

            } else {
                i = numeros.length - 1;
                System.out.println(numeros[i]);
                i--;
            }
        }
        scan.close();
    }

}
