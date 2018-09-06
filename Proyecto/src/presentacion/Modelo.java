/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import logica.Transacciones;

/**
 *
 * @author Estudiantes
 */
public class Modelo {
    
    private Transacciones miSistema;
    private VistaInicial ventanaInicial;
    private VistaPrincipal ventanaPrincipal;
    private VistaGastos ventanaGastos;
    private VistaIngresos ventanaIngresos;
    private VistaHistorial ventanaHistorial;
    float saldoInicial=0;
    
    public Transacciones getMiSistema() {
        if(miSistema == null){
            miSistema = new Transacciones();
        }
        return miSistema;
    }   
    
    public VistaInicial getVentanaInicial() {
        if(ventanaInicial == null){
            ventanaInicial = new VistaInicial(this);
        }        
        return ventanaInicial;
    }
    
    public VistaPrincipal getVentanaPrincipal(){
        if(ventanaPrincipal == null){
            ventanaPrincipal = new VistaPrincipal(this);
        }        
        return ventanaPrincipal;
    }

    public VistaGastos getVentanaGastos() {
        if(ventanaGastos == null){
            ventanaGastos = new VistaGastos(this);
        }
        return ventanaGastos;
    }

    public VistaIngresos getVentanaIngresos() {
        if(ventanaIngresos == null){
            ventanaIngresos = new VistaIngresos(this);
        }
        return ventanaIngresos;
    }

    public VistaHistorial getVentanaHistorial() {
        if(ventanaHistorial == null){
            ventanaHistorial = new VistaHistorial(this);
        }
        return ventanaHistorial;
    }
    
    public void iniciar() {
        getVentanaInicial().setTitle("Mi Billetera");
//        getVentanaInicial().setDefaultCloseOperation(EXIT_ON_CLOSE);
        getVentanaInicial().setSize(500, 400);
        getVentanaInicial().getBtnSiguiente().setEnabled(false);
        getVentanaInicial().setVisible(true);
    }
    
    public void saldoInicial(){
        
        boolean error = false;
        
        try{
            saldoInicial = Float.parseFloat(getVentanaInicial().getTxtSaldoInicial().getText());
            getMiSistema().setSaldo(saldoInicial);
            
        }catch(NumberFormatException e){
            error = true;            
        }
        
        if(error){
            getVentanaInicial().getLblRespuesta().setText("Existe un error en la introducción del saldo");
        }
        else{
            getVentanaInicial().getLblRespuesta().setText("Saldo añadido exitosamente. Nuevo saldo: "+saldoInicial);
            getVentanaInicial().getBtnSaldoInicial().setEnabled(false);
            getVentanaInicial().getBtnSiguiente().setEnabled(true);
        }
    }
    
    public void saldoGastos(){
        boolean error=false;
        try{
            getMiSistema().setSaldo(getMiSistema().getSaldo()-Float.parseFloat(getVentanaGastos().getTxtGastos().getText()));
            
        }catch(NumberFormatException e){
            error = true;            
        }
        
        if(error){
            getVentanaGastos().getlblResultado().setText("Existe un error en la introducción del gasto");
        }
        else{
            getVentanaGastos().getlblResultado().setText("Gasto añadido exitosamente");
        }
    }
    public void saldoIngresos(){
        boolean error=false;
        try{
            getMiSistema().setSaldo(getMiSistema().getSaldo()+Float.parseFloat(getVentanaIngresos().getTxtIngresos().getText()));
            
        }catch(NumberFormatException e){
            error = true;         
        }
        
        if(error){
            getVentanaIngresos().getLblResultado().setText("Existe un error en la introducción del gasto");
        }
        else{
            getVentanaIngresos().getLblResultado().setText("Ingreso añadido exitosamente");
        }
    }
    public void reiniciar(){
        getVentanaInicial().getTxtSaldoInicial().setText("");
        getVentanaInicial().getLblRespuesta().setText("Nueva cuenta, ingresa tu saldo inicial.");
        getVentanaInicial().getBtnSaldoInicial().setEnabled(true);
        getVentanaInicial().getBtnSiguiente().setEnabled(false);
    }
    
    public void iniciarVistaPrincipal(){
        getVentanaPrincipal().setTitle("Ventana Principal");
        getVentanaPrincipal().setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getVentanaPrincipal().getLblSaldoTotal().setText(String.valueOf(getMiSistema().getSaldo()));
        getVentanaPrincipal().setSize(500, 400);
        getVentanaPrincipal().setVisible(true);
        getVentanaInicial().setVisible(false);
        getVentanaGastos().setVisible(false);
        getVentanaHistorial().setVisible(false);
        getVentanaIngresos().setVisible(false);
        
    }
    
    public void iniciarVistaGastos(){
        getVentanaGastos().setTitle("Gastos");
        getVentanaGastos().setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getVentanaGastos().setSize(500, 400);
        getVentanaGastos().setVisible(true);
        getVentanaPrincipal().setVisible(false);
        getVentanaHistorial().setVisible(false);
        getVentanaIngresos().setVisible(false);
        getVentanaInicial().setVisible(false);
    }
    
    public void iniciarVistaIngresos(){
        getVentanaIngresos().setTitle("Ingresos");
        getVentanaIngresos().setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getVentanaIngresos().setSize(500, 400);
        getVentanaIngresos().setVisible(true);
        getVentanaPrincipal().setVisible(false);
        getVentanaHistorial().setVisible(false);
        getVentanaGastos().setVisible(false);
        getVentanaInicial().setVisible(false);
    }
    
    public void iniciarVistaHistorial(){
        getVentanaHistorial().setTitle("Historial");
        getVentanaHistorial().setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getVentanaHistorial().setSize(500, 400);
        getVentanaHistorial().setVisible(true);
        getVentanaPrincipal().setVisible(false);
        getVentanaGastos().setVisible(false);
        getVentanaIngresos().setVisible(false);
        getVentanaInicial().setVisible(false);
    }
}
