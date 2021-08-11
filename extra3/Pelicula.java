public class Pelicula {
    private String titulo;
            Integer duracion;
            Integer edadMinima;


    public Pelicula() {
    }

    public Pelicula(String titulo, Integer duracion, Integer edadMinima) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracion() {
        return this.duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getEdadMinima() {
        return this.edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "{" +
            " titulo: " + getTitulo() +
            ", duracion: " + getDuracion() + "min " +
            ", edad mínima: " + getEdadMinima()  +
            "}";
    }
    
}
