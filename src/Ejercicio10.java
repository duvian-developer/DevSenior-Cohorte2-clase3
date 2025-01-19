import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Introduce el primer número: ");
        var num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        var num2 = scanner.nextDouble();

        System.out.print("Introduce el tercer número: ");
        var num3 = scanner.nextDouble();
        
        var media = (num1 + num2 + num3) / 3;        
        System.out.println("La media aritmética de los tres números es: " + media);

      
        scanner.close();
    }
    
}
