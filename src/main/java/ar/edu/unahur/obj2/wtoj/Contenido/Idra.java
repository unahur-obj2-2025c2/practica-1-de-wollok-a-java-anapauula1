package ar.edu.unahur.obj2.wtoj.Contenido;

public class Idra {
    /* ES UN OBJETO, HACEMOS LO SIGUIENTE: */
    
    private static Idra instance = new Idra(); 
    private Double valor = 0.5;

    private Idra() {} // ANULAMOS EL CONTRUCTOR

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public static Idra getInstance(){
        return instance;
    }
}
