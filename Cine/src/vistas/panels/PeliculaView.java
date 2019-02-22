package vistas.panels;

import controller.PeliculaC;
import dao.PeliculaImpl;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PeliculaView extends javax.swing.JPanel {


    
    public static DefaultTableModel modeloTabla;
    public int tipo = 1; //2: nombre , 3: apellido, 1: todos
    public String dato; // contenido del filtro
    PeliculaImpl dao;
    private int codigoPelicula;
    
    public PeliculaView() {
        initComponents();
        btnGroupPelicula.add(jrGenero);
        btnGroupPelicula.add(jrTipo);
    }
    
    private void cargar_Tabla() throws Exception {
        String columna[] = new String[]{"Código", "Nombre", "Genero", "Tipo","Idioma"};
        modeloTabla = new DefaultTableModel(null, columna);
        dao = new PeliculaImpl();
        dao.buscar(modeloTabla, tipo, dato);
        tblPelicula.setModel(modeloTabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupPelicula = new javax.swing.ButtonGroup();
        btnTipoPelicula = new javax.swing.ButtonGroup();
        jRadioButton4 = new javax.swing.JRadioButton();
        jpCRUD = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnListado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox<>();
        rbSubtitulada = new javax.swing.JRadioButton();
        rbDoblada = new javax.swing.JRadioButton();
        cbIdioma = new javax.swing.JComboBox<>();
        rbPrimero = new javax.swing.JRadioButton();
        rbTercero = new javax.swing.JRadioButton();
        rbCuarto = new javax.swing.JRadioButton();
        rbSegundo = new javax.swing.JRadioButton();
        rbQuinto = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jpListado = new javax.swing.JPanel();
        jrGenero = new javax.swing.JRadioButton();
        jrTipo = new javax.swing.JRadioButton();
        chkTodos = new javax.swing.JCheckBox();
        txtDato = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPelicula = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar2 = new javax.swing.JButton();

        jRadioButton4.setText("PG");

        setLayout(new java.awt.CardLayout());

        jpCRUD.setBackground(new java.awt.Color(0, 204, 153));
        jpCRUD.setForeground(new java.awt.Color(0, 153, 153));
        jpCRUD.setMaximumSize(new java.awt.Dimension(700, 600));
        jpCRUD.setMinimumSize(new java.awt.Dimension(700, 600));
        jpCRUD.setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel2.setMaximumSize(new java.awt.Dimension(170, 560));
        jPanel2.setMinimumSize(new java.awt.Dimension(170, 560));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/entrega.png"))); // NOI18N
        jButton1.setText("Nuevo");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/guardar(1).png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reportar(2).png"))); // NOI18N
        jButton3.setText("Modificar");

        btnListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reportar(2).png"))); // NOI18N
        btnListado.setText("Listado");
        btnListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(btnListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnListado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Género");

        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Duración");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Detalle de Pelicula");
        jLabel4.setAlignmentX(2.0F);
        jLabel4.setAlignmentY(2.0F);
        jLabel4.setIconTextGap(10);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Tipo");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Idioma");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Clasificación");

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Animadas", "Comedia", "Terror", "Drama", "Acción" }));
        cbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGeneroActionPerformed(evt);
            }
        });

        rbSubtitulada.setText("Subtitulada");
        rbSubtitulada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSubtituladaActionPerformed(evt);
            }
        });

        rbDoblada.setText("Doblada");

        cbIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Ingles", "Latino", "Castellano" }));

        rbPrimero.setText("R");

        rbTercero.setText("14A");

        rbCuarto.setText("18A");

        rbSegundo.setText("PG");

        rbQuinto.setText("G");

        jLabel6.setText("Películas de contenido restringido para todo menor de edad.");

        jLabel9.setText("Películas aptas para los menores de edad, pero que ameritan el acompañamiento.");

        jLabel10.setText("Películas que pueden ser vistas por niños menores de 14 años de edad, con la compañía de sus padres.");

        jLabel11.setText("Películas que son para el público en general y que no muestra contenido explicito ni ofensivo, para ninguna edad");

        jLabel12.setText("Películas que pueden ser vistas por adolescentes menores de los 18 años de edad pero bajo la supervisión de padres o representantes");

        javax.swing.GroupLayout jpCRUDLayout = new javax.swing.GroupLayout(jpCRUD);
        jpCRUD.setLayout(jpCRUDLayout);
        jpCRUDLayout.setHorizontalGroup(
            jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCRUDLayout.createSequentialGroup()
                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCRUDLayout.createSequentialGroup()
                        .addContainerGap(207, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))
                    .addGroup(jpCRUDLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCRUDLayout.createSequentialGroup()
                                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(rbTercero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbCuarto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbQuinto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbSegundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpCRUDLayout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE))
                                    .addGroup(jpCRUDLayout.createSequentialGroup()
                                        .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jpCRUDLayout.createSequentialGroup()
                                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpCRUDLayout.createSequentialGroup()
                                        .addComponent(rbSubtitulada)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbDoblada, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpCRUDLayout.createSequentialGroup()
                                        .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(24, 24, 24)
                                        .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbIdioma, 0, 167, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDuracion)))
                                    .addComponent(txtNombre1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpCRUDLayout.setVerticalGroup(
            jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpCRUDLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSubtitulada, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbDoblada, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTercero, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbQuinto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        add(jpCRUD, "card2");

        jpListado.setMaximumSize(new java.awt.Dimension(900, 600));
        jpListado.setMinimumSize(new java.awt.Dimension(900, 600));

        jrGenero.setBackground(new java.awt.Color(204, 255, 204));
        jrGenero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrGenero.setText("Genero");
        jrGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrGeneroActionPerformed(evt);
            }
        });

        jrTipo.setBackground(new java.awt.Color(204, 255, 204));
        jrTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrTipo.setText("Tipo");
        jrTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrTipoActionPerformed(evt);
            }
        });

        chkTodos.setBackground(new java.awt.Color(204, 255, 204));
        chkTodos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkTodos.setText("Todos");
        chkTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTodosActionPerformed(evt);
            }
        });

        txtDato.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDatoCaretUpdate(evt);
            }
        });

        tblPelicula.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPelicula);

        jPanel3.setMaximumSize(new java.awt.Dimension(170, 560));
        jPanel3.setMinimumSize(new java.awt.Dimension(170, 560));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/entrega.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reportar(2).png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reportar(2).png"))); // NOI18N
        btnEliminar2.setText("Eliminar");
        btnEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNuevo))
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addGap(64, 64, 64)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpListadoLayout = new javax.swing.GroupLayout(jpListado);
        jpListado.setLayout(jpListadoLayout);
        jpListadoLayout.setHorizontalGroup(
            jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpListadoLayout.createSequentialGroup()
                        .addComponent(jrGenero)
                        .addGap(18, 18, 18)
                        .addComponent(jrTipo)
                        .addGap(18, 18, 18)
                        .addComponent(chkTodos)
                        .addGap(18, 18, 18)
                        .addComponent(txtDato))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jpListadoLayout.setVerticalGroup(
            jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpListadoLayout.createSequentialGroup()
                        .addGroup(jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrGenero)
                            .addComponent(jrTipo)
                            .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkTodos))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jpListadoLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        add(jpListado, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void jrTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrTipoActionPerformed
        tipo = 3;
        chkTodos.setSelected(false);
    }//GEN-LAST:event_jrTipoActionPerformed

    private void chkTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTodosActionPerformed

        try {
            if (chkTodos.isSelected() == true) {
                btnGroupPelicula.clearSelection();
                tipo = 1;
                cargar_Tabla();
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_chkTodosActionPerformed

    private void txtDatoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDatoCaretUpdate
        try {
            dato = txtDato.getText();
            cargar_Tabla();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_txtDatoCaretUpdate

    private void jrGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrGeneroActionPerformed
        tipo = 2;
        chkTodos.setSelected(false);
    }//GEN-LAST:event_jrGeneroActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        jpCRUD.setVisible(true);
        jpListado.setVisible(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar2ActionPerformed
        try {
            int fila = tblPelicula.getSelectedRow();
            if (fila >= 0) {
                int opcion = JOptionPane.showConfirmDialog(null, "Deseas eliminar? ", "Eliminación del registro", JOptionPane.OK_OPTION);
                if (opcion == JOptionPane.OK_OPTION) {
                    codigoPelicula = Integer.parseInt(tblPelicula.getValueAt(fila, 0).toString());
                    PeliculaC clienteC = new PeliculaC();
                    clienteC.getPelicula().setIdPeli(codigoPelicula);
                    clienteC.eliminarPelicula();
                    cargar_Tabla();
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnEliminar2ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            int fila = tblPelicula.getSelectedRow();
            if (fila >= 0) {
                codigoPelicula = Integer.parseInt(tblPelicula.getValueAt(fila, 0).toString());
                txtNombre1.setText(tblPelicula.getValueAt(fila, 1).toString());
                txtDuracion.setText(tblPelicula.getValueAt(fila, 3).toString());
                btnModificar.setEnabled(true);
                btnGuardar.setEnabled(false);
                btnModificar.setEnabled(false);
                btnEliminar2.setEnabled(false);
                jpCRUD.setVisible(true);
                jpListado.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Selecciona un registro");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void rbSubtituladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSubtituladaActionPerformed

    }//GEN-LAST:event_rbSubtituladaActionPerformed

    private void cbGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGeneroActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void btnListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoActionPerformed
        jpCRUD.setVisible(false);
        jpListado.setVisible(true);
    }//GEN-LAST:event_btnListadoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            PeliculaC peliculaC = new PeliculaC();
            peliculaC.variables();
            peliculaC.registrarPelicula();
            peliculaC.limpiar();
        } catch (Exception ex) {
            System.out.println("Error en el btnGuardar" + ex.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar2;
    private javax.swing.ButtonGroup btnGroupPelicula;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup btnTipoPelicula;
    public static javax.swing.JComboBox<String> cbGenero;
    public static javax.swing.JComboBox<String> cbIdioma;
    public static javax.swing.JCheckBox chkTodos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpCRUD;
    private javax.swing.JPanel jpListado;
    public static javax.swing.JRadioButton jrGenero;
    public static javax.swing.JRadioButton jrTipo;
    public static javax.swing.JRadioButton rbCuarto;
    public static javax.swing.JRadioButton rbDoblada;
    public static javax.swing.JRadioButton rbPrimero;
    public static javax.swing.JRadioButton rbQuinto;
    public static javax.swing.JRadioButton rbSegundo;
    public static javax.swing.JRadioButton rbSubtitulada;
    public static javax.swing.JRadioButton rbTercero;
    public static javax.swing.JTable tblPelicula;
    public static javax.swing.JTextField txtDato;
    public static javax.swing.JTextField txtDuracion;
    public static javax.swing.JTextField txtNombre1;
    // End of variables declaration//GEN-END:variables
}
