package com.example.ejercicioproductos.model;

public class ProductoRefrigerado extends Producto{

    //código del organismo de supervisión alimentaria.
    private int codOrganismoAlimentaria;


    public ProductoRefrigerado() {
        this.codOrganismoAlimentaria = 0;
    }
    public ProductoRefrigerado(int codOrganismoAlimentaria) {
        this.codOrganismoAlimentaria = codOrganismoAlimentaria;
    }

    public ProductoRefrigerado(String fechaCad, int numLote, int codOrganismoAlimentaria) {
        super(fechaCad, numLote);
        this.codOrganismoAlimentaria = codOrganismoAlimentaria;
    }

    @Override
    public String toString() {
        return "codOrganismoAlimentaria=" + codOrganismoAlimentaria;
    }



    public int getCodOrganismoAlimentaria() {
        return codOrganismoAlimentaria;
    }

    public void setCodOrganismoAlimentaria(int codOrganismoAlimentaria) {
        this.codOrganismoAlimentaria = codOrganismoAlimentaria;
    }
}
