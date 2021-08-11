import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cine {
    private Integer[] filas;
    String[] columnas;
    HashMap<String, Boolean> butacas; // {3A=false, 4D= true}

    Pelicula pelicula;
    Integer precioEntrada;
    HashMap<Espectador, String> espectadores; // {nombreEspectador1=4C, nombreEspectador2=5F}

    public Cine() {
        butacas = new HashMap<>();
        espectadores = new HashMap<>();
    }

    public Cine(Integer[] filas, String[] columnas, HashMap<String, Boolean> butacas, Pelicula pelicula,
            Integer precioEntrada, HashMap<Espectador, String> espectadores) {
        this.filas = filas;
        this.columnas = columnas;
        this.butacas = butacas;
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.espectadores = espectadores;
    }

    public Integer[] getFilas() {
        return this.filas;
    }

    public void setFilas(Integer[] filas) {
        this.filas = filas;
    }

    public String[] getColumnas() {
        return this.columnas;
    }

    public void setColumnas(String[] columnas) {
        this.columnas = columnas;
    }

    public HashMap<String, Boolean> getButacas() {
        return this.butacas;
    }

    public void setButacas(HashMap<String, Boolean> butacas) {
        this.butacas = butacas;
    }

    public Pelicula getPelicula() {
        return this.pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Integer getPrecioEntrada() {
        return this.precioEntrada;
    }

    public void setPrecioEntrada(Integer precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public HashMap<Espectador, String> getEspectadores() {
        return this.espectadores;
    }

    public void setEspectadores(HashMap<Espectador, String> espectadores) {
        this.espectadores = espectadores;
    }

    @Override
    public String toString() {
        return "{" + " filas='" + getFilas() + "'" + ", columnas='" + getColumnas() + "'" + ", butacas='" + getButacas()
                + "'" + ", pelicula='" + getPelicula() + "'" + ", precioEntrada='" + getPrecioEntrada() + "'"
                + ", espectadores='" + getEspectadores() + "'" + "}";
    }

    public void crearCine(Integer[] filasNombre, String[] columnasNombre, Integer precioEntrada, Pelicula pelicula) {
        setFilas(filas);
        setColumnas(columnas);
        for (int i = 0; i < filasNombre.length; i++) {
            for (int j = 0; j < columnasNombre.length; j++) {
                butacas.put(filasNombre[i].toString() + columnasNombre[j], false);
            }
        }
        setPelicula(pelicula);
        setPrecioEntrada(precioEntrada);
    }

    public void mostrarButacas(Integer[] filasNombre, String[] columnasNombre) {
        String[][] butacasMatrix = new String[filasNombre.length][columnasNombre.length];
        for (int i = 0; i < filasNombre.length; i++) {
            for (int j = 0; j < columnasNombre.length; j++) {
                butacasMatrix[i][j] = filasNombre[i].toString() + columnasNombre[j];
            }
        }
        for (int i = 0; i < butacasMatrix.length; i++) {
            for (int j = 0; j < butacasMatrix[i].length; j++) {
                System.err.print(butacasMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public ArrayList<Espectador> espectadoresQuePuedenVerLaPeli(ArrayList<Espectador> espectadores) {
        List<Espectador> espectadoresQueNoCumplenConRequisitos = new ArrayList<>();
        for (Espectador espectador : espectadores) {
            if (espectador.edad < pelicula.edadMinima || espectador.dineroDisponible < precioEntrada) {
                espectadoresQueNoCumplenConRequisitos.add(espectador);
            }
        }
        espectadores.removeAll(espectadoresQueNoCumplenConRequisitos);
        return espectadores;
    }
    // TODO
    // agarrar una butaca random
    // si tiene gente, agarrar otra
    // si estaba vacia, agarrar el primer espectador y ponerlo
    // repetir hasta que espectadores.size = 0
    public void ubicarEspectadoresEnButacas(ArrayList<Espectador> espectadores) {
        while (espectadores.size() > 0) {
            
            
        }
    }
}
