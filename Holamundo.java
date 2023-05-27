public class Holamundo {

    char A = 'A';
    int a = 789 ,b = 465 ,c = 123;
    boolean binario = true;
    static float decimal;
    byte es_byte;

    //Este es un ejemplo de una calculadora
    public static void main(String[] args) {
        // El tipo de dato double tiene como funcion ejecutar numeros reales dobles.
        double a = 300.24; 
        double b = 0.5; 
        // El tipo de dato float tiene como funcion ejecutar numeros reales simples. 
        // Este es el cating de "double" a "float".
        float resultado = (float) (a + b); 
        System.out.println("La suma es: " + resultado);

        // Este es el cating de "double" a "float".
        resultado  = (float) (a / b);                                    
        System.out.println("La division es: " + resultado);
        
        // Este es el cating de "double" a "float". 
        resultado  = (float) (a - b);
        System.out.println("La resta es: " + resultado);
        
        // Este es el cating de "double" a "float".
        resultado  = (float) (a * b);
        System.out.println("La multiplicacion es: " + resultado);
    }
}