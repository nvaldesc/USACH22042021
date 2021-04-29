package com.example.ejercicioproductos.model;

public class ProductoFresco extends Producto{

    //fecha de envasado y el país de origen

    private String fechaEnvasado;
    private String paisOrigen;


    public ProductoFresco() {
        this.fechaEnvasado = "";
        this.paisOrigen = "";
    }
    public ProductoFresco(String fechaEnvasado, String paisOrigen) {
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public ProductoFresco(String fechaCad, int numLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCad, numLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "fechaEnvasado='" + fechaEnvasado +
                ", paisOrigen='" + paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
