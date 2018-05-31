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
public class Empleado {
    
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected String NIF;
    protected String telefono;
    protected String direccion;
    protected ArrayList<Nomina> nominas;
    
    public Empleado(){
        id = 0;
        nombre = new String();
        apellidos = new String();
        NIF = new String();
        telefono = new String();
        direccion = new String();
        nominas = new ArrayList();
    }
    
    /**
     * 
     * @param id
     * @param nombre
     * @param apellidos
     * @param NIF
     * @param telefono
     * @param direccion 
     */
    public Empleado(int id, String nombre, String apellidos, String NIF, String telefono, String direccion) throws EmpleadoException{
        if (id <0 ) throw new EmpleadoException(); else this.id = id;
        if (nombre.length()>30 || nombre.length()<2) throw new EmpleadoException(); else this.nombre = nombre;
        if (apellidos.length()>60 || apellidos.length()<5) throw new EmpleadoException(); else this.apellidos = apellidos;
        if (NIF.length()!=9) throw new EmpleadoException(); else this.NIF = NIF;
        if (telefono.length()!=9) throw new EmpleadoException(); else this.telefono = telefono;
        if (direccion.length()<20 || direccion.length()>140) throw new EmpleadoException(); else this.direccion = direccion;
        nominas = new ArrayList();
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
     * @return nombre 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @return apellidos 
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * 
     * @return NIF 
     */
    public String getNIF() {
        return NIF;
    }

    /**
     * 
     * @return telefono 
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * 
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
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
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @param apellidos 
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * 
     * @param NIF 
     */
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    /**
     * 
     * @param telefono 
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * 
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * 
     * @return nominas
     */
    public ArrayList<Nomina> getNominas() {
        return nominas;
    }

    /**
     * 
     * @param nominas 
     */
    public void setNominas(ArrayList<Nomina> nominas) {
        this.nominas = nominas;
    }
    
    /**
     * 
     * @param n 
     */
    public void addNomina(Nomina n){
        nominas.add(n);
    }

    /**
     * 
     * @return String
     */
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", telefono=" + telefono + ", direccion=" + direccion + ", nominas=" + nominas + '}';
    } 
}
