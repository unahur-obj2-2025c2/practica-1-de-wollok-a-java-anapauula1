package ar.edu.unahur.obj2.wtoj.Usuario;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.wtoj.Contenido.Contenido;
import ar.edu.unahur.obj2.wtoj.Planes.PlanPremium;
import ar.edu.unahur.obj2.wtoj.Planes.PlanSuscribible;

public class Usuario {
    // TIENE UN UNICO PLAN
    public PlanSuscribible plan = new PlanPremium();
    // instanciamos un plan del tipo PLANSUSCRIBIBLE

    List<Contenido> contenidos = new ArrayList<>();

    public List<Contenido> getContenidos() {
        return contenidos;
    }
    public void verContenido(Contenido unContenido){
        contenidos.add(unContenido);
    }
    // PUEDE CAMBIAR EL PLAN EN CUALQUIER MOMENTO
    public PlanSuscribible getPlan() {
        return plan;
    }
    public void setPlan(PlanSuscribible plan) {
        this.plan = plan;
    }
    // CONTRUCTOR
    public Usuario(PlanSuscribible plan) {
        this.plan = plan;
    }
    public Usuario(PlanSuscribible plan, List<Contenido> contenidos) {
        this.plan = plan;
        this.contenidos = contenidos;
    }
}
