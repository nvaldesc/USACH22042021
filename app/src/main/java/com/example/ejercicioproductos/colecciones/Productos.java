package com.example.ejercicioproductos.colecciones;

import android.os.Build;

import com.example.ejercicioproductos.model.Producto;
import com.example.ejercicioproductos.model.ProductoCongelado;

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
                productos +
                '}';
    }

    public int size(){
        return this.productos.size();
    }
    public boolean isEmpty(){
        return this.productos.isEmpty();
    }
    public long obtenerTodosLosCongelados(){

        long contador = 0;
        /*
        for (int i=0;i<this.productos.size();i++){
            Producto p = this.productos.get(i);
            if(p instanceof ProductoCongelado){
                contador++;
            }
        }*/
        /*
        for (Producto p:this.productos) {
            if(p instanceof ProductoCongelado)
                contador++;
        }*/

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            contador = productos.stream().filter(p -> p instanceof ProductoCongelado).count();
        }


        return contador;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
