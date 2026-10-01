import java.util.Scanner;

public class Resta {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, multiplicacion;
        System.out.println("Ingrese el primer número: ");   
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = leer.nextInt();
        multiplicacion = num1 * num2;

        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplicacion);
           
    }
    
}
