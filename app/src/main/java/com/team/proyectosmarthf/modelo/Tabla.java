package com.team.proyectosmarthf.modelo;

public class Tabla {

    private String id;
    private String minimo;
    private String maximo;
    private String porcentaje;


    public Tabla(String id, int minimo, int maximo, int porcentaje) {
        this.id = id;
        this.minimo = minimo+"";
        this.maximo = maximo+"";
        this.porcentaje = porcentaje+"";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMinimo() {
        return minimo;
    }

    public void setMinimo(String minimo) {
        this.minimo = minimo;
    }

    public String getMaximo() {
        return maximo;
    }

    public void setMaximo(String maximo) {
        this.maximo = maximo;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
}
