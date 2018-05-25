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
public class EOficina extends Empleado{
    
    private boolean tecladoMecanico;
    
    public EOficina(){
        super();
        tecladoMecanico = false;
    }
    
    /**
     * 
     * @param id
     * @param nombre
     * @param apellidos
     * @param NIF
     * @param telefono
     * @param direccion
     * @param tecladoMecanico 
     */
    public EOficina(int id, String nombre, String apellidos, String NIF, String telefono, String direccion, boolean tecladoMecanico){
        super(id, nombre, apellidos, NIF, telefono, direccion);
        this.tecladoMecanico = tecladoMecanico;
    }

    public boolean isTecladoMecanico() {
        return tecladoMecanico;
    }

    public void setTecladoMecanico(boolean tecladoMecanico) {
        this.tecladoMecanico = tecladoMecanico;
    }

    @Override
    public String toString() {
        return "EOficina{" + super.toString() + " tecladoMecanico=" + tecladoMecanico + '}';
    }
    
    
}
