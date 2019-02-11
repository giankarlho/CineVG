package vistas.panels;

import controller.ClienteC;
import dao.ClienteImpl;
import java.sql.Date;
import javax.swing.JOptionPane;
<
import javax.swing.table.DefaultTableModel;



public class ClienteView extends javax.swing.JPanel {

    public static DefaultTableModel modeloTabla;
    public int tipo = 1; //2: nombre , 3: apellido, 1: todos
    public String dato; // contenido del filtro
    ClienteImpl dao;
    private int codigoCliente;

    public ClienteView() throws Exception {
        initComponents();
        btnGroupCliente.add(jrNombre);
        btnGroupCliente.add(jrApellido);
        cargar_Tabla();
    }

    private void cargar_Tabla() throws Exception {
        String columna[] = new String[]{"Código", "Nombre", "Apellido", "Nacimiento"};
        modeloTabla = new DefaultTableModel(null, columna);
        dao = new ClienteImpl();
        dao.buscar(modeloTabla, tipo, dato);
        tblCliente.setModel(modeloTabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupCliente = new javax.swing.ButtonGroup();
        jpCRUD = new javax.swing.JPanel();
        jpSMneu = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnListado = new javax.swing.JButton();
        btnModificarReg = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtApe = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jdNac = new com.toedter.calendar.JDateChooser();
        jpListado = new javax.swing.JPanel();
        jpSMneu1 = new javax.swing.JPanel();
        btnNuevoReg = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        txtDato = new javax.swing.JTextField();
        jrNombre = new javax.swing.JRadioButton();
        jrApellido = new javax.swing.JRadioButton();
        chkTodos = new javax.swing.JCheckBox();

        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setLayout(new java.awt.CardLayout());

        jpCRUD.setBackground(new java.awt.Color(255, 204, 204));
        jpCRUD.setMaximumSize(new java.awt.Dimension(700, 600));
        jpCRUD.setMinimumSize(new java.awt.Dimension(700, 600));
        jpCRUD.setPreferredSize(new java.awt.Dimension(700, 600));

        jpSMneu.setMaximumSize(new java.awt.Dimension(170, 560));
        jpSMneu.setMinimumSize(new java.awt.Dimension(170, 560));
        jpSMneu.setPreferredSize(new java.awt.Dimension(170, 560));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/entrega.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/guardar(1).png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reportar(2).png"))); // NOI18N
        btnListado.setText("Listado");
        btnListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoActionPerformed(evt);
            }
        });

        btnModificarReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reportar(2).png"))); // NOI18N
        btnModificarReg.setText("Modificar");
        btnModificarReg.setEnabled(false);
        btnModificarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarRegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSMneuLayout = new javax.swing.GroupLayout(jpSMneu);
        jpSMneu.setLayout(jpSMneuLayout);
        jpSMneuLayout.setHorizontalGroup(
            jpSMneuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSMneuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSMneuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSMneuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNuevo))
                    .addGroup(jpSMneuLayout.createSequentialGroup()
                        .addGroup(jpSMneuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListado, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarReg, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jpSMneuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnGuardar, btnListado, btnModificarReg, btnNuevo});

        jpSMneuLayout.setVerticalGroup(
            jpSMneuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSMneuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(29, 29, 29)
                .addComponent(btnModificarReg)
                .addGap(143, 143, 143)
                .addComponent(btnListado)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jpSMneuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnGuardar, btnListado, btnModificarReg, btnNuevo});

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Apellido");

        txtApe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nacimiento");

        jdNac.setDateFormatString("dd/mm/yyyy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtApe)
                    .addComponent(txtNom, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(jdNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jdNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpCRUDLayout = new javax.swing.GroupLayout(jpCRUD);
        jpCRUD.setLayout(jpCRUDLayout);
        jpCRUDLayout.setHorizontalGroup(
            jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpSMneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jpCRUDLayout.setVerticalGroup(
            jpCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpSMneu, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(jpCRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jpCRUD, "card2");

        jpListado.setBackground(new java.awt.Color(204, 255, 204));
        jpListado.setMaximumSize(new java.awt.Dimension(700, 600));
        jpListado.setMinimumSize(new java.awt.Dimension(700, 600));
        jpListado.setPreferredSize(new java.awt.Dimension(700, 600));

        jpSMneu1.setMaximumSize(new java.awt.Dimension(170, 560));
        jpSMneu1.setMinimumSize(new java.awt.Dimension(170, 560));

        btnNuevoReg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevoReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/entrega.png"))); // NOI18N
        btnNuevoReg.setText("Nuevo");
        btnNuevoReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoRegActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reportar(2).png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reportar(2).png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSMneu1Layout = new javax.swing.GroupLayout(jpSMneu1);
        jpSMneu1.setLayout(jpSMneu1Layout);
        jpSMneu1Layout.setHorizontalGroup(
            jpSMneu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSMneu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSMneu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSMneu1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNuevoReg))
                    .addGroup(jpSMneu1Layout.createSequentialGroup()
                        .addGroup(jpSMneu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jpSMneu1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEliminar, btnModificar, btnNuevoReg});

        jpSMneu1Layout.setVerticalGroup(
            jpSMneu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSMneu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevoReg)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addGap(29, 29, 29)
                .addComponent(btnEliminar)
                .addContainerGap(301, Short.MAX_VALUE))
        );

        jpSMneu1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEliminar, btnModificar, btnNuevoReg});

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        txtDato.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDatoCaretUpdate(evt);
            }
        });

        jrNombre.setBackground(new java.awt.Color(204, 255, 204));
        jrNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrNombre.setText("Nombre");
        jrNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNombreActionPerformed(evt);
            }
        });

        jrApellido.setBackground(new java.awt.Color(204, 255, 204));
        jrApellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrApellido.setText("Apellido");
        jrApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrApellidoActionPerformed(evt);
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

        javax.swing.GroupLayout jpListadoLayout = new javax.swing.GroupLayout(jpListado);
        jpListado.setLayout(jpListadoLayout);
        jpListadoLayout.setHorizontalGroup(
            jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                    .addGroup(jpListadoLayout.createSequentialGroup()
                        .addComponent(jrNombre)
                        .addGap(18, 18, 18)
                        .addComponent(jrApellido)
                        .addGap(18, 18, 18)
                        .addComponent(chkTodos)
                        .addGap(18, 18, 18)
                        .addComponent(txtDato)))
                .addGap(18, 18, 18)
                .addComponent(jpSMneu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpListadoLayout.setVerticalGroup(
            jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListadoLayout.createSequentialGroup()
                .addGroup(jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpListadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpSMneu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpListadoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrNombre)
                            .addComponent(jrApellido)
                            .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkTodos))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)))
                .addContainerGap())
        );

        add(jpListado, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        ClienteC clienteC = new ClienteC();
        clienteC.limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            ClienteC clienteC = new ClienteC();
            clienteC.variables();
            clienteC.registrarCliente();
            cargar_Tabla();
        } catch (Exception ex) {
            System.out.println("Error en el btnGuardar" + ex.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoRegActionPerformed
        jpCRUD.setVisible(true);
        jpListado.setVisible(false);
    }//GEN-LAST:event_btnNuevoRegActionPerformed

    private void btnListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoActionPerformed
        jpCRUD.setVisible(false);
        jpListado.setVisible(true);
    }//GEN-LAST:event_btnListadoActionPerformed

    private void jrNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNombreActionPerformed
        tipo = 2;
        chkTodos.setSelected(false);
    }//GEN-LAST:event_jrNombreActionPerformed

    private void jrApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrApellidoActionPerformed
        tipo = 3;
        chkTodos.setSelected(false);
    }//GEN-LAST:event_jrApellidoActionPerformed

    private void txtDatoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDatoCaretUpdate
        try {
            dato = txtDato.getText();
            cargar_Tabla();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_txtDatoCaretUpdate

    private void chkTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTodosActionPerformed

        try {
            if (chkTodos.isSelected() == true) {
                btnGroupCliente.clearSelection();
                tipo = 1;
                cargar_Tabla();
                txtDato.setText("");
            }
        } catch (Exception ex) {
            ex.getMessage();
        }

    }//GEN-LAST:event_chkTodosActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        try {
            int fila = tblCliente.getSelectedRow();
            if (fila >= 0) {
                btnModificar.setEnabled(true);
                btnEliminar.setEnabled(true);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tblClienteMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            int fila = tblCliente.getSelectedRow();
            if (fila >= 0) {
                codigoCliente = Integer.parseInt(tblCliente.getValueAt(fila, 0).toString());
                txtNom.setText(tblCliente.getValueAt(fila, 1).toString());
                txtApe.setText(tblCliente.getValueAt(fila, 2).toString());
                jdNac.setDate(Date.valueOf(tblCliente.getValueAt(fila, 3).toString());
                btnEliminarReg.setEnabled(true);
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

    private void btnModificarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarRegActionPerformed
        try {
            int opcion = JOptionPane.showConfirmDialog(null, "Deseas modificar? ", "Modificación del registro", JOptionPane.OK_OPTION);
            if (opcion == JOptionPane.OK_OPTION) {
                ClienteC clienteC = new ClienteC();
                clienteC.getCliente().setIdCli(codigoCliente);
                clienteC.variables();
                clienteC.modificarCliente();
                cargar_Tabla();
                JOptionPane.showMessageDialog(null,"Registro modificado");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnModificarRegActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int fila = tblCliente.getSelectedRow();
            if (fila >= 0) {
                int opcion = JOptionPane.showConfirmDialog(null, "Deseas eliminar menso? ", "Eliminación del registro", JOptionPane.OK_OPTION);
                if (opcion == JOptionPane.OK_OPTION) {
                    codigoCliente = Integer.parseInt(tblCliente.getValueAt(fila, 0).toString());
                    ClienteC clienteC = new ClienteC();
                    clienteC.getCliente().setIdCli(codigoCliente);
                    clienteC.eliminarCliente();
                    cargar_Tabla();
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup btnGroupCliente;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarReg;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevoReg;
    private javax.swing.JCheckBox chkTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static com.toedter.calendar.JDateChooser jdNac;
    private javax.swing.JPanel jpCRUD;
    private javax.swing.JPanel jpListado;
    private javax.swing.JPanel jpSMneu;
    private javax.swing.JPanel jpSMneu1;
    private javax.swing.JRadioButton jrApellido;
    private javax.swing.JRadioButton jrNombre;
    public static javax.swing.JTable tblCliente;
    public static javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtDato;
    public static javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
