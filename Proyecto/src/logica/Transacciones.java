/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Josue
 */
public class Transacciones {
   
    private float gastos;
    private float ingresos;
    private float saldo;
    private float HGastos;

    public Transacciones() {
        gastos = 0;
        ingresos = 0;
        saldo = 0;
        HGastos=0;
    }
    
    public void añadirGasto(float gasto){
        gastos += gasto;
        saldo -= gasto;
    }
    
    public void añadirIngreso(float ingreso){
        ingresos += ingreso;
        saldo += ingreso;
    }

    public float getGastos() {
        return gastos;
    }

    public void setGastos(float gastos) {
        this.gastos = gastos;
    }

    public float getIngresos() {
        return ingresos;
    }

    public void setIngresos(float ingresos) {
        this.ingresos = ingresos;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getHGastos() {
        return HGastos;
    }
    public void setHGastos(float HGastos) {
        this.HGastos = HGastos;
    }
    
    
}
