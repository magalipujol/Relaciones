import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revol;

    public Juego(Revolver rev) {
        this.revol = rev;
    }

    public Revolver getRevol() {
        return revol;
    }

    public void setRevol(Revolver revol) {
        this.revol = revol;
    }

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + '}';
    }

    public void llenarJuego(ArrayList<Jugador> jugs, Revolver rev) {
        jugadores = jugs;
        rev.llenarRevolver();
        revol = rev;
        ronda(jugadores);
    }

    public boolean ronda(ArrayList<Jugador> jugadores) { 
        boolean flag=false;
        do{
        for (Jugador jugadore : jugadores) {
            if (jugadore.disparo(revol)) {
                jugadore.setMojado(true);
                System.out.println("el mojado es el jugador "+jugadore.getNombre()+ " .");
                flag=jugadore.getMojado();
                return jugadore.getMojado();
            }
        }
        }while(flag==false);
        
        return true;
    }
}

