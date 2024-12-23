package jdbcapp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleTypes;

/**
 * Panel de reservas con funcionalidad para consultar habitaciones disponibles,
 * crear una reserva y registrar información del huésped.
 */

public class Reservas extends javax.swing.JPanel {

    public Reservas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnReserva = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHabitaciones = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdHabitacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreHuesped = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdHuesped = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtApellidoHuesped = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTelHuesped = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCorreoHuesped = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Reservas");

        btnReserva.setBackground(new java.awt.Color(43, 147, 255));
        btnReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReservaMouseClicked(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reservar");

        javax.swing.GroupLayout btnReservaLayout = new javax.swing.GroupLayout(btnReserva);
        btnReserva.setLayout(btnReservaLayout);
        btnReservaLayout.setHorizontalGroup(
            btnReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReservaLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel3)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        btnReservaLayout.setVerticalGroup(
            btnReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReservaLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        tblHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblHabitaciones);

        jPanel2.setBackground(new java.awt.Color(43, 147, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Consultar Habitaciones Disponibles");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jLabel5.setText("Id de la Habitación");

        jLabel2.setText("Nombre del huesped");

        jLabel6.setText("Id del huesped");

        jLabel7.setText("Apellido del huesped");

        jLabel9.setText("Teléfono");

        jLabel8.setText("Correo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(334, 334, 334))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelHuesped)
                                    .addComponent(txtApellidoHuesped, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNombreHuesped, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIdHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCorreoHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(txtCorreoHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtApellidoHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTelHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Evento para gestionar la acción de mostrar las habitaciones disponibles
    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // Crear conexión a la base de datos
        dbconnection conect = new dbconnection();
        Connection a = conect.conectar();

        try {
            // Llamada al procedimiento almacenado para mostrar habitaciones disponibles
            CallableStatement cs = a.prepareCall("{call procedimiento_mostrar_habitaciones_disponibles(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeQuery();
            ResultSet rs = (ResultSet) cs.getObject(1);

            DefaultTableModel dtm = new DefaultTableModel();
            dtm.setColumnIdentifiers(new String[]{"id", "Tipo", "Tarifa", "Estado"});
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getInt("Id"), rs.getString("Tipo"), rs.getDouble("Tarifa"), rs.getString("DISPONIBILIDAD")});
            }
            tblHabitaciones.setModel(dtm);
            rs.close();
            a.close(); // Cierra la conexión
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jPanel2MouseClicked
    
// Evento para gestionar la acción de reservar una habitación
    private void btnReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservaMouseClicked
        // Crear conexión a la base de datos
        dbconnection conect = new dbconnection();
        Connection a = conect.conectar();

        try {
            // Llamada al procedimiento almacenado para crear una reserva
            CallableStatement cs = a.prepareCall("{call procedimiento_crear_reserva (?,?,?,?)}");

            cs.setInt(1, Integer.parseInt(txtIdHuesped.getText()));
            cs.setInt(2, Integer.parseInt(txtIdHabitacion.getText()));
            cs.setInt(3, Integer.parseInt(txtIdHabitacion.getText()));
            cs.setDouble(4, Double.parseDouble(txtIdHabitacion.getText()));
            cs.executeQuery();
            // Llamada al procedimiento almacenado para crear un huesped en la base de datos
            CallableStatement cs2 = a.prepareCall("{call procedimiento_crear_huesped (?,?,?,?,?)}");

            cs2.setInt(1, Integer.parseInt(txtIdHuesped.getText()));
            cs2.setString(2, txtNombreHuesped.getText());
            cs2.setString(3, txtApellidoHuesped.getText());
            cs2.setString(4, txtCorreoHuesped.getText());
            cs2.setString(5, txtTelHuesped.getText());

            cs2.executeQuery();

            CallableStatement cs3 = a.prepareCall("{call Actualizar_disponibilidad_habitacion (?)}");

            cs3.setInt(1, Integer.parseInt(txtIdHabitacion.getText()));
            cs3.executeQuery();
            a.close(); //Cierra la conexión
            //Mensaje de éxito
            JOptionPane.showMessageDialog(null, "Reserva creada correctamente");
            //Limpia los campos de texto
            txtIdHabitacion.setText("");
            txtIdHuesped.setText("");
            txtNombreHuesped.setText("");
            txtApellidoHuesped.setText("");
            txtCorreoHuesped.setText("");
            txtTelHuesped.setText("");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btnReservaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHabitaciones;
    private javax.swing.JTextField txtApellidoHuesped;
    private javax.swing.JTextField txtCorreoHuesped;
    private javax.swing.JTextField txtIdHabitacion;
    private javax.swing.JTextField txtIdHuesped;
    private javax.swing.JTextField txtNombreHuesped;
    private javax.swing.JTextField txtTelHuesped;
    // End of variables declaration//GEN-END:variables
}
