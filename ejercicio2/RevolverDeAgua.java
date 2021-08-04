package ejercicio2;

public class RevolverDeAgua {
    private Integer posicionActual;
    private Integer posicionAgua;


    public RevolverDeAgua() {
    }

    public RevolverDeAgua(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return this.posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return this.posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "{" +
            " posicion actual: '" + getPosicionActual() + "'" +
            ", posición del agua:'" + getPosicionAgua() + "'" +
            "}";
    }

    public void llenarRevolver() {
        setPosicionAgua((int) (Math.random() * 10));
        setPosicionActual((int) (Math.random() * 10));
    }

    public boolean mojar() {
        return (getPosicionActual() == getPosicionAgua());
    }

    public void siguienteChorro() {
        if (getPosicionActual() == 9) {
            setPosicionActual(0);
        } else {
            setPosicionActual(getPosicionActual() + 1);
        }
    }
}
