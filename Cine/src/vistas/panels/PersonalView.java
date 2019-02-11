package vistas.panels;

import dao.UbigeoD;
import java.awt.event.ItemEvent;
import model.Ubigeo;

public class PersonalView extends javax.swing.JPanel {

    public String sexo;
    UbigeoD ubigeoDao = new UbigeoD();

    public PersonalView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMain = new javax.swing.JPanel();
        jpListado = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDetalle = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        JScroll = new javax.swing.JScrollPane();
        jtPersonal = new javax.swing.JTable();
        chkTodos = new javax.swing.JCheckBox();
        jrNom = new javax.swing.JRadioButton();
        jrDNI = new javax.swing.JRadioButton();
        jrApe = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jpCRUD = new javax.swing.JPanel();
        plDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtApe = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jrSexo = new javax.swing.JRadioButton();
        jrSexo1 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRegistros = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnNuevoReg = new javax.swing.JButton();
        plUbigeo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cboDpto = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cboDist = new javax.swing.JComboBox();
        txtDir = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboProv = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txtUbigeo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        chkEditarDpto = new javax.swing.JCheckBox();

        jpMain.setAlignmentX(0.0F);
        jpMain.setAlignmentY(0.0F);
        jpMain.setMaximumSize(new java.awt.Dimension(960, 600));
        jpMain.setPreferredSize(new java.awt.Dimension(960, 650));
        jpMain.setLayout(new java.awt.CardLayout());

        jpListado.setBackground(new java.awt.Color(255, 255, 255));
        jpListado.setAlignmentX(0.0F);
        jpListado.setAlignmentY(0.0F);
        jpListado.setMinimumSize(new java.awt.Dimension(960, 600));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Listado de Personal");

        jPanel2.setBackground(new java.awt.Color(2, 136, 209));
        jPanel2.setMaximumSize(null);
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(120, 600));

        btnImprimir.setBackground(new java.awt.Color(255, 255, 255));
        btnImprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setText("Imprimir");
        btnImprimir.setContentAreaFilled(false);
        btnImprimir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnImprimir.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnImprimir.setMaximumSize(new java.awt.Dimension(120, 40));
        btnImprimir.setMinimumSize(new java.awt.Dimension(120, 40));
        btnImprimir.setPreferredSize(new java.awt.Dimension(120, 40));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setAlignmentY(0.0F);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminar.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnEliminar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnEliminar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnEliminar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevo.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnNuevo.setMaximumSize(new java.awt.Dimension(120, 40));
        btnNuevo.setMinimumSize(new java.awt.Dimension(120, 40));
        btnNuevo.setPreferredSize(new java.awt.Dimension(120, 40));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Actualiza");
        btnEditar.setAlignmentY(0.0F);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEditar.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnEditar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnEditar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnEditar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnDetalle.setBackground(new java.awt.Color(255, 255, 255));
        btnDetalle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDetalle.setForeground(new java.awt.Color(255, 255, 255));
        btnDetalle.setText("Detalle");
        btnDetalle.setAlignmentY(0.0F);
        btnDetalle.setContentAreaFilled(false);
        btnDetalle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDetalle.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnDetalle.setMaximumSize(new java.awt.Dimension(120, 40));
        btnDetalle.setMinimumSize(new java.awt.Dimension(120, 40));
        btnDetalle.setPreferredSize(new java.awt.Dimension(120, 40));
        btnDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        txtBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtBuscar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtBuscarCaretUpdate(evt);
            }
        });

        JScroll.setPreferredSize(new java.awt.Dimension(452, 405));

        jtPersonal.setModel(new javax.swing.table.DefaultTableModel(
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
        JScroll.setViewportView(jtPersonal);

        chkTodos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkTodos.setText("Todos");
        chkTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTodosActionPerformed(evt);
            }
        });

        jrNom.setBackground(new java.awt.Color(255, 255, 255));
        jrNom.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jrNom.setText("Nombre");
        jrNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNomActionPerformed(evt);
            }
        });

        jrDNI.setBackground(new java.awt.Color(255, 255, 255));
        jrDNI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jrDNI.setText("DNI");
        jrDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrDNIActionPerformed(evt);
            }
        });

        jrApe.setBackground(new java.awt.Color(255, 255, 255));
        jrApe.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jrApe.setText("Apellido");
        jrApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrApeActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Total del Personal");

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        javax.swing.GroupLayout jpListadoLayout = new javax.swing.GroupLayout(jpListado);
        jpListado.setLayout(jpListadoLayout);
        jpListadoLayout.setHorizontalGroup(
            jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListadoLayout.createSequentialGroup()
                .addGroup(jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpListadoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrNom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrApe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrDNI)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkTodos)
                        .addGap(81, 81, 81))
                    .addGroup(jpListadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpListadoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpListadoLayout.setVerticalGroup(
            jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListadoLayout.createSequentialGroup()
                .addGroup(jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpListadoLayout.createSequentialGroup()
                        .addGroup(jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jrDNI)
                                .addComponent(jrNom)
                                .addComponent(chkTodos)
                                .addComponent(jrApe))
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 50, Short.MAX_VALUE))
        );

        jpMain.add(jpListado, "card3");

        jpCRUD.setBackground(new java.awt.Color(255, 255, 255));
        jpCRUD.setAlignmentX(0.0F);
        jpCRUD.setAlignmentY(0.0F);
        jpCRUD.setMinimumSize(new java.awt.Dimension(960, 600));

        plDatos.setBackground(new java.awt.Color(255, 255, 255));
        plDatos.setToolTipText("");
        plDatos.setPreferredSize(new java.awt.Dimension(404, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Apellido Paterno y Materno");

        txtApe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApe.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("DNI");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre (s)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Sexo");

        txtNom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNom.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtDni.setBackground(new java.awt.Color(204, 255, 255));
        txtDni.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Usuario");

        txtUsuario.setBackground(new java.awt.Color(204, 204, 255));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Tipo o Nivel");

        jrSexo.setBackground(new java.awt.Color(255, 255, 255));
        jrSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrSexo.setText("Hombre");
        jrSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrSexoActionPerformed(evt);
            }
        });

        jrSexo1.setBackground(new java.awt.Color(255, 255, 255));
        jrSexo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrSexo1.setText("Mujer");
        jrSexo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrSexo1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Contraseña");

        txtPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPass.setText("jPasswordField1");
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
        });

        javax.swing.GroupLayout plDatosLayout = new javax.swing.GroupLayout(plDatos);
        plDatos.setLayout(plDatosLayout);
        plDatosLayout.setHorizontalGroup(
            plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plDatosLayout.createSequentialGroup()
                        .addGroup(plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(plDatosLayout.createSequentialGroup()
                                .addGroup(plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNom, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, plDatosLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(0, 53, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(plDatosLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jrSexo)
                                .addGap(26, 26, 26)
                                .addComponent(jrSexo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(plDatosLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(plDatosLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(plDatosLayout.createSequentialGroup()
                                .addGroup(plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPass)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plDatosLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
                    .addGroup(plDatosLayout.createSequentialGroup()
                        .addGroup(plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApe, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(plDatosLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(167, 167, 167)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        plDatosLayout.setVerticalGroup(
            plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plDatosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13))
                .addGap(17, 17, 17)
                .addGroup(plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrSexo)
                    .addComponent(jrSexo1))
                .addGap(18, 18, 18)
                .addGroup(plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel19))
                .addGap(13, 13, 13)
                .addGroup(plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Registro de Personal");

        jPanel1.setBackground(new java.awt.Color(2, 136, 209));
        jPanel1.setMaximumSize(null);
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(120, 600));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setAlignmentY(0.0F);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setEnabled(false);
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGuardar.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnGuardar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnGuardar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnGuardar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setEnabled(false);
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelar.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnCancelar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnCancelar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnCancelar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRegistros.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistros.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistros.setText("Listado");
        btnRegistros.setAlignmentY(0.0F);
        btnRegistros.setContentAreaFilled(false);
        btnRegistros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistros.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnRegistros.setMaximumSize(new java.awt.Dimension(120, 40));
        btnRegistros.setMinimumSize(new java.awt.Dimension(120, 40));
        btnRegistros.setPreferredSize(new java.awt.Dimension(120, 40));
        btnRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrosActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setAlignmentY(0.0F);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setEnabled(false);
        btnModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificar.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnModificar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnModificar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnModificar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnNuevoReg.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevoReg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevoReg.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoReg.setText("Nuevo");
        btnNuevoReg.setContentAreaFilled(false);
        btnNuevoReg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevoReg.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnNuevoReg.setMaximumSize(new java.awt.Dimension(120, 40));
        btnNuevoReg.setMinimumSize(new java.awt.Dimension(120, 40));
        btnNuevoReg.setPreferredSize(new java.awt.Dimension(120, 40));
        btnNuevoReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoRegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoReg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btnNuevoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btnRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        plUbigeo.setBackground(new java.awt.Color(255, 255, 255));
        plUbigeo.setToolTipText("");
        plUbigeo.setName(""); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Dirección");

        cboDpto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboDpto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDptoItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Distrito");

        cboDist.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboDist.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDistItemStateChanged(evt);
            }
        });
        cboDist.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cboDistPropertyChange(evt);
            }
        });

        txtDir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Departamento");

        cboProv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboProv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboProvItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Provincia");

        txtUbigeo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Ubigeo:");

        chkEditarDpto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkEditarDpto.setText("Editar");
        chkEditarDpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEditarDptoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plUbigeoLayout = new javax.swing.GroupLayout(plUbigeo);
        plUbigeo.setLayout(plUbigeoLayout);
        plUbigeoLayout.setHorizontalGroup(
            plUbigeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plUbigeoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plUbigeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboDpto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboProv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboDist, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDir)
                    .addGroup(plUbigeoLayout.createSequentialGroup()
                        .addGroup(plUbigeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(plUbigeoLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkEditarDpto))
                            .addGroup(plUbigeoLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUbigeo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 137, Short.MAX_VALUE)))
                .addContainerGap())
        );
        plUbigeoLayout.setVerticalGroup(
            plUbigeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plUbigeoLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(plUbigeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(chkEditarDpto))
                .addGap(15, 15, 15)
                .addComponent(cboDpto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(plUbigeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel16)
                    .addComponent(txtUbigeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboDist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout jpCRUDLayout = new javax.swing.GroupLayout(jpCRUD);
        jpCRUD.setLayout(jpCRUDLayout);
        jpCRUDLayout.setHorizontalGroup(
            jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCRUDLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(plUbigeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14)
                    .addComponent(plDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpCRUDLayout.setVerticalGroup(
            jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCRUDLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(plDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plUbigeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );

        jpMain.add(jpCRUD, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jpMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(956, 956, 956))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        try {

        } catch (Exception e) {
            e.getMessage();
            System.out.println("bntImprimir " + e.getMessage());
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleActionPerformed

    }//GEN-LAST:event_btnDetalleActionPerformed

    private void txtBuscarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtBuscarCaretUpdate

    }//GEN-LAST:event_txtBuscarCaretUpdate

    private void chkTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTodosActionPerformed

    }//GEN-LAST:event_chkTodosActionPerformed

    private void jrNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNomActionPerformed

    }//GEN-LAST:event_jrNomActionPerformed

    private void jrDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrDNIActionPerformed

    }//GEN-LAST:event_jrDNIActionPerformed

    private void jrApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrApeActionPerformed

    }//GEN-LAST:event_jrApeActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void jrSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrSexoActionPerformed
        sexo = "M";
    }//GEN-LAST:event_jrSexoActionPerformed

    private void jrSexo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrSexo1ActionPerformed
        sexo = "F";
    }//GEN-LAST:event_jrSexo1ActionPerformed

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        txtPass.setText("");
    }//GEN-LAST:event_txtPassFocusGained

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrosActionPerformed

    }//GEN-LAST:event_btnRegistrosActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnNuevoRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoRegActionPerformed

    }//GEN-LAST:event_btnNuevoRegActionPerformed

    private void cboDptoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDptoItemStateChanged
        try {
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                ubigeoDao.listar_prov(cboProv, cboDpto.getSelectedItem().toString());

            }
        } catch (Exception ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_cboDptoItemStateChanged

    private void cboDistItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDistItemStateChanged
        try {
            if (evt.getStateChange() == ItemEvent.SELECTED) {

                int idubi;
                Ubigeo ubigeo = (Ubigeo) cboDist.getSelectedItem();
                String id = ubigeo.getIdUbi();
                idubi = Integer.parseInt(id);
                txtUbigeo.setText(String.valueOf(idubi));

            }
        } catch (Exception ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_cboDistItemStateChanged

    private void cboDistPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cboDistPropertyChange


    }//GEN-LAST:event_cboDistPropertyChange

    private void cboProvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboProvItemStateChanged

    }//GEN-LAST:event_cboProvItemStateChanged

    private void chkEditarDptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEditarDptoActionPerformed

    }//GEN-LAST:event_chkEditarDptoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScroll;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDetalle;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevoReg;
    private javax.swing.JButton btnRegistros;
    public static javax.swing.JComboBox cboDist;
    public static javax.swing.JComboBox cboDpto;
    public static javax.swing.JComboBox cboProv;
    private javax.swing.JCheckBox chkEditarDpto;
    public static javax.swing.JCheckBox chkTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpCRUD;
    private javax.swing.JPanel jpListado;
    private javax.swing.JPanel jpMain;
    private javax.swing.JRadioButton jrApe;
    private javax.swing.JRadioButton jrDNI;
    private javax.swing.JRadioButton jrNom;
    javax.swing.JRadioButton jrSexo;
    javax.swing.JRadioButton jrSexo1;
    public static javax.swing.JTable jtPersonal;
    private javax.swing.JLabel lblTotal;
    public javax.swing.JPanel plDatos;
    public javax.swing.JPanel plUbigeo;
    public static javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtBuscar;
    public static javax.swing.JTextField txtDir;
    public static javax.swing.JTextField txtDni;
    public static javax.swing.JTextField txtNom;
    public static javax.swing.JPasswordField txtPass;
    public static javax.swing.JTextField txtUbigeo;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
