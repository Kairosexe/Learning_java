import java.util.Scanner;

public class calculadora {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        int opcion = 0;

        float numero1 = 0;
        float numero2 = 0;
        float total = 0;

        while (opcion != 5) {
            System.out.println("---------------");
            System.out.println("CALCULADORA");
            System.out.println("---------------");
            System.out.println("1. Sumar. \n2. Restar. \n3. Multplicar. \n4. Dividir \n5. Salir. ");
            System.out.println("\nSelecciona una opcion.");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el primer numero:");
                    numero1 = scan.nextFloat();
                    System.out.println("Ingresa el segundo numero:");
                    numero2 = scan.nextFloat();
                    total = numero1 + numero2;
                    System.out.println("Resultado = " + total);
                    break;
                case 2:
                    System.out.println("Ingresa el primer numero:");
                    numero1 = scan.nextFloat();
                    System.out.println("Ingresa el segundo numero:");
                    numero2 = scan.nextFloat();
                    total = numero1 - numero2;
                    System.out.println("Resultado = " + total);
                    break;
                case 3:
                    System.out.println("Ingresa el primer numero:");
                    numero1 = scan.nextFloat();
                    System.out.println("Ingresa el segundo numero:");
                    numero2 = scan.nextFloat();
                    total = numero1 * numero2;
                    System.out.println("Resultado = " + total);
                    break;
                case 4:
                    System.out.println("Ingresa el primer numero:");
                    numero1 = scan.nextFloat();
                    System.out.println("Ingresa el segundo numero:");
                    numero2 = scan.nextFloat();
                    total = numero1 / numero2;
                    System.out.println("Resultado = " + total);
                    break;
                case 5:
                    System.out.println("Nos vemos pronto.");
                    break;
            }
        }
        scan.close();
    }
}
