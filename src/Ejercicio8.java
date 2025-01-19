import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la longitud del rectángulo: ");
        var longitud = scanner.nextDouble();
        
        System.out.print("Introduce el ancho del rectángulo: ");
        var ancho = scanner.nextDouble();
       
        var area = longitud * ancho;
        var perimetro = 2 * (longitud + ancho);

        System.out.println("Área del rectángulo: " + area);
        System.out.println("Perímetro del rectángulo: " + perimetro);

        scanner.close();
    }
}
