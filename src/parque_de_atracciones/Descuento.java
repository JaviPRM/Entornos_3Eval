/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parque_de_atracciones;

import java.util.Date;

/**
 *
 * @author cayetano
 */
public class Descuento {
    
    private String codigo;
    private Date fechaValidez;
    private double importe;
    
    public Descuento(){
        codigo = new String();
        fechaValidez = new Date();
        importe = 0;
    }

    /**
     * 
     * @param codigo
     * @param fechaValidez
     * @param importe 
     */
    public Descuento(String codigo, Date fechaValidez, double importe) {
        this.codigo = codigo;
        this.fechaValidez = fechaValidez;
        this.importe = importe;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaValidez() {
        return fechaValidez;
    }

    public void setFechaValidez(Date fechaValidez) {
        this.fechaValidez = fechaValidez;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Descuento{" + "codigo=" + codigo + ", fechaValidez=" + fechaValidez + ", importe=" + importe + '}';
    }
    
}
