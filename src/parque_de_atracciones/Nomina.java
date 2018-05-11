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
public class Nomina {
    
    private int id;
    private int mes;
    private int año;
    private double salario;

    public Nomina(){
        id = 0;
        mes = 0;
        año = 0;
        salario = 0;
    }
    
    public Nomina(int id, int mes, int año, double salario) {
        this.id = id;
        this.mes = mes;
        this.año = año;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nomina{" + "id=" + id + ", mes=" + mes + ", a\u00f1o=" + año + ", salario=" + salario + '}';
    }
    
    
}
