/*3. Una compañía de promociones turísticas desea mantener información sobre la infraestructura
        de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
        acuerdo con sus posibilidades.

        -- Los alojamientos se identifican por un nombre, una dirección,
        una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
        alojamientos:

        --Hoteles y Alojamientos Extrahoteleros.
        Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
        Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
        características de las distintas categorías son las siguientes:

        • Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
        Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
        • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
        Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
        Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.

        Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
        acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
        cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
        será.

        El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
        PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
        agregado por gimnasio) + (valor agregado por limosinas).
        Donde:
        Valor agregado por el restaurante:
        • $10 si la capacidad del restaurante es de menos de 30 personas.
        • $30 si está entre 30 y 50 personas.
        • $50 si es mayor de 50.
        Valor agregado por el gimnasio:
        • $50 si el tipo del gimnasio es A.
        • $30 si el tipo del gimnasio es B.
        Valor agregado por las limosinas:
        • $15 por la cantidad de limosinas del hotel.

        En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
        hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
        Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
        cuadrados que ocupa.
        Existen dos tipos de alojamientos extrahoteleros: los Camping y las Residencias.

        Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
        disponibles y si posee o no un restaurante dentro de las instalaciones.

        Para las residencias se indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y
        si posee o no campo deportivo. Realizar un programa en el que se representen todas las relaciones
        descriptas.

        Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
        • todos los alojamientos.
        • todos los hoteles de más caro a más barato.
        • todos los campings con restaurante
        • todos las residencias que tienen descuento.*/

import Entity.Alojamiento;
import Entity.ExtraHoteleros.Camping;
import Entity.ExtraHoteleros.Residencia;
import Entity.Hoteles.Hotel4;
import Entity.Hoteles.Hotel5;
import Entity.Hoteles.Hoteles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();

        alojamientos.add(new Hotel4("Hotel A", "Dirección A", "Localidad A", "Gerente A",
                40, 100, 9, 50000.0, "A",
                "cielo", 50));
        alojamientos.add(new Hotel4("Hotel B", "Dirección B", "Localidad B", "Gerente B",
                80, 160, 9, 80000.0, "A",
                "campo", 70));
        alojamientos.add(new Hotel5("Hotel C", "Dirección C", "Localidad C", "Gerente C",
                100, 250, 15, 5000.0, "A",
                "plato", 50, 2, 10, 12));
        alojamientos.add(new Hotel5("Hotel D", "Dirección D", "Localidad D", "Gerente D",
                140, 300, 20, 700000.0, "A",
                "posillo", 80, 2, 15, 22));

        alojamientos.add(new Camping("Camping A", "Dirección C", "Localidad C",
                "Gerente C", "si", 5000, 300, 10,
                false));
        alojamientos.add(new Camping("Camping B", "Dirección B", "Localidad B",
                "Gerente B", "si", 100, 20, 2, true));


        alojamientos.add(new Residencia("Residencia A", "Dirección D", "Localidad D",
                "Gerente D", "si", 2000, 50, true,
                "si"));
        alojamientos.add(new Residencia("Residencia B", "Dirección B", "Localidad B",
                "Gerente B", "si", 300, 10, true, "si"));


        // *___________Menu____________*

        int opcion;
        do {
            System.out.println(" ");
            System.out.println("Ingrese el numeral de la acción a realizar: ");
            System.out.println("1. todos los alojamientos.");
            System.out.println("2. todos los hoteles de más caro a más barato.");
            System.out.println("3. todos los campings con restaurante.");
            System.out.println("4. todos las residencias que tienen descuento.");
            System.out.println("5. Salir.");
            opcion = leer.nextInt();


            switch (opcion) {
                case 1:
                    // Consultar todos los alojamientos
                    System.out.println("Todos los alojamientos:");
                    for (Alojamiento alojamiento : alojamientos) {
                        System.out.println(alojamiento);
                    }
                    break;
                case 2:
                    // Consultar todos los hoteles de más caro a más barato
                    System.out.println("\nHoteles de más caro a más barato:");
                    System.out.println("-----------------------------------");
                    ArrayList<Hoteles> hotel = new ArrayList<>();
                    for (Alojamiento elec : alojamientos) {
                        if (elec instanceof Hotel4 || elec instanceof Hotel5) {
                            hotel.add((Hoteles) elec);
                        }
                    }
                    // Define un comparador personalizado para comparar los objetos por el atributo deseado
                    Comparator<Hoteles> comparador = new Comparator<Hoteles>() {

                        @Override
                        public int compare(Hoteles obj1, Hoteles obj2) {
                            // Comparar los objetos en función del atributo deseado (en este caso, el valor)
                            // Orden descendente (de mayor a menor)
                            return Double.compare(obj2.getPrecioHabitacion(), obj1.getPrecioHabitacion());
                        }
                    };
                    // Ordena la lista de objetos utilizando el comparador
                    Collections.sort(hotel, comparador);

                    // Imprime la lista ordenada
                    for (Hoteles miObjeto : hotel) {
                        System.out.println(miObjeto);
                    }
                    break;
                case 3:
                    // Consultar todos los campings con restaurante
                    System.out.println("\nCampings con restaurante:");
                    alojamientos.stream()
                            .filter(alojamiento -> alojamiento instanceof Camping)
                            .map(alojamiento -> (Camping) alojamiento)
                            .filter(Camping::getPoseeRestaurante)
                            .forEach(System.out::println);
                    break;
                case 4:
                    // Consultar todas las residencias que tienen descuento
                    System.out.println("\nResidencias con descuento:");
                    alojamientos.stream()
                            .filter(alojamiento -> alojamiento instanceof Residencia)
                            .map(alojamiento -> (Residencia) alojamiento)
                            .filter(Residencia::getHacenDescuentos)
                            .forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese un numeral correcto.");

            }
        } while (opcion != 5);

    }
}