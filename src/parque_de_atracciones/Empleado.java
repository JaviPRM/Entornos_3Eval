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
    public Empleado(int id, String nombre, String apellidos, String NIF, String telefono, String direccion){
        if (id <0 ) throw new EmpleadoException(); else this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.telefono = telefono;
        this.direccion = direccion;
        nominas = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Nomina> getNominas() {
        return nominas;
    }

    public void setNominas(ArrayList<Nomina> nominas) {
        this.nominas = nominas;
    }
    
    public void addNomina(Nomina n){
        nominas.add(n);
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", telefono=" + telefono + ", direccion=" + direccion + ", nominas=" + nominas + '}';
    } 
}
