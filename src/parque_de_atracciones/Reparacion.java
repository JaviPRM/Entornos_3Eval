/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parque_de_atracciones;

/**
 *
 * @author cayetano
 */
public class Reparacion {
    
    private int id;
    private String descripcion;
    private int numeroDias;
    
    public Reparacion(){
        id = 0;
        descripcion = new String();
        numeroDias = 0;
    }

    public Reparacion(int id, String descripcion, int numeroDias) {
        this.id = id;
        this.descripcion = descripcion;
        this.numeroDias = numeroDias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    @Override
    public String toString() {
        return "Reparacion{" + "id=" + id + ", descripcion=" + descripcion + ", numeroDias=" + numeroDias + '}';
    }
    
    
}
