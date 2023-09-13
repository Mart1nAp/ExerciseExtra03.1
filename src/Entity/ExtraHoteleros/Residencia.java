package Entity.ExtraHoteleros;
public class Residencia extends ExtraHoteleros{

    protected int cantidadHabitaciones;
    protected boolean hacenDescuentos;
    protected String poseeCampoDeportivo;

    public Residencia(){}

    public Residencia(String nombre, String direccion, String localidad, String gerente, String esPrivado, double area,
                      int cantidadHabitaciones, boolean hacenDescuentos, String poseeCampoDeportivo) {
        super(nombre, direccion, localidad, gerente, esPrivado, area);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.hacenDescuentos = hacenDescuentos;
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean getHacenDescuentos() {
        return hacenDescuentos;
    }

    public void setHacenDescuentos(boolean hacenDescuentos) {
        this.hacenDescuentos = hacenDescuentos;
    }

    public String getPoseeCampoDeportivo() {
        return poseeCampoDeportivo;
    }

    public void setPoseeCampoDeportivo(String poseeCampoDeportivo) {
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" +
                "nombre='" + getNombre() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", localidad='" + getLocalidad() + '\'' +
                ", gerente='" + getGerente() + '\'' +
                ", esPrivado=" + getEsPrivado() +
                ", area=" + getArea()  +
                ", cantidadHabitaciones=" + getCantidadHabitaciones() +
                ", haceDescuentos=" + getHacenDescuentos() +
                ", tieneCampoDeportivo=" + getPoseeCampoDeportivo() +
                '}';
    }
}
