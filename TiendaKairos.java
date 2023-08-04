import java.util.Scanner;
public class TiendaKairos {
    static Scanner scan = new Scanner(System.in);

    static float[][] productos = { { 0, 24, 100 }, { 1, 17, 100 }, { 2, 157, 100 }, { 3, 92, 100 } };

    static int numProducto = 0;
    static float total = 0;
    static boolean regresar;
    static float cantidad = 0;

    public static void main(String[] args) {
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("Ingrese la opcion a realizar \n1) Compra \n2) Venta \n3) Ver productos \n4) Salir");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("------------------------");
                    System.out.println("Seleccione el prdoducto que desea restablecer.");
                    System.out.println("------------------------");
                    System.out.println("1. Pollo. \n2. Papa . \n3. Queso. \n4. Tosino. \n5. Regresar.");
                    System.out.println("------------------------");
                    numProducto = scan.nextInt();
                    System.out.println("------------------------");
                    compraProductos();
                    break;
                case 2:
                    System.out.println("------------------------");
                    System.out.println("Seleccione el prdoducto que desea comprar.");
                    System.out.println("------------------------");
                    System.out.println(
                            "1. Pollo $24 el Kilo. \n2. Papa $17 el Kilo. \n3. Queso $157 la unidad. \n4. Tosino $92 el Kilo. \n------------------------ \n5. Regresar.");
                    System.out.println("------------------------");
                    numProducto = scan.nextInt();
                    System.out.println("------------------------");

                    ventaProductos();
                    break;
                case 3:
                    verProductos();
                    break;
                case 4:
                    System.out.println("Nos vemos pronto");
                    break;
            }
        }
    }

    static void compraProductos() {
        while (!regresar) {
            switch (numProducto) {
                case 1:
                    System.out.println("Ingrese la cantidad que desea restableacer.");
                    System.out.println("------------------------");
                    cantidad = scan.nextFloat(); 
                    productos[0][2] += cantidad;
                    System.out.println("------------------------");
                    System.out.println("Se realizo la compra.");
                    System.out.println("Cantidad actualizada: Pollo " + productos[0][2]);
                    break;

                case 2:
                    System.out.println("Ingrese la cantidad que desea restableacer.");
                    System.out.println("------------------------");
                    cantidad = scan.nextFloat();
                    productos[1][2] += cantidad;
                    System.out.println("------------------------");
                    System.out.println("Se realizo la compra.");
                    System.out.println("Cantidad actualizada: Papa " + productos[1][2]);
                    break;

                case 3:
                    System.out.println("Ingrese la cantidad que desea restableacer.");
                    System.out.println("------------------------");
                    cantidad = scan.nextFloat();
                    productos[2][2] += cantidad;
                    System.out.println("------------------------");
                    System.out.println("Se realizo la compra.");
                    System.out.println("Cantidad actualizada: Queso " + productos[2][2]);
                    break;

                case 4:
                    System.out.println("Ingrese la cantidad que desea restableacer.");
                    System.out.println("------------------------");
                    cantidad = scan.nextFloat();
                    productos[3][2] += cantidad;
                    System.out.println("------------------------");
                    System.out.println("Se realizo la compra.");
                    System.out.println("Cantidad actualizada: Tosino " + productos[3][2]);
                    break;
                case 5:
                    regresar = true;
                    System.out.println("Nos vemos pronto.");
                    break;
            }
        }
    }

    public static void ventaProductos() {
        while (!regresar) {
            switch (numProducto) {
                case 1:
                    System.out.println("Ingrese la cantidad que desea comprar.");
                    System.out.println("------------------------");
                    cantidad = scan.nextFloat();
                    productos [0][2] -= cantidad;
                    total += productos[0][1] * cantidad;
                    System.out.println("------------------------");
                    System.out.println("Se realizo la compra.");
                    System.out.println(
                            "Compro " + cantidad + " de Pollo. \nCosto total del Pollo solicitado: $"
                                    + productos[0][1] * cantidad);
                    break;

                case 2:
                    System.out.println("Ingrese la cantidad que desea comprar.");
                    System.out.println("------------------------");
                    cantidad = scan.nextFloat();
                    productos [1][2] -= cantidad;
                    total += productos[1][1] * cantidad;
                    System.out.println("------------------------");
                    System.out.println("Se realizo la compra.");
                    System.out
                            .println("Compro " + cantidad + " de Papa. \nCosto total del Papa solicitado: $"
                                    + productos[1][1] * cantidad);
                    break;

                case 3:
                    System.out.println("Ingrese la cantidad que desea comprar.");
                    System.out.println("------------------------");
                    cantidad = scan.nextFloat();
                    productos [2][2] -= cantidad;
                    total += productos[2][1] * cantidad;
                    System.out.println("------------------------");
                    System.out.println("Se realizo la compra.");
                    System.out.println(
                            "Compro " + cantidad + " de Queso. \nCosto total del Queso solicitado: $"
                                    + productos[2][1] * cantidad);
                    break;

                case 4:
                    System.out.println("Ingrese se la cantidad que desea comprar.");
                    System.out.println("------------------------");
                    cantidad = scan.nextFloat();
                    productos [3][2] -= cantidad;
                    total += productos[3][1] * cantidad;
                    System.out.println("------------------------");
                    System.out.println("Se realizo la compra.");
                    System.out.println(
                            "Compro " + cantidad + " de Tosino. \nCosto total del Tosino solicitado: $"
                                    + productos[3][1] * cantidad);
                    break;

                case 5:
                    regresar = true;
                    System.out.println("El total de su compra es: $" + total + "\nGracias, vuelva pronto.");
                    break;

                default:
                    System.out.println("Lo sentimos no contamos con ese producto.");
                    break;
            }
            break;
        }
    }

    public static void verProductos() {
        for (int i = 0; i < productos.length; i++) {
            System.out.println(
                    productos[0][i] + "\t" + productos[1][i] + "\t" + productos[2][i] + "\t" + productos[3][i]);
        }

    }


}
