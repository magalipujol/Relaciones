import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


public class NewMain {
    public static void main(String[] args) {
        // Cine cine = new Cine();
        // Integer[] filas = {1, 2, 3, 4, 5, 6, 7, 8};
        // String [] columnas = {"A", "B", "C", "D", "E", "F"};
        
        
        // // creo varias peliculas
        // Pelicula pelicula1 = new Pelicula("Bee Movie", 95, 8);
        // Pelicula pelicula2 = new Pelicula("Messi: la peli", 10, 10);
        // Pelicula pelicula3 = new Pelicula("Maradona papá", 113, 21);
        
        // // creo el cine con 8 filas y 6 columnas (48 asientos disponibles)
        // cine.crearCine(filas, columnas, 100, pelicula1);
        // System.out.println("Butacas matrix");
        // cine.mostrarButacas(filas, columnas);

        // // creo varios espectadores
        // ArrayList<Espectador> espectadores = crearXCantidadDeEspectadores(10);
        // for (Espectador espectador : espectadores) {
        //     System.out.print(espectador + ", ");
        // }
        // System.out.println("Cantidad de espectadores total: " + espectadores.size());

        // System.out.println("Espectadores que pueden ver la peli: " + cine.espectadoresQuePuedenVerLaPeli(espectadores));
        // System.out.println("Cantidad que pueden ver la peli: " +cine.espectadoresQuePuedenVerLaPeli(espectadores).size());


        HashMap<String, Integer> diccionario = new HashMap<>();
        diccionario.put("key1", 1);
        diccionario.put("key2", 2);
        diccionario.put("key3", 3);
        diccionario.put("key4", 4);

        Set<String> keys = diccionario.keySet();
        System.out.println(keys);

        System.out.println(keys.toArray()[(int) (Math.random() * 4)]);

    }

    public static ArrayList<Espectador> crearXCantidadDeEspectadores(Integer cantidadEspectadores) {
        ArrayList<Espectador> espectadores = new ArrayList<>();
        String[] nombresEspectadores = {"Mama", "Luchetti", "Pachano", "BajoEnGrasas", "Magali", 
                                        "Agustin", "José", "John", "Messi", "Fideos" };
        for (int i = 0; i <= cantidadEspectadores; i++) {
            String nombreRandom = nombresEspectadores[(int) (Math.random() * 10)];
            Integer edadRandom = (int) (Math.random() * 100);
            Integer plataRandom = (int) (Math.random() * 1000);
            espectadores.add(new Espectador(nombreRandom, edadRandom, plataRandom));
        }    
        return espectadores;
    }
}
