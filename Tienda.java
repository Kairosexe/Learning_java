import java.util.Scanner;

public class Tienda {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0;
        int numProducto = 0;

        double pollo[] = { 1, 24, 100 };
        double papa[] = { 1, 17, 100 };
        double queso[] = { 1, 157, 100 };
        double tosino[] = { 1, 92, 100 };

        System.out.println("Ingrese la opcion a realizar \n1) Compra \n2) Venta\n3)Ver productos \n4)Salir");
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
                    System.out.println("------------------------");
                    System.out.println("Seleccione el prdoducto que desea comprar.");
                    System.out.println("------------------------");
                    System.out.println(
                            "1. Pollo $24 el Kilo. \n2. Papa $17 el Kilo. \n3. Queso $157 la unidad. \n4. Tosino $92 el Kilo.");
                    System.out.println("------------------------");
                    numProducto = scan.nextInt();
                    System.out.println("------------------------");
                    switch (numProducto) {
                        case 1:
                            System.out.println("Ingrse la cantidad que desea comprar.");
                            System.out.println("------------------------");
                            double cantidadPollo = scan.nextDouble();
                            System.out.println("------------------------");
                            System.out.println("Se realizo la compra.");
                            System.out.println("Compro " + cantidadPollo + " de pollo. \nSu total a pagar es: $"
                                    + multiplicar(pollo, cantidadPollo));
                            break;
                        case 2:
                            System.out.println("Ingrse la cantidad que desea comprar.");
                            System.out.println("------------------------");
                            double cantidadPapa = scan.nextDouble();
                            System.out.println("------------------------");
                            System.out.println("Se realizo la compra.");
                            System.out.println("Compro " + cantidadPapa + " de pollo. \nSu total a pagar es: $"
                                    + multiplicar(papa, cantidadPapa));
                            break;
                        case 3:
                            System.out.println("Ingrse la cantidad que desea comprar.");
                            System.out.println("------------------------");
                            double cantidadQueso = scan.nextDouble();
                            System.out.println("------------------------");
                            System.out.println("Se realizo la compra.");
                            System.out.println("Compro " + cantidadQueso + " de pollo. \nSu total a pagar es: $"
                                    + multiplicar(queso, cantidadQueso));
                            break;
                        case 4:
                            System.out.println("Ingrse la cantidad que desea comprar.");
                            System.out.println("------------------------");
                            double cantidadTosino = scan.nextDouble();
                            System.out.println("------------------------");
                            System.out.println("Se realizo la compra.");
                            System.out.println("Compro " + cantidadTosino + " de pollo. \nSu total a pagar es: $"
                                    + multiplicar(tosino, cantidadTosino));
                            break;
                        default:
                            System.out.println("Lo sentimos no contamos con ese producto.");
                            continue;
                    }
                    break;
            }
        }
    }

    public static void compra(double arreglo[], double cantidad) {
        arreglo[2] += cantidad;
    }

    public static int multiplicar(double arreglo[], double cantidad) {
        return arreglo[1] * cantidad;
    }
}