package vistas.panels;

import controller.PersonalC;
import dao.PersonalImpl;
import dao.UbigeoD;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Ubigeo;

public class PersonalView extends javax.swing.JPanel {

    UbigeoD ubiDAO ;
    public static DefaultTableModel modeloTabla;
    public int tipo = 1; //2: nombre , 3: apellido, 1: todos
    public String dato,sexo; // contenido del filtro    
    PersonalImpl dao;
    public int codigoPersonal, tipoPersonal;
    
    public PersonalView() throws Exception {
        initComponents();
        ubiDAO = new UbigeoD();
        btnGroupSexo.add(jrSexo);
        btnGroupSexo.add(jrSexo1);
        ubiDAO.listar_dpto(cboDpto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSexo = new javax.swing.ButtonGroup();
        jpMain = new javax.swing.JPanel();
        jpListado = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        JScroll = new javax.swing.JScrollPane();
        tblPersonal = new javax.swing.JTable();
        chkTodos = new javax.swing.JCheckBox();
        jrNom = new javax.swing.JRadioButton();
        jrDNI = new javax.swing.JRadioButton();
        jrApe = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jpSMneu1 = new javax.swing.JPanel();
        btnNuevoReg = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnImprimir1 = new javax.swing.JButton();
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
        jcTipo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
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
        jpSMneu = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnListado = new javax.swing.JButton();
        btnModificarReg = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));

        jpMain.setAlignmentX(0.0F);
        jpMain.setAlignmentY(0.0F);
        jpMain.setMaximumSize(new java.awt.Dimension(700, 600));
        jpMain.setMinimumSize(new java.awt.Dimension(700, 600));
        jpMain.setPreferredSize(new java.awt.Dimension(700, 600));
        jpMain.setLayout(new java.awt.CardLayout());

        jpListado.setBackground(new java.awt.Color(255, 255, 255));
        jpListado.setAlignmentX(0.0F);
        jpListado.setAlignmentY(0.0F);
        jpListado.setMaximumSize(new java.awt.Dimension(700, 600));
        jpListado.setMinimumSize(new java.awt.Dimension(700, 600));
        jpListado.setPreferredSize(new java.awt.Dimension(700, 600));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtBuscar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtBuscarCaretUpdate(evt);
            }
        });

        JScroll.setMaximumSize(new java.awt.Dimension(452, 405));
        JScroll.setMinimumSize(new java.awt.Dimension(452, 405));
        JScroll.setPreferredSize(new java.awt.Dimension(452, 405));

        tblPersonal.setModel(new javax.swing.table.DefaultTableModel(
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
        JScroll.setViewportView(tblPersonal);

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

        jpSMneu1.setMaximumSize(new java.awt.Dimension(160, 600));
        jpSMneu1.setMinimumSize(new java.awt.Dimension(160, 600));

        btnNuevoReg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevoReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nuevo.png"))); // NOI18N
        btnNuevoReg.setText("Nuevo");
        btnNuevoReg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevoReg.setMaximumSize(new java.awt.Dimension(137, 60));
        btnNuevoReg.setMinimumSize(new java.awt.Dimension(137, 60));
        btnNuevoReg.setPreferredSize(new java.awt.Dimension(137, 60));
        btnNuevoReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoRegActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/modificar_48x48.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificar.setMaximumSize(new java.awt.Dimension(137, 60));
        btnModificar.setMinimumSize(new java.awt.Dimension(137, 60));
        btnModificar.setPreferredSize(new java.awt.Dimension(137, 60));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eliminar_48x48.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminar.setMaximumSize(new java.awt.Dimension(137, 60));
        btnEliminar.setMinimumSize(new java.awt.Dimension(137, 60));
        btnEliminar.setPreferredSize(new java.awt.Dimension(137, 60));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnImprimir1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnImprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/printer_48x48.png"))); // NOI18N
        btnImprimir1.setText("Imprimir");
        btnImprimir1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnImprimir1.setMaximumSize(new java.awt.Dimension(137, 60));
        btnImprimir1.setMinimumSize(new java.awt.Dimension(137, 60));
        btnImprimir1.setPreferredSize(new java.awt.Dimension(137, 60));
        btnImprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSMneu1Layout = new javax.swing.GroupLayout(jpSMneu1);
        jpSMneu1.setLayout(jpSMneu1Layout);
        jpSMneu1Layout.setHorizontalGroup(
            jpSMneu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSMneu1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jpSMneu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jpSMneu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSMneu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpSMneu1Layout.setVerticalGroup(
            jpSMneu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSMneu1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnNuevoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jpListadoLayout = new javax.swing.GroupLayout(jpListado);
        jpListado.setLayout(jpListadoLayout);
        jpListadoLayout.setHorizontalGroup(
            jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListadoLayout.createSequentialGroup()
                .addGroup(jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpListadoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpListadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                            .addGroup(jpListadoLayout.createSequentialGroup()
                                .addComponent(jrNom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrApe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrDNI)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chkTodos)))))
                .addGap(18, 18, 18)
                .addComponent(jpSMneu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jpListadoLayout.setVerticalGroup(
            jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListadoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrDNI)
                    .addComponent(jrNom)
                    .addComponent(chkTodos)
                    .addComponent(jrApe))
                .addGap(18, 18, 18)
                .addComponent(JScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jpSMneu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpMain.add(jpListado, "card3");

        jpCRUD.setBackground(new java.awt.Color(255, 255, 255));
        jpCRUD.setAlignmentX(0.0F);
        jpCRUD.setAlignmentY(0.0F);
        jpCRUD.setMaximumSize(new java.awt.Dimension(700, 600));
        jpCRUD.setMinimumSize(new java.awt.Dimension(700, 600));
        jpCRUD.setPreferredSize(new java.awt.Dimension(700, 600));

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

        jcTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Administrador", "Operador" }));

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
                                        .addGap(0, 70, Short.MAX_VALUE)))
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
                                .addGroup(plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPass)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(10, 10, 10)
                .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13))
                .addGap(10, 10, 10)
                .addGroup(plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrSexo)
                    .addComponent(jrSexo1)
                    .addComponent(jcTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel19))
                .addGap(12, 12, 12)
                .addGroup(plDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Registro de Personal");

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
        cboProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProvActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Provincia");

        txtUbigeo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Ubigeo:");

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
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(plUbigeoLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUbigeo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        plUbigeoLayout.setVerticalGroup(
            plUbigeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plUbigeoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(cboDpto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addComponent(cboProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(plUbigeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel16)
                    .addComponent(txtUbigeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(cboDist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpSMneu.setMaximumSize(new java.awt.Dimension(160, 600));
        jpSMneu.setMinimumSize(new java.awt.Dimension(160, 600));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevo.setMaximumSize(new java.awt.Dimension(137, 60));
        btnNuevo.setMinimumSize(new java.awt.Dimension(137, 60));
        btnNuevo.setPreferredSize(new java.awt.Dimension(137, 60));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/guardar_48x48.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGuardar.setMaximumSize(new java.awt.Dimension(137, 60));
        btnGuardar.setMinimumSize(new java.awt.Dimension(137, 60));
        btnGuardar.setPreferredSize(new java.awt.Dimension(137, 60));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnListado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/listado_48x48.png"))); // NOI18N
        btnListado.setText("Listado");
        btnListado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnListado.setMaximumSize(new java.awt.Dimension(137, 60));
        btnListado.setMinimumSize(new java.awt.Dimension(137, 60));
        btnListado.setPreferredSize(new java.awt.Dimension(137, 60));
        btnListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoActionPerformed(evt);
            }
        });

        btnModificarReg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModificarReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/modificar_48x48.png"))); // NOI18N
        btnModificarReg.setText("Modificar");
        btnModificarReg.setEnabled(false);
        btnModificarReg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificarReg.setMaximumSize(new java.awt.Dimension(137, 60));
        btnModificarReg.setMinimumSize(new java.awt.Dimension(137, 60));
        btnModificarReg.setPreferredSize(new java.awt.Dimension(137, 60));
        btnModificarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarRegActionPerformed(evt);
            }
        });

        btnImprimir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/printer_48x48.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnImprimir.setMaximumSize(new java.awt.Dimension(137, 60));
        btnImprimir.setMinimumSize(new java.awt.Dimension(137, 60));
        btnImprimir.setPreferredSize(new java.awt.Dimension(137, 60));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSMneuLayout = new javax.swing.GroupLayout(jpSMneu);
        jpSMneu.setLayout(jpSMneuLayout);
        jpSMneuLayout.setHorizontalGroup(
            jpSMneuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSMneuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSMneuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpSMneuLayout.createSequentialGroup()
                        .addGroup(jpSMneuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificarReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpSMneuLayout.setVerticalGroup(
            jpSMneuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSMneuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnModificarReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(btnListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jpCRUDLayout = new javax.swing.GroupLayout(jpCRUD);
        jpCRUD.setLayout(jpCRUDLayout);
        jpCRUDLayout.setHorizontalGroup(
            jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCRUDLayout.createSequentialGroup()
                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCRUDLayout.createSequentialGroup()
                        .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                            .addComponent(plUbigeo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(jpCRUDLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jpSMneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpCRUDLayout.setVerticalGroup(
            jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCRUDLayout.createSequentialGroup()
                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpCRUDLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(plUbigeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpSMneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void cboDptoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDptoItemStateChanged
        try {
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                ubiDAO.listar_prov(cboProv, cboDpto.getSelectedItem().toString());

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

    private void cboProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboProvActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        PersonalC personalC = new PersonalC();
        personalC.limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            PersonalC personalC = new PersonalC();
            personalC.variables();
            personalC.registrarPersonal();
            cargar_Tabla();
        } catch (Exception ex) {
            System.out.println("Error en el btnGuardar" + ex.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoActionPerformed
        jpCRUD.setVisible(false);
        jpListado.setVisible(true);
    }//GEN-LAST:event_btnListadoActionPerformed

    private void btnModificarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarRegActionPerformed
        try {
            int opcion = JOptionPane.showConfirmDialog(null, "Deseas modificar? ", "Modificación del registro", JOptionPane.OK_OPTION);
            if (opcion == JOptionPane.OK_OPTION) {
                PersonalC personalC = new PersonalC();
                personalC.getPersonal().setIdPer(codigoPersonal);
                personalC.variables();
                personalC.modificarPersonal();
                cargar_Tabla();
                JOptionPane.showMessageDialog(null,"Registro modificado");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnModificarRegActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnNuevoRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoRegActionPerformed
        jpCRUD.setVisible(true);
        jpListado.setVisible(false);
    }//GEN-LAST:event_btnNuevoRegActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            int fila = tblPersonal.getSelectedRow();
            if (fila >= 0) {
                codigoPersonal = Integer.parseInt(tblPersonal.getValueAt(fila, 0).toString());
                txtNom.setText(tblPersonal.getValueAt(fila, 1).toString());
                txtApe.setText(tblPersonal.getValueAt(fila, 2).toString());
                //                btnEliminarReg.setEnabled(true);
                btnModificarReg.setEnabled(true);
                btnGuardar.setEnabled(false);
                btnModificar.setEnabled(false);
                btnEliminar.setEnabled(false);
                jpCRUD.setVisible(true);
                jpListado.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Selecciona un registro");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int fila = tblPersonal.getSelectedRow();
            if (fila >= 0) {
                int opcion = JOptionPane.showConfirmDialog(null, "Deseas eliminar menso? ", "Eliminación del registro", JOptionPane.OK_OPTION);
                if (opcion == JOptionPane.OK_OPTION) {
                    codigoPersonal = Integer.parseInt(tblPersonal.getValueAt(fila, 0).toString());
                    PersonalC personalC = new PersonalC();
                    personalC.getPersonal().setIdPer(codigoPersonal);
                    personalC.eliminarPersonal();
                    cargar_Tabla();
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnImprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimir1ActionPerformed
    
    private void cargar_Tabla() throws Exception {
        String columna[] = new String[]{"Código", "Nombre", "Apellido", "Nacimiento"};
        modeloTabla = new DefaultTableModel(null, columna);
        dao = new PersonalImpl();
        dao.buscar(modeloTabla, tipo, dato);
        tblPersonal.setModel(modeloTabla);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScroll;
    private javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup btnGroupSexo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnImprimir1;
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarReg;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevoReg;
    public static javax.swing.JComboBox cboDist;
    public static javax.swing.JComboBox cboDpto;
    public static javax.swing.JComboBox cboProv;
    public static javax.swing.JCheckBox chkTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    public static javax.swing.JComboBox<String> jcTipo;
    private javax.swing.JPanel jpCRUD;
    private javax.swing.JPanel jpListado;
    private javax.swing.JPanel jpMain;
    private javax.swing.JPanel jpSMneu;
    private javax.swing.JPanel jpSMneu1;
    private javax.swing.JRadioButton jrApe;
    private javax.swing.JRadioButton jrDNI;
    private javax.swing.JRadioButton jrNom;
    javax.swing.JRadioButton jrSexo;
    javax.swing.JRadioButton jrSexo1;
    private javax.swing.JLabel lblTotal;
    public javax.swing.JPanel plDatos;
    public javax.swing.JPanel plUbigeo;
    public static javax.swing.JTable tblPersonal;
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
