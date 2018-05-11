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
public class Atraccion {
    
    private int id;
    private String nombre;
    private String estado;
    private boolean accesible;
    
    public Atraccion(){
        id = 0;
        nombre = new String();
        estado = new String();
        accesible = false;
    }

    public Atraccion(int id, String nombre, String estado, boolean accesible) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.accesible = accesible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isAccesible() {
        return accesible;
    }

    public void setAccesible(boolean accesible) {
        this.accesible = accesible;
    }

    @Override
    public String toString() {
        return "Atraccion{" + "id=" + id + ", nombre=" + nombre + ", estado=" + estado + ", accesible=" + accesible + '}';
    }
    
}
