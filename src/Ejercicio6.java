public class Ejercicio6 {
    public static void main(String[] args) {
        var precioTotalPantalonesConDescuento = 34;
        //los pantalones se vendieron al 85% de su precio original
        var precioPantalonesSinDescuento = precioTotalPantalonesConDescuento/0.85;
        System.out.println("El precio de los pantalones sin descuento es: " + precioPantalonesSinDescuento);
        var precioTotalPantalones = precioPantalonesSinDescuento - precioPantalonesSinDescuento*0.15;
        System.out.println("precio de pantalones con el 15% de descuento: "+ precioTotalPantalones );
    }
    
}
