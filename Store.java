import java.util.Scanner;

/**
 * Clase Store
 * Clase que simula un punto de venta en la terminal
 * <p>
 * </p>
 * <p>
 * Este documento ayudará a simular las acciones basicas de un punto de venta.
 * </p>
 * 
 * @since 1.0
 * 
 */
public class Store {

    static Scanner scn = new Scanner(System.in);

    // Precio - Cantidad disponible - venta - compra
    public static double pollo[] = new double[4];
    static double papa[] = new double[4];
    static double tosino[] = new double[4];
    static double queso[] = new double[4];
    // id - total de prodcutos vendidos - total de la venta
    static double tickets[][] = new double[100][3];

    /**
     * Metodo main, se asignan los precios y se da unas cantidades iniciales de los
     * productos.
     * 
     * @param args
     */
    public static void main(String[] args) {
        pollo[0] = 24;
        papa[0] = 17;
        queso[0] = 157;
        tosino[0] = 92;
        tosino[1] = 100;
        papa[1] = 100;
        pollo[1] = 100;
        queso[1] = 100;

        carrito();
    }

    /**
     * Función para el arreglo del producto.
     * 
     * @param array
     */
    static void leer(double array[]) {
        System.out.println(
                "\t" + nombreProducto(array[0]) + "\tPrecio: " + array[0] + "\tCantidad: " + array[1] + "\tVenta: "
                        + array[2] + "\tCompra: "
                        + array[3]);
    }

    /**
     * Función para realizar una venta, resta la cantidad que ingreses al arreglo
     * seleccionado
     * 
     * @param array
     * @param cantidad
     */
    static void venta(double array[], double cantidad) {

        if (cantidad > array[1] || array[1] == 0) {
            System.out.println("----------------------------------------:");
            System.out.println("¡No hay productos suficientes!\n SUGIERO REABASTECER LO MÁS PRONTO POSIBLE");
            System.out.println("----------------------------------------\n:");
            return;
        }

        for (int j = 0; j < tickets.length; j++) {
            if (esFilaVacia(tickets, j)) {
                System.out.println("Generando id: " + j + 1);
                tickets[j][0] = j + 1;
                tickets[j][1] = cantidad;
                tickets[j][2] = cantidad * array[0];

                break;
            }

        }

        array[1] -= cantidad;
        array[2] += cantidad;
        System.out.println("Se vendio: " + cantidad + " de " + nombreProducto(cantidad * array[0]));

    }

    /**
     * Busca el nombre del producto entre la lista de precios dependiendo el total
     * del producto.
     * 
     * @param total
     * @return nombre del producto
     */
    static String nombreProducto(double total) {
        double precios[] = { pollo[0], papa[0], queso[0], tosino[0] };

        // Cada producto tiene un número:
        /*
         * 0- pollo
         * 1- papa
         * 2- queso
         * 3- tosino
         */
        String nombre = "";
        for (int i = 0; i < 4; i++) {
            if (total % precios[i] == 0) {
                // IMGINATE SI FUERAN 100 PRODUCTOS NO MANCHEEEES, OBVIO HAY UNA MANERA MÁS
                // SENCILLA DE HACER ESTO
                switch (i) {
                    case 0:
                        nombre = "pollo";
                        break;
                    case 1:
                        nombre = "papa";
                        break;
                    case 2:
                        nombre = "Queso";
                        break;
                    case 3:
                        nombre = "Tosino";
                        break;

                    default:
                        System.out.println("Nombre de producto no encontrado");
                        break;
                }
            }
        }

        return nombre;
    }

    /**
     * Funcion para aumentar la cantidad de productos disponibles.
     * 
     * @param array
     * @param cantidad
     */
    static void compra(double array[], double cantidad) {
        array[1] += cantidad;
        array[3] += cantidad;
        System.out.println("Se compró: " + cantidad);
    }

    /**
     * Funcion que imprime el menu de acciones.
     */
    static void carrito() {
        int opcion = 0;
        while (opcion != 4) {

            double cantidad = 0;
            System.out.println(
                    "BIENVENIDO A MI SUPERMECADO\n ¿Qué desea realizar?\n1)Reabastecer (compra)\n2)Vender productos\n3)Ver tickets\n4)SALIR ");
            opcion = scn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("----------------------------------------:");
                    System.out.println("Ingrese alguno de los siguientes productos que desee reabastecer:");
                    System.out.println("----------------------------------------:");
                    System.out.println("1) Pollo");
                    leer(pollo);
                    System.out.println("2) Papa");
                    leer(papa);
                    System.out.println("3) Queso");
                    leer(queso);
                    System.out.println("4) Tosino");
                    leer(tosino);
                    System.out.println("----------------------------------------:");
                    System.out.println("0) SALIR");

                    int selection = scn.nextInt();
                    switch (selection) {
                        case 1:
                            System.out.println("----------------------------------------:");
                            System.out.println("Ingrese la cantidad de pollo que desea: ");
                            cantidad = scn.nextDouble();
                            System.out.println("----------------------------------------:");
                            compra(pollo, cantidad);
                            break;
                        case 2:
                            System.out.println("----------------------------------------:");
                            System.out.println("Ingrese la cantidad de papa que desea: ");
                            cantidad = scn.nextDouble();
                            System.out.println("----------------------------------------:");
                            compra(papa, cantidad);
                            break;
                        case 3:
                            System.out.println("----------------------------------------:");
                            System.out.println("Ingrese la cantidad de queso que desea: ");
                            cantidad = scn.nextDouble();
                            System.out.println("----------------------------------------:");
                            compra(papa, cantidad);
                            break;
                        case 4:
                            System.out.println("----------------------------------------:");
                            System.out.println("Ingrese la cantidad de tosino que desea: ");
                            cantidad = scn.nextDouble();
                            System.out.println("----------------------------------------:");
                            compra(tosino, cantidad);
                            break;
                        case 0:
                            System.out.println("Gracias por su tiempo -.-");
                            System.out.println("----------------------------------------:");
                            compra(tosino, cantidad);
                            break;

                        default:
                            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                            System.out.println("Ingrese una opcion valida: ");
                            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

                            break;
                    }
                    break;
                case 2:
                    System.out.println("----------------------------------------:");
                    System.out.println("Seleccione el producto que desea vender:");
                    System.out.println("----------------------------------------:");
                    System.out.println("1) Pollo");
                    leer(pollo);
                    System.out.println("2) Papa");
                    leer(papa);
                    System.out.println("3) Queso");
                    leer(queso);
                    System.out.println("4) Tosino");
                    leer(tosino);
                    System.out.println("----------------------------------------:");
                    System.out.println("0) SALIR");

                    int selection2 = scn.nextInt();
                    switch (selection2) {
                        case 1:
                            System.out.println("----------------------------------------:");
                            System.out.println("Ingrese la cantidad de pollo que desea: ");
                            cantidad = scn.nextDouble();
                            System.out.println("----------------------------------------:");
                            venta(pollo, cantidad);
                            break;
                        case 2:
                            System.out.println("----------------------------------------:");
                            System.out.println("Ingrese la cantidad de papa que desea: ");
                            cantidad = scn.nextDouble();
                            System.out.println("----------------------------------------:");
                            venta(papa, cantidad);
                            break;
                        case 3:
                            System.out.println("----------------------------------------:");
                            System.out.println("Ingrese la cantidad de queso que desea: ");
                            cantidad = scn.nextDouble();
                            System.out.println("----------------------------------------:");
                            venta(papa, cantidad);
                            break;
                        case 4:
                            System.out.println("----------------------------------------:");
                            System.out.println("Ingrese la cantidad de tosino que desea: ");
                            cantidad = scn.nextDouble();
                            System.out.println("----------------------------------------:");
                            venta(tosino, cantidad);
                            break;
                        case 0:
                            System.out.println("Gracias por su tiempo -.-");
                            System.out.println("----------------------------------------:");
                            break;

                        default:
                            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                            System.out.println("Ingrese una opcion valida: ");
                            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

                            break;
                    }
                    break;
                case 3:
                    verTickets();
                    break;
                case 4:
                    System.out.println("¡Regrese pronto!");
                    break;

                default:

                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("Ingrese una opcion valida");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    break;
            }
        }
    }

    /**
     * Función que revisa arreglos bidimensionales fila por fila para ver si no
     * contiene valores.
     * 
     * @param array
     * @param fila
     * @return true o false
     */
    static boolean esFilaVacia(double[][] array, int fila) {
        for (int columna = 0; columna < array[fila].length; columna++) {
            if (array[fila][columna] != 0.0) {
                return false; // Si se encuentra un elemento distinto de 0, la fila no está vacía
            }
        }
        return true; // Si no se encontraron elementos distintos de 0, la fila está vacía
    }

    /**
     * Realiza la impresión de los tickets generados por venta de productos
     * 
     */
    static void verTickets() {
        System.out.println("----------------------------------------:");
        for (int i = 0; i < tickets.length; i++) {
            if (esFilaVacia(tickets, i)) {
                return;
            } else {
                for (double[] fila : tickets) {
                    for (double elemento : fila) {
                        // Revisa que el id que va imprimir sea valido.
                        if (elemento == 0) {
                            return;
                        }
                        System.out.println("\t" + elemento);
                    }
                    System.out.println("----------");
                }
                System.out.println("----------------------------------------:");
            }
        }
    }
}
