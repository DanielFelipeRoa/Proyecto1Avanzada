/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author zll_OKAMI_llz
 */
public class VistaGastos extends javax.swing.JFrame {

    /**
     * Creates new form VistaGastos
     */
    private Modelo modelo;
    private ControladorVistaGastos controlVisGas;
    
    public VistaGastos(Modelo m) {
        modelo = m;
        initComponents();
        capturarEventos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblGastos = new javax.swing.JLabel();
        txtGastos = new javax.swing.JTextField();
        btnSaldoGastos = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        TipoGastos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblGastos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblGastos.setText("Gastos");

        txtGastos.setText("Inserte Dienero Gastado");
        txtGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGastosActionPerformed(evt);
            }
        });

        btnSaldoGastos.setText("Agregar gastos");

        btnAtras.setText("Ir atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        TipoGastos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimentos y Bebidas", "Automovil", "Mercado", "Compras", "Entretenimiento", "Familia", "Salud", "Regalos" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(TipoGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnSaldoGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(txtGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(lblGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txtGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaldoGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(btnAtras)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGastosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGastosActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtrasActionPerformed
    
        
    public ControladorVistaGastos getControlVisGas() {
        if(controlVisGas == null){
            controlVisGas = new ControladorVistaGastos(this);
        }
        return controlVisGas;
    }
private void capturarEventos(){
        btnSaldoGastos.addActionListener(getControlVisGas());
        btnAtras.addActionListener(getControlVisGas());
    }
    public Modelo getModelo() {
        return modelo;
    }
    public JTextField getTxtGastos(){
        return txtGastos;
    }
    public JLabel getLblGastos() {
        return lblGastos;
    }
    public JComboBox getCBTipoGastos(){
        return TipoGastos;
    }
    public JLabel getlblResultado() {
        return lblResultado;
    }
    public JButton getbtnSaldoGastos() {
        return btnSaldoGastos;
    }
    public JButton getbtnAtras() {
        return btnAtras;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TipoGastos;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSaldoGastos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblGastos;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtGastos;
    // End of variables declaration//GEN-END:variables
}
