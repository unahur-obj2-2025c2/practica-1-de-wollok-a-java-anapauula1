package ar.edu.unahur.obj2.wtoj.Contenido;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    // TENEMOS NUMERO DE TEMPORADA
    private Integer nroTemporada;
    // LISTA VACIA DE EPISODIOS
    List<Episodio> episodios = new ArrayList<>();

    public Temporada(Integer nroTemporada, List<Episodio> episodios) {
        this.nroTemporada = nroTemporada;
        this.episodios = episodios;
    }

    // CONTRUCTOR SIN LA LISTA
    public Temporada(Integer nroTemporadas){
        this.nroTemporada = nroTemporadas;
    }

    public Integer getNroTemporada() {
        return nroTemporada;
    }
    public void setNroTemporada(Integer nroTemporada) {
        this.nroTemporada = nroTemporada;
    }
    public List<Episodio> getListEpisodios() {
        return episodios;
    }
    // PORQUE ES UNA LISTA NO SIRVE EL SET NORMAL
    public void agregarEpisodio(Episodio unEpisodio){
        episodios.add(unEpisodio);
    }
    // PARA SACAR EL COSTO DE LOS EPISODIOS
    public Double costo(){
        return episodios.stream().mapToDouble(e->e.getCostoBase()).average().orElse(0.0);
    }
}
