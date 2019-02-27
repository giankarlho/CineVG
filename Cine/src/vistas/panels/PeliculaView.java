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
        String columna[] = new String[]{"Código", "Nombre", "Genero", "Tipo"};
        modeloTabla = new DefaultTableModel(null, columna);
        dao = new PeliculaImpl();
        dao.buscar(modeloTabla, tipo, dato);
        tblPelicula.setModel(modeloTabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupPelicula = new javax.swing.ButtonGroup();
        btnTipoPelicula = new javax.swing.ButtonGroup();
        jRadioButton4 = new javax.swing.JRadioButton();
        jpCRUD = new javax.swing.JPanel();
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
        jpSMneu = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnListado = new javax.swing.JButton();
        btnModificarReg = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jpListado = new javax.swing.JPanel();
        jrGenero = new javax.swing.JRadioButton();
        jrTipo = new javax.swing.JRadioButton();
        chkTodos = new javax.swing.JCheckBox();
        txtDato1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPelicula = new javax.swing.JTable();
        jpSMneu2 = new javax.swing.JPanel();
        btnNuevoReg = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnImprimir2 = new javax.swing.JButton();

        jRadioButton4.setText("PG");

        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setLayout(new java.awt.CardLayout());

        jpCRUD.setBackground(new java.awt.Color(204, 204, 255));
        jpCRUD.setForeground(new java.awt.Color(51, 204, 0));
        jpCRUD.setMaximumSize(new java.awt.Dimension(700, 600));
        jpCRUD.setMinimumSize(new java.awt.Dimension(700, 600));
        jpCRUD.setPreferredSize(new java.awt.Dimension(900, 600));

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

        cbGenero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Animadas", "Comedia", "Terror", "Drama", "Acción" }));
        cbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGeneroActionPerformed(evt);
            }
        });

        rbSubtitulada.setBackground(new java.awt.Color(204, 204, 255));
        rbSubtitulada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbSubtitulada.setText("Subtitulada");
        rbSubtitulada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSubtituladaActionPerformed(evt);
            }
        });

        rbDoblada.setBackground(new java.awt.Color(204, 204, 255));
        rbDoblada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbDoblada.setText("Doblada");

        cbIdioma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Ingles", "Latino", "Castellano" }));

        rbPrimero.setBackground(new java.awt.Color(204, 204, 255));
        rbPrimero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbPrimero.setText("R");

        rbTercero.setBackground(new java.awt.Color(204, 204, 255));
        rbTercero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbTercero.setText("14A");

        rbCuarto.setBackground(new java.awt.Color(204, 204, 255));
        rbCuarto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbCuarto.setText("18A");

        rbSegundo.setBackground(new java.awt.Color(204, 204, 255));
        rbSegundo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbSegundo.setText("PG");

        rbQuinto.setBackground(new java.awt.Color(204, 204, 255));
        rbQuinto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbQuinto.setText("G");

        jLabel6.setText("Películas de contenido restringido para todo menor de edad.");

        jLabel9.setText("Películas aptas para los menores de edad, pero que ameritan el acompañamiento.");

        jLabel10.setText("Películas que pueden ser vistas por niños menores de 14 años de edad, con la compañía de sus padres.");

        jLabel11.setText("Películas que son para el público en general y que no muestra contenido explicito ni ofensivo, para ninguna edad");

        jLabel12.setText("Películas que pueden ser vistas por adolescentes menores de los 18 años de edad pero bajo la supervisión de padres o representantes");

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
                .addGap(38, 38, 38)
                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCRUDLayout.createSequentialGroup()
                        .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCRUDLayout.createSequentialGroup()
                                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpCRUDLayout.createSequentialGroup()
                                        .addComponent(rbSubtitulada)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbDoblada, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(11, 11, 11)
                                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jpCRUDLayout.createSequentialGroup()
                                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(rbTercero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbCuarto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbQuinto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbSegundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpCRUDLayout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jpCRUDLayout.createSequentialGroup()
                        .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombre1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpCRUDLayout.createSequentialGroup()
                                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(123, 123, 123)))
                .addComponent(jpSMneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jpCRUDLayout.setVerticalGroup(
            jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCRUDLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
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
                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpCRUDLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbQuinto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCRUDLayout.createSequentialGroup()
                .addComponent(jpSMneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jpCRUD, "card2");

        jpListado.setBackground(new java.awt.Color(204, 204, 255));
        jpListado.setMaximumSize(new java.awt.Dimension(700, 600));
        jpListado.setMinimumSize(new java.awt.Dimension(700, 600));
        jpListado.setPreferredSize(new java.awt.Dimension(700, 600));

        jrGenero.setBackground(new java.awt.Color(204, 204, 255));
        jrGenero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrGenero.setText("Genero");
        jrGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrGeneroActionPerformed(evt);
            }
        });

        jrTipo.setBackground(new java.awt.Color(204, 204, 255));
        jrTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrTipo.setText("Tipo");
        jrTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrTipoActionPerformed(evt);
            }
        });

        chkTodos.setBackground(new java.awt.Color(204, 204, 255));
        chkTodos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkTodos.setText("Todos");
        chkTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTodosActionPerformed(evt);
            }
        });

        txtDato1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDato1CaretUpdate(evt);
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
        jScrollPane2.setViewportView(tblPelicula);

        jpSMneu2.setMaximumSize(new java.awt.Dimension(160, 600));
        jpSMneu2.setMinimumSize(new java.awt.Dimension(160, 600));

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

        btnImprimir2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnImprimir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/printer_48x48.png"))); // NOI18N
        btnImprimir2.setText("Imprimir");
        btnImprimir2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnImprimir2.setMaximumSize(new java.awt.Dimension(137, 60));
        btnImprimir2.setMinimumSize(new java.awt.Dimension(137, 60));
        btnImprimir2.setPreferredSize(new java.awt.Dimension(137, 60));
        btnImprimir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSMneu2Layout = new javax.swing.GroupLayout(jpSMneu2);
        jpSMneu2.setLayout(jpSMneu2Layout);
        jpSMneu2Layout.setHorizontalGroup(
            jpSMneu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSMneu2Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jpSMneu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jpSMneu2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSMneu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpSMneu2Layout.setVerticalGroup(
            jpSMneu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSMneu2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnNuevoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jpListadoLayout = new javax.swing.GroupLayout(jpListado);
        jpListado.setLayout(jpListadoLayout);
        jpListadoLayout.setHorizontalGroup(
            jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpListadoLayout.createSequentialGroup()
                        .addComponent(jrGenero)
                        .addGap(18, 18, 18)
                        .addComponent(jrTipo)
                        .addGap(18, 18, 18)
                        .addComponent(chkTodos)
                        .addGap(18, 18, 18)
                        .addComponent(txtDato1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jpSMneu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(4, Short.MAX_VALUE))
        );
        jpListadoLayout.setVerticalGroup(
            jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrGenero)
                    .addComponent(jrTipo)
                    .addComponent(txtDato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkTodos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jpSMneu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jpListado, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void rbSubtituladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSubtituladaActionPerformed

    }//GEN-LAST:event_rbSubtituladaActionPerformed

    private void cbGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGeneroActionPerformed
       
    }//GEN-LAST:event_cbGeneroActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
       
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        PeliculaC peliculaC = new PeliculaC();
        peliculaC.limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            PeliculaC clienteC = new PeliculaC();
            clienteC.variables();
            clienteC.registrarPelicula();
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
                PeliculaC peliculaC = new PeliculaC();
                peliculaC.getPelicula().setIdPeli(codigoPelicula);
                peliculaC.variables();
                peliculaC.modificarPelicula();
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

    private void jrGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrGeneroActionPerformed

    private void jrTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrTipoActionPerformed

    private void chkTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTodosActionPerformed

    private void txtDato1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDato1CaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDato1CaretUpdate

    private void btnNuevoRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoRegActionPerformed
        jpCRUD.setVisible(true);
        jpListado.setVisible(false);
    }//GEN-LAST:event_btnNuevoRegActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int fila = tblPelicula.getSelectedRow();
            if (fila >= 0) {
                int opcion = JOptionPane.showConfirmDialog(null, "Deseas eliminar menso? ", "Eliminación del registro", JOptionPane.OK_OPTION);
                if (opcion == JOptionPane.OK_OPTION) {
                    codigoPelicula = Integer.parseInt(tblPelicula.getValueAt(fila, 0).toString());
                    PeliculaC peliculaC = new PeliculaC();
                    peliculaC.getPelicula().setIdPeli(codigoPelicula);
                    peliculaC.eliminarPelicula();
                    cargar_Tabla();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnImprimir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimir2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup btnGroupPelicula;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnImprimir2;
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarReg;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevoReg;
    private javax.swing.ButtonGroup btnTipoPelicula;
    public static javax.swing.JComboBox<String> cbGenero;
    public static javax.swing.JComboBox<String> cbIdioma;
    public static javax.swing.JCheckBox chkTodos;
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
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpCRUD;
    private javax.swing.JPanel jpListado;
    private javax.swing.JPanel jpSMneu;
    private javax.swing.JPanel jpSMneu2;
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
    public static javax.swing.JTextField txtDato1;
    public static javax.swing.JTextField txtDuracion;
    public static javax.swing.JTextField txtNombre1;
    // End of variables declaration//GEN-END:variables
}
