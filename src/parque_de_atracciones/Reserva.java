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
public class Reserva {
    
    private int id;
    private Date fechaReserva;
    private Date fechaValidez;
    
    public Reserva(){
        id = 0;
        fechaReserva = new Date();
        fechaValidez = new Date();
    }

    public Reserva(int id, Date fechaReserva, Date fechaValidez) {
        this.id = id;
        this.fechaReserva = fechaReserva;
        this.fechaValidez = fechaValidez;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaValidez() {
        return fechaValidez;
    }

    public void setFechaValidez(Date fechaValidez) {
        this.fechaValidez = fechaValidez;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", fechaReserva=" + fechaReserva + ", fechaValidez=" + fechaValidez + '}';
    }
    
}
