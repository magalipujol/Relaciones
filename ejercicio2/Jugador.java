package ejercicio2;

public class Jugador {
    private Integer id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return this.mojado;
    }

    public boolean getMojado() {
        return this.mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", mojado='" + isMojado() + "'" +
            "}";
    }

    public boolean disparo(RevolverDeAgua revolver) {
        boolean aux = revolver.mojar();
        setMojado(aux);
        revolver.siguienteChorro(); 
        return aux;
    }

}
