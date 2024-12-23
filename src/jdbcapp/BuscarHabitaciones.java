package jdbcapp;

import java.sql.Connection;
import java.sql.CallableStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleTypes;
/**
 * Clase BuscarHabitaciones: Panel para gestionar la búsqueda y visualización
 * de habitaciones. Permite buscar habitaciones, crear nuevas y eliminar existentes.
 */
public class BuscarHabitaciones extends javax.swing.JPanel {

    public BuscarHabitaciones() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHabitaciones = new javax.swing.JTable();
        btnBuscar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Habitaciones");

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

        btnBuscar.setBackground(new java.awt.Color(43, 147, 255));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar");

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        btnBorrar.setBackground(new java.awt.Color(43, 147, 255));
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Borrar");

        javax.swing.GroupLayout btnBorrarLayout = new javax.swing.GroupLayout(btnBorrar);
        btnBorrar.setLayout(btnBorrarLayout);
        btnBorrarLayout.setHorizontalGroup(
            btnBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBorrarLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel5)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        btnBorrarLayout.setVerticalGroup(
            btnBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBorrarLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        btnCrear.setBackground(new java.awt.Color(43, 147, 255));
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearMouseClicked(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Crear");

        javax.swing.GroupLayout btnCrearLayout = new javax.swing.GroupLayout(btnCrear);
        btnCrear.setLayout(btnCrearLayout);
        btnCrearLayout.setHorizontalGroup(
            btnCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCrearLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel6)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        btnCrearLayout.setVerticalGroup(
            btnCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCrearLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(306, 306, 306)
                                .addComponent(jLabel1)))
                        .addGap(92, 312, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Acción para buscar habitaciones con su estado de disponibilidad.
     */
    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // Crear conexión a la base de datos
        dbconnection conect = new dbconnection();
        Connection a = conect.conectar();

        try {
            // Llamada al procedimiento almacenado para mostrar las habitaciones
            CallableStatement cs = a.prepareCall("{call procedimiento_mostrar_habitaciones(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeQuery();
            ResultSet rs = (ResultSet) cs.getObject(1);
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.setColumnIdentifiers(new String[]{"Id", "Tipo", "Tarifa", "Estado"});
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getInt("Id"), rs.getString("Tipo"), rs.getDouble("Tarifa"), rs.getString("DISPONIBILIDAD")});
            }
            tblHabitaciones.setModel(dtm);
            rs.close();
            a.close();// Cierra la conexión
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarMouseClicked
    /**
     * Acción para dirigirse a la pestaña de borrar una habitación seleccionada.
     */
    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        BorrarHabitaciones pbh = new BorrarHabitaciones();
        Dashboard.ShowPanel(pbh);
    }//GEN-LAST:event_btnBorrarMouseClicked
    /**
     * Acción para dirigirse a la pestaña de crear una nueva habitación.
     */
    private void btnCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseClicked
        CrearHabitaciones pch = new CrearHabitaciones();
        Dashboard.ShowPanel(pch);
    }//GEN-LAST:event_btnCrearMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBorrar;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHabitaciones;
    // End of variables declaration//GEN-END:variables
}
