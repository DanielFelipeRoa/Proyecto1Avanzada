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
public class ControladorVistaIngresos implements ActionListener {
    
    private VistaIngresos ventanaIngresos;

    public ControladorVistaIngresos(VistaIngresos ventanaIngresos) {
        this.ventanaIngresos = ventanaIngresos;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Modelo m = ventanaIngresos.getModelo();
        Object Boton = e.getSource();
        if (Boton==ventanaIngresos.getBtnSaldoIngresos()){
            m.saldoIngresos();
        } else if(Boton==ventanaIngresos.getBtnAtras()){
            m.iniciarVistaPrincipal();
        }
    }
    
}
