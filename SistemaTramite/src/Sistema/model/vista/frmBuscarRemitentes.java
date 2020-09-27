package Sistema.model.vista;

import Sistema.model.bo.RemitenteBo;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class frmBuscarRemitentes extends javax.swing.JDialog {

    public frmBuscarRemitentes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
//        cargarDatos();

    }

    frmBuscarRemitentes(frmGeneral aThis, boolean b) {
        super(aThis, b);
        initComponents();
        this.setLocationRelativeTo(null);
        recepcion = (frmGeneral) aThis;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblder = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtRemitente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRemitente = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remitentes Registrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(709, 405));
        setSize(new java.awt.Dimension(2147483647, 2147483647));
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Remitentes");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(120, 0, 390, 22);

        lblder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblder.setText("Remitente");
        getContentPane().add(lblder);
        lblder.setBounds(10, 40, 60, 20);

        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir);
        btnsalir.setBounds(610, 40, 80, 23);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/buscar.gif"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(450, 40, 90, 23);
        getContentPane().add(txtRemitente);
        txtRemitente.setBounds(80, 40, 360, 20);

        tblRemitente = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblRemitente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblRemitente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRemitenteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRemitente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 690, 320);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 30, 720, 10);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblRemitenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRemitenteMouseClicked
        if (evt.getClickCount() >= 2) {
            int index = tblRemitente.getSelectedRow();
            recepcion.getTxtcodRemRecepcion().setText(tblRemitente.getValueAt(index, 0).toString());
            recepcion.getTxtRemitenteRecepcion().setText(tblRemitente.getValueAt(index, 2).toString());
            this.dispose();
        }
    }//GEN-LAST:event_tblRemitenteMouseClicked

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
//        opt = 'B';
        txtRemitente.setEnabled(false);
        String remitente = txtRemitente.getText();
        cargarDatosBuscarNombre(remitente);
        try {
            TableColumn columna;
            remTableModel = RemitenteBo.obtenerListaRemitenteBuscar(txtRemitente.getText());
            tblRemitente.setModel(remTableModel);
            String titu[] = {"COD", "DNI", "REMITENTE", "DIRECCION", "TELEFONO", "EMAIL",};
            remTableModel.setColumnIdentifiers(titu);
            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tblRemitente.getModel());
            tblRemitente.setRowSorter(sorter);
            TableColumnModel columnModel = tblRemitente.getColumnModel();
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            DefaultTableCellRenderer tcc = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.RIGHT);
            tcc.setHorizontalAlignment(SwingConstants.CENTER);
            columnModel.getColumn(0).setCellRenderer(tcc);
            columnModel.getColumn(0).setPreferredWidth(10);
            columnModel.getColumn(1).setCellRenderer(tcc);
            columnModel.getColumn(1).setPreferredWidth(4);
            columnModel.getColumn(2).setPreferredWidth(120);
            columnModel.getColumn(3).setPreferredWidth(100);
            columnModel.getColumn(4).setPreferredWidth(20);
            columnModel.getColumn(5).setPreferredWidth(100);
            columna = tblRemitente.getColumnModel().getColumn(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void cargarDatosBuscarNombre(String remitente) {
        try {
            TableColumn columna;
            DefaultTableModel RemitenteTableModel = RemitenteBo.obtenerListaRemitenteBuscar(remitente);
            tblRemitente.setModel(RemitenteTableModel);
//            setAnchoColumnas();
            columna = tblRemitente.getColumnModel().getColumn(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(frmBuscarRemitentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBuscarRemitentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBuscarRemitentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBuscarRemitentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmBuscarRemitentes dialog = new frmBuscarRemitentes(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblder;
    private javax.swing.JTable tblRemitente;
    private javax.swing.JTextField txtRemitente;
    // End of variables declaration//GEN-END:variables
    private frmGeneral recepcion;
    private DefaultTableModel remTableModel;
}
