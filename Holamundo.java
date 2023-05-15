public class Holamundo {

    char A = 'A';
    int a = 789 ,b = 465 ,c = 123;
    boolean binario = true;
    static float decimal;
    byte es_byte;

    public static void main(String[] args) {
        double a = 300.165156854116524;
        double b = 2;
        float resultado = (float) (a + b);
        System.out.println("La suma es: " +  resultado);

        resultado  = (float) (a /  b);
        System.out.println("La division es: " + resultado);
        
        resultado  = (float) (a - b);
        System.out.println("La resta es: " + resultado);
        
        resultado  = (float) (a * b);
        System.out.println("La multiplicacion es: " + resultado);
    }
}