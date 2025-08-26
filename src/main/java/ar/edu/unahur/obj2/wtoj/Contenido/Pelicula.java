package ar.edu.unahur.obj2.wtoj.Contenido;

public class Pelicula extends Contenido {
    // CONSTRUCTOR PARA QUE SE CREEN LAS INSTANCIAS
    public Pelicula(String titulo, Double costo){
        super(titulo, costo);
    }

    // -- OVERRIDE DEL METODO ADICIONAL
    @Override
    public Double adicional() {
        return 0.0;
    }
}
