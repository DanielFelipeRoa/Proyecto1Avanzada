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
public class ControladorVistaPrincipal implements ActionListener{
    
    private VistaPrincipal ventanaPrincipal;

    public ControladorVistaPrincipal(VistaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Modelo m = ventanaPrincipal.getModelo();
        Object Boton = e.getSource();
        
        if(Boton == ventanaPrincipal.getBtnGastos()){
            m.iniciarVistaGastos();           
        }else if(Boton == ventanaPrincipal.getBtnIngresos()){
            m.iniciarVistaIngresos();
        }else if(Boton == ventanaPrincipal.getBtnHistorial()){
            m.iniciarVistaHistorial();
        }
    }
    
    
}
