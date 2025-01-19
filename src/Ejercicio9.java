import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Introduce la temperatura en grados Celsius: ");
        var celsius = scanner.nextDouble();       
        var fahrenheit = (celsius * 9 / 5) + 32;
        var kelvin = celsius + 273.15;      
        System.out.println(celsius + " °C equivalen a " + fahrenheit + " °F y " + kelvin + " K.");      
        scanner.close();
    }
    
}
