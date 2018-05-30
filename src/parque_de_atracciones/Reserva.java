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
    private Entrada[] tickets;
    private Visitante comprador;
    
    public Reserva(){
        id = 0;
        fechaReserva = new Date();
        fechaValidez = new Date();
        tickets = new Entrada[5];
        comprador = new Visitante();
    }

    /**
     * 
     * @param id
     * @param fechaReserva
     * @param fechaValidez
     * @param comprador 
     */
    public Reserva(int id, Date fechaReserva, Date fechaValidez, Visitante comprador) {
        this.id = id;
        this.fechaReserva = fechaReserva;
        this.fechaValidez = fechaValidez;
        tickets = new Entrada[5];
        this.comprador = comprador;
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

    public Entrada[] getTickets() {
        return tickets;
    }

    public void setTickets(Entrada[] tickets) {
        this.tickets = tickets;
    }

    public Visitante getComprador() {
        return comprador;
    }

    public void setComprador(Visitante comprador) {
        this.comprador = comprador;
    }
    
    public void creaReserva(int numEntradas){
        for(int i=0;i<numEntradas;i++){
            
        }
    }
    
    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", fechaReserva=" + fechaReserva + ", fechaValidez=" + fechaValidez + ", tickets=" + tickets + ", comprador=" + comprador + '}';
    }
}
