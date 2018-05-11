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
public class EAtracciones extends Empleado{
    
    private boolean herramientasBuenEstado;

    public EAtracciones() {
        super();
        herramientasBuenEstado = true;
    }

    public EAtracciones(int id, String nombre, String apellidos, String NIF, String telefono, String direccion, boolean herramientasBuenEstado) {
        super(id, nombre, apellidos, NIF, telefono, direccion);
        this.herramientasBuenEstado = herramientasBuenEstado;
    }

    public boolean isHerramientasBuenEstado() {
        return herramientasBuenEstado;
    }

    public void setHerramientasBuenEstado(boolean herramientasBuenEstado) {
        this.herramientasBuenEstado = herramientasBuenEstado;
    }

    @Override
    public String toString() {
        return "EAtracciones{" + super.toString() + " herramientasBuenEstado=" + herramientasBuenEstado + '}';
    }
    
    
}
