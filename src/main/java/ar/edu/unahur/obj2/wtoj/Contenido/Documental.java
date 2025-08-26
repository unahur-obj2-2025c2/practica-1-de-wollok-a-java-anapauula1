package ar.edu.unahur.obj2.wtoj.Contenido;

public class Documental extends Contenido {
    private String director;

    //  CONSTRUCTOR
    public Documental(String titulo, Double costo,String director){
        super(titulo, costo);
        this.director = director;
    }
    
    @Override
    public Double adicional() {
        return Idra.getInstance().getValor();
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    
}
