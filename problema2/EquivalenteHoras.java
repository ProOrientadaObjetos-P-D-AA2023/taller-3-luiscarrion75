/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.equivalentehoras;
import horas.equivalencia;
/**
 *
 * @author DELL
 */
public class EquivalenteHoras {

    public static void main(String[] args) {
       
        equivalencia e = new equivalencia();
        e.setHoras(48);
        System.out.println("Horas son: " + e.getHoras());
        System.out.println("Equivalencia en minutos: " + e.calcularminutos()+ " minutos");
        System.out.println("Equivalencia en segundos: " + e.calcularsegundos()+ " segundos");
        System.out.println("Equivalencia en dias: " + e.calculardias());
    }
}
