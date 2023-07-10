import java.util.Scanner;

public class castillo {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String objetos_magicos[] = new String[4];

        objetos_magicos[0] = "Caldera";
        objetos_magicos[1] = "Posion";
        objetos_magicos[2] = "Escoba";
        objetos_magicos[3] = "Puerta magica";
        String objeto = "";

        while (!objeto.equals("Salir")) {

            System.out.println("Ingresa el objeto magico: ");
            objeto = scan.nextLine();

            if (objeto.equals("Salir")) {
                break;
            }
            boolean encontrado = false;
            // Contador 0
            for (int i = 0; i < 4; i++) {
                encontrado = objeto.equals(objetos_magicos[i]);
                if (encontrado) {
                    System.out.println("Encontrado");
                    break;
                }
            }
        }

    }

}
