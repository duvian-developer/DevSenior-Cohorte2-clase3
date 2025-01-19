public class Ejercicio5 {
    public static void main(String[] args) {

        var descuentoPC= 0.10;
        var costoPC = 660;
        var valorDescuento = costoPC*descuentoPC;
        var costoPCconDescuento = costoPC - valorDescuento;

        System.out.println("El PC tiene un valor de: " + costoPC + " al aplicar un decuento del "+descuentoPC+"%"+ " El costo total del Pc sería de: "+costoPCconDescuento);

        
    }
}
