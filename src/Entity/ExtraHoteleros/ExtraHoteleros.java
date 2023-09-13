package Entity.ExtraHoteleros;

import Entity.Alojamiento;

public class ExtraHoteleros extends Alojamiento {

        protected String esPrivado;
        protected double area;

    public ExtraHoteleros(){}

    public ExtraHoteleros(String nombre, String direccion, String localidad, String gerente, String esPrivado,
                          double area) {
        super(nombre, direccion, localidad, gerente);
        this.esPrivado = esPrivado;
        this.area = area;
    }

    public String getEsPrivado() {
        return esPrivado;
    }

    public void setEsPrivado(String esPrivado) {
        this.esPrivado = esPrivado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "AlojamientoExtrahotelero{" +
                "nombre='" + getNombre() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", localidad='" + getLocalidad() + '\'' +
                ", gerente='" + getGerente() + '\'' +
                ", esPrivado=" + getEsPrivado() +
                ", area=" + getArea() +
                '}';
    }
}
