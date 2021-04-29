package com.example.ejercicioproductos.model;

public class Producto {

    //fecha de caducidad y número de lote.

    private String fechaCad;
    private int numLote;

    public Producto() {
        this.fechaCad = "";
        this.numLote = 0;
    }

    public Producto(String fechaCad, int numLote) {
        this.fechaCad = fechaCad;
        this.numLote = numLote;
    }

    @Override
    public String toString() {
        return "Producto:" +
                "fechaCad='" + fechaCad+
                ", numLote=" + numLote;
    }

    public String getFechaCad() {
        return fechaCad;
    }

    public void setFechaCad(String fechaCad) {
        this.fechaCad = fechaCad;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }
}
