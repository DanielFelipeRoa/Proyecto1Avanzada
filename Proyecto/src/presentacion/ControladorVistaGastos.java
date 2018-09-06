/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Josue
 */
public class ControladorVistaGastos implements ActionListener{

    private VistaGastos ventanaGastos;
    
    public ControladorVistaGastos(VistaGastos v){
        ventanaGastos = v;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Modelo m = ventanaGastos.getModelo();
        Object Boton = e.getSource();
        if (Boton == ventanaGastos.getbtnSaldoGastos()){
            m.saldoGastos();
            
        } else if(Boton==ventanaGastos.getbtnAtras()){
            m.iniciarVistaPrincipal();
        }
    }
    
}
