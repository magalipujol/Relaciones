public class Espectador {
    private String nombre;
            Integer edad;
            Integer dineroDisponible;

    public Espectador() {
    }

    public Espectador(String nombre, Integer edad, Integer dineroDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDineroDisponible() {
        return this.dineroDisponible;
    }

    public void setDineroDisponible(Integer dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", dineroDisponible='" + getDineroDisponible() + "'" +
            "}";
    }

    
}
