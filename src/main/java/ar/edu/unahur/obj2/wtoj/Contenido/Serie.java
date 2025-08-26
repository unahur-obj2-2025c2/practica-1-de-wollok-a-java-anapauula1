package ar.edu.unahur.obj2.wtoj.Contenido;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido{

    List<Temporada> temporadas = new ArrayList<>();

    public Serie(String titulo, Double costo, List<Temporada> temporadas){
        super(titulo, costo);
        this.temporadas = temporadas;
    }
    public Serie(String titulo, Double costo){
        super(titulo, costo);
    }
    public void agregarTemporada(Temporada unatemporada){
            temporadas.add(unatemporada);
    }
    // OVERRIDE DEL METODO ADICIONAL

    @Override
    public Double adicional() {
        return temporadas.stream().mapToDouble( t -> t.costo()).average().orElse(0.0);
    }
    public List<Temporada> getTemporadas() {
        return temporadas;
    }

}
