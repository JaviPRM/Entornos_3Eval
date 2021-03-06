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
public class Reparacion {
    
    private int id;
    private String descripcion;
    private int numeroDias;
    private ArrayList<ETaller> mecanicos;
    
    public Reparacion(){
        id = 0;
        descripcion = new String();
        numeroDias = 0;
        mecanicos = new ArrayList();
    }
    
    /**
     * 
     * @param id
     * @param descripcion
     * @param numeroDias 
     */
    public Reparacion(int id, String descripcion, int numeroDias)throws ReparacionException  {
       if(id<0)throw new ReparacionException(); this.id = id;
       if(descripcion.length()>300||descripcion.length()<10) throw  new ReparacionException(); this.descripcion = descripcion;
       if(numeroDias<0) throw new ReparacionException(); else this.numeroDias = numeroDias;
        mecanicos = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public ArrayList<ETaller> getMecanicos() {
        return mecanicos;
    }

    public void setMecanicos(ArrayList<ETaller> mecanicos) {
        this.mecanicos = mecanicos;
    }
    
    public void añadirMecanico(ETaller e){
        mecanicos.add(e);
    }

    @Override
    public String toString() {
        return "Reparacion{" + "id=" + id + ", descripcion=" + descripcion + ", numeroDias=" + numeroDias + ", mecanicos=" + mecanicos + '}';
    }  
}
