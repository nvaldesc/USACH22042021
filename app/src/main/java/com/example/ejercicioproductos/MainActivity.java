package com.example.ejercicioproductos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.ejercicioproductos.colecciones.Productos;
import com.example.ejercicioproductos.model.ProductoCongelado;
import com.example.ejercicioproductos.model.ProductoFresco;
import com.example.ejercicioproductos.model.ProductoRefrigerado;

public class MainActivity extends AppCompatActivity {

    private TextView mensaje;
    private Productos productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensaje = findViewById(R.id.txtmensaje);

        productos = new Productos();

        ProductoCongelado pc = new ProductoCongelado("26-08-2021",10,-10);
        ProductoFresco pf = new ProductoFresco("27-04-2021",3,"22-04-2021","Chile");
        ProductoRefrigerado pr = new ProductoRefrigerado("20-07-2021",56,12345);

        productos.addProducto(pc);
        productos.addProducto(pf);
        productos.addProducto(pr);


       mensaje.setText(productos.toString());



    }
}