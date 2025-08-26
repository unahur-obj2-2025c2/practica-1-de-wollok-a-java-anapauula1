package ar.edu.unahur.obj2.wtoj.Contenido;

public abstract class Contenido {
    // ESTA CLASE ABSTRACTA TENDRA
    private final String titulo;
    private Double costo;

    // CONTRUCTOR
    public Contenido(String titulo, Double costo) {
        this.titulo = titulo;
        this.costo = costo;
    }
    // GETTER Y SETTER PARA EL TITULO Y COSTO
    public String getTitulo() {
        return titulo;
    }
    public Double getCosto() {
        return costo;
    }
    public void setCosto(Double costo) {
        this.costo = costo;
    }
    
    /* ----------- METODOS ------------------- */
    public Double costoLicencia(){
        return this.costo + adicional();
    }
    public abstract Double adicional();
}

