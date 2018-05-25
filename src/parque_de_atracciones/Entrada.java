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
public class Entrada {
    
    private int id;
    private Date fechaHora;
    private double precio;
    
    public Entrada(){
        id = 0;
        fechaHora = new Date();
        precio = 0;
    }

    /**
     *
     * @param id
     * @param fechaHora
     * @param precio
     * @param desc
     */
    public Entrada(int id, Date fechaHora, double precio, Descuento desc) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void aplicarDescuento(Descuento desc){
        this.precio = precio-desc.getImporte();
        System.out.println("El descuento ha sido aplicado. El precio de su entrada es ahora de " + precio + "€");
    }

    @Override
    public String toString() {
        return "Entrada{" + "id=" + id + ", fechaHora=" + fechaHora + ", precio=" + precio + '}';
    }
}
