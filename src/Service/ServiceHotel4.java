package Service;

import Entity.Hoteles.Hotel4;

public class ServiceHotel4 {

    Hotel4 hot1 = new Hotel4();
    public double calcularPrecioHabitacion() {
        double valorRestaurante;
        double valorGimnasio;

        if (hot1.getCapacidadRestaurante()< 30) {
            valorRestaurante = 10;
        } else if (hot1.getCapacidadRestaurante() <= 50) {
            valorRestaurante = 30;
        } else {
            valorRestaurante = 50;
        }

        if (hot1.getTipoGimnasio().equalsIgnoreCase("A")) {
            valorGimnasio = 50;
        }else {
            valorGimnasio = 30;
        }

        return 50 + (hot1.getCantidadHabitaciones()) + valorRestaurante + valorGimnasio;
    }

}
