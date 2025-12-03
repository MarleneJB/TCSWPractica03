/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.uv.tcswpractica03;

import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author meli
 */
public class Vista extends javax.swing.JFrame {

    private static final Logger logger = Logger.getLogger(Vista.class.getName());

    private DAOEmpleado daoEmpleado;
    private boolean editando = false;
    private Long idEmpleadoEditando = null;

    public Vista() {
        initComponents();
        daoEmpleado = new DAOEmpleado();
        Tabla.setDefaultEditor(Object.class, null);
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("Nombre:");
        jLabel2.setText("Direccion:");
        jLabel3.setText("Telefono:");

        txtNombre.addActionListener(evt -> txtNombreActionPerformed(evt));
        txtTelefono.addActionListener(evt -> txtTelefonoActionPerformed(evt));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(evt -> btnGuardarActionPerformed(evt));

        btnListar.setText("Listar");
        btnListar.addActionListener(evt -> btnListarActionPerformed(evt));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(evt -> btnEditarActionPerformed(evt));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(evt -> btnEliminarActionPerformed(evt));

        btnOk.setText("Limpiar");
        btnOk.addActionListener(evt -> btnOkActionPerformed(evt));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnOk)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(txtNombre,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 148,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnGuardar)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnEliminar))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtDireccion,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                148,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtTelefono,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                148,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnListar)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnEditar)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(39, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnGuardar)
                                        .addComponent(btnEliminar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(btnListar)
                                        .addComponent(btnEditar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addComponent(btnOk)
                                .addGap(21, 21, 21)));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Clave", "Nombre", "Dirección", "Telefono"
                }));
        jScrollPane2.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(257, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>                        

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {
        logger.fine("txtNombreActionPerformed triggered: " + evt.getActionCommand());
    }

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {
        logger.fine("txtTelefonoActionPerformed triggered: " + evt.getActionCommand());
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        logger.info("Botón Guardar presionado: " + evt.getActionCommand());
        try {
            if (txtNombre.getText().trim().isEmpty() ||
                    txtDireccion.getText().trim().isEmpty() ||
                    txtTelefono.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (editando) {
                Empleados empleado = new Empleados();
                empleado.setNombre(txtNombre.getText().trim());
                empleado.setDireccion(txtDireccion.getText().trim());
                empleado.setTelefono(txtTelefono.getText().trim());

                Empleados resultado = daoEmpleado.update(empleado, idEmpleadoEditando);
                if (resultado != null) {
                    logger.info("Empleado actualizado: " + empleado.getNombre());
                    JOptionPane.showMessageDialog(this, "Empleado actualizado exitosamente",
                            "Exito", JOptionPane.INFORMATION_MESSAGE);
                    limpiarCampos();
                    listarEmpleados();
                } else {
                    logger.warning("Error al actualizar empleado");
                    JOptionPane.showMessageDialog(this, "Error al actualizar el empleado",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                Empleados empleado = new Empleados();
                empleado.setNombre(txtNombre.getText().trim());
                empleado.setDireccion(txtDireccion.getText().trim());
                empleado.setTelefono(txtTelefono.getText().trim());

                boolean creado = daoEmpleado.create(empleado);
                if (creado) {
                    logger.info("Empleado creado: " + empleado.getNombre());
                    JOptionPane.showMessageDialog(this, "Empleado creado exitosamente",
                            "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    limpiarCampos();
                    listarEmpleados();
                } else {
                    logger.warning("Error al crear empleado");
                    JOptionPane.showMessageDialog(this, "Error al crear el empleado",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error en btnGuardarActionPerformed", e);
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {
        logger.info("Botón Listar presionado: " + evt.getActionCommand());
        listarEmpleados();
    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {
        logger.info("Botón Editar presionado: " + evt.getActionCommand());
        int filaSeleccionada = Tabla.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un empleado de la tabla para editar",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
            Long clave = (Long) modelo.getValueAt(filaSeleccionada, 0);
            Empleados empleadoEncontrado = daoEmpleado.findById(clave);

            if (empleadoEncontrado != null) {
                txtNombre.setText(empleadoEncontrado.getNombre());
                txtDireccion.setText(empleadoEncontrado.getDireccion());
                txtTelefono.setText(empleadoEncontrado.getTelefono());

                editando = true;
                idEmpleadoEditando = empleadoEncontrado.getClave();
                btnGuardar.setText("Actualizar");

                logger.info("Empleado cargado para edición: " + empleadoEncontrado.getNombre());
                JOptionPane.showMessageDialog(this, "Empleado cargado para edición",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                logger.warning("Empleado no encontrado");
                JOptionPane.showMessageDialog(this, "No se pudo encontrar el empleado",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error en btnEditarActionPerformed", e);
            JOptionPane.showMessageDialog(this, "Error al cargar empleado: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {
        logger.info("Botón Limpiar presionado: " + evt.getActionCommand());
        limpiarCampos();
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        logger.info("Botón Eliminar presionado: " + evt.getActionCommand());
        int filaSeleccionada = Tabla.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un empleado de la tabla para eliminar",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
            Long clave = (Long) modelo.getValueAt(filaSeleccionada, 0);

            Empleados empleadoEncontrado = daoEmpleado.findById(clave);

            if (empleadoEncontrado != null) {
                int opcion = JOptionPane.showConfirmDialog(this,
                        "¿Está seguro de que desea eliminar el empleado:\n" +
                                "Nombre: " + empleadoEncontrado.getNombre() + "\n" +
                                "Dirección: " + empleadoEncontrado.getDireccion() + "\n" +
                                "Teléfono: " + empleadoEncontrado.getTelefono(),
                        "Confirmar Eliminación",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE);

                if (opcion == JOptionPane.YES_OPTION) {
                    Empleados resultado = daoEmpleado.delete(empleadoEncontrado.getClave());

                    if (resultado != null) {
                        logger.info("Empleado eliminado: " + empleadoEncontrado.getNombre());
                        JOptionPane.showMessageDialog(this, "Empleado eliminado exitosamente",
                                "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        listarEmpleados();
                        limpiarCampos();
                    } else {
                        logger.warning("Error al eliminar empleado");
                        JOptionPane.showMessageDialog(this, "Error al eliminar el empleado",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                logger.warning("Empleado no encontrado para eliminar");
                JOptionPane.showMessageDialog(this, "No se pudo encontrar el empleado",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error en btnEliminarActionPerformed", e);
            JOptionPane.showMessageDialog(this, "Error al eliminar empleado: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void listarEmpleados() {
        logger.info("Listando empleados...");
        try {
            List<Empleados> empleados = daoEmpleado.findAll();
            DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
            modelo.setRowCount(0);
            
            //ordenar
            empleados.sort(Comparator.comparing(Empleados::getClave));
            for (Empleados emp : empleados) {
                Object[] fila = {
                        emp.getClave(),
                        emp.getNombre(),
                        emp.getDireccion(),
                        emp.getTelefono()
                };
                modelo.addRow(fila);
            }

            logger.info("Se cargaron " + empleados.size() + " empleados");
            JOptionPane.showMessageDialog(this, "Se cargaron " + empleados.size() + " empleados",
                    "Información", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error al listar empleados", e);
            JOptionPane.showMessageDialog(this, "Error al cargar empleados: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarCampos() {
        logger.info("Limpiando campos");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        editando = false;
        idEmpleadoEditando = null;
        btnGuardar.setText("Guardar");
        Tabla.clearSelection();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Vista().setVisible(true));
    }

    // Variables declaration - do not modify
    public javax.swing.JTable Tabla;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration
}