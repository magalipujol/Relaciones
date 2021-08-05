import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> monton;


    public Baraja() {
        // * Acordate de esto blda
        cartas = new ArrayList<>(); 
        monton = new ArrayList<>();
    }


    public Baraja(ArrayList<Carta> cartas, ArrayList<Carta> monton) {
        this.cartas = cartas;
        this.monton = monton;
    }

    public ArrayList<Carta> getCartas() {
        return this.cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getMonton() {
        return this.monton;
    }

    public void setMonton(ArrayList<Carta> monton) {
        this.monton = monton;
    }

    @Override
    public String toString() {
        return "{" +
            " cartas: " + getCartas() +
            "\nmonton: " + getMonton() +
            "}";
    }

    public void crearMazo() {
        String[] palos = {"oro", "basto", "espada", "copa"};
        for (String palo : palos) {
            for (int i = 1; i < 13; i++) {
                if (i != 8 && i != 9) {
                    cartas.add(new Carta(palo, i));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (cartas.size() == 0) {
            return null;
        } else {
            Carta siguienteCarta = cartas.get(0);
            monton.add(siguienteCarta);
            cartas.remove(0);
            return siguienteCarta;
        }
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public ArrayList<Carta> darCartas(int cantidad) {
        ArrayList<Carta> cartasParaDar = new ArrayList<>();
        if (cantidad <= cartasDisponibles()) {
            for (int i = 0; i < cantidad; i++) {
                cartasParaDar.add(siguienteCarta());
            }
            return cartasParaDar;
        } else {
            return null;
        } 
    }

    


}
