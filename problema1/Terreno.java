/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejecutorterreno.Terreno;

/**
 *
 * @author DELL
 */
public class Terreno {
    public double largo;
    public double ancho;
    public double area;
    public double costoTerreno;
    public double valor_metrocuadrado;

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getValor_metrocuadrado() {
        return valor_metrocuadrado;
    }

    public void setValor_metrocuadrado(double valor_metrocuadrado) {
        this.valor_metrocuadrado = valor_metrocuadrado;
    }
 
    public void calcularArea(){
    area = ancho * largo;
    }
    
    public double obtenerArea(){
    return area;
    }
    public void calcularCostoTerreno(){
    costoTerreno = area * valor_metrocuadrado;
    }
    public double obtenerCostoTerreno(){
    return costoTerreno;
    }
}
