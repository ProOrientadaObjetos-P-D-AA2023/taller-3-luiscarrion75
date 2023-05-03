/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package horas;

/**
 *
 * @author DELL
 */
public class equivalencia {
    
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;
    
    
    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getMinutos() {
        return minutos;
    }

    public void setMinutos(double minutos) {
        this.minutos = minutos;
    }

    public double getSegundos() {
        return segundos;
    }

    public void setSegundos(double segundos) {
        this.segundos = segundos;
    }

    public double getDias() {
        return dias;
    }

    public void setDias(double dias) {
        this.dias = dias;
    }
    
    public double calcularminutos(){
     return minutos = horas*60; 
   }
    public double calcularsegundos(){
    return segundos = horas*3600;
    }
public double calculardias(){
        dias = horas/24;
        return dias;
    }
        
}
     
