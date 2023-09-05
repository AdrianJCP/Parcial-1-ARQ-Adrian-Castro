public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;
    public Cafetera() {
        this.capacidadMaxima = 1000;

        this.cantidadActual = 0;
    }
    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    public void servirTaza(int cantidad) {
        if (cantidadActual >= cantidad) {
            cantidadActual -= cantidad;
            System.out.println("Se a servido una taza de cafe ---->" + cantidad + " C.C de café.");
        } else {
            System.out.println("No hay suficiente café en la cafetera. Se sirvió lo que quedaba.");
            cantidadActual = 0;
        }
    }
    public void vaciarCafetera() {
        cantidadActual = 0;
    }
    public void agregarCafe(int cantidad) {
        if (cantidadActual + cantidad <= capacidadMaxima) {
            cantidadActual += cantidad;
            System.out.println("Se agregaron ---> " + cantidad + " C.C de café a la cafetera.");
        } else {
            System.out.println ("¡UPS! la cafetera esta llena no se puede llenar mas");
        }
    }
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public int getCantidadActual() {
        return cantidadActual;
    }
}



//Adrian Jose Castro Perez
//722983
//Ingenieria de Sistemas




