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
public class Visitante {
    
    private int id;
    private String nombre;
    private String apellidos;
    private String email;
    
    public Visitante(){
        id = 0;
        nombre = new String();
        apellidos = new String();
        email = new String(); 
    }

    /**
     * 
     * @param id
     * @param nombre
     * @param apellidos
     * @param email 
     */
    public Visitante(int id, String nombre, String apellidos, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Visitante{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + '}';
    }
    
}
