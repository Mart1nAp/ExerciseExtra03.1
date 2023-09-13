package Service;

import Entity.Hoteles.Hotel5;

public class ServiceHotel5 extends ServiceHotel4{

    Hotel5 hot1 = new Hotel5();

    @Override
    public double calcularPrecioHabitacion() {
        int valorLimosinas;

        valorLimosinas = hot1.getCantidadLimosinas() *15;

        return super.calcularPrecioHabitacion() + valorLimosinas;

    }
}
