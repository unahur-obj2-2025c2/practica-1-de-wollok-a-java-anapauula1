package ar.edu.unahur.obj2.wtoj.Contenido;

public class Episodio {
    /*
     UTILIZAMOS DOUBLE PORQUE EL COSTO PUEDE SER
     EN DECIMAL COMO 2.5
     */
    private Integer numero;
    private String titulo;
    private Double costoBase;

    // CONTRUCTOR
    public Episodio(Integer numero, String titulo,Double costoBase) {
        this.numero = numero;
        this.titulo = titulo;
        this.costoBase = costoBase;
    }
    // GETTER Y SETTER DE AMBOS
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Double getCostoBase() {
        return costoBase;
    }
    public void setCostoBase(Double costoBase) {
        this.costoBase = costoBase;
    }
}
