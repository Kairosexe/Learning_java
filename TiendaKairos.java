import java.util.Scanner;

public class TiendaKairos {
    static Scanner scan = new Scanner(System.in);

    static float[][] productos = { { 0, 24, 100 }, { 1, 17, 100 }, { 2, 157, 100 }, { 3, 92, 100 } };

    static int numProducto = 0;
    static float total = 0;

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
                    System.out.println("1. Pollo. \n2. Papa . \n3. Queso. \n4. Tosino.");
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
                            "1. Pollo $24 el Kilo. \n2. Papa $17 el Kilo. \n3. Queso $157 la unidad. \n4. Tosino $92 el Kilo. \n------------------------ \n5. Salir.");
                    System.out.println("------------------------");
                    numProducto = scan.nextInt();
                    System.out.println("------------------------");
                    ventaProductos();
                    break;
                case 3:
                    verProductos();
                    break;
                case 4:
                System.out.println("El total de su compra es: $" + total + "\nGracias, vuelva pronto.");
                    break;

            }
        }
    }

    static void compraProductos() {
        switch (numProducto) {
            case 1:
                System.out.println("Ingrse la cantidad que desea restableacer.");
                System.out.println("------------------------");
                double cantidadPollo = scan.nextDouble();
                productos[0][1] += cantidadPollo;
                System.out.println("------------------------");
                System.out.println("Se realizo la compra.");
                System.out.println("Cantidad actualizada: Pollo " + productos[0][1]);
                break;

            case 2:
                System.out.println("Ingrse la cantidad que desea restableacer.");
                System.out.println("------------------------");
                double cantidadPapa = scan.nextDouble();
                productos[1][1] += cantidadPapa;
                System.out.println("------------------------");
                System.out.println("Se realizo la compra.");
                System.out.println("Cantidad actualizada: Papa " + productos[1][1]);
                break;

            case 3:
                System.out.println("Ingrse la cantidad que desea restableacer.");
                System.out.println("------------------------");
                double cantidadQueso = scan.nextDouble();
                productos[2][1] += cantidadQueso;
                System.out.println("------------------------");
                System.out.println("Se realizo la compra.");
                System.out.println("Cantidad actualizada: Queso " + productos[2][1]);
                break;

            case 4:
                System.out.println("Ingrse la cantidad que desea restableacer.");
                System.out.println("------------------------");
                double cantidadTosino = scan.nextDouble();
                productos[3][1] += cantidadTosino;
                System.out.println("------------------------");
                System.out.println("Se realizo la compra.");
                System.out.println("Cantidad actualizada: Tosino " + productos[3][1]);
                break;
        }
    }

    public static void ventaProductos() {
        switch (numProducto) {
            case 1:
                System.out.println("Ingrese la cantidad que desea comprar.");
                System.out.println("------------------------");
                double cantidadPollo = scan.nextDouble();
                total += productos[0][1] * cantidadPollo;
                System.out.println("------------------------");
                System.out.println("Se realizo la compra.");
                System.out.println(
                        "Compro " + cantidadPollo + " de Pollo. \nCosto total del Pollo solicitado: $"
                                + productos[0][1] * cantidadPollo);
                break;

            case 2:
                System.out.println("Ingrese la cantidad que desea comprar.");
                System.out.println("------------------------");
                double cantidadPapa = scan.nextDouble();
                total += productos[1][1] * cantidadPapa;
                System.out.println("------------------------");
                System.out.println("Se realizo la compra.");
                System.out
                        .println("Compro " + cantidadPapa + " de Papa. \nCosto total del Papa solicitado: $"
                                + productos[1][1] * cantidadPapa);
                break;

            case 3:
                System.out.println("Ingrese la cantidad que desea comprar.");
                System.out.println("------------------------");
                double cantidadQueso = scan.nextDouble();
                total += productos[2][1] * cantidadQueso;
                System.out.println("------------------------");
                System.out.println("Se realizo la compra.");
                System.out.println(
                        "Compro " + cantidadQueso + " de Queso. \nCosto total del Queso solicitado: $"
                                + productos[2][1] * cantidadQueso);
                break;

            case 4:
                System.out.println("Ingrese se la cantidad que desea comprar.");
                System.out.println("------------------------");
                double cantidadTosino = scan.nextDouble();
                total += productos[3][1] * cantidadTosino;
                System.out.println("------------------------");
                System.out.println("Se realizo la compra.");
                System.out.println(
                        "Compro " + cantidadTosino + " de Tosino. \nCosto total del Tosino solicitado: $"
                                + productos[3][1] * cantidadTosino);
                break;

            case 5:
                System.out.println("Gracias, vuelva pronto. \n su compra total fue $" + total);
                break;

            default:
                System.out.println("Lo sentimos no contamos con ese producto.");
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
