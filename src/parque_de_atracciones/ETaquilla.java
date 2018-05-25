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
public class ETaquilla extends Empleado{
    
    private int entradasVendidas;

    public ETaquilla() {
        super();
        entradasVendidas = 0;
    }
    
    /**
     * 
     * @param id
     * @param nombre
     * @param apellidos
     * @param NIF
     * @param telefono
     * @param direccion
     * @param entradasVendidas 
     */
    public ETaquilla(int id, String nombre, String apellidos, String NIF, String telefono, String direccion, int entradasVendidas) {
        super(id, nombre, apellidos, NIF, telefono, direccion);
        this.entradasVendidas = entradasVendidas;
    }

    public int getEntradasVendidas() {
        return entradasVendidas;
    }

    public void setEntradasVendidas(int entradasVendidas) {
        this.entradasVendidas = entradasVendidas;
    }

    @Override
    public String toString() {
        return "ETaquilla{" + super.toString() + " entradasVendidas=" + entradasVendidas + '}';
    }
    
    
    
    
}
