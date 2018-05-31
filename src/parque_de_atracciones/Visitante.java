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
    public Visitante(int id, String nombre, String apellidos, String email) throws VisitanteException{
        if (id <0) throw new VisitanteException(); else this.id = id;
        if (nombre.length()>30 || nombre.length()<2) throw new VisitanteException(); else this.nombre = nombre;
        if (apellidos.length()>60 || apellidos.length()<5) throw new VisitanteException(); else this.apellidos = apellidos;
        if (email.length()<10 || email.length()>140) throw new VisitanteException(); else this.email = email;
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
     * @return apellidos 
     */
    public String getApellidos() {
        return apellidos;
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
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return String 
     */
    @Override
    public String toString() {
        return "Visitante{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + '}';
    }
    
}
