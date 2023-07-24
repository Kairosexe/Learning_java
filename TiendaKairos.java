import java.util.Scanner;

public class TiendaKairos {
    static Scanner scan = new Scanner(System.in);
    static float[][] productos = { { 0, 24, 100 }, { 1, 17, 100 }, { 2, 157, 100 }, { 3, 92, 100 } };

    public static void main(String[] args) {
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("Ingrese la opcion a realizar \n1) Compra \n2) Venta \n3) Ver productos \n4) Salir");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    verProductos();
                    break;
                case 4:

                    break;

            }
        }
    }

    static void verProductos() {
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[0][i] + "\t" + productos[1][i] + "\t" + productos[2][i] + "\t" + productos[3][i]);
        }

    }
}
