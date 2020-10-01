package Sistema.model.vista;

import Sistema.model.bo.RecepcionBo;
import Sistema.model.bo.RemitenteBo;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class frmBuscarDocumentoRecepcion extends javax.swing.JDialog {

    public frmBuscarDocumentoRecepcion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public frmBuscarDocumentoRecepcion(frmGeneral aThis, boolean b) {
        super(aThis, b);
        initComponents();
        this.setLocationRelativeTo(null);
        recepcion = (frmGeneral) aThis;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtRecepcion = new javax.swing.JTextField();
        lblRecepcion = new javax.swing.JLabel();
        btnBuscarRecepcion = new javax.swing.JButton();
        btnSalirRecepcion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDocumentoRecepcion = new javax.swing.JTable();

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Buscar Recepcion");
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

        txtRecepcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRecepcionKeyPressed(evt);
            }
        });

        lblRecepcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblRecepcion.setText("Recepción");
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

        btnBuscarRecepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/buscar.gif"))); // NOI18N
        btnBuscarRecepcion.setText("Buscar");
        btnBuscarRecepcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarRecepcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarRecepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRecepcionActionPerformed(evt);
            }
        });
        btnBuscarRecepcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBuscarRecepcionjSeparator1KeyPressed(evt);
            }
        });

        btnSalirRecepcion.setText("Salir");
        btnSalirRecepcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalirRecepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirRecepcionActionPerformed(evt);
            }
        });
        btnSalirRecepcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalirRecepcionjSeparator1KeyPressed(evt);
            }
        });

        jScrollPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jScrollPane1jSeparator1KeyPressed(evt);
            }
        });

        tblDocumentoRecepcion = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblDocumentoRecepcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDocumentoRecepcion.setMinimumSize(new java.awt.Dimension(898, 498));
        tblDocumentoRecepcion.setPreferredSize(new java.awt.Dimension(898, 498));
        tblDocumentoRecepcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDocumentoRecepcionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDocumentoRecepcionMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDocumentoRecepcion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(lblRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(txtRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnBuscarRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnSalirRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 426, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 39, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalirRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void txtRecepcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRecepcionKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            btnBuscarRecepcion.doClick();
        }
    }//GEN-LAST:event_txtRecepcionKeyPressed

    private void btnBuscarRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRecepcionActionPerformed
        try {
            TableColumn columna;
            docTableModel = RecepcionBo.obtenerListaRecepcionBuscar(txtRecepcion.getText());
            tblDocumentoRecepcion.setModel(docTableModel);
            //idRecepcion,codigoRecepcion,Documento,Institucion,idRemitente,Asunto,Referencia,Destinatario,Obs,Fecha,Hora 
            String titu[] = {"ID", "CODREC", "DOCUMENTO", "INSTITUCIÓN", "IDREM", "ASUNTO", "REFERENCIA", "DESTINATARIO", "OBS", "FECHA", "HORA"};
            docTableModel.setColumnIdentifiers(titu);
            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tblDocumentoRecepcion.getModel());
            tblDocumentoRecepcion.setRowSorter(sorter);
            TableColumnModel columnModel = tblDocumentoRecepcion.getColumnModel();
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            DefaultTableCellRenderer tcc = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.RIGHT);
            tcc.setHorizontalAlignment(SwingConstants.CENTER);
            columnModel.getColumn(0).setCellRenderer(tcc);
            columnModel.getColumn(0).setPreferredWidth(10);
            columnModel.getColumn(1).setPreferredWidth(15);
            columnModel.getColumn(2).setPreferredWidth(110);
            columnModel.getColumn(3).setPreferredWidth(110);
            columnModel.getColumn(4).setPreferredWidth(5);
            columnModel.getColumn(5).setPreferredWidth(110);
            columnModel.getColumn(6).setPreferredWidth(110);
            columnModel.getColumn(7).setPreferredWidth(110);
            columnModel.getColumn(8).setPreferredWidth(110);
            columnModel.getColumn(9).setPreferredWidth(20);
            columnModel.getColumn(10).setPreferredWidth(20);
            columna = tblDocumentoRecepcion.getColumnModel().getColumn(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarRecepcionActionPerformed

    private void btnBuscarRecepcionjSeparator1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarRecepcionjSeparator1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarRecepcionjSeparator1KeyPressed

    private void btnSalirRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirRecepcionActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirRecepcionActionPerformed

    private void btnSalirRecepcionjSeparator1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalirRecepcionjSeparator1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirRecepcionjSeparator1KeyPressed

    private void tblDocumentoRecepcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDocumentoRecepcionMouseClicked
        if (evt.getClickCount() >= 2) {
            int index = tblDocumentoRecepcion.getSelectedRow();
            recepcion.gettxtIdRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 0).toString());
            recepcion.gettxtCodigoRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 1).toString());
            recepcion.getTxtDocumentoRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 2).toString());
            recepcion.gettxtInstitucionRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 3).toString());
            recepcion.gettxtCodRemRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 4).toString());
            String lsNombreRem = cargarRemitente((Integer)tblDocumentoRecepcion.getValueAt(index, 4));
            recepcion.gettxtRemitenteRecepcion().setText(lsNombreRem);
            recepcion.gettxtAsuntoRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 5).toString());
            recepcion.gettxtReferenciaRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 6).toString());
            recepcion.gettxtDestinatarioRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 7).toString());
            recepcion.gettxaObsRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 8).toString());
            recepcion.getTxtfechaRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 9).toString());
            recepcion.getTxtHoraRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 10).toString());
            this.dispose();
        }
    }//GEN-LAST:event_tblDocumentoRecepcionMouseClicked

    private void tblDocumentoRecepcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDocumentoRecepcionMousePressed
        if (evt.getClickCount() == 2) {
            int index = tblDocumentoRecepcion.getSelectedRow();
            recepcion.gettxtIdRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 0).toString());
            recepcion.gettxtCodigoRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 1).toString());
            recepcion.getTxtDocumentoRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 2).toString());
            recepcion.gettxtInstitucionRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 3).toString());
            recepcion.gettxtCodRemRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 4).toString());
            String lsNombreRem = cargarRemitente((Integer)tblDocumentoRecepcion.getValueAt(index, 4));
            recepcion.gettxtRemitenteRecepcion().setText(lsNombreRem);
            recepcion.gettxtAsuntoRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 5).toString());
            recepcion.gettxtReferenciaRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 6).toString());
            recepcion.gettxtDestinatarioRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 7).toString());
            recepcion.gettxaObsRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 8).toString());
            recepcion.getTxtfechaRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 9).toString());
            recepcion.getTxtHoraRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 10).toString()); 
            recepcion.getBtnModificarRecepcion().setEnabled(true);
            recepcion.getBtnEliminarRecepcion().setEnabled(true);
            recepcion.getBtnNuevoRecepcion().setEnabled(false);
            recepcion.getBtnGrabarRecepcion().setEnabled(false);
            recepcion.habilitarBotonesFormularioRecepcion();
            this.dispose();
        }
    }//GEN-LAST:event_tblDocumentoRecepcionMousePressed

    private void jScrollPane1jSeparator1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jScrollPane1jSeparator1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1jSeparator1KeyPressed

    private void lblRecepcionjSeparator1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblRecepcionjSeparator1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRecepcionjSeparator1KeyPressed

    private void lblRecepcionComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_lblRecepcionComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRecepcionComponentMoved

    public String cargarRemitente(int idRemitente) {
        String lsDocumento="";
        try {
            lsDocumento = RemitenteBo.obtenerNombreRemitente(idRemitente);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lsDocumento;
    }

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
            java.util.logging.Logger.getLogger(frmBuscarDocumentoRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBuscarDocumentoRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBuscarDocumentoRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBuscarDocumentoRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmBuscarDocumentoRecepcion dialog = new frmBuscarDocumentoRecepcion(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscarRecepcion;
    private javax.swing.JButton btnSalirRecepcion;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblRecepcion;
    private javax.swing.JTable tblDocumentoRecepcion;
    private javax.swing.JTextField txtRecepcion;
    // End of variables declaration//GEN-END:variables
    private frmGeneral recepcion;
    private DefaultTableModel docTableModel;
}
