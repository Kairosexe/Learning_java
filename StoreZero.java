import java.util.Scanner;

public class StoreZero {
    public static void main(String[] args) {

        int opcion = 0;

        String[] accion = new String[5];

        accion[0] = "1. Agregar Productos.";
        accion[1] = "2. Comprar.";
        accion[2] = "3. Modicficar datos.";
        accion[3] = "4. Eliminar.";
        accion[4] = "5. Salir.";

        String[] productos = new String[5];

        productos[0] = "1. Pollo $24 el Kilo.";
        productos[1] = "2. Papa $17 el Kilo.";
        productos[2] = "3. Queso $157 la unidad.";
        productos[3] = "4. Tosino $92 el Kilo.";
        productos[4] = "5. Salir.";

        int seleccionarAccion;

        // Datos de los productos de la tienda.
        int pollo1Kilo = 24, papa1Kilo = 17, queso1Unidad = 157, tosino1Kilo = 92;

        // Varibles a las cuales se les asignara un valor por medio de la clase
        // "Scanner".
        int numProducto;
        int cantidad;
        int total = 0;

        // Clase para capturar datos.
        Scanner scan = new Scanner(System.in);

        // Ejecuta lo que este dentro de su bloque en modo de bucle simepre y cuando la
        // condicion sea verdadera, en este caso, si la variable "opcion" se le da el
        // valor de "1" el bucle continuara, pero si el valor de esta cambia a "0", el
        // bucle se cerrara.
        // EJEMPLO:
        // Si "opcion" es diferente a 5 el bucle continua.
        while (opcion != 5) {

            System.out.println("BIENVENIDO/A");
            for (int i = 0; i < 5; i++) {
                System.out.println(accion[i]);
            }
            seleccionarAccion = scan.nextInt();

            switch (seleccionarAccion) {
                case 1:
                    System.out.println("Ingrese el producto que desea añadir.");

                    break;
                case 2:
                    System.out.println("------------------------");
                    System.out.println("NUESTROS PRODUCTOS SON:");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(productos[i]);
                    }
                    System.out.println("------------------------");
                    System.out.println("Ingresa el numero del producto que deseas llevar o <5> para Salir.");
                    System.out.println("------------------------");
                    // Forma parte de la calse "Scanner", aqui se asignan valores.
                    numProducto = scan.nextInt();

                    // Si selecciona algun numero del 1-4 retornara en consola la opcion de acuerdo
                    // el caso que le fue asignado y de igual manera el precio del producto
                    // multiplicado por la cantidad que el cliente solicito.
                    switch (numProducto) {
                        case 1:
                            System.out.println("------------------------");
                            System.out.println("Selecciono Pollo.");
                            System.out.println("------------------------");
                            System.out.println("Ingresa la cantidad que deseas llevar.");
                            // Aqui se asigna valor a la variable "cantidad" que representara la cantidad
                            // del producto que se selecciono.
                            cantidad = scan.nextInt();
                            System.out.println("CARRITO DE COMPRAS:");
                            // Guarda el costo total del producto seleccionado.
                            System.out.println("Cantidad: " + cantidad + "Kg.");
                            total += multiplicar(pollo1Kilo, cantidad);
                            System.out.println("Precio: $" + multiplicar(pollo1Kilo, cantidad));
                            break;
                        case 2:
                            System.out.println("------------------------");
                            System.out.println("Selecciono Papa.");
                            System.out.println("------------------------");
                            System.out.println("Ingresa la cantidad que deseas llevar.");
                            cantidad = scan.nextInt();
                            System.out.println("Cantidad: " + cantidad + "Kg.");
                            total += multiplicar(papa1Kilo, cantidad);
                            System.out.println("Precio: $" + multiplicar(papa1Kilo, cantidad));
                            break;
                        case 3:
                            System.out.println("------------------------");
                            System.out.println("Selecciono Queso.");
                            System.out.println("------------------------");
                            System.out.println("Ingresa la cantidad que deseas llevar.");
                            cantidad = scan.nextInt();
                            System.out.println("Cantidad: " + cantidad + "Kg.");
                            total += multiplicar(queso1Unidad, cantidad);
                            System.out.println("Precio: $" + multiplicar(queso1Unidad, cantidad));
                            break;
                        case 4:
                            System.out.println("------------------------");
                            System.out.println("Selecciono Tosino.");
                            System.out.println("------------------------");
                            System.out.println("Ingresa la cantidad que deseas llevar.");
                            cantidad = scan.nextInt();
                            System.out.println("Cantidad: " + cantidad + "Kg.");
                            total += multiplicar(tosino1Kilo, cantidad);
                            System.out.println("Precio: $" + multiplicar(tosino1Kilo, cantidad));
                            break;
                        case 5:
                            System.out.println("El total de su compra es: $" + total + fuimonos(opcion));
                            break;
                        default:
                            System.out.println("Lo sentimos no contamos con ese producto.");
                            // Detiene la iteración actual y vuelve al principio del bucle para realizar
                            // otra iteración. En este caso si la opcion seleccionada es menor que uno o
                            // mayor a cuatro el bucle se detendra y se riniciara.
                            continue;
                    }
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    fuimonos(opcion);
                    break;
            }

        }
        // Cierra la secuencia y libera los recursos que estaban ocupados en la
        // secuencia de scanner.
        // Basicamente esta clase libera espacio en la memoria.
        scan.close();
    }

    // Multiplica el producto por la cantidad seleccionada.
    public static int multiplicar(int precio, int cantidad) {
        return precio * cantidad;
    }

    // Para salir.
    public static int fuimonos(int op) {
        System.out.println("¡Gracias, vuelva pronto!");
        System.exit(5);
        return fuimonos(op);
    }
}
