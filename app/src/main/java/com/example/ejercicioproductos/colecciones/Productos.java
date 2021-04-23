package com.example.ejercicioproductos.colecciones;

import com.example.ejercicioproductos.model.Producto;

import java.util.ArrayList;

public class Productos {

    private ArrayList<Producto> productos;

    public Productos() {
        this.productos = new ArrayList<>();
    }

    public Productos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void addProducto(Producto p){
        this.productos.add(p);
    }

    @Override
    public String toString() {
        return "Productos{" +
                "productos=" + productos +
                '}';
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
