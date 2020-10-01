package Sistema.model.vista;

import Sistema.model.bo.RecepcionBo;
import Sistema.model.bo.RemitenteBo;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class frmBuscarRecepcionDerivacion extends javax.swing.JDialog {

    public frmBuscarRecepcionDerivacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    frmBuscarRecepcionDerivacion(frmGeneral aThis, boolean b) {
        super(aThis, b);
        initComponents();
        this.setLocationRelativeTo(null);
        derivacion = (frmGeneral) aThis;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblder = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        btnBuscarRecepcion = new javax.swing.JButton();
        txtRecepcion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDocumentoRecepcion = new javax.swing.JTable();
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

        setMinimumSize(new java.awt.Dimension(950, 500));
        setSize(new java.awt.Dimension(2147483647, 2147483647));
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Recepciones");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 0, 500, 22);

        lblder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblder.setText("Recepción");
        getContentPane().add(lblder);
        lblder.setBounds(10, 40, 60, 20);

        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir);
        btnsalir.setBounds(570, 40, 80, 25);

        btnBuscarRecepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/buscar.gif"))); // NOI18N
        btnBuscarRecepcion.setText("Buscar");
        btnBuscarRecepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRecepcionActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarRecepcion);
        btnBuscarRecepcion.setBounds(450, 40, 90, 25);

        txtRecepcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRecepcionKeyPressed(evt);
            }
        });
        getContentPane().add(txtRecepcion);
        txtRecepcion.setBounds(80, 40, 360, 20);

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
        });
        jScrollPane1.setViewportView(tblDocumentoRecepcion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 890, 340);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(40, 30, 760, 10);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDocumentoRecepcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDocumentoRecepcionMouseClicked
        if (evt.getClickCount() >= 2) {
            int index = tblDocumentoRecepcion.getSelectedRow();
            derivacion.getlblIdRecepcion().setText(tblDocumentoRecepcion.getValueAt(index, 0).toString());
            derivacion.gettxtDocumentoDerivacion().setText(tblDocumentoRecepcion.getValueAt(index, 2).toString());
            String lsRemitente = cargarRemitente(Integer.parseInt(tblDocumentoRecepcion.getValueAt(index, 4).toString()));
            derivacion.gettxtRemitenteDerivacion().setText(lsRemitente);
            derivacion.getBtnModificarDerivacion().setEnabled(true);
            derivacion.getBtnEliminarDerivacion().setEnabled(true);
            derivacion.getBtnNuevoDerivacion().setEnabled(false);
            derivacion.getBtnGrabarDerivacion().setEnabled(false);
            derivacion.habilitarBotonesFormularioDerivacion();
            this.dispose();
        }
    }//GEN-LAST:event_tblDocumentoRecepcionMouseClicked
    public String cargarRemitente(int idRemitente) {
        String lsDocumento = "";
        try {
            lsDocumento = RemitenteBo.obtenerNombreRemitente(idRemitente);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lsDocumento;
    }
    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnBuscarRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRecepcionActionPerformed
//        opt = 'B';
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

    private void txtRecepcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRecepcionKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            btnBuscarRecepcion.doClick();
        }
    }//GEN-LAST:event_txtRecepcionKeyPressed
//    private void cargarDatosBuscarNombre(String recepcion) {
//        try {
//            TableColumn columna;
//            DefaultTableModel DerivacionTableModel = DerivacionBo.obtenerListaRecepcionBuscar(recepcion);
//            tblDocumentoDerivacion.setModel(RecepcionTableModel);
//            columna = tblDocumentoDerivacion.getColumnModel().getColumn(0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmBuscarRecepcionDerivacion dialog = new frmBuscarRecepcionDerivacion(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblder;
    private javax.swing.JTable tblDocumentoRecepcion;
    private javax.swing.JTextField txtRecepcion;
    // End of variables declaration//GEN-END:variables
    private frmGeneral derivacion;
    private DefaultTableModel docTableModel;
}
