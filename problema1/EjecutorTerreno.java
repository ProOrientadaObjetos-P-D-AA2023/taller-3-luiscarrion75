/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejecutorterreno;
import com.mycompany.ejecutorterreno.Terreno.Terreno;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EjecutorTerreno {

    public static void main(String[] args) {
        System.out.println("TERRENO");
Scanner teclado = new Scanner(System.in);
        double l;
        double a;
        double mc;
        Terreno t = new Terreno();
    System.out.println("Largo del terreno: ");
        l=teclado.nextDouble();
        t.setLargo(l);
        System.out.println("Ancho es: " );
        a=teclado.nextDouble();
        t.setAncho(a);
        System.out.println("Valor del metro cuadrado ");
    mc = teclado.nextDouble();
    t.setValor_metrocuadrado(mc);
    
    t.calcularArea();
    t.calcularCostoTerreno();
        
        System.out.println("El costo del terreno es: " + t.obtenerCostoTerreno());
    
        System.out.println("El largo es: " + t.getLargo());
        System.out.println("El ancho es: " + t.getAncho());
        System.out.println("El area es: " + t.obtenerArea());
        System.out.println("El valor del metro cuadrado es: " + t.getValor_metrocuadrado());
        System.out.println("El valor del terreno es: " + t.obtenerCostoTerreno());
    
    
    
    }
    }
    

