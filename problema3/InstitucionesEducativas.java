/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.institucioneseducativas;
import caracteristicas.caracte;
/**
 *
 * @author DELL
 */
public class InstitucionesEducativas {

    public static void main(String[] args) {
   caracte c = new caracte();
   c.setNombre("Unidad Educativa Del Milenio Bernardo Valdivieso");
        System.out.println("Nombre del Plantel: " + c.getNombre());
   c.setTiInstitucion("Fiscal");
        System.out.println("Tipo de Institucion: " + c.getTiInstitucion());
   c.setAlumnos(12220);
        System.out.println("Alumnos: " + c.getAlumnos());
        c.setDocentes(50);
        System.out.println("Docentes: " + c.getDocentes());
        c.setSedes(1);
        System.out.println("Numero de sedes: " + c.getSedes());
        c.setGastos(7);
        System.out.println("Gastos proyectados por estudiante: " + c.getGastos());
    c.calcularPresupuesto();
        System.out.println("El presupuesto es: " + c.calcularPresupuesto());
    
    
    
    }
   
}
