package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class NewMain {
    public static void main(String[] args) {
        RevolverDeAgua revolver = new RevolverDeAgua();

        List<Jugador> jugadores = new ArrayList<Jugador>();

        jugadores.add(new Jugador(1, "a", false));
        jugadores.add(new Jugador(2, "b", false));
        jugadores.add(new Jugador(3, "c", false));
        jugadores.add(new Jugador(4, "d", false));
        jugadores.add(new Jugador(5, "e", false));
        jugadores.add(new Jugador(6, "f", false));

        Juego juego = new Juego(jugadores, revolver);

        juego.llenarJuego(jugadores, revolver);

        System.out.println(juego.ronda());

    }
    
}
