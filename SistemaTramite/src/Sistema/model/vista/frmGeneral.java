package Sistema.model.vista;

import Sistema.model.bean.Cargo;
import Sistema.model.bean.Correlativos;
import Sistema.model.bean.Derivacion;
import Sistema.model.bean.Documento;
import Sistema.model.bean.DocumentoArchivo;
import Sistema.model.bean.DocumentoDestinatario;
import Sistema.model.bean.Recepcion;
import Sistema.model.bean.TipoDocumento;
import Sistema.model.bo.CargoBo;
import Sistema.model.bo.CorrelativosBo;
import Sistema.model.bo.DerivacionBo;
import Sistema.model.bo.DocumentoArchivoBo;
import Sistema.model.bo.TipoDocumentoBo;
import Sistema.model.bo.DocumentoBo;
import Sistema.model.bo.DocumentoDestinatarioBo;
import Sistema.model.bo.DocumentoEstadoBo;
import Sistema.model.bo.RecepcionBo;
import Sistema.model.dao.CorrelativosDaoImp;
import static Sistema.model.vista.frmLogin.gsUsuario;
import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import static java.awt.PageAttributes.MediaType.D;
import java.awt.event.ItemEvent;
import java.io.*;
import java.sql.Connection;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class frmGeneral extends javax.swing.JFrame {
    private Statement st;
    private Connection con;
    private int codigo;
    private char opt;
    /**
     * Variables de Recepcion
     */
    private Recepcion oRecepcion;
    private int idRecepcion;
    private String codigoRecepcion;
    private String DocumentoRecepcion;
    private String InstitucionRecepcion;
    private int IdRemitenteRecepcion;
    private String AsuntoRecepcion;
    private String ReferenciaRecepcion;
    private String destinatarioRecepcion;
    private String obsRecepcion;
    private String FechaRecepcion;
    private String HoraRecepcion;

    /**
     * Variables de Cargo
     */
    private Cargo oCargo;
    private int idCargo;
    private int idDocumentoCargo;
    private String FechaCargo;
    private String HoraCargo;
    private String AreaCargo;
    private String Recepcionista;
    private String numeroCargo;
    private int estadoCArgo;
    private String fechaEstadoCargo;
    private String usuarioEstadoCargo;
    private String Obs;
    private String usuarioRegistra;
    private String fechaRegistro;
    private char opt1;
    /**
     * Variables de Documento
     */
    private Documento oDocumento;
    private Correlativos oCorrelativos;
    private DocumentoDestinatario oDocumentoDestinatario;
    private DocumentoArchivo oDocumentoArchivo;
    private int idDocumento;
    private int idtipoDocumento;
    private String numeroDocumento;
    private String Destinatario;
    private String fechaDocumento;
    private String anio;
    private String Documento;
    private int folios;
    private String asunto;
    private String areaDocumento;
    private String InstitucionDocumento;
    private String Archivo;
    private int estadoDocumento;
    private String secuenciaNroDoc;
    private char opt2;
    private TipoDocumentoBo oTipoDocumento;
    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos pdf, docx, xlsx", "pdf", "docx", "xlsx");
    /**
     * Variables de Derivacion
     */
    private Derivacion oDerivacion;
    private int idDerivacion;
    private String codigoDerivacion;
    private String Derivacion;
    private String FechaDerivacion;
    private int idDocumentoDerivacion;
    private String Remitentederivacion;
    private String MotivoDerivacion;
    private String ObservacionDerivacion;
    private int PrioridadDerivacion;
    private int Prioridad;
    private String Observacion;
    private char opt3;

    public frmGeneral(java.awt.Frame parent, boolean modal) {
        initComponents();
        this.setTitle("Trámite Documentario: Registro de Documentos, Cargo, Recepción, Derivacion");
        try {
            JFormattedTextField txtfechaCargo = new JFormattedTextField(new FormatoFecha());
            txtfechaCargo.setValue(new Date());
            txtFechaCargo.setEnabled(false);
        } catch (Exception e) {
        }
        this.setLocationRelativeTo(null);
        
        modeloListaDestinatario = new DefaultListModel();
        lsDestinatario.setModel(modeloListaDestinatario);

        modeloListaArchivo = new DefaultListModel();
        lsArchivos.setModel(modeloListaArchivo);
        camposDeshabilitado();
        llenarCombos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tabPane = new javax.swing.JTabbedPane();
        tbDocumento = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtIdDocumento = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cboTipoDocumento = new javax.swing.JComboBox();
        txtInstitucion = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lblcod2 = new javax.swing.JLabel();
        txtAsunto = new javax.swing.JTextField();
        txtAreaDocumento = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        btnNuevoDocumento = new javax.swing.JButton();
        btnGrabarDocumento = new javax.swing.JButton();
        btnCancelarDocumento = new javax.swing.JButton();
        cboEstadoDocumento = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        lblNumeroDocumento = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        btnModificarDocumento = new javax.swing.JButton();
        btnEliminarDocumento = new javax.swing.JButton();
        txtDestinatario = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        lsDestinatario = new javax.swing.JList<>();
        txtFechaDocumento = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnBuscarDocumento = new javax.swing.JButton();
        btnQuitaDestinatario = new javax.swing.JButton();
        btnAregarDestinatario = new javax.swing.JButton();
        txtRutaDestino = new javax.swing.JTextField();
        btnAgregarArchivo = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        lsArchivos = new javax.swing.JList<>();
        btnQuitarArchivo = new javax.swing.JButton();
        spFolios = new javax.swing.JSpinner();
        btnSalirDocumento = new javax.swing.JButton();
        tbCargo = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lbcod = new javax.swing.JLabel();
        txtObservacionCargo = new javax.swing.JTextField();
        lblcodigoCargo = new javax.swing.JLabel();
        txtCodigoCargo = new javax.swing.JTextField();
        txtDocumentoCargo = new javax.swing.JTextField();
        txtAreaCargo = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtHoraCargo = new javax.swing.JTextField();
        txtAsuntoCargo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtInstitucionCargo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnNuevoCargo = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnGrabarCargo = new javax.swing.JButton();
        btnBuscarCargo = new javax.swing.JButton();
        txtNroDocumentoCargo = new javax.swing.JTextField();
        btnModificarCargo = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        txtFechaCargo = new com.toedter.calendar.JDateChooser();
        btnEliminarCargo = new javax.swing.JButton();
        btnBuscarDocumentoCargo = new javax.swing.JButton();
        lblIdDocumentoCargo = new javax.swing.JLabel();
        lbcod1 = new javax.swing.JLabel();
        txtRecepcionistaCargo = new javax.swing.JTextField();
        btnSalir1 = new javax.swing.JButton();
        tbRecepcion = new javax.swing.JPanel();
        lblRec = new javax.swing.JLabel();
        txtIdRecepcion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtRemitenteRecepcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDestinatarioRecepcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHoraRecepcion = new javax.swing.JTextField();
        txtCodRemRecepcion = new javax.swing.JTextField();
        btnNuevoRecepcion = new javax.swing.JButton();
        btngrabarRecepcion = new javax.swing.JButton();
        btnModificarRecepcion = new javax.swing.JButton();
        btncancelarRecepcion = new javax.swing.JButton();
        btneliminarRecepcion = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtfechaRecepcion = new javax.swing.JTextField();
        btnBuscarR = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        btnBuscarRecepcion = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        txtDocumentoRecepcion = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtInstitucionRecepcion = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtAsuntoRecepcion = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtReferenciaRecepcion = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaObsRecepcion = new javax.swing.JTextArea();
        txtCodigoRecepcion = new javax.swing.JTextField();
        tbDerivacion = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtRemitenteDerivacion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        lblCodDerivacion = new javax.swing.JLabel();
        txtCodigoDerivacion = new javax.swing.JTextField();
        txtMotivoDerivacion = new javax.swing.JTextField();
        btnNuevaDerivacion = new javax.swing.JButton();
        btnGrabarDerivacion = new javax.swing.JButton();
        btnModificarDerivacion = new javax.swing.JButton();
        btnCancelarDerivacion = new javax.swing.JButton();
        btnSalirDerivacion = new javax.swing.JButton();
        btnEliminarDerivacion = new javax.swing.JButton();
        txtFechaDerivacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnBuscarDocDerivacion = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cboPrioridadDerivacion = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        btnBuscarDerivacion = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaObsDerivacion = new javax.swing.JTextArea();
        txtIdDerivacion = new javax.swing.JTextField();
        lblDocu = new javax.swing.JLabel();
        lblIdRecepcion = new javax.swing.JLabel();
        txtDocumentoDerivacion = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(815, 575));

        tabPane.setToolTipText("");
        tabPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabPane.setMinimumSize(new java.awt.Dimension(810, 550));

        tbDocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbDocumento.setMinimumSize(new java.awt.Dimension(800, 500));
        tbDocumento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Documento");
        tbDocumento.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 180, 25));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Asunto");
        tbDocumento.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 90, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Documento");
        tbDocumento.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 19));
        tbDocumento.add(txtIdDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 70, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("Nº Documento:");
        tbDocumento.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 90, 19));

        txtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDocumentoKeyPressed(evt);
            }
        });
        tbDocumento.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 470, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Destinatario(s)");
        tbDocumento.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 170, 90, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Tipo de Dcmto");
        tbDocumento.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 90, 20));

        cboTipoDocumento.setToolTipText("Seleccione Tipo Documento");
        cboTipoDocumento.setEnabled(false);
        cboTipoDocumento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTipoDocumentoItemStateChanged(evt);
            }
        });
        cboTipoDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboTipoDocumentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cboTipoDocumentoMouseEntered(evt);
            }
        });
        cboTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoDocumentoActionPerformed(evt);
            }
        });
        cboTipoDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboTipoDocumentoKeyPressed(evt);
            }
        });
        tbDocumento.add(cboTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 210, 30));

        txtInstitucion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInstitucionKeyPressed(evt);
            }
        });
        tbDocumento.add(txtInstitucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 680, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Area");
        tbDocumento.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 80, 20));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Institucion");
        tbDocumento.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 80, 20));

        lblcod2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblcod2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblcod2.setText("Código");
        tbDocumento.add(lblcod2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 80, 20));

        txtAsunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAsuntoKeyPressed(evt);
            }
        });
        tbDocumento.add(txtAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 680, 20));

        txtAreaDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAreaDocumentoKeyPressed(evt);
            }
        });
        tbDocumento.add(txtAreaDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 680, 20));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Ruta Destino");
        tbDocumento.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 90, 20));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setText("Fecha");
        tbDocumento.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, 20));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Estado");
        tbDocumento.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 80, 20));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Año");
        tbDocumento.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 20));

        btnNuevoDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/btnNuevo.jpg"))); // NOI18N
        btnNuevoDocumento.setToolTipText("Nuevo");
        btnNuevoDocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoDocumentoActionPerformed(evt);
            }
        });
        tbDocumento.add(btnNuevoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        btnGrabarDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/btnGrabar.jpg"))); // NOI18N
        btnGrabarDocumento.setToolTipText("Guardar");
        btnGrabarDocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGrabarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarDocumentoActionPerformed(evt);
            }
        });
        tbDocumento.add(btnGrabarDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 40, 40));

        btnCancelarDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/cancelar2.png"))); // NOI18N
        btnCancelarDocumento.setToolTipText("Deshacer");
        btnCancelarDocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDocumentoActionPerformed(evt);
            }
        });
        tbDocumento.add(btnCancelarDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 40, 40));

        cboEstadoDocumento.setEnabled(false);
        cboEstadoDocumento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboEstadoDocumentoItemStateChanged(evt);
            }
        });
        cboEstadoDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboEstadoDocumentoMouseClicked(evt);
            }
        });
        cboEstadoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoDocumentoActionPerformed(evt);
            }
        });
        cboEstadoDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboEstadoDocumentoKeyPressed(evt);
            }
        });
        tbDocumento.add(cboEstadoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 210, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Nro de Folios:");
        tbDocumento.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 90, 20));

        lblNumeroDocumento.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblNumeroDocumento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroDocumento.setText("0000000");
        tbDocumento.add(lblNumeroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 80, -1));

        txtAnio.setEditable(false);
        tbDocumento.add(txtAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 50, 20));

        btnModificarDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/modifica.png"))); // NOI18N
        btnModificarDocumento.setToolTipText("Actualizar");
        btnModificarDocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDocumentoActionPerformed(evt);
            }
        });
        tbDocumento.add(btnModificarDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 40, 40));

        btnEliminarDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/eliminar1.png"))); // NOI18N
        btnEliminarDocumento.setToolTipText("Eliminar");
        btnEliminarDocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDocumentoActionPerformed(evt);
            }
        });
        tbDocumento.add(btnEliminarDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 40, 40));

        txtDestinatario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDestinatarioKeyPressed(evt);
            }
        });
        tbDocumento.add(txtDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 470, 20));

        lsDestinatario.setToolTipText("");
        jScrollPane4.setViewportView(lsDestinatario);

        tbDocumento.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 470, 80));

        txtFechaDocumento.setEditable(false);
        tbDocumento.add(txtFechaDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 100, 20));
        tbDocumento.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 810, 10));

        btnBuscarDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/btnBuscar.jpg"))); // NOI18N
        btnBuscarDocumento.setToolTipText("Buscar");
        btnBuscarDocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDocumentoActionPerformed(evt);
            }
        });
        tbDocumento.add(btnBuscarDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 40, 40));

        btnQuitaDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/eliminar.gif"))); // NOI18N
        btnQuitaDestinatario.setText("Quitar");
        btnQuitaDestinatario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuitaDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitaDestinatarioActionPerformed(evt);
            }
        });
        tbDocumento.add(btnQuitaDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 100, -1));

        btnAregarDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/agregar.gif"))); // NOI18N
        btnAregarDestinatario.setText("Agregar");
        btnAregarDestinatario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAregarDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAregarDestinatarioActionPerformed(evt);
            }
        });
        tbDocumento.add(btnAregarDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 100, -1));

        txtRutaDestino.setText("src\\\\Sistema\\\\model\\\\archivos\\\\");
            txtRutaDestino.setEnabled(false);
            tbDocumento.add(txtRutaDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 440, 20));

            btnAgregarArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/agregar.gif"))); // NOI18N
            btnAgregarArchivo.setText("Adjuntar Archivo");
            btnAgregarArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnAgregarArchivo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnAgregarArchivoActionPerformed(evt);
                }
            });
            tbDocumento.add(btnAgregarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 140, -1));

            jScrollPane6.setViewportView(lsArchivos);

            tbDocumento.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 680, 70));

            btnQuitarArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/eliminar.gif"))); // NOI18N
            btnQuitarArchivo.setText("Quitar");
            btnQuitarArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnQuitarArchivo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnQuitarArchivoActionPerformed(evt);
                }
            });
            tbDocumento.add(btnQuitarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 90, -1));

            spFolios.setToolTipText("");
            spFolios.setValue(1);
            spFolios.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    spFoliosKeyPressed(evt);
                }
            });
            tbDocumento.add(spFolios, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 50, -1));

            btnSalirDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/btnSalir.png"))); // NOI18N
            btnSalirDocumento.setToolTipText("Salir");
            btnSalirDocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnSalirDocumento.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSalirDocumentoActionPerformed(evt);
                }
            });
            tbDocumento.add(btnSalirDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 40, 40));

            tabPane.addTab("Documento", tbDocumento);

            tbCargo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            tbCargo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel16.setText("Cargo");
            tbCargo.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 180, 25));

            jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel17.setText("Documento");
            tbCargo.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 110, 20));

            jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel19.setText("Área");
            tbCargo.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 110, 20));

            lbcod.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            lbcod.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            lbcod.setText("Observacion");
            tbCargo.add(lbcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 110, 20));
            tbCargo.add(txtObservacionCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 550, 20));

            lblcodigoCargo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            lblcodigoCargo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            lblcodigoCargo.setText(" Cargo Numero");
            tbCargo.add(lblcodigoCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 110, 20));
            tbCargo.add(txtCodigoCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 100, 20));
            tbCargo.add(txtDocumentoCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 390, 20));

            txtAreaCargo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                public void mouseDragged(java.awt.event.MouseEvent evt) {
                    txtAreaCargoMouseDragged(evt);
                }
                public void mouseMoved(java.awt.event.MouseEvent evt) {
                    txtAreaCargoMouseMoved(evt);
                }
            });
            tbCargo.add(txtAreaCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 550, -1));

            jLabel44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel44.setText("Fecha");
            tbCargo.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 40, 20));

            jLabel45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel45.setText("Hora");
            jLabel45.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
            tbCargo.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 30, 20));

            txtHoraCargo.setDoubleBuffered(true);
            txtHoraCargo.setDragEnabled(true);
            tbCargo.add(txtHoraCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 110, 20));

            txtAsuntoCargo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtAsuntoCargoActionPerformed(evt);
                }
            });
            tbCargo.add(txtAsuntoCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 550, 20));

            jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel21.setText("Asunto");
            tbCargo.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, 20));

            jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel25.setText("Institucion");
            tbCargo.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 110, 20));
            tbCargo.add(txtInstitucionCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 550, 20));
            tbCargo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 790, 0));

            btnNuevoCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/btnNuevo.jpg"))); // NOI18N
            btnNuevoCargo.setToolTipText("Nuevo Cargo");
            btnNuevoCargo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnNuevoCargo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnNuevoCargoActionPerformed(evt);
                }
            });
            tbCargo.add(btnNuevoCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));
            tbCargo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 810, 10));

            btnGrabarCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/btnGrabar.jpg"))); // NOI18N
            btnGrabarCargo.setToolTipText("Grabar Cargo");
            btnGrabarCargo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnGrabarCargo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnGrabarCargoActionPerformed(evt);
                }
            });
            tbCargo.add(btnGrabarCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 40, 40));

            btnBuscarCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/btnBuscar.jpg"))); // NOI18N
            btnBuscarCargo.setToolTipText("Buscar Cargo");
            btnBuscarCargo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnBuscarCargo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnBuscarCargoActionPerformed(evt);
                }
            });
            tbCargo.add(btnBuscarCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 40, 40));

            txtNroDocumentoCargo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtNroDocumentoCargoActionPerformed(evt);
                }
            });
            tbCargo.add(txtNroDocumentoCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 60, 20));

            btnModificarCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/modifica.png"))); // NOI18N
            btnModificarCargo.setToolTipText("Actualizar");
            btnModificarCargo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnModificarCargo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnModificarCargoActionPerformed(evt);
                }
            });
            tbCargo.add(btnModificarCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 40, 40));

            btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/cancelar2.png"))); // NOI18N
            btnCancelar1.setToolTipText("Deshacer");
            btnCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnCancelar1ActionPerformed(evt);
                }
            });
            tbCargo.add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 40, 40));
            tbCargo.add(txtFechaCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 120, 20));

            btnEliminarCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/eliminar1.png"))); // NOI18N
            btnEliminarCargo.setToolTipText("Eliminar");
            btnEliminarCargo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnEliminarCargo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnEliminarCargoActionPerformed(evt);
                }
            });
            tbCargo.add(btnEliminarCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 40, 40));

            btnBuscarDocumentoCargo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            btnBuscarDocumentoCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/buscar.gif"))); // NOI18N
            btnBuscarDocumentoCargo.setText("Buscar");
            btnBuscarDocumentoCargo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnBuscarDocumentoCargoActionPerformed(evt);
                }
            });
            tbCargo.add(btnBuscarDocumentoCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 90, -1));
            tbCargo.add(lblIdDocumentoCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 80, 20));

            lbcod1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            lbcod1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            lbcod1.setText("Recepcionista");
            tbCargo.add(lbcod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 110, 20));
            tbCargo.add(txtRecepcionistaCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 550, 20));

            btnSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/btnSalir.png"))); // NOI18N
            btnSalir1.setToolTipText("Salir");
            btnSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnSalir1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSalir1ActionPerformed(evt);
                }
            });
            tbCargo.add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 40, 40));

            tabPane.addTab("Cargo", tbCargo);

            tbRecepcion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            tbRecepcion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
            tbRecepcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            lblRec.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            lblRec.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            lblRec.setText("Còdigo Recepcion");
            tbRecepcion.add(lblRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 110, 20));
            tbRecepcion.add(txtIdRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 100, -1));

            jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel1.setText("Remitente");
            tbRecepcion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 120, 20));

            txtRemitenteRecepcion.setEnabled(false);
            txtRemitenteRecepcion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtRemitenteRecepcionActionPerformed(evt);
                }
            });
            tbRecepcion.add(txtRemitenteRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 380, -1));

            jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel2.setText("Institución");
            tbRecepcion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, 20));
            tbRecepcion.add(txtDestinatarioRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 460, 20));

            jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel6.setText("Fecha");
            tbRecepcion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 40, 20));

            txtHoraRecepcion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtHoraRecepcionActionPerformed(evt);
                }
            });
            tbRecepcion.add(txtHoraRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 110, -1));
            tbRecepcion.add(txtCodRemRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 69, -1));

            btnNuevoRecepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/btnNuevo.jpg"))); // NOI18N
            btnNuevoRecepcion.setToolTipText("Nuevo");
            btnNuevoRecepcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnNuevoRecepcion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnNuevoRecepcionActionPerformed(evt);
                }
            });
            tbRecepcion.add(btnNuevoRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

            btngrabarRecepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/btnGrabar.jpg"))); // NOI18N
            btngrabarRecepcion.setToolTipText("Guardar");
            btngrabarRecepcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btngrabarRecepcion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btngrabarRecepcionActionPerformed(evt);
                }
            });
            tbRecepcion.add(btngrabarRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 40, 40));

            btnModificarRecepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/modifica.png"))); // NOI18N
            btnModificarRecepcion.setToolTipText("Actualizar");
            btnModificarRecepcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnModificarRecepcion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnModificarRecepcionActionPerformed(evt);
                }
            });
            tbRecepcion.add(btnModificarRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 40, 40));

            btncancelarRecepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/cancelar2.png"))); // NOI18N
            btncancelarRecepcion.setToolTipText("Deshacer");
            btncancelarRecepcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btncancelarRecepcion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btncancelarRecepcionActionPerformed(evt);
                }
            });
            tbRecepcion.add(btncancelarRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 40, 40));

            btneliminarRecepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/eliminar1.png"))); // NOI18N
            btneliminarRecepcion.setToolTipText("Eliminar");
            btneliminarRecepcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btneliminarRecepcion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btneliminarRecepcionActionPerformed(evt);
                }
            });
            tbRecepcion.add(btneliminarRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 40, 40));

            btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/btnSalir.png"))); // NOI18N
            btnsalir.setToolTipText("Salir");
            btnsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnsalir.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnsalirActionPerformed(evt);
                }
            });
            tbRecepcion.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 40, 40));

            jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel7.setText("Recepción");
            tbRecepcion.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 180, 25));

            jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel4.setText("Hora");
            tbRecepcion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, 20));
            tbRecepcion.add(txtfechaRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 130, -1));

            btnBuscarR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            btnBuscarR.setText("Buscar");
            btnBuscarR.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnBuscarRActionPerformed(evt);
                }
            });
            tbRecepcion.add(btnBuscarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 70, -1));
            tbRecepcion.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 810, 10));

            btnBuscarRecepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/btnBuscar.jpg"))); // NOI18N
            btnBuscarRecepcion.setToolTipText("Buscar ");
            btnBuscarRecepcion.setContentAreaFilled(false);
            btnBuscarRecepcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnBuscarRecepcion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnBuscarRecepcionActionPerformed(evt);
                }
            });
            tbRecepcion.add(btnBuscarRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 40, 40));

            jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel29.setText("Nro de Documento");
            tbRecepcion.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, 20));
            tbRecepcion.add(txtDocumentoRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 460, -1));

            jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel31.setText("Obs");
            tbRecepcion.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 100, 20));
            tbRecepcion.add(txtInstitucionRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 460, 20));

            jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel33.setText("Asunto");
            tbRecepcion.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 100, 20));
            tbRecepcion.add(txtAsuntoRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 460, 20));

            jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel34.setText("Referencia");
            tbRecepcion.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 100, 20));
            tbRecepcion.add(txtReferenciaRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 460, 20));

            jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel32.setText("Destinatario");
            tbRecepcion.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 100, 20));

            txaObsRecepcion.setColumns(20);
            txaObsRecepcion.setRows(5);
            jScrollPane1.setViewportView(txaObsRecepcion);

            tbRecepcion.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 460, -1));
            tbRecepcion.add(txtCodigoRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 100, -1));

            tabPane.addTab("Recepción", tbRecepcion);

            tbDerivacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            tbDerivacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel9.setText("Fecha entrega");
            tbDerivacion.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 100, 20));

            jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel12.setText("Remitente");
            tbDerivacion.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 80, 20));
            tbDerivacion.add(txtRemitenteDerivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 500, 20));

            jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel14.setText("Motivo Derivacion");
            tbDerivacion.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, 20));

            lblCodDerivacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            lblCodDerivacion.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
            lblCodDerivacion.setText("Codigo Derivacion");
            tbDerivacion.add(lblCodDerivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 20));
            tbDerivacion.add(txtCodigoDerivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 90, 20));
            tbDerivacion.add(txtMotivoDerivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 500, 20));

            btnNuevaDerivacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/btnNuevo.jpg"))); // NOI18N
            btnNuevaDerivacion.setToolTipText("Nuevo");
            btnNuevaDerivacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnNuevaDerivacion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnNuevaDerivacionActionPerformed(evt);
                }
            });
            tbDerivacion.add(btnNuevaDerivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

            btnGrabarDerivacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/btnGrabar.jpg"))); // NOI18N
            btnGrabarDerivacion.setToolTipText("Guardar");
            btnGrabarDerivacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnGrabarDerivacion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnGrabarDerivacionActionPerformed(evt);
                }
            });
            tbDerivacion.add(btnGrabarDerivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 40, 40));

            btnModificarDerivacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/modifica.png"))); // NOI18N
            btnModificarDerivacion.setToolTipText("Actualizar");
            btnModificarDerivacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnModificarDerivacion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnModificarDerivacionActionPerformed(evt);
                }
            });
            tbDerivacion.add(btnModificarDerivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 40, 40));

            btnCancelarDerivacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/cancelar2.png"))); // NOI18N
            btnCancelarDerivacion.setToolTipText("Deshacer");
            btnCancelarDerivacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnCancelarDerivacion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnCancelarDerivacionActionPerformed(evt);
                }
            });
            tbDerivacion.add(btnCancelarDerivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 40, 40));

            btnSalirDerivacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/btnSalir.png"))); // NOI18N
            btnSalirDerivacion.setToolTipText("Salir");
            btnSalirDerivacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnSalirDerivacion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSalirDerivacionActionPerformed(evt);
                }
            });
            tbDerivacion.add(btnSalirDerivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 40, 40));

            btnEliminarDerivacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/eliminar1.png"))); // NOI18N
            btnEliminarDerivacion.setToolTipText("Eliminar");
            btnEliminarDerivacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnEliminarDerivacion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnEliminarDerivacionActionPerformed(evt);
                }
            });
            tbDerivacion.add(btnEliminarDerivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 40, 40));
            tbDerivacion.add(txtFechaDerivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 90, -1));

            jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel10.setText("Observacion");
            tbDerivacion.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, 20));

            btnBuscarDocDerivacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            btnBuscarDocDerivacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/buscar.gif"))); // NOI18N
            btnBuscarDocDerivacion.setText("Buscar");
            btnBuscarDocDerivacion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnBuscarDocDerivacionActionPerformed(evt);
                }
            });
            tbDerivacion.add(btnBuscarDocDerivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 90, -1));

            jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel11.setText("Priroridad");
            tbDerivacion.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 70, -1));

            cboPrioridadDerivacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alto", "Bajo", "Regular" }));
            tbDerivacion.add(cboPrioridadDerivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 90, -1));
            tbDerivacion.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 810, 10));

            jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel13.setText("Derivación");
            tbDerivacion.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 180, 25));

            btnBuscarDerivacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/btnBuscar.jpg"))); // NOI18N
            btnBuscarDerivacion.setToolTipText("Buscar ");
            btnBuscarDerivacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnBuscarDerivacion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnBuscarDerivacionActionPerformed(evt);
                }
            });
            tbDerivacion.add(btnBuscarDerivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 40, 40));

            txaObsDerivacion.setColumns(20);
            txaObsDerivacion.setRows(5);
            jScrollPane2.setViewportView(txaObsDerivacion);

            tbDerivacion.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 500, 70));
            tbDerivacion.add(txtIdDerivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 90, -1));

            lblDocu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            lblDocu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            lblDocu.setText("Recepción");
            tbDerivacion.add(lblDocu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 60, 20));

            lblIdRecepcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            tbDerivacion.add(lblIdRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 80, 20));
            tbDerivacion.add(txtDocumentoDerivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 410, 20));

            tabPane.addTab("Derivación", tbDerivacion);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 2, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDocumentoActionPerformed
        if (codigo != 0) {
            opt2 = 'E';
            lblcod2.setVisible(true);
            txtIdDocumento.setVisible(true);
            txtIdDocumento.setText("" + codigo);
            txtDocumento.setText(Documento);
            cboTipoDocumento.getSelectedItem().toString();
            this.lblNumeroDocumento.setText(String.valueOf(numeroDocumento));
            this.txtAnio.setText(anio);
//            jDateFechaDoc.setDate(fecha2);
            lsDestinatario.clearSelection();
            txtAsunto.setText(asunto);
            txtInstitucion.setText(InstitucionDocumento);
            txtAreaDocumento.setText(areaDocumento);
            spFolios.setValue(folios);
            cboEstadoDocumento.getSelectedItem().toString();
            try {
                idDocumento = Integer.parseInt(txtIdDocumento.getText());
                if (opt2 == 'E') {
                    oDocumento = new Documento();
                    oDocumento.setIdDocumento(idDocumentoCargo);
                    int rpta = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar?",
                            "DOCUMENTO", JOptionPane.YES_NO_OPTION);
                    if (rpta == 0) {
                        if (DocumentoBo.eliminarDocumento(oDocumento)) {
                            JOptionPane.showMessageDialog(this, "Se Eliminó Correctamente", "DOCUMENTO",
                                    JOptionPane.INFORMATION_MESSAGE);
                            cargarDatos();
                        } else {
                            JOptionPane.showMessageDialog(this, "No se pudo Eliminar", "DOCUMENTO",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "DOCUMENTO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione el Documento", "DOCUMENTO", JOptionPane.ERROR_MESSAGE);
        }
        btnsHabilitarRecepcion();
        //btnsConfirmarDeshabilitar();
    }//GEN-LAST:event_btnEliminarDocumentoActionPerformed

    private void btnModificarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDocumentoActionPerformed
        if (codigo != 0) {
            opt2 = 'M';
            camposHabilitado();
            txtDocumento.setText("");
            cboTipoDocumento.getSelectedItem().toString();
            cboEstadoDocumento.getSelectedItem().toString();
            this.lblNumeroDocumento.setText("");
            this.txtAnio.setText("");
            txtFechaCargo.setDate(null);
            lsDestinatario.clearSelection();
            txtAsunto.setText("");
            txtInstitucion.setText("");
            txtAreaDocumento.setText("");
            spFolios.setValue(1);
            cboEstadoDocumento.getSelectedItem();
            lblcod2.setVisible(true);
            txtIdDocumento.setVisible(true);
            txtIdDocumento.setText("" + codigo);
            txtDocumento.setText(Documento);
            cboTipoDocumento.getSelectedItem().toString();
            cboEstadoDocumento.getSelectedItem().toString();
            this.lblNumeroDocumento.setText(String.valueOf(numeroDocumento));
            this.txtAnio.setText(anio);
            lsDestinatario.clearSelection();
            txtAsunto.setText(asunto);
            txtInstitucion.setText(InstitucionDocumento);
            txtAreaDocumento.setText(areaDocumento);
            spFolios.setValue(String.valueOf(folios));
            cboEstadoDocumento.getSelectedItem();
            btnsHabilitarDocumento();
            btnsDeshabilitarDocumento();
        }
    }//GEN-LAST:event_btnModificarDocumentoActionPerformed

    private void btnSalirDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirDocumentoActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirDocumentoActionPerformed

    private void btnCancelarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDocumentoActionPerformed
        limpiarCamposDocumentos();
        deshabilitarCamposDocumento();
        btnNuevoDocumento.setEnabled(true);
        btnBuscarDocumento.setEnabled(true);
    }//GEN-LAST:event_btnCancelarDocumentoActionPerformed

    private void btnGrabarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarDocumentoActionPerformed
        idDocumento = 0;
        idtipoDocumento = ((TipoDocumento) cboTipoDocumento.getSelectedItem()).getIdTipoDocumento();
        estadoDocumento = cboEstadoDocumento.getSelectedIndex();
        numeroDocumento = lblNumeroDocumento.getText();
        grabarDocDestinatatio(idtipoDocumento, numeroDocumento);
        grabarDocArchivo(idtipoDocumento, numeroDocumento);
        fechaDocumento = txtFechaDocumento.getText();
        anio = txtAnio.getText();
        Documento = txtDocumento.getText();
        folios = (Integer) spFolios.getValue();
        asunto = txtAsunto.getText();
        areaDocumento = txtAreaDocumento.getText();
        InstitucionDocumento = txtInstitucion.getText();
        estadoDocumento = cboEstadoDocumento.getSelectedIndex();
        oDocumento = new Documento();
        switch (opt2) {
            case 'N':
                oDocumento.setIdtipoDocumento(idtipoDocumento);
                oDocumento.setNumeroDocumento(numeroDocumento);
                oDocumento.setFecha(fechaDocumento);
                oDocumento.setAnio(anio);
                oDocumento.setDocumento(Documento);
                oDocumento.setFolios(folios);
                oDocumento.setAsunto(asunto);
                oDocumento.setArea(areaDocumento);
                oDocumento.setInstitucion(InstitucionDocumento);
                oDocumento.setEstado(estadoDocumento);
                try {
                    if (DocumentoBo.grabarDocumento(oDocumento)) {
                        JOptionPane.showMessageDialog(this, "Se Registró Correctamente", "MENSAJE --> DOCUMENTO", JOptionPane.INFORMATION_MESSAGE);
                        limpiarCamposDocumentos();
//                        cargarDatos();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo Registrar", "MENSAJE --> DOCUMENTO", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE --> DOCUMENTO", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case 'M':
                codigo = Integer.parseInt(txtIdRecepcion.getText());
                oDocumento.setIdDocumento(idDocumento);
                oDocumento.setIdtipoDocumento(idtipoDocumento);
                oDocumento.setNumeroDocumento(numeroDocumento);
                oDocumento.setFecha(fechaDocumento);
                oDocumento.setAnio(anio);
                oDocumento.setDocumento(Documento);
                oDocumento.setFolios(folios);
                oDocumento.setAsunto(asunto);
                oDocumento.setArea(areaDocumento);
                oDocumento.setInstitucion(InstitucionDocumento);
                oDocumento.setEstado(estadoDocumento);

                try {
                    if (DocumentoBo.modificarDocumento(oDocumento)) {
                        JOptionPane.showMessageDialog(this, "Se Modificó Correctamente", "DOCUMENTO", JOptionPane.INFORMATION_MESSAGE);
                        cargarDatos();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo Modificar", "DOCUMENTO", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "DOCUMENTO", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }
    }//GEN-LAST:event_btnGrabarDocumentoActionPerformed

    private void btnNuevoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoDocumentoActionPerformed
        opt2 = 'N';
        txtDocumento.setEditable(true);
        // txtAnio.setEditable(true);
        lsDestinatario.setEnabled(true);
        lsDestinatario.clearSelection();
        txtAsunto.setEditable(true);
        txtInstitucion.setEditable(true);
        txtAreaDocumento.setEditable(true);
        spFolios.setEnabled(true);
        spFolios.setValue(1);
        limpiarCamposDocumentos();
        habilitarCamposDocumento();
        btnsDeshabilitarDocumento();
        btnsHabilitarDocumento();
        Calendar fecha = Calendar.getInstance();
        txtAnio.setText(String.valueOf(fecha.get(Calendar.YEAR)));
        Date fechaActual = new Date();
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        txtFechaDocumento.setText((formatoFecha.format(fechaActual)).toString());
//        int nroDoc = ((TipoDocumento) cboTipoDocumento.getSelectedItem()).getIdTipoDocumento();
//        cargarUltimoCorrelativo(nroDoc);
    }//GEN-LAST:event_btnNuevoDocumentoActionPerformed

    private void cboTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoDocumentoActionPerformed
    public boolean copyFile(String fromFile, String toFile) {
        File origin = new File(fromFile);
        File destination = new File(toFile);
        if (origin.exists()) {
            try {
                InputStream in = new FileInputStream(origin);
                OutputStream out = new FileOutputStream(destination);
                byte[] buf = new byte[1024];
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                in.close();
                out.close();
                return true;
            } catch (IOException ioe) {
                ioe.printStackTrace();
                return false;
            }
        } else {
            return false;
        }
    }
    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btneliminarRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarRecepcionActionPerformed
        codigo = Integer.parseInt(txtIdRecepcion.getText());
        if (codigo != 0) {
            opt = 'E';
            lblRec.setVisible(true);
            txtIdRecepcion.setVisible(true);
            try {
                opt = 'E';
                oRecepcion = new Recepcion();
                oRecepcion.setIdRecepcion(codigo);
                int rpta = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar?",
                        "RECEPCION", JOptionPane.YES_NO_OPTION);
                if (rpta == 0) {
                    if (RecepcionBo.eliminarRecepcion(oRecepcion)) {
                        JOptionPane.showMessageDialog(this, "Se Eliminó Correctamente", "RECEPCION",
                                JOptionPane.INFORMATION_MESSAGE);
                        limpiarCamposRecepcion();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo Eliminar", "RECEPCION",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "RECEPCION", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione Recepcion", "RECEPCION", JOptionPane.ERROR_MESSAGE);
        }
        btnsHabilitarRecepcion();
        //btnsConfirmarDeshabilitar();
    }//GEN-LAST:event_btneliminarRecepcionActionPerformed

    private void btncancelarRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarRecepcionActionPerformed
        if (opt == 'M') {
            lblRec.setVisible(false);
            txtIdRecepcion.setVisible(false);
        }
        limpiarCamposRecepcion();
        deshabilitarCamposRecepcion();
        btnsHabilitarRecepcion();
        //btnsConfirmarDeshabilitar();  
    }//GEN-LAST:event_btncancelarRecepcionActionPerformed

    private void btnModificarRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarRecepcionActionPerformed
        if (codigo != 0) {
            opt = 'M';
            camposHabilitado();
            txtIdRecepcion.setText("");
            txtDocumentoRecepcion.setText("");
            txtInstitucionRecepcion.setText("");
            txtAsuntoRecepcion.setText("");
            txtReferenciaRecepcion.setText("");
            txtDestinatarioRecepcion.setText("");
            txaObsRecepcion.setText("");
            txtfechaRecepcion.setText("");
            txtHoraRecepcion.setText("");
            lblRec.setVisible(true);
            txtIdRecepcion.setVisible(true);
            txtIdRecepcion.setText("" + codigo);
            txtRemitenteRecepcion.requestFocus();
//            txtRemitenteRecepcion.setText(RemitenteRecepcion);
            txtDestinatarioRecepcion.setText(InstitucionRecepcion);
            txtfechaRecepcion.setText(FechaRecepcion);
            txtHoraRecepcion.setText(HoraRecepcion);
            btnsHabilitarRecepcion_Nuevo();
            btnsDeshabilitarCargo();
            //            JOptionPane.showMessageDialog(this, "Seleccione el Remitente", "REMITENTE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarRecepcionActionPerformed

    private void btngrabarRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarRecepcionActionPerformed
        idRecepcion = 1;//Integer.parseInt(txtIdRecepcion.getText()) ;
        codigoRecepcion = txtCodigoRecepcion.getText();
        DocumentoRecepcion = txtDocumentoRecepcion.getText();
        InstitucionRecepcion = txtInstitucionRecepcion.getText();
        IdRemitenteRecepcion = Integer.parseInt(txtCodRemRecepcion.getText());
        AsuntoRecepcion = txtAsuntoRecepcion.getText();
        ReferenciaRecepcion = txtReferenciaRecepcion.getText();
        destinatarioRecepcion = txtDestinatarioRecepcion.getText();
        obsRecepcion = txaObsRecepcion.getText();
        FechaRecepcion = txtfechaRecepcion.getText();
        HoraRecepcion = txtHoraRecepcion.getText();

        oRecepcion = new Recepcion();
        switch (opt) {
            case 'N':
                oRecepcion.setIdRecepcion(idRecepcion);
                oRecepcion.setCodigoRecepcion(codigoRecepcion);
                oRecepcion.setDocumento(DocumentoRecepcion);
                oRecepcion.setInstitucion(InstitucionRecepcion);
                oRecepcion.setIdRemitente(IdRemitenteRecepcion);
                oRecepcion.setAsunto(AsuntoRecepcion);
                oRecepcion.setReferencia(ReferenciaRecepcion);
                oRecepcion.setDestinatario(destinatarioRecepcion);
                oRecepcion.setObs(obsRecepcion);
                oRecepcion.setFecha(FechaRecepcion);
                oRecepcion.setHora(HoraRecepcion);
                try {
                    if (RecepcionBo.grabarRecepcion(oRecepcion)) {
                        JOptionPane.showMessageDialog(this, "Se Registró Correctamente", "MENSAJE --> RECEPCION", JOptionPane.INFORMATION_MESSAGE);
                        cargarDatos();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo Registrar", "MENSAJE --> RECEPCION", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE --> RECEPCION", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case 'M':
                codigo = Integer.parseInt(txtIdRecepcion.getText());
                oRecepcion.setInstitucion(InstitucionRecepcion);
//               oRecepcion.setRemitente(RemitenteRecepcion);
                oRecepcion.setFecha(FechaRecepcion);
                oRecepcion.setHora(HoraRecepcion);
//                oRecepcion.setRemitenteResponsable(RemitenteResponsable);
                oRecepcion.setIdRemitente(IdRemitenteRecepcion);
                oRecepcion.setIdRecepcion(codigo);
                try {
                    if (RecepcionBo.modificarRecepcion(oRecepcion)) {
                        JOptionPane.showMessageDialog(this, "Se Modificó Correctamente", "RECEPCION", JOptionPane.INFORMATION_MESSAGE);
                        cargarDatos();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo Modificar", "RECEPCION", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "RECEPCION", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }
        camposDeshabilitado();
        lblRec.setVisible(false);
        txtIdRecepcion.setVisible(false);
        cargarDatos();
        //btnsConfirmarDeshabilitar();
        btnsHabilitarRecepcion();
    }//GEN-LAST:event_btngrabarRecepcionActionPerformed

    private void btnNuevoRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoRecepcionActionPerformed
        opt = 'N';
        txtIdRecepcion.setEnabled(false);
        txtCodigoRecepcion.setEnabled(false);
        txtDocumentoRecepcion.setEditable(true);
        txtInstitucionRecepcion.setEditable(true);
        txtRemitenteRecepcion.setEnabled(false);
        txtCodRemRecepcion.setEnabled(false);
        txtAsuntoRecepcion.setEditable(true);
        txtReferenciaRecepcion.setEditable(true);
        txtDestinatarioRecepcion.setEditable(true);
        txaObsRecepcion.setEditable(true);
        txtfechaRecepcion.setEditable(true);
        txtHoraRecepcion.setEditable(true);
        limpiarCamposRecepcion();
        btnsHabilitarRecepcion_Nuevo();
        btnsDeshabilitarRecepcion_Nuevo();
        camposHabilitado();
        cargarCorrelativoRecepcion();
    }//GEN-LAST:event_btnNuevoRecepcionActionPerformed

    private void txtHoraRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraRecepcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraRecepcionActionPerformed

    private void txtRemitenteRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemitenteRecepcionActionPerformed

    }//GEN-LAST:event_txtRemitenteRecepcionActionPerformed

    private void cboTipoDocumentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboTipoDocumentoKeyPressed
        int nroDoc = ((TipoDocumento) cboTipoDocumento.getSelectedItem()).getIdTipoDocumento();
        cargarUltimoCorrelativo(nroDoc);
    }//GEN-LAST:event_cboTipoDocumentoKeyPressed

    private void txtAsuntoCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsuntoCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAsuntoCargoActionPerformed

    private void txtAreaCargoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAreaCargoMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaCargoMouseDragged

    private void txtAreaCargoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAreaCargoMouseMoved

    }//GEN-LAST:event_txtAreaCargoMouseMoved

    private void btnBuscarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCargoActionPerformed
        try {
            frmBuscarCargo frmBuscaCargo = new frmBuscarCargo(this, true);
            frmBuscaCargo.toFront();
            frmBuscaCargo.setVisible(true);
            this.txtAreaCargo.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar la vista: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarCargoActionPerformed
    public static String llenarConCeros(String cadena, String prefijo, int longitudMaxima) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < (longitudMaxima - cadena.trim().length()); i++) {
            res.append(prefijo);
        }
        res.append(cadena);
        return res.toString();
    }

    private void llenarCombos() {
        try {
            tipoDocumentoComboModel = TipoDocumentoBo.obtenerModeloTipoDocumento();
            cboTipoDocumento.setModel(tipoDocumentoComboModel);
            cboTipoDocumento.setPreferredSize(new Dimension(160, 22));

            estadoDocumentoComboModel = DocumentoEstadoBo.obtenerModeloDocumentoEstado();
            cboEstadoDocumento.setModel(estadoDocumentoComboModel);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }

    //Aqui
    private void cargarCorrelativoCargo() {
        String lsDocumento;
        try {
            String secuencia = CorrelativosBo.obtenerCargoCorrelativo();
            txtCodigoCargo.setText(secuencia);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargarCorrelativoRecepcion() {
        String lsDocumento;
        try {
            String secuencia = CorrelativosBo.obtenerRecepcionCorrelativo();
            txtCodigoRecepcion.setText(secuencia);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void cargarCorrelativoDerivacion() {
        try {
            String secuencia = CorrelativosBo.obtenerDerivacionCorrelativo();
            txtCodigoDerivacion.setText(secuencia);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void btnsEdicionHabilitar3() {
        btnNuevaDerivacion.setEnabled(true);
        btnBuscarDerivacion.setEnabled(true);
    }
    private void limpiarCamposDerivacion() {
        txtCodigoDerivacion.setText("");
        txtIdDerivacion.setText("");
        lblIdRecepcion.setText("");
        txtFechaDerivacion.setText("");
        txtDocumentoDerivacion.setText("");
        txtRemitenteDerivacion.setText("");
        txtMotivoDerivacion.setText("");
        txaObsDerivacion.setText("");
        cboPrioridadDerivacion.getSelectedItem().toString();
    }
    private void cargarUltimoCorrelativo(int idDocumento) {
        String lsDocumento;
        try {
            String secuencia = CorrelativosBo.obtenerListaUltimoCorrelativo(idDocumento);
            lblNumeroDocumento.setText(secuencia);
            lsDocumento = ((TipoDocumento) cboTipoDocumento.getSelectedItem()).getTipoDocumento();
            txtDocumento.setText(lsDocumento + " N° " + lblNumeroDocumento.getText() + "-" + txtAnio.getText() + "-FISME-UNTRM/BAGUA");
            String sql = "SELECT idDocumento FROM dbo.Documento ORDER BY idDocumento DESC LIMIT 1";
//            st = con.createStatement();
//            ResultSet rs = st.executeQuery(sql);
            txtIdDocumento.setText("1");
//            cargarIdDocumento();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargarIdDocumento() {
        try {
            txtIdDocumento.setText(CorrelativosBo.obtenerIdDocumento());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargarNumeroCargo(int tip) {
//        try {
//            TableColumn columna;
//            serienumeroTableModel = SerieNumeroDocumentoBo.obtenerSerieyNumeroDocumento(tip);
//            tblSerieDocumento.setModel(serienumeroTableModel);
//            columna = tblSerieDocumento.getColumnModel().getColumn(0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    private void btnGrabarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarCargoActionPerformed
        idCargo = Integer.parseInt("1");
        idDocumentoCargo = Integer.parseInt(lblIdDocumentoCargo.getText());
        System.out.println("idDocumentoCargo: " + idDocumentoCargo);
        Calendar cal;
        int d, m, a;
        cal = txtFechaCargo.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        java.sql.Date fecc = new java.sql.Date(a, m, d);
        FechaCargo = fecc.toString();
        HoraCargo = txtHoraCargo.getText();
        AreaCargo = txtAreaCargo.getText();
        Recepcionista = txtRecepcionistaCargo.getText();
        numeroCargo = txtNroDocumentoCargo.getText();
        estadoCArgo = 1;
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        fechaEstadoCargo = hourdateFormat.toString();
        System.out.println("fechaEstadoCargo: " + fechaEstadoCargo);
        usuarioEstadoCargo = gsUsuario;
        System.out.println("usuarioEstadoCargo: " + usuarioEstadoCargo);
        Obs = txtObservacionCargo.getText();
        System.out.println("txtObservacionCargo: " + txtObservacionCargo);
        usuarioRegistra = gsUsuario;
        System.out.println("txtusuarioRegistra: " + usuarioRegistra);
        //cal = txtfechaDevolucion.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        java.sql.Date txtfechaDev = new java.sql.Date(a, m, d);
        fechaRegistro = "23/09/2020"; //txtfechaDev.toString();
        oCargo = new Cargo();
        switch (opt) {
            case 'N':
                oCargo.setIdDocumento(idDocumentoCargo);
                oCargo.setFecha(FechaCargo);
                oCargo.setHora(HoraCargo);
                oCargo.setArea(AreaCargo);
                oCargo.setRecepcionista(Recepcionista);
                oCargo.setNumeroCargo(numeroCargo);
                oCargo.setEstadoCargo(estadoCArgo);
                oCargo.setUsuarioEstadoCargo(usuarioEstadoCargo);
                oCargo.setObs(Obs);
                oCargo.setUsuarioRegistra(usuarioRegistra);
                oCargo.setFechaRegistro(fechaRegistro);
                try {
                    if (CargoBo.grabarCargo(oCargo)) {
                        JOptionPane.showMessageDialog(this, "Se Registró Correctamente", "MENSAJE --> CARGO", JOptionPane.INFORMATION_MESSAGE);
                        cargarDatos1();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo Registrar", "MENSAJE --> CARGO", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE --> CARGO", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case 'M':
                idCargo = Integer.parseInt(txtCodigoCargo.getText());
                oCargo.setIdCargo(idCargo);
                oCargo.setIdDocumento(idDocumentoCargo);
                oCargo.setFecha(FechaCargo);
                oCargo.setHora(HoraRecepcion);
                oCargo.setArea(AreaCargo);
                oCargo.setRecepcionista(Recepcionista);

                try {
                    if (CargoBo.modificarCargo(oCargo)) {
                        JOptionPane.showMessageDialog(this, "Se Modificó Correctamente", "CARGO", JOptionPane.INFORMATION_MESSAGE);
                        cargarDatos1();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo Modificar", "CARGO", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "CARGO", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }
        camposDeshabilitado();
        lblcodigoCargo.setVisible(false);
        txtCodigoCargo.setVisible(false);
        cargarDatos();
        //btnsConfirmarDeshabilitar();
        btnsHabilitarRecepcion();
    }//GEN-LAST:event_btnGrabarCargoActionPerformed

    private void btnNuevoCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCargoActionPerformed
        opt = 'N';
        lblcodigoCargo.setVisible(true);
        txtCodigoCargo.setVisible(true);
        txtCodigoCargo.setEditable(false);
        txtFechaCargo.setEnabled(true);
        txtFechaCargo.setDate(null);
        txtHoraCargo.setEditable(true);
        txtHoraCargo.setText("");
        txtNroDocumentoCargo.setEditable(true);
        txtNroDocumentoCargo.setText("");
        txtDocumentoCargo.setEditable(true);
        txtDocumentoCargo.setText("");
        txtAsunto.setEditable(true);
        txtAsunto.setText("");
        txtInstitucion.setEditable(true);
        txtInstitucion.setText("");
        txtAreaCargo.setEditable(true);
        txtAreaCargo.setText("");
        txtRecepcionistaCargo.setEditable(true);
        txtRecepcionistaCargo.setText("");
        txtObservacionCargo.setEditable(true);
        txtObservacionCargo.setText("");
        btnsHabilitarCargo();
        btnsDeshabilitarCargo();
        camposHabilitado1();
        limpiarCamposCargo();
        cargarCorrelativoCargo();
    }//GEN-LAST:event_btnNuevoCargoActionPerformed

    private void btnModificarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCargoActionPerformed
        if (codigo != 0) {
            opt = 'M';
            camposHabilitado();
            txtCodigoCargo.setText("");
            txtDocumentoCargo.setText("");
//            txtFechaCargo.setText();
            txtHoraCargo.setText("");
            txtAreaCargo.setText("");
            txtObservacionCargo.setText("");
            lblcodigoCargo.setVisible(true);
            txtCodigoCargo.setVisible(true);
            txtCodigoCargo.setText("" + codigo);
            txtDocumentoCargo.requestFocus();
//            txtFechaCargo.setText(Fecha);
            txtHoraCargo.setText(HoraRecepcion);
            txtAreaCargo.setText(AreaCargo);
//            txtRemitenteRecepcion.setText(RemitenteRecepcion);
            txtObservacionCargo.setText(Recepcionista);
            btnsHabilitarRecepcion_Nuevo();
            btnsDeshabilitarCargo();
            //            JOptionPane.showMessageDialog(this, "Seleccione el Cargo", "CARGO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarCargoActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        limpiarCamposCargo();
        deshabilitarCamposCargo();
        btnNuevoCargo.setEnabled(true);
	btnBuscarCargo.setEnabled(true);     
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void txtNroDocumentoCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroDocumentoCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroDocumentoCargoActionPerformed

    private void btnGrabarDerivacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarDerivacionActionPerformed
        idDerivacion = 1;
        codigoDerivacion = txtCodigoDerivacion.getText();
        FechaDerivacion = txtFechaDerivacion.getText();
        idDocumentoDerivacion = Integer.parseInt(lblIdRecepcion.getText());
        MotivoDerivacion = txtMotivoDerivacion.getText();
        ObservacionDerivacion = txaObsDerivacion.getText();
        PrioridadDerivacion = cboPrioridadDerivacion.getSelectedIndex();
        oDerivacion = new Derivacion();
        switch (opt) {
            case 'N':
                oDerivacion.setIdDerivacion(idDerivacion);
                oDerivacion.setCodigoDerivacion(codigoDerivacion);
                oDerivacion.setFecha(FechaDerivacion);
                oDerivacion.setIdDocumento(idDocumentoDerivacion);
                oDerivacion.setMotivoDerivacion(MotivoDerivacion);
                oDerivacion.setObservacion(ObservacionDerivacion);
                oDerivacion.setPrioridad(PrioridadDerivacion);
                try {
                    if (DerivacionBo.grabarDerivacion(oDerivacion)) {
                        JOptionPane.showMessageDialog(this, "Se Registró Correctamente", "MENSAJE --> DERIVACION", JOptionPane.INFORMATION_MESSAGE);
                        cargarDatos3();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo Registrar", "MENSAJE --> DERIVACION", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE --> DERIVACION", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case 'M':
                idDerivacion = Integer.parseInt(txtCodigoDerivacion.getText());
                oDerivacion.setIdDerivacion(idDerivacion);
                oDerivacion.setCodigoDerivacion(codigoDerivacion);
                oDerivacion.setFecha(FechaDerivacion);
                oDerivacion.setIdDocumento(idDocumentoDerivacion);
                oDerivacion.setMotivoDerivacion(MotivoDerivacion);
                oDerivacion.setObservacion(ObservacionDerivacion);
                oDerivacion.setPrioridad(PrioridadDerivacion);
                try {
                    if (DerivacionBo.modificarDerivacion(oDerivacion)) {
                        JOptionPane.showMessageDialog(this, "Se Modificó Correctamente", "DERIVACION", JOptionPane.INFORMATION_MESSAGE);
                        cargarDatos3();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo Modificar", "DERIVACION", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "DERIVACION", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }
        camposDeshabilitado3();
        lblCodDerivacion.setVisible(true);
        txtCodigoDerivacion.setVisible(true);
        cargarDatos3();
        btnsConfirmarDeshabilitar3();
        btnsEdicionHabilitar3();
//        idDerivacion = 1;
//        codigoDerivacion = txtCodigoDerivacion.getText();
//        FechaDerivacion = txtFechaDerivacion.getText();
//        idDocumentoDerivacion = Integer.parseInt(lblIdRecepcion.getText());
//        MotivoDerivacion = txtMotivoDerivacion.getText();
//        ObservacionDerivacion = txaObsDerivacion.getText();
//        PrioridadDerivacion = cboPrioridadDerivacion.getSelectedIndex();
//        oDerivacion = new Derivacion();
//        switch (opt) {
//            case 'N':
//                oDerivacion.setIdDerivacion(idDerivacion);
//                oDerivacion.setCodigoDerivacion(codigoDerivacion);
//                oDerivacion.setFecha(FechaDerivacion);
//                oDerivacion.setIdDocumento(idDocumentoDerivacion);
//                oDerivacion.setMotivoDerivacion(MotivoDerivacion);
//                oDerivacion.setObservacion(ObservacionDerivacion);
//                oDerivacion.setPrioridad(PrioridadDerivacion);
//                try {
//                    if (DerivacionBo.grabarDerivacion(oDerivacion)) {
//                        JOptionPane.showMessageDialog(this, "Se Registró Correctamente", "MENSAJE --> DERIVACION", JOptionPane.INFORMATION_MESSAGE);
//                        cargarDatos3();
//                    } else {
//                        JOptionPane.showMessageDialog(this, "No se pudo Registrar", "MENSAJE -->DERIVACION", JOptionPane.ERROR_MESSAGE);
//                    }
//                } catch (Exception e) {
//                    JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE --> DERIVACION", JOptionPane.ERROR_MESSAGE);
//                }
//                break;
//            case 'M':
//                idDerivacion = Integer.parseInt(txtCodigoDerivacion.getText());
//                oDerivacion.setIdDerivacion(idDerivacion);
//                oDerivacion.setCodigoDerivacion(codigoDerivacion);
//                oDerivacion.setFecha(FechaDerivacion);
//                oDerivacion.setIdDocumento(idDocumentoDerivacion);
//                oDerivacion.setMotivoDerivacion(MotivoDerivacion);
//                oDerivacion.setObservacion(ObservacionDerivacion);
//                oDerivacion.setPrioridad(PrioridadDerivacion);
//                try {
//                    if (DerivacionBo.modificarDerivacion(oDerivacion)) {
//                        JOptionPane.showMessageDialog(this, "Se Modificó Correctamente", "DERIVACION", JOptionPane.INFORMATION_MESSAGE);
//                        cargarDatos3();
//                    } else {
//                        JOptionPane.showMessageDialog(this, "No se pudo Modificar", "DERIVACION", JOptionPane.ERROR_MESSAGE);
//                    }
//                } catch (Exception e) {
//                    JOptionPane.showMessageDialog(this, e.getMessage(), "DERIVACION", JOptionPane.ERROR_MESSAGE);
//                }
//                break;
//        }
//        camposDeshabilitado3();
//        lblCodDerivacion.setVisible(true);
//        txtCodigoDerivacion.setVisible(true);
//        cargarDatos3();
//        btnsConfirmarDeshabilitar3();
//        btnsEdicionHabilitar3();
//        Derivacion = cbderivacion.getSelectedItem().toString();
//        FechaDerivacion = txtFechaDerivacion.getText();
//        Remitentederivacion = txtnombreRemi.getText();
//        MotivoDerivacion = txtMotivoDerivacion.getText();
//        Prioridad = cbPRIORIDAD.getSelectedIndex();
//        Observacion = txtObservacionDeriv.getText();
//        oDerivacion = new Derivacion();
//        switch (opt) {
//            case 'N':
//                oDerivacion.setDerivacion(Derivacion);
//                oDerivacion.setFecha(FechaDerivacion);
//                oDerivacion.setIdDocumento(idDocumentoDerivacion);
//                oDerivacion.setMotivoDerivacion(MotivoDerivacion);
//                oDerivacion.setRemitente(Remitentederivacion);
//                oDerivacion.setPrioridad(Prioridad);
//                oDerivacion.setObservacion(Observacion);
//
//                try {
//                    if (DerivacionBo.grabarDerivacion(oDerivacion)) {
//                        JOptionPane.showMessageDialog(this, "Se Registró Correctamente", "MENSAJE → DERIVACION", JOptionPane.INFORMATION_MESSAGE);
//                        cargarDatos3();
//                    } else {
//                        JOptionPane.showMessageDialog(this, "No se pudo Registrar", "MENSAJE → DERIVACION", JOptionPane.ERROR_MESSAGE);
//                    }
//                } catch (Exception e) {
//                    JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE → DERIVACION", JOptionPane.ERROR_MESSAGE);
//                }
//                break;
//            case 'M':
//                idDerivacion = Integer.parseInt(txtcodigoDerivacion.getText());
//                oDerivacion.setIdDerivacion(idDerivacion);
//                oDerivacion.setDerivacion(Derivacion);
//                oDerivacion.setFecha(FechaDerivacion);
//                oDerivacion.setIdDocumento(idDocumentoDerivacion);
//                oDerivacion.setRemitente(Remitentederivacion);
//                oDerivacion.setPrioridad(Prioridad);
//                oDerivacion.setMotivoDerivacion(MotivoDerivacion);
//                oDerivacion.setObservacion(Observacion);
//
//                try {
//                    if (DerivacionBo.modificarDerivacion(oDerivacion)) {
//                        JOptionPane.showMessageDialog(this, "Se Modificó Correctamente", "DERIVACION", JOptionPane.INFORMATION_MESSAGE);
//                        cargarDatos3();
//                    } else {
//                        JOptionPane.showMessageDialog(this, "No se pudo Modificar", "DERIVACION", JOptionPane.ERROR_MESSAGE);
//                    }
//                } catch (Exception e) {
//                    JOptionPane.showMessageDialog(this, e.getMessage(), "DERIVACION", JOptionPane.ERROR_MESSAGE);
//                }
//                break;
//        }
//        camposDeshabilitado3();
//        lblCodDerivacion.setVisible(true);
//        txtcodigoDerivacion.setVisible(true);
//        cargarDatos3(); //En desuso
//        btnsConfirmarDeshabilitar3();
//        btnsHabilitarDerivacion();
    }//GEN-LAST:event_btnGrabarDerivacionActionPerformed

    private void btnNuevaDerivacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaDerivacionActionPerformed
        opt = 'N'; 
        txtIdDerivacion.setEnabled(false);
        txtCodigoDerivacion.setEnabled(false);
        txtCodigoDerivacion.setText("");
        txtFechaDerivacion.setEditable(true);
        txtFechaDerivacion.setText("");
        lblIdRecepcion.setEnabled(false);
        lblIdRecepcion.setText("");
        txtDocumentoDerivacion.setEnabled(false);
        txtDocumentoDerivacion.setText("");
        txtRemitenteDerivacion.setEditable(false);
        txtRemitenteDerivacion.setText("");
        txtMotivoDerivacion.setEditable(true);
        txtMotivoDerivacion.setText("");
        txaObsDerivacion.setEditable(true);
        txaObsDerivacion.setText("");
        cboPrioridadDerivacion.getSelectedItem().toString();
        cboPrioridadDerivacion.setEditable(true);
        btnsConfirmarHabilitar3();
        btnsEdicionDeshabilitar3();
        camposHabilitado3();
        limpiarCamposDerivacion();
        cargarCorrelativoDerivacion();
    }

    private void cargarDatos3() {
//        try {
//            TableColumn columna;
//            DefaultTableModel DerivacionTableModel = DerivacionBo.obtenerListaDerivacion();
//            tblDerivacion.setModel(DerivacionTableModel);
//            setAnchoColumnas();
//            columna = tblDerivacion.getColumnModel().getColumn(0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    public void setAnchoColumnas() {
//        JViewport scroll = (JViewport) tblDerivacion.getParent();
//        int ancho = scroll.getWidth();
//        int anchoColumna = 0;
//        TableColumnModel modeloColumna = tblDerivacion.getColumnModel();
//        TableColumn columnaTabla;
//        for (int i = 0; i < tblDerivacion.getColumnCount(); i++) {
//            columnaTabla = modeloColumna.getColumn(i);
//            switch (i) {
//                case 0:
//                    anchoColumna = (4 * ancho) / 100;
//                    break;
//                case 1:
//                    anchoColumna = (6 * ancho) / 100;
//                    break;
//                case 2:
//                    anchoColumna = (6 * ancho) / 100;
//                    break;
//                case 3:
//                    anchoColumna = (10 * ancho) / 100;
//                    break;
//                case 4:
//                    anchoColumna = (23 * ancho) / 100;
//                    break;
//                case 5:
//                    anchoColumna = (23 * ancho) / 100;
//                    break;
//                case 6:
//                    anchoColumna = (23 * ancho) / 100;
//                    break;
//                case 7:
//                    anchoColumna = (23 * ancho) / 100;
//                    break;
//            }
//            columnaTabla.setPreferredWidth(anchoColumna);
//        }
    }

    private void cargarDatosBuscar3() {
//        try {
//            TableColumn columna;
//            DefaultTableModel DerivacionTableModel = DerivacionBo.obtenerListaDerivacionBuscar(txtMotivoDerivacion.getText());
//            tblDerivacion.setModel(DerivacionTableModel);
//            setAnchoColumnas();
//            columna = tblDerivacion.getColumnModel().getColumn(0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    private void btnsEdicionDeshabilitar3() {
        btnNuevaDerivacion.setEnabled(false);
        btnModificarDerivacion.setEnabled(false);
        btnBuscarDerivacion.setEnabled(false);
        btnEliminarDerivacion.setEnabled(false);
    }

    private void btnsHabilitarDerivacion() {
        btnNuevaDerivacion.setEnabled(true);
        btnBuscarDerivacion.setEnabled(true);
    }

    private void btnsConfirmarHabilitar3() {
        btnGrabarDerivacion.setEnabled(true);
        btnBuscarDocDerivacion.setEnabled(true);
        cboPrioridadDerivacion.setEnabled(true);
    }

    private void btnsConfirmarDeshabilitar3() {
        btngrabarRecepcion.setEnabled(false);
        btnGrabarDerivacion.setEnabled(false);
        btnModificarDerivacion.setEnabled(false);
        btnEliminarDerivacion.setEnabled(false);
        btnBuscarDocDerivacion.setEnabled(false);
    }
   
    private void camposHabilitado3() {
        txtFechaDerivacion.setEnabled(true);
//        txtcodiDoc.setEnabled(true);
        txtRemitenteDerivacion.setEnabled(true);
        txtMotivoDerivacion.setEnabled(true);
        txaObsDerivacion.setEnabled(true);
    }

    private void camposDeshabilitado3() {
        txtFechaDerivacion.setEnabled(false);
        //txtcodiDoc.setEnabled(false);
        txtRemitenteDerivacion.setEnabled(false);
        txtMotivoDerivacion.setEnabled(false);
        cboPrioridadDerivacion.setEnabled(false);
        txaObsDerivacion.setEnabled(false);
    }//GEN-LAST:event_btnNuevaDerivacionActionPerformed

    private void btnModificarDerivacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDerivacionActionPerformed
        if (codigo != 0) {
            opt = 'M';
            camposHabilitado3();
            txtFechaDerivacion.setText("");
            txtRemitenteDerivacion.setText("");
            txtMotivoDerivacion.setText("");
            cboPrioridadDerivacion.getSelectedItem().toString();
//            lblDerivacion.setVisible(true);
            txtCodigoDerivacion.setVisible(true);
            txtCodigoDerivacion.setText("" + codigo);
            txtMotivoDerivacion.requestFocus();
            cboPrioridadDerivacion.getSelectedItem().toString();
            txtFechaDerivacion.setText(FechaDerivacion);
//            txtRemitenteDerivacion.setText(Remitentederivacion);
            txtMotivoDerivacion.setText(MotivoDerivacion);
            btnsConfirmarHabilitar3();
            btnsEdicionDeshabilitar3();
//            JOptionPane.showMessageDialog(this, "Seleccione la Derivacion", "DERIVACION", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarDerivacionActionPerformed

    private void btnCancelarDerivacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDerivacionActionPerformed
        if (opt == 'M') {
            lblCodDerivacion.setVisible(false);
            txtCodigoDerivacion.setVisible(false);
        }
        btnsEdicionHabilitar3();
        btnsConfirmarDeshabilitar3();
        limpiarCamposDerivacion();
        camposDeshabilitado3();

//        if (opt == 'M') {
//            lblCodDerivacion.setVisible(false);
//            txtCodigoDerivacion.setVisible(false);
//        }
//        limpiarCamposDerivacion();
//        deshabilitarCamposDerivacion();
//        btnsHabilitarDerivacion();
//        //btnsConfirmarDeshabilitar3();
//        //camposDeshabilitado3();
    }//GEN-LAST:event_btnCancelarDerivacionActionPerformed

    private void btnEliminarDerivacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDerivacionActionPerformed
        if (codigo != 0) {
            opt3 = 'E';
            lblCodDerivacion.setVisible(true);
            txtCodigoDerivacion.setVisible(true);
            txtCodigoDerivacion.setText("" + codigo);
            cboPrioridadDerivacion.getSelectedItem().toString();
            txtFechaDerivacion.setText(FechaDerivacion);
//            txtRemitenteRecepcion.setText(Remitentederivacion);
            txtMotivoDerivacion.setText(MotivoDerivacion);

            try {
                codigo = Integer.parseInt(txtIdRecepcion.getText());

                if (opt == 'E') {
                    oDerivacion = new Derivacion();
                    oDerivacion.setIdDerivacion(idDerivacion);
                    int rpta = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar?",
                            "DERIVACION", JOptionPane.YES_NO_OPTION);
                    if (rpta == 0) {
                        if (DerivacionBo.eliminarDerivacion(oDerivacion)) {
                            JOptionPane.showMessageDialog(this, "Se Eliminó Correctamente", "DERIVACION",
                                    JOptionPane.INFORMATION_MESSAGE);
                            cargarDatos();
                        } else {
                            JOptionPane.showMessageDialog(this, "No se pudo Eliminar", "DERIVACION",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "DERIVACION", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione el Derivacion", "DERIVACION", JOptionPane.ERROR_MESSAGE);
        }
        btnsEdicionHabilitar3();
        btnsConfirmarDeshabilitar3();
    }//GEN-LAST:event_btnEliminarDerivacionActionPerformed

    private void btnSalirDerivacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirDerivacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirDerivacionActionPerformed

    private void btnBuscarDocDerivacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDocDerivacionActionPerformed
        frmBuscarRecepcionDerivacion frmBRDerivaciones = new frmBuscarRecepcionDerivacion(this, true);
        frmBRDerivaciones.setLocationRelativeTo(null);
        frmBRDerivaciones.setVisible(true);
//        opt = 'B';
//        txtMotivoDerivacion.setEnabled(true);
//        cbderivacion.setEnabled(false);
//        cboPrioridadDerivacion.setEnabled(false);
//        txtRemitenteDerivacion.setEnabled(false);
//        txtFechaDerivacion.setEnabled(false);
//        txaObsDerivacion.setEnabled(false);
//        txtCodigoDerivacion.setVisible(false);
//        lblCodDerivacion.setVisible(false);
//        txtMotivoDerivacion.requestFocus();
//        cargarDatosBuscar3();
    }//GEN-LAST:event_btnBuscarDocDerivacionActionPerformed

    private void cboTipoDocumentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboTipoDocumentoMouseClicked
         int nroDoc = ((TipoDocumento) cboTipoDocumento.getSelectedItem()).getIdTipoDocumento();
         cargarUltimoCorrelativo(nroDoc);
    }//GEN-LAST:event_cboTipoDocumentoMouseClicked

    private void cboTipoDocumentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTipoDocumentoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            int nroDoc = ((TipoDocumento) cboTipoDocumento.getSelectedItem()).getIdTipoDocumento();
            cargarUltimoCorrelativo(nroDoc);
        }
    }//GEN-LAST:event_cboTipoDocumentoItemStateChanged

    private void btnBuscarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDocumentoActionPerformed
        frmBuscarDocumento frmBDocumento = new frmBuscarDocumento(this, true);
        frmBDocumento.setLocationRelativeTo(null);
        frmBDocumento.setVisible(true);
    }//GEN-LAST:event_btnBuscarDocumentoActionPerformed

    private void btnEliminarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCargoActionPerformed
        if (codigo != 0) {
            opt2 = 'E';
            txtIdDocumento.setText("" + codigo);
            txtDocumento.setText(Documento);
//            jDateFechaDoc.setDate(fecha2);
            txtAsuntoCargo.setText(asunto);
            txtInstitucion.setText(InstitucionDocumento);
            txtAreaDocumento.setText(areaDocumento);
            spFolios.setValue(folios);
            cboEstadoDocumento.getSelectedItem().toString();
            try {
                idDocumento = Integer.parseInt(txtIdDocumento.getText());
                if (opt2 == 'E') {
                    oDocumento = new Documento();
                    oDocumento.setIdDocumento(idDocumentoCargo);
                    int rpta = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar?",
                            "DOCUMENTO", JOptionPane.YES_NO_OPTION);
                    if (rpta == 0) {
                        if (DocumentoBo.eliminarDocumento(oDocumento)) {
                            JOptionPane.showMessageDialog(this, "Se Eliminó Correctamente", "DOCUMENTO",
                                    JOptionPane.INFORMATION_MESSAGE);
                            cargarDatos();
                        } else {
                            JOptionPane.showMessageDialog(this, "No se pudo Eliminar", "DOCUMENTO",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "DOCUMENTO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione el Documento", "DOCUMENTO", JOptionPane.ERROR_MESSAGE);
        }
        btnsHabilitarRecepcion();
        //btnsConfirmarDeshabilitar();
    }//GEN-LAST:event_btnEliminarCargoActionPerformed

    private void btnBuscarRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRecepcionActionPerformed
        try {
            frmBuscarDocumentoRecepcion frmBuscarDocumentoRecepcion = new frmBuscarDocumentoRecepcion(this, true);
            frmBuscarDocumentoRecepcion.toFront();
            frmBuscarDocumentoRecepcion.setVisible(true);
            this.txtRemitenteRecepcion.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar la vista: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarRecepcionActionPerformed

    private void btnBuscarDerivacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDerivacionActionPerformed
        try {
            frmBuscarDocumentoDerivacion frmBuscarDocumentoDerivacion = new frmBuscarDocumentoDerivacion(this, true);
            frmBuscarDocumentoDerivacion.toFront();
            frmBuscarDocumentoDerivacion.setVisible(true);
            this.txtMotivoDerivacion.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar la vista: " + e.getMessage());
        }     
    }//GEN-LAST:event_btnBuscarDerivacionActionPerformed

    private void btnAregarDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAregarDestinatarioActionPerformed
        String dato = txtDestinatario.getText();
        modeloListaDestinatario.addElement(dato);
        txtDestinatario.setText("");
        txtDestinatario.requestFocus(true);
    }//GEN-LAST:event_btnAregarDestinatarioActionPerformed

    private void btnQuitaDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitaDestinatarioActionPerformed
        int opt = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el registro?");
        if (opt == 0) {
            int posicion = lsDestinatario.getSelectedIndex();
            modeloListaDestinatario.remove(posicion);
        }
    }//GEN-LAST:event_btnQuitaDestinatarioActionPerformed

    private void btnAgregarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarArchivoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filtro);
        int opcion = fileChooser.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
//            String Archivo = fileChooser.getSelectedFile().getName(); //Nombre Archivo
            String Archivo = fileChooser.getSelectedFile().toString(); //Ruta
//            txtNombreArchivo.setText(Archivo);
//            txtRuta.setText(Ruta);
            modeloListaArchivo.addElement(Archivo);
        }
    }//GEN-LAST:event_btnAgregarArchivoActionPerformed

    private void cboEstadoDocumentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboEstadoDocumentoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEstadoDocumentoMouseClicked

    private void cboEstadoDocumentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboEstadoDocumentoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEstadoDocumentoItemStateChanged

    private void cboEstadoDocumentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboEstadoDocumentoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
//            btnAgregarArchivo.requestFocus();
        }
    }//GEN-LAST:event_cboEstadoDocumentoKeyPressed

    private void cboEstadoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEstadoDocumentoActionPerformed

    private void txtDestinatarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDestinatarioKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            btnAregarDestinatario.doClick();
        }
    }//GEN-LAST:event_txtDestinatarioKeyPressed

    private void txtAsuntoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAsuntoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtInstitucion.requestFocus();
        }
    }//GEN-LAST:event_txtAsuntoKeyPressed

    private void txtInstitucionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInstitucionKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtAreaDocumento.requestFocus();
        }
    }//GEN-LAST:event_txtInstitucionKeyPressed

    private void txtAreaDocumentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaDocumentoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            cboEstadoDocumento.requestFocus();
        }
    }//GEN-LAST:event_txtAreaDocumentoKeyPressed

    private void txtDocumentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtDestinatario.requestFocus();
        }
    }//GEN-LAST:event_txtDocumentoKeyPressed

    private void spFoliosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spFoliosKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtDocumento.requestFocus();
        }
    }//GEN-LAST:event_spFoliosKeyPressed

    private void btnQuitarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarArchivoActionPerformed
        int opt = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el registro?");
        if (opt == 0) {
            int posicion = lsArchivos.getSelectedIndex();
            modeloListaArchivo.remove(posicion);
        }
    }//GEN-LAST:event_btnQuitarArchivoActionPerformed

    private void btnBuscarDocumentoCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDocumentoCargoActionPerformed
        frmBuscarDocumentoCargo frmBDocumentoCargo = new frmBuscarDocumentoCargo(this, true);
        frmBDocumentoCargo.setLocationRelativeTo(null);
        frmBDocumentoCargo.setVisible(true);
    }//GEN-LAST:event_btnBuscarDocumentoCargoActionPerformed

    private void cboTipoDocumentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboTipoDocumentoMouseEntered
//         int nroDoc = ((TipoDocumento) cboTipoDocumento.getSelectedItem()).getIdTipoDocumento();
//         cargarUltimoCorrelativo(nroDoc);
    }//GEN-LAST:event_cboTipoDocumentoMouseEntered

    private void btnBuscarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRActionPerformed
        frmBuscarRemitentes frmBuscaRemitente = new frmBuscarRemitentes(this, true);
        frmBuscaRemitente.setLocationRelativeTo(null);
        frmBuscaRemitente.setVisible(true);
    }//GEN-LAST:event_btnBuscarRActionPerformed
    private void cargarDatos() {
//        try {
//            TableColumn columna;
//            DefaultTableModel RecepcionTableModel = RecepcionBo.obtenerListaRecepcion();
//            tblRecepcion.setModel(RecepcionTableModel);
//            setAnchoColumnas();
//            columna = tblRecepcion.getColumnModel().getColumn(0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

//    public void setAnchoColumnas2() {
//        JViewport scroll = (JViewport) tblRecepcion.getParent();
//        int ancho = scroll.getWidth();
//        int anchoColumna = 0;
//        TableColumnModel modeloColumna = tblRecepcion.getColumnModel();
//        TableColumn columnaTabla;
//        for (int i = 0; i < tblRecepcion.getColumnCount(); i++) {
//            columnaTabla = modeloColumna.getColumn(i);
//            switch (i) {
//                case 0:
//                    anchoColumna = (4 * ancho) / 100;
//                    break;
//                case 1:
//                    anchoColumna = (6 * ancho) / 100;
//                    break;
//                case 2:
//                    anchoColumna = (10 * ancho) / 100;
//                    break;
//                case 3:
//                    anchoColumna = (23 * ancho) / 100;
//                    break;
//                case 4:
//                    anchoColumna = (23 * ancho) / 100;
//                    break;
//                case 5:
//                    anchoColumna = (23 * ancho) / 100;
//                    break;
//                case 6:
//                    anchoColumna = (23 * ancho) / 100;
//                    break;
//            }
//            columnaTabla.setPreferredWidth(anchoColumna);
//        }
//    }
//
//    private void cargarDatosBuscar() {
//        try {
//            TableColumn columna;
//            DefaultTableModel RecepcionTableModel = RecepcionBo.obtenerListaRecepcion();
//            tblRecepcion.setModel(RecepcionTableModel);
//            setAnchoColumnas();
//            columna = tblRecepcion.getColumnModel().getColumn(0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void cargarDatosBuscarRemitente() {
//        try {
//            TableColumn columna;
//            DefaultTableModel RecepcionTableModel = RecepcionBo.obtenerListaRecepcionRemitente(txtRemitenteRecepcion.getText());
//            tblRecepcion.setModel(RecepcionTableModel);
//            setAnchoColumnas();
//            columna = tblRecepcion.getColumnModel().getColumn(0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    private void btnsDeshabilitarCargo() {
        btnNuevoCargo.setEnabled(false);
        btnBuscarCargo.setEnabled(false);
        btnModificarCargo.setEnabled(false);
        btnEliminarCargo.setEnabled(false);
    }

    private void btnsHabilitarRecepcion() {
        btnNuevoRecepcion.setEnabled(true);
        btnBuscarRecepcion.setEnabled(true);
    }

    private void btnsHabilitarRecepcion_Nuevo() {
        btngrabarRecepcion.setEnabled(true);
        btnBuscarR.setEnabled(true);
    }
    
    private void limpiarCamposRecepcion() {
        txtIdRecepcion.setText("");
        txtCodigoRecepcion.setText("");
        txtfechaRecepcion.setText("");
        txtHoraRecepcion.setText("");
        txtDocumentoRecepcion.setText("");
        txtInstitucionRecepcion.setText("");
        txtRemitenteRecepcion.setText("");
        txtCodRemRecepcion.setText("");
        txtAsuntoRecepcion.setText("");
        txtReferenciaRecepcion.setText("");
        txtDestinatarioRecepcion.setText("");
        txaObsRecepcion.setText("");
    }
    private void btnsDeshabilitarRecepcion_Nuevo(){
        btnNuevoRecepcion.setEnabled(false);
        btnBuscarRecepcion.setEnabled(false);
        btnModificarRecepcion.setEnabled(false);
        btneliminarRecepcion.setEnabled(false);
    }
    private void camposHabilitado() {
        txtDestinatarioRecepcion.setEnabled(true);
        txtfechaRecepcion.setEnabled(true);
        txtHoraRecepcion.setEnabled(true);
        // txtRRecepcion.setEnabled(true);
    }
    private void deshabilitarCamposDocumento(){
        btnGrabarDocumento.setEnabled(false);
        btnModificarDocumento.setEnabled(false);
        btnEliminarDocumento.setEnabled(false);
        cboTipoDocumento.setEnabled(false);
        btnAregarDestinatario.setEnabled(false);
        btnQuitaDestinatario.setEnabled(false);
        btnAgregarArchivo.setEnabled(false);
        btnQuitarArchivo.setEnabled(false);
        cboEstadoDocumento.setEnabled(false);
        spFolios.setEnabled(false);
    }
    private void deshabilitarCamposCargo(){
        btnGrabarCargo.setEnabled(false);
        btnModificarCargo.setEnabled(false);
        btnEliminarCargo.setEnabled(false);
        btnBuscarDocumentoCargo.setEnabled(false);
        txtFechaCargo.setEnabled(false);
    }
    private void deshabilitarCamposRecepcion(){
        btngrabarRecepcion.setEnabled(false);
        btnModificarRecepcion.setEnabled(false);
        btneliminarRecepcion.setEnabled(false);
        btnBuscarR.setEnabled(false);
    }
    private void deshabilitarCamposDerivacion(){
        btnGrabarDerivacion.setEnabled(false);
        btnModificarDerivacion.setEnabled(false);
        btnEliminarDerivacion.setEnabled(false);
        btnBuscarDocDerivacion.setEnabled(false);
        cboPrioridadDerivacion.setEnabled(false);
        //cbderivacion.setEnabled(false);
        txtFechaDerivacion.setEnabled(false);
//        txtcodiDoc.setEnabled(false);
        txtRemitenteDerivacion.setEnabled(false);
        txtMotivoDerivacion.setEnabled(false);
        txaObsDerivacion.setEnabled(false);
    }
    private void camposDeshabilitado() {
        // txtRRecepcion.setEnabled(false);
        //DESACTIVAMOS BOTONES DE LAS 4 SECCIONES
        
        //Sección Documentos
        cboTipoDocumento.setEnabled(false);
//     lblNumeroDocumento.setEnabled(true);
        txtAnio.setEnabled(false);
        lblNumeroDocumento.setEnabled(false);
        txtFechaDocumento.setEnabled(false);
        txtDocumento.setEnabled(false);
        lsDestinatario.setEnabled(false);
        txtAsunto.setEnabled(false);
        txtInstitucion.setEnabled(false);
        txtAreaDocumento.setEnabled(false);
//      txtRutaOrigen.setEnabled(true);
        txtNroDocumentoCargo.setEnabled(false);
        btnGrabarDocumento.setEnabled(false);
        btnModificarDocumento.setEnabled(false);
        btnEliminarDocumento.setEnabled(false);
        cboTipoDocumento.setEnabled(false);
        btnAregarDestinatario.setEnabled(false);
        btnQuitaDestinatario.setEnabled(false);
        btnAgregarArchivo.setEnabled(false);
        btnQuitarArchivo.setEnabled(false);
        cboEstadoDocumento.setEnabled(false);
        spFolios.setEnabled(false);
        //Sección Cargo
        txtCodigoCargo.setEnabled(false); 
        btnGrabarCargo.setEnabled(false);
        btnModificarCargo.setEnabled(false);
        btnEliminarCargo.setEnabled(false);
        btnBuscarDocumentoCargo.setEnabled(false);
        //cbdevolucion.setEnabled(false);
        //Sección Recepción
        txtHoraRecepcion.setEnabled(false);
        txtDestinatarioRecepcion.setEnabled(false);
        txtfechaRecepcion.setEnabled(false);
        btngrabarRecepcion.setEnabled(false);
        btnModificarRecepcion.setEnabled(false);
        btneliminarRecepcion.setEnabled(false);
        btnBuscarR.setEnabled(false);
        //Sección Derivación
        btnGrabarDerivacion.setEnabled(false);
        btnModificarDerivacion.setEnabled(false);
        btnEliminarDerivacion.setEnabled(false);
        btnBuscarDocDerivacion.setEnabled(false);
        cboPrioridadDerivacion.setEnabled(false);
        //cbderivacion.setEnabled(false);
    }
    
    private void cargarDatos1() {
//        try {
//            TableColumn columna;
//            DefaultTableModel CargoTableModel = CargoBo.obtenerListaCargo();
//            tblCargo.setModel(CargoTableModel);
//            setAnchoColumnas();
//            columna = tblCargo.getColumnModel().getColumn(0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//        private void cargarDatosBuscar1() {
//        try {
//            TableColumn columna;
//            DefaultTableModel CargoTableModel = CargoBo.obtenerListaCargoBuscar(texto.getText);
//            tblCargo.setModel(CargoTableModel);
//            setAnchoColumnas();
//            columna = tblCargo.getColumnModel().getColumn(0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public void setAnchoColumnas1() {
//        JViewport scroll = (JViewport) tblCargo.getParent();
//        int ancho = scroll.getWidth();
//        int anchoColumna = 0;
//        TableColumnModel modeloColumna = tblCargo.getColumnModel();
//        TableColumn columnaTabla;
//        for (int i = 0; i < tblCargo.getColumnCount(); i++) {
//            columnaTabla = modeloColumna.getColumn(i);
//            switch (i) {
//                case 0:
//                    anchoColumna = (4 * ancho) / 100;
//                    break;
//                case 1:
//                    anchoColumna = (6 * ancho) / 100;
//                    break;
//                case 2:
//                    anchoColumna = (10 * ancho) / 100;
//                    break;
//                case 3:
//                    anchoColumna = (23 * ancho) / 100;
//                    break;
//                case 4:
//                    anchoColumna = (23 * ancho) / 100;
//                    break;
//                case 5:
//                    anchoColumna = (23 * ancho) / 100;
//                    break;
//
//            }
//            columnaTabla.setPreferredWidth(anchoColumna);
//        }
    }

    private void cargarDatosBuscarCodigo1() {
        try {
            TableColumn columna;
            DefaultTableModel CargoTableModel = CargoBo.obtenerListaCargo(txtObservacionCargo.getText());
//            tblCargo.setModel(CargoTableModel);
            setAnchoColumnas();
//            columna = tblCargo.getColumnModel().getColumn(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void btnsHabilitarCargo() {
        btnGrabarCargo.setEnabled(true);
        btnBuscarDocumentoCargo.setEnabled(true);
    }

    private void btnsConfirmarDeshabilitar1() {
        btngrabarRecepcion.setEnabled(false);
    }

    private void limpiarCamposCargo() {
        txtCodigoCargo.setText("");
        txtNroDocumentoCargo.setText("");
        txtDocumentoCargo.setText("");
        txtHoraCargo.setText(HoraRecepcion);
        txtAsuntoCargo.setText("");
        txtInstitucionCargo.setText("");
        txtAreaCargo.setText("");
        txtRecepcionistaCargo.setText("");
        txtObservacionCargo.setText("");
    }

    private void camposHabilitado1() {
        txtDocumentoCargo.setEnabled(true);
        txtFechaCargo.setEnabled(true);
        txtHoraCargo.setEnabled(true);
        txtAreaCargo.setEnabled(true);
        txtObservacionCargo.setEnabled(true);
    }

    private void camposDeshabilitado1() {
        txtDocumentoCargo.setEnabled(false);
        txtFechaCargo.setEnabled(false);
        txtHoraCargo.setEnabled(false);
        txtAreaCargo.setEnabled(false);
        txtObservacionCargo.setEnabled(false);
    }

    private void btnsDeshabilitarDocumento() {
        btnNuevoDocumento.setEnabled(false);
        btnBuscarDocumento.setEnabled(false);
        btnModificarDocumento.setEnabled(false);
        btnEliminarDocumento.setEnabled(false);
    }

    private void btnsEdicionHabilitar2() {
        btnNuevoRecepcion.setEnabled(true);
        btnModificarRecepcion.setEnabled(true);
        btnEliminarDocumento.setEnabled(true);
    }

    private void btnsHabilitarDocumento() {
        btnGrabarDocumento.setEnabled(true);
        btnCancelarDocumento.setEnabled(true);
        cboTipoDocumento.setEnabled(true);
        spFolios.setEnabled(true);
        btnAregarDestinatario.setEnabled(true);
        btnQuitaDestinatario.setEnabled(true);
        btnAgregarArchivo.setEnabled(true);
        btnQuitarArchivo.setEnabled(true);
        cboEstadoDocumento.setEnabled(true); 
    }

    private void btnsConfirmarDeshabilitar2() {
        btnGrabarDocumento.setEnabled(false);
        btnCancelarDocumento.setEnabled(false);
    }

    private void limpiarCamposDocumentos() {
        cboTipoDocumento.setSelectedItem("");
        txtIdDocumento.setText("");
        txtAnio.setText("");
        lblNumeroDocumento.setText("");
        txtFechaDocumento.setText("");
        spFolios.setValue(0);
        txtDocumento.setText("");
        txtDocumento.setText("");
        lsDestinatario.removeAll();
        txtAsunto.setText("");
        txtInstitucion.setText("");
        txtAreaDocumento.setText("");
        cboEstadoDocumento.setSelectedItem("");
        lsArchivos.removeAll();
        txtDestinatario.setText("");
    }
    private void habilitarCamposDocumento(){
        cboTipoDocumento.setEnabled(true);
//     lblNumeroDocumento.setEnabled(true);
        txtAnio.setEnabled(true);
        lblNumeroDocumento.setEnabled(true);
        txtFechaDocumento.setEnabled(true);
        txtDocumento.setEnabled(true);
        lsDestinatario.setEnabled(true);
        txtAsunto.setEnabled(true);
        txtInstitucion.setEnabled(true);
        txtAreaDocumento.setEnabled(true);
        cboEstadoDocumento.setEnabled(true);
//      txtRutaOrigen.setEnabled(true);
        spFolios.setEnabled(true);
    }
//    private void camposHabilitado2() {
//        cboTipoDocumento.setEnabled(true);
////     lblNumeroDocumento.setEnabled(true);
//        txtAnio.setEnabled(true);
//        lblNumeroDocumento.setEnabled(true);
//        txtFechaDocumento.setEnabled(true);
//        txtDocumento.setEnabled(true);
//        lsDestinatario.setEnabled(true);
//        txtAsunto.setEnabled(true);
//        txtInstitucion.setEnabled(true);
//        txtAreaDocumento.setEnabled(true);
//        cboEstadoDocumento.setEnabled(true);
////      txtRutaOrigen.setEnabled(true);
//        spFolios.setEnabled(true);
//    }

//    private void camposDeshabilitado2() {
//        cboTipoDocumento.setEnabled(false);
////        lblNumero.setEnabled(false);
//        txtAnio.setEnabled(false);
////        txtfech.setEnabled(false);
//        txtDocumento.setEnabled(false);
//        lsDestinatario.setEnabled(false);
//        txtAsunto.setEnabled(false);
//        txtInstitucion.setEnabled(false);
//        txtAreaDocumento.setEnabled(false);
//        cboEstadoDocumento.setEnabled(false);
//        spFolios.setEnabled(false);
//    }

    private void grabarDocDestinatatio(int idTipoDocumento, String numeroDocumento) {
        ListModel listModel = lsDestinatario.getModel();
        oDocumentoDestinatario = new DocumentoDestinatario();
        oDocumentoDestinatario.setIdDocDestinatario(1);
        oDocumentoDestinatario.setIdTipoDocumento(idTipoDocumento);
        oDocumentoDestinatario.setNumeroDocumento(numeroDocumento);
        for (int i = 0; i < listModel.getSize(); i++) {
            String dato = listModel.getElementAt(i).toString();
            oDocumentoDestinatario.setDestinatario(dato);
            try {
                if (DocumentoDestinatarioBo.grabarDocumentoDestinatario(oDocumentoDestinatario)) {
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo Registrar Destinatarios", "MENSAJE → DOCUMENTO", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE → DOCUMENTO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void grabarDocArchivo(int idTipoDocumento, String numeroDocumento) {
        ListModel listModel = lsArchivos.getModel();
        oDocumentoArchivo = new DocumentoArchivo();
        oDocumentoArchivo.setDocumentoArchivo(1);
        oDocumentoArchivo.setIdTipoDocumento(idTipoDocumento);
        oDocumentoArchivo.setNumeroDocumento(numeroDocumento);
        String rutaDestino = txtRutaDestino.getText();
        for (int i = 0; i < listModel.getSize(); i++) {
            String archivo = listModel.getElementAt(i).toString();
            oDocumentoArchivo.setOrigen(archivo);
            File origen = new File(archivo);
            File destino = new File(rutaDestino + oDocumentoArchivo.getIdTipoDocumento() + oDocumentoArchivo.getNumeroDocumento() + origen.getName());
            oDocumentoArchivo.setDestino(destino.toString());
            try {
                InputStream in = new FileInputStream(origen);
                OutputStream out = new FileOutputStream(destino);

                byte[] buf = new byte[1024];
                int len;

                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                in.close();
                out.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }

            try {
                if (DocumentoArchivoBo.grabarDocumentoArchivo(oDocumentoArchivo)) {
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo Registrar Destinatarios", "MENSAJE → DOCUMENTO", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE → DOCUMENTO", JOptionPane.ERROR_MESSAGE);
            }
        }
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
            java.util.logging.Logger.getLogger(frmGeneral.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGeneral.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGeneral.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGeneral.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmGeneral dialog = new frmGeneral(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAgregarArchivo;
    private javax.swing.JButton btnAregarDestinatario;
    private javax.swing.JButton btnBuscarCargo;
    private javax.swing.JButton btnBuscarDerivacion;
    private javax.swing.JButton btnBuscarDocDerivacion;
    private javax.swing.JButton btnBuscarDocumento;
    private javax.swing.JButton btnBuscarDocumentoCargo;
    private javax.swing.JButton btnBuscarR;
    private javax.swing.JButton btnBuscarRecepcion;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnCancelarDerivacion;
    private javax.swing.JButton btnCancelarDocumento;
    private javax.swing.JButton btnEliminarCargo;
    private javax.swing.JButton btnEliminarDerivacion;
    private javax.swing.JButton btnEliminarDocumento;
    private javax.swing.JButton btnGrabarCargo;
    private javax.swing.JButton btnGrabarDerivacion;
    private javax.swing.JButton btnGrabarDocumento;
    private javax.swing.JButton btnModificarCargo;
    private javax.swing.JButton btnModificarDerivacion;
    private javax.swing.JButton btnModificarDocumento;
    private javax.swing.JButton btnModificarRecepcion;
    private javax.swing.JButton btnNuevaDerivacion;
    private javax.swing.JButton btnNuevoCargo;
    private javax.swing.JButton btnNuevoDocumento;
    private javax.swing.JButton btnNuevoRecepcion;
    private javax.swing.JButton btnQuitaDestinatario;
    private javax.swing.JButton btnQuitarArchivo;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnSalirDerivacion;
    private javax.swing.JButton btnSalirDocumento;
    private javax.swing.JButton btncancelarRecepcion;
    private javax.swing.JButton btneliminarRecepcion;
    private javax.swing.JButton btngrabarRecepcion;
    private javax.swing.JButton btnsalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox cboEstadoDocumento;
    private javax.swing.JComboBox<String> cboPrioridadDerivacion;
    private javax.swing.JComboBox cboTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbcod;
    private javax.swing.JLabel lbcod1;
    private javax.swing.JLabel lblCodDerivacion;
    private javax.swing.JLabel lblDocu;
    private javax.swing.JLabel lblIdDocumentoCargo;
    private javax.swing.JLabel lblIdRecepcion;
    private javax.swing.JLabel lblNumeroDocumento;
    private javax.swing.JLabel lblRec;
    private javax.swing.JLabel lblcod2;
    private javax.swing.JLabel lblcodigoCargo;
    private javax.swing.JList<String> lsArchivos;
    private javax.swing.JList<String> lsDestinatario;
    private javax.swing.JSpinner spFolios;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JPanel tbCargo;
    private javax.swing.JPanel tbDerivacion;
    private javax.swing.JPanel tbDocumento;
    private javax.swing.JPanel tbRecepcion;
    private javax.swing.JTextArea txaObsDerivacion;
    private javax.swing.JTextArea txaObsRecepcion;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtAreaCargo;
    private javax.swing.JTextField txtAreaDocumento;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtAsuntoCargo;
    private javax.swing.JTextField txtAsuntoRecepcion;
    private javax.swing.JTextField txtCodRemRecepcion;
    private javax.swing.JTextField txtCodigoCargo;
    private javax.swing.JTextField txtCodigoDerivacion;
    private javax.swing.JTextField txtCodigoRecepcion;
    private javax.swing.JTextField txtDestinatario;
    private javax.swing.JTextField txtDestinatarioRecepcion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtDocumentoCargo;
    private javax.swing.JTextField txtDocumentoDerivacion;
    private javax.swing.JTextField txtDocumentoRecepcion;
    private com.toedter.calendar.JDateChooser txtFechaCargo;
    private javax.swing.JTextField txtFechaDerivacion;
    private javax.swing.JTextField txtFechaDocumento;
    private javax.swing.JTextField txtHoraCargo;
    private javax.swing.JTextField txtHoraRecepcion;
    private javax.swing.JTextField txtIdDerivacion;
    private javax.swing.JTextField txtIdDocumento;
    private javax.swing.JTextField txtIdRecepcion;
    private javax.swing.JTextField txtInstitucion;
    private javax.swing.JTextField txtInstitucionCargo;
    private javax.swing.JTextField txtInstitucionRecepcion;
    private javax.swing.JTextField txtMotivoDerivacion;
    private javax.swing.JTextField txtNroDocumentoCargo;
    private javax.swing.JTextField txtObservacionCargo;
    private javax.swing.JTextField txtRecepcionistaCargo;
    private javax.swing.JTextField txtReferenciaRecepcion;
    private javax.swing.JTextField txtRemitenteDerivacion;
    private javax.swing.JTextField txtRemitenteRecepcion;
    private javax.swing.JTextField txtRutaDestino;
    private javax.swing.JTextField txtfechaRecepcion;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel ultimoCorrelativoTableModel;
    private DefaultComboBoxModel tipoDocumentoComboModel;
    private DefaultComboBoxModel estadoDocumentoComboModel;
    private DefaultListModel modeloListaDestinatario;
    private DefaultListModel modeloListaArchivo;

    void getTxtDocumento(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getTxtasunto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getTxtdocumento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Documento
    public JTextField getTxtIdDocumento() {
        return txtIdDocumento;
    }

    public void setTxtIdDocumento(JTextField txtIdDocumento) {
        this.txtIdDocumento = txtIdDocumento;
    }

    public JComboBox getCboTipoDocumento() {
        return cboTipoDocumento;
    }

    public void setCboTipoDocumento(JComboBox cboTipoDocumento) {
        this.cboTipoDocumento = cboTipoDocumento;
    }

    public JLabel getLblNumeroDocumento() {
        return lblNumeroDocumento;
    }

    public void setLblNumeroDocumento(JLabel lblNumeroDocumento) {
        this.lblNumeroDocumento = lblNumeroDocumento;
    }

    public JTextField getTxtAnio() {
        return txtAnio;
    }

    public void setTxtAnio(JTextField txtAnio) {
        this.txtAnio = txtAnio;
    }

    public JTextField getTxtFechaDocumento() {
        return txtFechaDocumento;
    }

    public void setTxtFechaDocumento(JTextField txtFechaDocumento) {
        this.txtFechaDocumento = txtFechaDocumento;
    }

    public JSpinner getSpFolios() {
        return spFolios;
    }

    public void setSpPinner(JSpinner spFolios) {
        this.spFolios.setValue(spFolios);
    }

    public JTextField getTxtDocumento() {
        return txtDocumento;
    }

    public void setTxtDocumento(JTextField txtDocumento) {
        this.txtDocumento = txtDocumento;
    }

    public JTextField getTxtAsunto() {
        return txtAsunto;
    }

    public void setTxtAsunto(JTextField txtAsunto) {
        this.txtAsunto = txtAsunto;
    }

    public JTextField getTxtInstitucion() {
        return txtInstitucion;
    }

    public void setTxtInstitucion(JTextField txtInstitucion) {
        this.txtInstitucion = txtInstitucion;
    }

    public JTextField getTxtAreaDocumento() {
        return txtAreaDocumento;
    }

    public void setTxtAreaDocumento(JTextField txtAreaDocumento) {
        this.txtAreaDocumento = txtAreaDocumento;
    }

    public JList getlsdestinatario() {
        return lsDestinatario;
    }

    public void setlsdestinatario(JList lsdestinatario) {
        this.lsDestinatario = lsdestinatario;
    }

    public JList getLsArchivo() {
        return lsArchivos;
    }

    public void setLsArchivo(JList lsArchivos) {
        this.lsArchivos = lsArchivos;
    }

    public JComboBox getcboEstadoDocumento() {
        return cboEstadoDocumento;
    }

    public void setcboEstadoDocumento(JComboBox cboEstadoDocumento) {
        this.cboEstadoDocumento = cboEstadoDocumento;
    }

    //Cargo     
    public JTextField gettxtCodigoCargo() {
        return txtCodigoCargo;
    }

    public void settxtCodigoCargo(JTextField txtCodigoCargo) {
        this.txtCodigoCargo = txtCodigoCargo;
    }

    public JDateChooser gettxtFechaCargo() {
        return txtFechaCargo;
    }

    public void settxtFechaCargo(JDateChooser txtFechaCargo) {
        this.txtFechaCargo = txtFechaCargo;
    }

    public JTextField gettxtHoraCargo() {
        return txtHoraCargo;
    }

    public void settxtHoraCargo(JTextField txtHoraCargo) {
        this.txtHoraCargo = txtHoraCargo;
    }

    public JTextField gettxtNroDocumentoCargo() {
        return txtNroDocumentoCargo;
    }

    public void settxtNroDocumentoCargo(JTextField txtNroDocumentoCargo) {
        this.txtNroDocumentoCargo = txtNroDocumentoCargo;
    }

    public JTextField gettxtDocumentoCargo() {
        return txtDocumentoCargo;
    }

    public void settxtDocumentoCargo(JTextField txtDocumentoCargo) {
        this.txtDocumentoCargo = txtDocumentoCargo;
    }

    //
    public JLabel getlblIdDocumentoCargo() {
        return lblIdDocumentoCargo;
    }

    public void setlblIdDocumentoCargo(JLabel lblIdDocumento) {
        this.lblIdDocumentoCargo = lblIdDocumento;
    }

    public JTextField gettxtAsuntoCargo() {
        return txtAsuntoCargo;
    }

    public void settxtAsuntoCargo(JTextField txtAsuntoCargo) {
        this.txtAsuntoCargo = txtAsuntoCargo;
    }

    public JTextField gettxtInstitucionCargo() {
        return txtInstitucionCargo;
    }

    public void settxtInstitucionCargo(JTextField txtInstitucionCargo) {
        this.txtInstitucionCargo = txtInstitucionCargo;
    }

    public JTextField gettxtAreaCargo() {
        return txtAreaCargo;
    }

    public void settxtAreaCargo(JTextField txtAreaCargo) {
        this.txtAreaCargo = txtAreaCargo;
    }

    public JTextField gettxtRecepcionistaCargo() {
        return txtRecepcionistaCargo;
    }

    public void settxtRecepcionistaCargo(JTextField txtRecepcionistaCargo) {
        this.txtRecepcionistaCargo = txtRecepcionistaCargo;
    }

    //Recepcion  
    public JTextField gettxtIdRecepcion() {
        return txtIdRecepcion;
    }

    public void settxtIdRecepcion(JTextField txtIdRecepcion) {
        this.txtIdRecepcion = txtIdRecepcion;
    }
    public JTextField getTxtIdDerivacion() {
        return txtIdDerivacion;
    }
    public JTextField gettxtCodigoRecepcion() {
        return txtCodigoRecepcion;
    }

    public void settxtCodigoRecepcion(JTextField txtCodigoRecepcion) {
        this.txtCodigoRecepcion = txtCodigoRecepcion;
    }

    public JTextField getTxtDocumentoRecepcion() {
        return txtDocumentoRecepcion;
    }

    public void setTxtDocumentoRecepcion(JTextField txtDocumentoRecepcion) {
        this.txtDocumentoRecepcion = txtDocumentoRecepcion;
    }

    public JTextField gettxtInstitucionRecepcion() {
        return txtInstitucionRecepcion;
    }

    public void settxtInstitucionRecepcion(JTextField txtInstitucionRecepcion) {
        this.txtInstitucionRecepcion = txtInstitucionRecepcion;
    }

    public JTextField gettxtRemitenteRecepcion() {
        return txtRemitenteRecepcion;
    }

    public void settxtRemitenteRecepcion(JTextField txtRemitenteRecepcion) {
        this.txtRemitenteRecepcion = txtRemitenteRecepcion;
    }

    public JTextField gettxtCodRemRecepcion() {
        return txtCodRemRecepcion;
    }

    public void settxtCodRemRecepcion(JTextField txtCodRemRecepcion) {
        this.txtCodRemRecepcion = txtCodRemRecepcion;
    }

    public JTextField gettxtAsuntoRecepcion() {
        return txtAsuntoRecepcion;
    }

    public void settxtAsuntoRecepcion(JTextField txtAsuntoRecepcion) {
        this.txtAsuntoRecepcion = txtAsuntoRecepcion;
    }

    public JTextField gettxtReferenciaRecepcion() {
        return txtReferenciaRecepcion;
    }

    public void settxtReferenciaRecepcion(JTextField txtReferenciaRecepcion) {
        this.txtReferenciaRecepcion = txtReferenciaRecepcion;
    }

    public JTextField gettxtDestinatarioRecepcion() {
        return txtDestinatarioRecepcion;
    }

    public void settxtDestinatarioRecepcion(JTextField txtDestinatarioRecepcion) {
        this.txtDestinatarioRecepcion = txtDestinatarioRecepcion;
    }

    public JTextArea gettxaObsRecepcion() {
        return txaObsRecepcion;
    }

    public void settxaObsRecepcion(JTextArea txaObsRecepcion) {
        this.txaObsRecepcion = txaObsRecepcion;
    }
    public JTextField gettxtDocumentoDerivacion() {
        return txtDocumentoDerivacion;
    }
    public JTextField getTxtfechaRecepcion() {
        return txtfechaRecepcion;
    }

    public void setTxtfechaRecepcion(JTextField txtfechaRecepcion) {
        this.txtfechaRecepcion = txtfechaRecepcion;
    }

    public JTextField getTxtHoraRecepcion() {
        return txtHoraRecepcion;
    }

    public void setTxtHoraRecepcion(JTextField txtHoraRecepcion) {
        this.txtHoraRecepcion = txtHoraRecepcion;
    }
    
    
    //Derivación
    public JTextField getTxtcodigoDerivacion() {
        return txtCodigoDerivacion;
    }
    public JTextField gettxtCodigoDerivacion() {
        return txtCodigoDerivacion;
    }
    public JLabel getlblIdRecepcion() {
        return lblIdRecepcion;
    }
    public JTextField gettxtRemitenteDerivacion() {
        return txtRemitenteDerivacion;
    }
    public JTextField gettxtMotivoDerivacion() {
        return txtMotivoDerivacion;
    }
    public JTextArea gettxaObsDerivacion() {
        return txaObsDerivacion;
    }
    public JComboBox getcboPrioridadDerivacion() {
        return cboPrioridadDerivacion;
    }
    public void txtcodigoDerivacion(JTextField txtcodigoDerivacion) {
        this.txtCodigoDerivacion = txtcodigoDerivacion;
    }

    public JTextField getTxtFechaDerivacion() {
        return txtFechaDerivacion;
    }

    public void txtFechaDerivacion(JTextField txtFechaDerivacion) {
        this.txtFechaDerivacion = txtFechaDerivacion;
    }
    
    public JTextField getTxtMotivoDerivacion() {
        return txtMotivoDerivacion;
    }

    public void txtMotivoDerivacion(JTextField txtMotivoDerivacion) {
        this.txtMotivoDerivacion = txtMotivoDerivacion;
    }

    public JTextField getTxtRemitenteDerivacion() {
        return txtRemitenteDerivacion;
    }

    public void TxtRemitenteDerivacion(JTextField txtnombreRemi) {
        this.txtRemitenteDerivacion = txtnombreRemi;
    }

    public JTextArea getTxtObservacionDeriv() {
        return txaObsDerivacion;
    }

    public void txtObservacionDeriv(JTextArea txtObservacionDeriv) {
        this.txaObsDerivacion = txtObservacionDeriv;
    }

    public JComboBox getcbPRIORIDAD() {
        return cboPrioridadDerivacion;
    }

    public void setcbPRIORIDAD(JComboBox cbPRIORIDAD) {
        this.cboPrioridadDerivacion = cbPRIORIDAD;
    }
    
    //Botones Documento
    public javax.swing.JButton getBtnModificarDocumento(){
        return btnModificarDocumento;
    }
    
    public javax.swing.JButton getBtnNuevoDocumento() {
        return btnNuevoDocumento;
    }
    
    public javax.swing.JButton getBtnGrabarDocumento(){
        return btnGrabarDocumento;
    }
    
    public javax.swing.JButton getBtnEliminarDocumento(){
        return btnEliminarDocumento;
    }
    
    //Botones Cargo
    public javax.swing.JButton getBtnModificarCargo(){
        return btnModificarCargo;
    }
    
    public javax.swing.JButton getBtnNuevoCargo() {
        return btnNuevoCargo;
    }
    
    public javax.swing.JButton getBtnGrabarCargo(){
        return btnGrabarCargo;
    }
    
    public javax.swing.JButton getBtnEliminarCargo(){
        return btnEliminarCargo;
    }
    
    //Botones Recepcion
    public javax.swing.JButton getBtnModificarRecepcion(){
        return btnModificarRecepcion;
    }
    
    public javax.swing.JButton getBtnNuevoRecepcion() {
        return btnNuevoRecepcion;
    }
    
    public javax.swing.JButton getBtnGrabarRecepcion(){
        return btngrabarRecepcion;
    }
    
    public javax.swing.JButton getBtnEliminarRecepcion(){
        return btneliminarRecepcion;
    }
    
    //Botones Derivacion
    public javax.swing.JButton getBtnModificarDerivacion(){
        return btnModificarDerivacion;
    }
    
    public javax.swing.JButton getBtnNuevoDerivacion() {
        return btnNuevaDerivacion;
    }
    
    public javax.swing.JButton getBtnGrabarDerivacion(){
        return btnGrabarDerivacion;
    }
    
    public javax.swing.JButton getBtnEliminarDerivacion(){
        return btnEliminarDerivacion;
    }
   
    public void habilitarBotonesFormularioDocumento(){
        cboTipoDocumento.setEnabled(true);
        btnAregarDestinatario.setEnabled(true);
        btnQuitaDestinatario.setEnabled(true);
        btnAgregarArchivo.setEnabled(true);
        btnQuitarArchivo.setEnabled(true);
        cboEstadoDocumento.setEnabled(true);
        spFolios.setEnabled(true);
        btnBuscarDocumento.setEnabled(false);
    }
    public void habilitarBotonesFormularioCargo(){
        btnBuscarDocumentoCargo.setEnabled(true);
        txtFechaCargo.setEnabled(true);
        btnBuscarCargo.setEnabled(false);
    }  
    public void habilitarBotonesFormularioRecepcion(){
        btnBuscarR.setEnabled(true);
        btnBuscarRecepcion.setEnabled(false);
    }
    
    public void habilitarBotonesFormularioDerivacion(){
        btnBuscarDocDerivacion.setEnabled(true);
        cboPrioridadDerivacion.setEnabled(true);
        btnBuscarDerivacion.setEnabled(false);
    }
}
