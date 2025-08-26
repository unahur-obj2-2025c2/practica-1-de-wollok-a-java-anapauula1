package ar.edu.unahur.obj2.wtoj.Planes;

import ar.edu.unahur.obj2.wtoj.Usuario.Usuario;

public class PlanPremium implements PlanSuscribible {

    @Override
    public Double costoPlan(Usuario unUsuario) {
        return 12.0;
    }
}
