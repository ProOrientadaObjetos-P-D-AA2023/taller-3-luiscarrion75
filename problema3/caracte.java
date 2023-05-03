/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caracteristicas;

/**
 *
 * @author DELL
 */
public class caracte {
    private String nombre;
    private String tiInstitucion;
    private int alumnos;
    private int docentes;
    private int sedes;
    private int gastos;
    private int presupuesto;

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTiInstitucion() {
        return tiInstitucion;
    }

    public void setTiInstitucion(String tiInstitucion) {
        this.tiInstitucion = tiInstitucion;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    public int getDocentes() {
        return docentes;
    }

    public void setDocentes(int docentes) {
        this.docentes = docentes;
    }

    public int getSedes() {
        return sedes;
    }

    public void setSedes(int sedes) {
        this.sedes = sedes;
    }

    public int getGastos() {
        return gastos;
    }

    public void setGastos(int gastos) {
        this.gastos = gastos;
    }
    
    public int calcularPresupuesto(){
    return presupuesto = alumnos * gastos;
    }
}
