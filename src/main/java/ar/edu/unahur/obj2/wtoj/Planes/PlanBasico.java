package ar.edu.unahur.obj2.wtoj.Planes;

import java.util.List;

import ar.edu.unahur.obj2.wtoj.Contenido.Contenido;
import ar.edu.unahur.obj2.wtoj.Usuario.Usuario;

public class PlanBasico implements PlanSuscribible {
    private Integer maxContenidos;
    private Double valorBase = 0.0;
    // TIENE UNA LISTA DE CONTENIDOS
    // al usuario le tenemos que preguntar los contenidos
    public Integer getMaxContenidos() {
        return maxContenidos;
    }
    public void setMaxContenidos(Integer maxContenidos) {
        this.maxContenidos = maxContenidos;
    }
    public Double getValorBase() {
        return valorBase;
    }
    public void setValorBase(Double valorBase) {
        this.valorBase = valorBase;
    }
    @Override
    public Double costoPlan(Usuario unUsuario) {
        List<Contenido> contenido = unUsuario.getContenidos();
         List<Contenido> excedentes = contenido.subList(maxContenidos,contenido.size());

        if (contenido.size() > this.maxContenidos) {
            return this.valorBase;
        }
        else{
            return this.valorBase + excedentes.stream().mapToDouble( c -> c.costoLicencia()).sum();
        }
    }
}
