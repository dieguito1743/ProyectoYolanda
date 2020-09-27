package Sistema.model.vista;

import Sistema.model.bo.DocumentoBo;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class frmBuscarDocumentoCargo extends javax.swing.JDialog {

    public frmBuscarDocumentoCargo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public frmBuscarDocumentoCargo(frmGeneral aThis, boolean b) {
        super(aThis, b);
        initComponents();
        this.setLocationRelativeTo(null);
        cargo = (frmGeneral) aThis;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtDocumento = new javax.swing.JTextField();
        lbldocumento = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDocumentoCargo = new javax.swing.JTable();

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Buscar Documento");
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

        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });
        txtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDocumentoKeyPressed(evt);
            }
        });

        lbldocumento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbldocumento.setText("Documento");
        lbldocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbldocumentojSeparator1KeyPressed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/buscar.gif"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        btnBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBuscarjSeparator1KeyPressed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        btnSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalirjSeparator1KeyPressed(evt);
            }
        });

        jScrollPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jScrollPane1jSeparator1KeyPressed(evt);
            }
        });

        tblDocumentoCargo = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblDocumentoCargo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDocumentoCargo.setMinimumSize(new java.awt.Dimension(898, 498));
        tblDocumentoCargo.setPreferredSize(new java.awt.Dimension(898, 498));
        tblDocumentoCargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDocumentoCargoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDocumentoCargoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDocumentoCargo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(lbldocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 9, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addGap(8, 8, 8)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbldocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void txtDocumentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            btnBuscar.doClick();
        }
    }//GEN-LAST:event_txtDocumentoKeyPressed

    private void lbldocumentojSeparator1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbldocumentojSeparator1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbldocumentojSeparator1KeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            TableColumn columna;
            docTableModel = DocumentoBo.obtenerListaDocumentoBuscar(txtDocumento.getText());
            tblDocumentoCargo.setModel(docTableModel);
            String titu[] = {"COD", "TD", "N°-DOC", "FECHA", "AÑO", "DOCUMENTO", "FOL", "ASUNTO", "AREA", "INSTITUCION", "ST",};
            docTableModel.setColumnIdentifiers(titu);
            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tblDocumentoCargo.getModel());
            tblDocumentoCargo.setRowSorter(sorter);
            TableColumnModel columnModel = tblDocumentoCargo.getColumnModel();
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            DefaultTableCellRenderer tcc = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.RIGHT);
            tcc.setHorizontalAlignment(SwingConstants.CENTER);
            columnModel.getColumn(0).setCellRenderer(tcc);
            columnModel.getColumn(0).setPreferredWidth(10);
            columnModel.getColumn(1).setCellRenderer(tcc);
            columnModel.getColumn(1).setPreferredWidth(4);
            columnModel.getColumn(2).setPreferredWidth(15);
            columnModel.getColumn(3).setPreferredWidth(40);
            columnModel.getColumn(4).setCellRenderer(tcc);
            columnModel.getColumn(4).setPreferredWidth(10);
            columnModel.getColumn(5).setPreferredWidth(180);
            columnModel.getColumn(6).setCellRenderer(tcc);
            columnModel.getColumn(6).setPreferredWidth(8);
            columnModel.getColumn(7).setPreferredWidth(45); //ASUNTO
            columnModel.getColumn(8).setPreferredWidth(45); //area
            columnModel.getColumn(9).setPreferredWidth(45); //INST
            columnModel.getColumn(10).setPreferredWidth(5);
            columna = tblDocumentoCargo.getColumnModel().getColumn(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarjSeparator1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarjSeparator1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarjSeparator1KeyPressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalirjSeparator1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalirjSeparator1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirjSeparator1KeyPressed

    private void tblDocumentoCargoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDocumentoCargoMouseClicked
        if (evt.getClickCount() >= 2) {
            int index = tblDocumentoCargo.getSelectedRow();
            cargo.getlblIdDocumentoCargo().setText(tblDocumentoCargo.getValueAt(index, 0).toString());
            cargo.gettxtNroDocumentoCargo().setText(tblDocumentoCargo.getValueAt(index, 2).toString());
            cargo.gettxtDocumentoCargo().setText(tblDocumentoCargo.getValueAt(index, 5).toString());
            cargo.gettxtAsuntoCargo().setText(tblDocumentoCargo.getValueAt(index, 7).toString());
            cargo.gettxtAreaCargo().setText(tblDocumentoCargo.getValueAt(index, 9).toString());
            cargo.gettxtInstitucionCargo().setText(tblDocumentoCargo.getValueAt(index, 8).toString());
            this.dispose();
        }
    }//GEN-LAST:event_tblDocumentoCargoMouseClicked

    private void tblDocumentoCargoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDocumentoCargoMousePressed
        if (evt.getClickCount() == 2) {
            int index = tblDocumentoCargo.getSelectedRow();
            cargo.getlblIdDocumentoCargo().setText(tblDocumentoCargo.getValueAt(index, 0).toString());
            cargo.gettxtNroDocumentoCargo().setText(tblDocumentoCargo.getValueAt(index, 2).toString());
            cargo.gettxtDocumentoCargo().setText(tblDocumentoCargo.getValueAt(index, 5).toString());
            cargo.gettxtAsuntoCargo().setText(tblDocumentoCargo.getValueAt(index, 7).toString());
            cargo.gettxtAreaCargo().setText(tblDocumentoCargo.getValueAt(index, 9).toString());
            cargo.gettxtInstitucionCargo().setText(tblDocumentoCargo.getValueAt(index, 8).toString());
            this.dispose();
        }
    }//GEN-LAST:event_tblDocumentoCargoMousePressed

    private void jScrollPane1jSeparator1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jScrollPane1jSeparator1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1jSeparator1KeyPressed

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

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
            java.util.logging.Logger.getLogger(frmBuscarDocumentoCargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBuscarDocumentoCargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBuscarDocumentoCargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBuscarDocumentoCargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmBuscarDocumentoCargo dialog = new frmBuscarDocumentoCargo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbldocumento;
    private javax.swing.JTable tblDocumentoCargo;
    private javax.swing.JTextField txtDocumento;
    // End of variables declaration//GEN-END:variables
    private frmGeneral cargo;
    private DefaultTableModel docTableModel;
}
