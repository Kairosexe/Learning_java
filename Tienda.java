import java.util.Scanner;

public class Tienda {

    static Scanner scan = new Scanner(System.in);

    static int opcion = 0;

    static int numProducto = 0;
    static double total = 0;

    static double pollo[] = { 1, 24, 100 };
    static double papa[] = { 1, 17, 100 };
    static double queso[] = { 1, 157, 100 };
    static double tosino[] = { 1, 92, 100 };

    public static void main(String[] args) {

        System.out.println("Ingrese la opcion a realizar \n1) Compra \n2) Venta \n3) Ver productos \n4) Salir");
        opcion = scan.nextInt();
        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    System.out.println("------------------------");
                    System.out.println("Seleccione el prdoducto que desea restablecer.");
                    System.out.println("------------------------");
                    System.out.println("1. Pollo. \n2. Papa . \n3. Queso. \n4. Tosino.");
                    System.out.println("------------------------");
                    numProducto = scan.nextInt();
                    System.out.println("------------------------");

                    switch (numProducto) {
                        case 1:
                            // TODO: Realizar lectura de productos y seleccion.
                            System.out.println("Ingrse la cantidad que desea restableacer.");
                            System.out.println("------------------------");
                            double cantidadPollo = scan.nextDouble();
                            compra(pollo, cantidadPollo);
                            System.out.println("------------------------");
                            System.out.println("Se realizo la compra.");
                            System.out.println("Cantidad actualizada: Pollo " + pollo[2]);
                            break;

                        case 2:
                            System.out.println("Ingrse la cantidad que desea restableacer.");
                            System.out.println("------------------------");
                            double cantidadPapa = scan.nextDouble();
                            compra(papa, cantidadPapa);
                            System.out.println("------------------------");
                            System.out.println("Se realizo la compra.");
                            System.out.println("Cantidad actualizada: Papa " + papa[2]);
                            break;

                        case 3:
                            System.out.println("Ingrse la cantidad que desea restableacer.");
                            System.out.println("------------------------");
                            double cantidadQueso = scan.nextDouble();
                            compra(queso, cantidadQueso);
                            System.out.println("------------------------");
                            System.out.println("Se realizo la compra.");
                            System.out.println("Cantidad actualizada: Queso " + queso[2]);
                            break;

                        case 4:
                            System.out.println("Ingrse la cantidad que desea restableacer.");
                            System.out.println("------------------------");
                            double cantidadTosino = scan.nextDouble();
                            compra(tosino, cantidadTosino);
                            System.out.println("------------------------");
                            System.out.println("Se realizo la compra.");
                            System.out.println("Cantidad actualizada: Tosino " + tosino[2]);
                            break;
                    }
                    break;
                case 2:
                    venta(args);
                    break;
            }
        }
    }

    public static void venta(String[] args) {
        System.out.println("------------------------");
        System.out.println("Seleccione el prdoducto que desea comprar.");
        System.out.println("------------------------");
        System.out.println(
                "1. Pollo $24 el Kilo. \n2. Papa $17 el Kilo. \n3. Queso $157 la unidad. \n4. Tosino $92 el Kilo. \n------------------------ \n5. Salir.");
        System.out.println("------------------------");
        numProducto = scan.nextInt();
        System.out.println("------------------------");
        switch (numProducto) {
            case 1:
                System.out.println("Ingrese la cantidad que desea comprar.");
                System.out.println("------------------------");
                double cantidadPollo = scan.nextDouble();
                total += multiplicar(pollo, cantidadPollo);
                System.out.println("------------------------");
                System.out.println("Se realizo la compra.");
                System.out.println(
                        "Compro " + cantidadPollo + " de Pollo. \nCosto total del Pollo solicitado: $"
                                + multiplicar(pollo, cantidadPollo));
                break;

            case 2:
                System.out.println("Ingrese la cantidad que desea comprar.");
                System.out.println("------------------------");
                double cantidadPapa = scan.nextDouble();
                total += multiplicar(papa, cantidadPapa);
                System.out.println("------------------------");
                System.out.println("Se realizo la compra.");
                System.out
                        .println("Compro " + cantidadPapa + " de Papa. \nCosto total del Papa solicitado: $"
                                + multiplicar(papa, cantidadPapa));
                break;

            case 3:
                System.out.println("Ingrese la cantidad que desea comprar.");
                System.out.println("------------------------");
                double cantidadQueso = scan.nextDouble();
                total += multiplicar(queso, cantidadQueso);
                System.out.println("------------------------");
                System.out.println("Se realizo la compra.");
                System.out.println(
                        "Compro " + cantidadQueso + " de Queso. \nCosto total del Queso solicitado: $"
                                + multiplicar(queso, cantidadQueso));
                break;

            case 4:
                System.out.println("Ingrese se la cantidad que desea comprar.");
                System.out.println("------------------------");
                double cantidadTosino = scan.nextDouble();
                total += multiplicar(tosino, cantidadTosino);
                System.out.println("------------------------");
                System.out.println("Se realizo la compra.");
                System.out.println(
                        "Compro " + cantidadTosino + " de Tosino. \nCosto total del Tosino solicitado: $"
                                + multiplicar(tosino, cantidadTosino));
                break;

            case 5:
                System.out.println("Gracias, vuelva pronto. \n su compra total fue $" + total);
                break;

            default:
                System.out.println("Lo sentimos no contamos con ese producto.");
                break;
        }
    }

    public static void compra(double arreglo[], double cantidad) {
        arreglo[2] += cantidad;
    }

    public static double multiplicar(double arreglo[], double cantidadProducto) {
        return arreglo[1] * cantidadProducto;
    }
}
