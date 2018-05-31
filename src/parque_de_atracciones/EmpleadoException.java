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
public class EmpleadoException extends Exception {

    public EmpleadoException() {
        super("Uno de los datos del empleado introducidos no es válido");
    }
    
}
