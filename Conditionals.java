public class Conditionals {
    public static void main(String[] args) {

        int numero = 8;
        int numero2 = 9;

        // Confrima si el numero es positivo o negativo.
        if (numero > 0) {
            System.out.println("Es positivo.");
        } else {
            System.out.println("Es negativo.");
        }
        
        // Confrima si el numero es "Cero".
        if (numero == 0) {
            System.out.println("Es cero");
        } else {
            System.out.println("La neta, la neta... no te entiendo nada carnal, escribe bien, dame el numero que te pido.");
        }

        // Confrima si el numero es par o inpar.
        if (numero % 2 == 0) {
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar.");
        } 
        
        // Confrima si el numero es divisible entre otro numero.
        if (numero % numero2 == 0) {
            System.out.println("Si se puede dividir.");
        } else {
            System.out.println("Nel, no se puede dividir, calale con otro.");
        } 
        
    }
}