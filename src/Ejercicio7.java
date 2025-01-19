import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Intoduce el primer número");
        var num1 = scann.nextInt();
        System.out.println("Intoduce el segundo número");
        var num2 = scann.nextInt();

        //operaciones
        var suma = num1+num2;
        var resta = num1-num2;
        var multiplicacion = num1*num2;
        double division;
        if(num2!=0){
            division = num1/num2;
        } else {
            division = Double.NaN;
        }
         

        System.out.println("la suma de "+ num1 + " + " + num2 + " es de: "+ suma);
        System.out.println("la resta de "+ num1 + " - " + num2 + " es de: "+ resta);
        System.out.println("la multiplicación de "+ num1 + " * " + num2 + " es de: "+ multiplicacion);
        System.out.println("la división de "+ num1 + " / " + num2 + " es de: "+ division);

        scann.close();;

       
    }
}
