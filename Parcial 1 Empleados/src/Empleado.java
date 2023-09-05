public class Empleado {
    private String cedula;
    private double sueldoBase;
    private double pagoHoraExtra;
    private int horasExtra;
    private String tipo;
    private boolean casado;
    private int numeroHijos;

    public Empleado(String cedula) {
        this.cedula = cedula;
        this.sueldoBase = 1145000.0;
        this.pagoHoraExtra = 25000.0;
        this.horasExtra = 0;
        this.tipo = "Servicios generales";
        this.casado = false;
        this.numeroHijos = 0;
    }


    public double calcularValorHorasExtra() {
        return pagoHoraExtra * horasExtra;
    }


    public double calcularSueldoBruto() {
        return sueldoBase + calcularValorHorasExtra();
    }


    public double calcularRetenciones() {
        double porcentajeRetencion = obtenerPorcentajeRetencion();
        return calcularSueldoBruto() * (porcentajeRetencion / 100);
    }

    private double obtenerPorcentajeRetencion() {
        double porcentajeBase = 0.0;

        switch (tipo) {
            case "Servicios generales":
                porcentajeBase = 8.0;
                break;
            case "Por emolumentos eclesiásticos":
                porcentajeBase = 6.0;
                break;
            case "Servicios de transporte de carga":
                porcentajeBase = 4.0;
                break;
            default:
                porcentajeBase = 8.0;
        }


        if (casado) {
            porcentajeBase -= 2.0;
        }
        porcentajeBase -= numeroHijos;

        return Math.max(porcentajeBase, 0.0);
    }


    public void mostrarInformacion() {
        double sueldoNeto = calcularSueldoBruto() - calcularRetenciones();

        System.out.println("Información del empleado:");
        System.out.println("Cédula: " + cedula);
        System.out.println("Sueldo base: " + sueldoBase);
        System.out.println("Pago por hora extra: " + pagoHoraExtra);
        System.out.println("Horas extra realizadas: " + horasExtra);
        System.out.println("Tipo: " + tipo);
        System.out.println("Casado: " + casado);
        System.out.println("Número de hijos: " + numeroHijos);
        System.out.println("Sueldo bruto: " + calcularSueldoBruto());
        System.out.println("Retención: " + calcularRetenciones());
        System.out.println("Sueldo neto: " + sueldoNeto);
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("1234567890");
        empleado1.horasExtra = 10;
        empleado1.tipo = "Por emolumentos eclesiásticos";
        empleado1.casado = true;
        empleado1.numeroHijos = 2;

        empleado1.mostrarInformacion();
    }
}

//Adrian Jose Castro Perez
//722983
//Ingenieria de Sistemas
