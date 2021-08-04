package ejercicio2;

import java.util.List;

public class Juego {
    private List<Jugador> jugadores;
    private RevolverDeAgua revolver;


    public Juego() {
    }

    public Juego(List<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public List<Jugador> getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return this.revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "{" +
            " jugadores='" + getJugadores() + "'" +
            ", revolver='" + getRevolver() + "'" +
            "}";
    }

    public void llenarJuego(List<Jugador> jugadores, RevolverDeAgua revolver) {
        setJugadores(jugadores);
        setRevolver(revolver);
        revolver.llenarRevolver();
    }

    public Jugador ronda() {
        for (Jugador jugador : jugadores) {
           if (jugador.disparo(getRevolver())) {
               return jugador;
           }
        }
        return null;
    }

}
