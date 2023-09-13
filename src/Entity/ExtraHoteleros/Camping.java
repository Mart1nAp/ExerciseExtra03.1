package Entity.ExtraHoteleros;

public class Camping extends ExtraHoteleros{
    protected int capacidadMaximaCarpas;
    protected int cantidadBanos;
    protected boolean poseeRestaurante;

    public Camping(){}

    public Camping(String nombre, String direccion, String localidad, String gerente, String esPrivado, double area,
                   int capacidadMaximaCarpas, int cantidadBanos, boolean poseeRestaurante) {
        super(nombre, direccion, localidad, gerente, esPrivado, area);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBanos = cantidadBanos;
        this.poseeRestaurante = poseeRestaurante;
    }

    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public void setCapacidadMaximaCarpas(int capacidadMaximaCarpas) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
    }

    public int getCantidadBanos() {
        return cantidadBanos;
    }

    public void setCantidadBanos(int cantidadBanos) {
        this.cantidadBanos = cantidadBanos;
    }

    public boolean getPoseeRestaurante() {
        return poseeRestaurante;
    }

    public void setPoseeRestaurante(boolean poseeRestaurante) {
        this.poseeRestaurante = poseeRestaurante;
    }

    @Override
    public String toString() {
        return "Camping{" +
                "nombre='" + getNombre() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", localidad='" + getLocalidad() + '\'' +
                ", gerente='" + getGerente() + '\'' +
                ", esPrivado=" + getEsPrivado() +
                ", area=" + getArea() +
                ", capacidadMaximaCarpas=" + getCapacidadMaximaCarpas() +
                ", cantidadBaños=" + getCantidadBanos() +
                ", tieneRestaurante=" + getPoseeRestaurante() +
                '}';
    }
}
