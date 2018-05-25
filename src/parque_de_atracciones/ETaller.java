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
public class ETaller extends Empleado{
    
    private int numHerramientas;
    
    public ETaller(){
        super();
        numHerramientas = 0;
    }
    
    /**
     * 
     * @param id
     * @param nombre
     * @param apellidos
     * @param NIF
     * @param telefono
     * @param direccion
     * @param numHerramientas 
     */
    public ETaller(int id, String nombre, String apellidos, String NIF, String telefono, String direccion, int numHerramientas){
        super(id, nombre, apellidos, NIF, telefono, direccion);
        this.numHerramientas = numHerramientas;
    }

    public int getNumHerramientas() {
        return numHerramientas;
    }

    public void setNumHerramientas(int numHerramientas) {
        this.numHerramientas = numHerramientas;
    }

    @Override
    public String toString() {
        return "ETaller{" + super.toString() + "numHerramientas=" + numHerramientas + '}';
    }
    
    
}
