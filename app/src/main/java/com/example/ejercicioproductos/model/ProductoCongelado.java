package com.example.ejercicioproductos.model;

public class ProductoCongelado extends Producto{

    //temperatura de congelación recomendada

    private int tempCongelacionRecomendada;


    public ProductoCongelado() {
        this.tempCongelacionRecomendada = 0;
    }

    public ProductoCongelado(int tempCongelacionRecomendada) {
        this.tempCongelacionRecomendada = tempCongelacionRecomendada;
    }

    public ProductoCongelado(String fechaCad, int numLote, int tempCongelacionRecomendada) {
        super(fechaCad, numLote);
        this.tempCongelacionRecomendada = tempCongelacionRecomendada;
    }

    @Override
    public String toString() {
        return super.toString()+ "temCong: "+this.tempCongelacionRecomendada;
    }

    public int getTempCongelacionRecomendada() {
        return tempCongelacionRecomendada;
    }

    public void setTempCongelacionRecomendada(int tempCongelacionRecomendada) {
        this.tempCongelacionRecomendada = tempCongelacionRecomendada;
    }
}
