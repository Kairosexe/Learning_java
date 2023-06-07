import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        int opcion = 1;

        // Datos de los productos de la tienda.
        int pollo1Kilo = 24;
        int papa1Kilo = 17;
        int queso1Unidad = 157;
        int tosino1Kilo = 92;

        // Varibles a las cuales se les asignara un valor por medio de la clase
        // "Scanner".
        int numProducto;
        int cantidad;

        // Clase para capturar datos.
        Scanner scan = new Scanner(System.in);

        // Ejecuta lo que este dentro de su bloque en modo de bucle simepre y cuando la
        // condicion sea verdadera, en este caso, si la variable "opcion" se le da el
        // valor de "1" el bucle continuara, pero si el valor de esta cambia a "0", el
        // bucle se cerrara.
        // EJEMPLO:
        // Si "opcion" es diferente a 0 el bucle continua.
        while (opcion != 0) {

            System.out.println("\tBIENVENIDO/A \nNUESTROS PRODUCTOS SON:");
            System.out.println("1. Pollo $24 el Kilo. \n2. Papa $17 el Kilo. \n3. Queso $157 la unidad. \n4. Tosino $92 el Kilo.");

            System.out.println("Ingresa el numero del producto que deseas llevar.");
            // Forma parte de la calse "Scanner", aqui se asignan valores.
            numProducto = scan.nextInt();

            // Si selecciona algun numero del 1-4 retornara en consola la opcion de acuerdo
            // el caso que le fue asignado.
            switch (numProducto) {
                case 1:
                    System.out.println("Selecciono Pollo.");
                    break;
                case 2:
                    System.out.println("Selecciono Papa.");
                    break;
                case 3:
                    System.out.println("Selecciono Queso.");
                    break;
                case 4:
                    System.out.println("Selecciono Tosino.");
                    break;
                default:
                    System.out.println("Lo sentimos no contamos con ese producto.");
                    // Reinicia el bucle si la opcion seleccionada es menor que uno o mayor a cuatro.
                    continue;
            }

            System.out.println("Ingresa la cantidad que deseas llevar.");
            // Aqui se asigna valor a la variable "cantidad" que representara la cantidad
            // del producto que se selecciono.
            cantidad = scan.nextInt();
            System.out.println("CARRITO DE COMPRAS:");

            // Si la cantidad del producto es mayor a cero retornara la cantidad que se le
            // asigno en la terminal.
            if (cantidad > 0) {
                System.out.println("Cantidad: " + cantidad + "Kg.");
            }

            // De acuerdo a el caso se selecciono se retornara el precio del producto
            // multiplicado por la cantidad que el cliente solicito.
            switch (numProducto) {
                case 1:
                    System.out.println("Precio: $" + pollo1Kilo * cantidad);
                    break;
                case 2:
                    System.out.println("Precio: $" + papa1Kilo * cantidad);
                    break;
                case 3:
                    System.out.println("Precio: $" + queso1Unidad * cantidad);
                    break;
                case 4:
                    System.out.println("Precio: $" + tosino1Kilo * cantidad);
                    break;
            }

            System.out.println("¿Desea salir o continuar?");
            System.out.println("Preciona <1> para continuar o <0> para salir.");
            // Aqui se le asignara el valor de acurdo a lo que el cliente desee hacer segun
            // las indicaciones que se le dio.
            opcion = scan.nextInt();
            // Si "opcion" es igual a "0" retornara "¡Gracias, vuelva pronto!" y el programa
            // finalizara.
            if (opcion == 0) {
                System.out.println("¡Gracias, vuelva pronto!");
            }
        }
        // Cierra la secuencia y libera los recursos que estaban ocupados en la
        // secuencia de scanner.
        // Basicamente esta clase libera espacio en la memoria.
        scan.close();
    }
}
