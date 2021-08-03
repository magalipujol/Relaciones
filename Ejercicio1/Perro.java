package Ejercicio1;

public class Perro {
    private String nombre;
    private String raza;
    private Integer edad;
    private String tamanio;


    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre:'" + getNombre() + "'" +
            ", raza:'" + getRaza() + "'" +
            ", edad:'" + getEdad() + "'" +
            ", tamanio:'" + getTamanio() + "'" +
            "}";
    }

}
