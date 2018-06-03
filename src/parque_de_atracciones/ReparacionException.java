/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parque_de_atracciones;

/**
 *
 * @author victor
 */
class ReparacionException extends Exception {
    public ReparacionException(){
        super("Uno de los datos introducidos sobre la atracción no es válido");
    }
}
