package Entity.Hoteles;

public class Hotel5 extends Hotel4{
    protected int cantidadLimosinas;
    protected int cantidadSalones;
    protected int cantidadSuits;
    protected double precioTotal;

    public Hotel5(){}

    public Hotel5(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones,
                  int numeroCamas, int cantidadPisos, String tipoGimnasio,
                  String nombreRestaurante, int capacidadRestaurante, int cantidadLimosinas, int cantidadSalones,
                  int cantidadSuits) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos,
                tipoGimnasio, nombreRestaurante, capacidadRestaurante);
        this.cantidadLimosinas = cantidadLimosinas;
        this.cantidadSalones = cantidadSalones;
        this.cantidadSuits = cantidadSuits;
        this.precioTotal = calcularPrecioHabitacion();
    }

    @Override
    public double getPrecioTotal() {
        return calcularPrecioHabitacion();
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public int getCantidadSalones() {
        return cantidadSalones;
    }

    public void setCantidadSalones(int cantidadSalones) {
        this.cantidadSalones = cantidadSalones;
    }

    public int getCantidadSuits() {
        return cantidadSuits;
    }

    public void setCantidadSuits(int cantidadSuits) {
        this.cantidadSuits = cantidadSuits;
    }
    @Override
    public String toString() {
        return "Hotel *****{" +
                "nombre='" + getNombre() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", localidad='" + getLocalidad() + '\'' +
                ", gerente='" + getGerente() + '\'' +
                ", cantidadHabitaciones=" + cantidadHabitaciones +
                ", numeroCamas=" + numeroCamas +
                ", cantidadPisos=" + cantidadPisos +
                ", tipoGimnasio=" + tipoGimnasio +
                ", nombreRestaurante='" + nombreRestaurante + '\'' +
                ", capacidadRestaurante=" + capacidadRestaurante +
                ", cantidadLimosinas=" + cantidadLimosinas +
                ", preciototal=" + getPrecioTotal() +
                '}';
    }

    @Override
    public double calcularPrecioHabitacion() {
        int valorLimosinas;

        valorLimosinas = getCantidadLimosinas() *15;

        return super.calcularPrecioHabitacion() + valorLimosinas;

    }
}
