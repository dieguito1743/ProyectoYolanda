 package Sistema.model.vista;

import Sistema.model.bo.DerivacionBo;
import Sistema.model.bo.RecepcionBo;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class frmBuscarDocumentoDerivacion extends javax.swing.JDialog {

    public frmBuscarDocumentoDerivacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public frmBuscarDocumentoDerivacion(frmGeneral aThis, boolean b) {
        super(aThis, b);
        initComponents();
        this.setLocationRelativeTo(null);
        derivacion= (frmGeneral) aThis;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtDerivacion = new javax.swing.JTextField();
        lblRecepcion = new javax.swing.JLabel();
        btnBuscarDerivacion = new javax.swing.JButton();
        btnSalirDerivacion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDocumentoDerivacion = new javax.swing.JTable();

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Buscar Derivación");
        jLabel16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel16jSeparator1KeyPressed(evt);
            }
        });

        jSeparator1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSeparator1KeyPressed(evt);
            }
        });

        txtDerivacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDerivacionKeyPressed(evt);
            }
        });

        lblRecepcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblRecepcion.setText("Derivación");
        lblRecepcion.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                lblRecepcionComponentMoved(evt);
            }
        });
        lblRecepcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblRecepcionjSeparator1KeyPressed(evt);
            }
        });

        btnBuscarDerivacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/buscar.gif"))); // NOI18N
        btnBuscarDerivacion.setText("Buscar");
        btnBuscarDerivacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarDerivacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarDerivacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDerivacionActionPerformed(evt);
            }
        });
        btnBuscarDerivacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBuscarDerivacionjSeparator1KeyPressed(evt);
            }
        });

        btnSalirDerivacion.setText("Salir");
        btnSalirDerivacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalirDerivacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirDerivacionActionPerformed(evt);
            }
        });
        btnSalirDerivacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalirDerivacionjSeparator1KeyPressed(evt);
            }
        });

        jScrollPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jScrollPane1jSeparator1KeyPressed(evt);
            }
        });

        tblDocumentoDerivacion = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblDocumentoDerivacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDocumentoDerivacion.setMinimumSize(new java.awt.Dimension(898, 498));
        tblDocumentoDerivacion.setPreferredSize(new java.awt.Dimension(898, 498));
        tblDocumentoDerivacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDocumentoDerivacionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDocumentoDerivacionMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDocumentoDerivacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(lblRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(txtDerivacion, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnBuscarDerivacion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnSalirDerivacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 429, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 39, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDerivacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarDerivacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalirDerivacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16jSeparator1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel16jSeparator1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16jSeparator1KeyPressed

    private void jSeparator1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSeparator1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSeparator1KeyPressed

    private void txtDerivacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDerivacionKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            btnBuscarDerivacion.doClick();
        }
    }//GEN-LAST:event_txtDerivacionKeyPressed

    private void btnBuscarDerivacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDerivacionActionPerformed
        try {
            TableColumn columna;
            docTableModel = DerivacionBo.obtenerListaDerivacionBuscar(txtDerivacion.getText());
            tblDocumentoDerivacion.setModel(docTableModel);
            //d.idDerivacion,d.codigoDerivacion,d.Fecha,d.idDocumento,isnull(d.idRemitente,''),d.MotivoDerivacion,
            //d.prioridad,d.observacion
            String titu[] = {"ID", "COD-DER","FECHA", "IDDOC","IDREMIT","MOTIVO","OBS","PRIORIDAD",};
            docTableModel.setColumnIdentifiers(titu);
            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tblDocumentoDerivacion.getModel());
            tblDocumentoDerivacion.setRowSorter(sorter);
            TableColumnModel columnModel = tblDocumentoDerivacion.getColumnModel();
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            DefaultTableCellRenderer tcc = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.RIGHT);
            tcc.setHorizontalAlignment(SwingConstants.CENTER);
            columnModel.getColumn(0).setCellRenderer(tcc);
            columnModel.getColumn(0).setPreferredWidth(20);
            columnModel.getColumn(1).setCellRenderer(tcc);
            columnModel.getColumn(1).setPreferredWidth(20);
            columnModel.getColumn(2).setPreferredWidth(25);
            columnModel.getColumn(3).setPreferredWidth(20);
            columnModel.getColumn(4).setCellRenderer(tcc);
            columnModel.getColumn(4).setPreferredWidth(10);
            columnModel.getColumn(5).setPreferredWidth(180);
            columnModel.getColumn(6).setPreferredWidth(180);
            columnModel.getColumn(7).setPreferredWidth(20);
            columna = tblDocumentoDerivacion.getColumnModel().getColumn(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarDerivacionActionPerformed

    private void btnBuscarDerivacionjSeparator1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarDerivacionjSeparator1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarDerivacionjSeparator1KeyPressed

    private void btnSalirDerivacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirDerivacionActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirDerivacionActionPerformed

    private void btnSalirDerivacionjSeparator1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalirDerivacionjSeparator1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirDerivacionjSeparator1KeyPressed

    private void tblDocumentoDerivacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDocumentoDerivacionMouseClicked
        if (evt.getClickCount() >= 2) {
            int index = tblDocumentoDerivacion.getSelectedRow();
            derivacion.getTxtIdDerivacion().setText(tblDocumentoDerivacion.getValueAt(index, 0).toString());
             derivacion.getTxtFechaDerivacion().setText(tblDocumentoDerivacion.getValueAt(index, 2).toString());
            derivacion.gettxtCodigoDerivacion().setText(tblDocumentoDerivacion.getValueAt(index,1).toString());
            derivacion.getlblIdRecepcion().setText(tblDocumentoDerivacion.getValueAt(index, 3).toString());
            derivacion.gettxtRemitenteDerivacion().setText(tblDocumentoDerivacion.getValueAt(index, 4).toString());
            derivacion.gettxtMotivoDerivacion().setText(tblDocumentoDerivacion.getValueAt(index, 5).toString());
            derivacion.gettxaObsDerivacion().setText(tblDocumentoDerivacion.getValueAt(index, 6).toString());
            derivacion.getcboPrioridadDerivacion().setSelectedItem(String.valueOf(tblDocumentoDerivacion.getModel().getValueAt(index, 7)));
            derivacion.getBtnModificarDerivacion().setEnabled(true);
            derivacion.getBtnEliminarDerivacion().setEnabled(true);
            derivacion.getBtnNuevoDerivacion().setEnabled(false);
            derivacion.getBtnGrabarDerivacion().setEnabled(false);
            derivacion.habilitarBotonesFormularioDerivacion();
            
            this.dispose();
        }
    }//GEN-LAST:event_tblDocumentoDerivacionMouseClicked

    private void tblDocumentoDerivacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDocumentoDerivacionMousePressed
        if (evt.getClickCount() >= 2) {
            int index = tblDocumentoDerivacion.getSelectedRow();
            derivacion.getTxtIdDerivacion().setText(tblDocumentoDerivacion.getValueAt(index, 0).toString());
            derivacion.getTxtFechaDerivacion().setText(tblDocumentoDerivacion.getValueAt(index, 2).toString());
            derivacion.gettxtCodigoDerivacion().setText(tblDocumentoDerivacion.getValueAt(index,1).toString());
            derivacion.getlblIdRecepcion().setText(tblDocumentoDerivacion.getValueAt(index, 3).toString());
            derivacion.gettxtRemitenteDerivacion().setText(tblDocumentoDerivacion.getValueAt(index, 4).toString());
            derivacion.gettxtMotivoDerivacion().setText(tblDocumentoDerivacion.getValueAt(index, 5).toString());
            derivacion.gettxaObsDerivacion().setText(tblDocumentoDerivacion.getValueAt(index, 6).toString());
            derivacion.getcboPrioridadDerivacion().setSelectedItem(String.valueOf(tblDocumentoDerivacion.getModel().getValueAt(index, 7)));
            this.dispose();
        }
    }//GEN-LAST:event_tblDocumentoDerivacionMousePressed

    private void jScrollPane1jSeparator1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jScrollPane1jSeparator1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1jSeparator1KeyPressed

    private void lblRecepcionjSeparator1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblRecepcionjSeparator1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRecepcionjSeparator1KeyPressed

    private void lblRecepcionComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_lblRecepcionComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRecepcionComponentMoved
    public String cargarRecepcion(int idRecepcion) {
        String lsDocumento = "";
        try {
            lsDocumento = RecepcionBo.obtenerNombreRecepcion(idRecepcion);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lsDocumento;

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmBuscarDocumentoDerivacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBuscarDocumentoDerivacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBuscarDocumentoDerivacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBuscarDocumentoDerivacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmBuscarDocumentoDerivacion dialog = new frmBuscarDocumentoDerivacion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarDerivacion;
    private javax.swing.JButton btnSalirDerivacion;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblRecepcion;
    private javax.swing.JTable tblDocumentoDerivacion;
    private javax.swing.JTextField txtDerivacion;
    // End of variables declaration//GEN-END:variables
    private frmGeneral derivacion;
    private DefaultTableModel docTableModel;
}
