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
 * @author Estudiantes
 */
public class ControladorVistaInicial implements ActionListener {
    
    private VistaInicial ventanaInicial;
    
    public ControladorVistaInicial (VistaInicial v){
        ventanaInicial = v;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        Modelo m = ventanaInicial.getModelo();        
        Object Boton = e.getSource();
        
        if (Boton == ventanaInicial.getBtnSaldoInicial()){    
            m.saldoInicial();
            
        }else if(Boton == ventanaInicial.getBtnSiguiente()){
            m.iniciarVistaPrincipal();
            
        }else if(Boton == ventanaInicial.getBtnNuevaCuenta()){
            m.reiniciar();
        }
    }
}
