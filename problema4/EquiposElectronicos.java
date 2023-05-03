/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caracteristicas;

/**
 *
 * @author DELL
 */
public class EquiposElectronicos {
    private String so;
    private double pantalla;
    private int ci;
    private double iva;
    private double ivaci;
    private double cf;
    private String dm;
    private String imei;

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public double getPantalla() {
        return pantalla;
    }

    public void setPantalla(double pantalla) {
        this.pantalla = pantalla;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getIvaci() {
        return ivaci;
    }

    public void setIvaci(double ivaci) {
        this.ivaci = ivaci;
    }

    public double getCf() {
        return cf;
    }

    public void setCf(double cf) {
        this.cf = cf;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
    public double calcularCostoFinal(){
    return cf = ci + iva;
    }
  
}
