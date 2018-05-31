/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parque_de_atracciones;

import java.util.ArrayList;

/**
 *
 * @author cayetano
 */
public class Atraccion {
    
    private int id;
    private String nombre;
    private String estado;
    private boolean accesible;
    private ArrayList<Empleado> empleados;
    private ArrayList<Reparacion> reparaciones;
    
    public Atraccion(){
        id = 0;
        nombre = new String();
        estado = new String();
        accesible = false;
        empleados = new ArrayList();
        reparaciones = new ArrayList();
    }

    /**
     * 
     * @param id
     * @param nombre
     * @param estado
     * @param accesible 
     */
    public Atraccion(int id, String nombre, String estado, boolean accesible) throws AtraccionException{
        if(id <0 ) throw new AtraccionException(); else this.id = id;
        if(nombre.length()<5 || nombre.length()>100) throw new AtraccionException(); else this.nombre = nombre;
        if(!"Abierta".equals(estado) && !"Cerrada".equals(estado) && !"Nueva".equals(estado))throw new AtraccionException(); else this.estado = estado;
        this.accesible = accesible;/**No sé si requiere comprobación**/
        empleados = new ArrayList();
        reparaciones = new ArrayList();
    }

    /**
     * 
     * @return id 
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return nombre 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * 
     * @param estado 
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * 
     * @return accesible
     */
    public boolean isAccesible() {
        return accesible;
    }

    /**
     * 
     * @param accesible 
     */
    public void setAccesible(boolean accesible) {
        this.accesible = accesible;
    }

    /**
     * 
     * @return empleados
     */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * 
     * @param empleados 
     */
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
     * 
     * @return reparaciones
     */
    public ArrayList<Reparacion> getReparaciones() {
        return reparaciones;
    }

    /**
     * 
     * @param reparaciones 
     */
    public void setReparaciones(ArrayList<Reparacion> reparaciones) {
        this.reparaciones = reparaciones;
    }
    
    /**
     * 
     * @param e 
     */
    public void añadirEmpleado(Empleado e){
        empleados.add(e);
    }
    
    /**
     * 
     * @param r 
     */
    public void añadirReparacion(Reparacion r){
        reparaciones.add(r);
    }

    /**
     * 
     * @return String
     */
    @Override
    public String toString() {
        return "Atraccion{" + "id=" + id + ", nombre=" + nombre + ", estado=" + estado + ", accesible=" + accesible + ", empleados=" + empleados + ", reparaciones=" + reparaciones + '}';
    }
    
}
