public class Main {
    public static void main(String[] args) {
        Cafetera miCafetera = new Cafetera();

        System.out.println("Cantidad actual de café: " + miCafetera.getCantidadActual() + " C.C");

        miCafetera.llenarCafetera();

        System.out.println("Cantidad actual de café: " + miCafetera.getCantidadActual() + " C.C");

        miCafetera.servirTaza(150);
        System.out.println("Cantidad actual de café: " + miCafetera.getCantidadActual() + " C.C");
        miCafetera.agregarCafe(250);

        System.out.println("Cantidad actual de café: " + miCafetera.getCantidadActual() + " C.C");
        miCafetera.vaciarCafetera();

        System.out.println("Cantidad actual de café: " + miCafetera.getCantidadActual() + " C.C");
    }
}
