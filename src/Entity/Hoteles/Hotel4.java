package Entity.Hoteles;

public class Hotel4 extends Hoteles{

    protected String tipoGimnasio;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;
    protected double precioTotal;



    public Hotel4(){}

    public Hotel4(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones,
                  int numeroCamas, int cantidadPisos, String tipoGimnasio, String nombreRestaurante,
                  int capacidadRestaurante) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos);
        this.tipoGimnasio = tipoGimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.precioTotal = calcularPrecioHabitacion();
    }

    public double getPrecioTotal() {
        return calcularPrecioHabitacion();
    }

    public String getTipoGimnasio() {
        return tipoGimnasio;
    }

    public void setTipoGimnasio(String tipoGimnasio) {
        this.tipoGimnasio = tipoGimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }
    @Override
    public String toString() {
        return "Hotel ****{" +
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
                ", preciototal=" + getPrecioTotal() +
                '}';
    }

    public double calcularPrecioHabitacion() {
        double valorRestaurante;
        double valorGimnasio;

        if (getCapacidadRestaurante()< 30) {
            valorRestaurante = 10;
        } else if (getCapacidadRestaurante() <= 50) {
            valorRestaurante = 30;
        } else {
            valorRestaurante = 50;
        }

        if (getTipoGimnasio().equalsIgnoreCase("A")) {
            valorGimnasio = 50;
        }else {
            valorGimnasio = 30;
        }

        return 50 + (getCantidadHabitaciones()) + valorRestaurante + valorGimnasio;
    }
}
