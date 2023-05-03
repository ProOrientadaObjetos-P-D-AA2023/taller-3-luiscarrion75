/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dispositivocelular;
 import caracteristicas.EquiposElectronicos;
/**
 *
 * @author DELL
 */
public class DispositivoCelular {

    public static void main(String[] args) {
       EquiposElectronicos e = new EquiposElectronicos();
       e.setSo("Android");
        System.out.println("Sistema Operativo: " + e.getSo());
        e.setPantalla(6.67);
        System.out.println("Tamaño de pantalla: " + e.getPantalla() + " pulgadas");
   e.setCi(288);
        System.out.println("Costo inicial: " + e.getCi() + "$");
    e.setIva(12);
        System.out.println("IVA: " + e.getIva() + " %");
        e.setDm("00:1A:2B:3C:4D:5E");
        System.out.println("Direccion MAC: " + e.getDm());
        e.setImei("356938035643809");
        System.out.println("Informacion IMEI: " + e.getImei());
        System.out.println("El costo final es: " + e.calcularCostoFinal());
        
        
    }
}
