package jdbcapp;

import java.awt.BorderLayout;
import javax.swing.JPanel;
/**
 * Clase Dashboard que actúa como marco principal de la aplicación.
 * Contiene un panel de navegación lateral y un área de contenido para mostrar diferentes vistas.
 */
public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        BuscarHabitaciones p1 = new BuscarHabitaciones();
        ShowPanel( p1);
    }
    
    public static void ShowPanel (JPanel p){
        p.setSize(765, 599);
        p.setLocation(0, 0);
        Content.removeAll();
        Content.add(p, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        Content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnHabitaciones = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnReservas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(1032, 640));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        Bg.setBackground(new java.awt.Color(0, 102, 255));

        Content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JDBCAPP");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setAlignmentY(1.0F);
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jSeparator1.setOpaque(true);

        btnHabitaciones.setBackground(new java.awt.Color(43, 147, 255));
        btnHabitaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHabitacionesMouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Habitaciones");

        javax.swing.GroupLayout btnHabitacionesLayout = new javax.swing.GroupLayout(btnHabitaciones);
        btnHabitaciones.setLayout(btnHabitacionesLayout);
        btnHabitacionesLayout.setHorizontalGroup(
            btnHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHabitacionesLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnHabitacionesLayout.setVerticalGroup(
            btnHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHabitacionesLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(14, 14, 14))
        );

        btnReservas.setBackground(new java.awt.Color(43, 147, 255));
        btnReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReservasMouseClicked(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reservas");

        javax.swing.GroupLayout btnReservasLayout = new javax.swing.GroupLayout(btnReservas);
        btnReservas.setLayout(btnReservasLayout);
        btnReservasLayout.setHorizontalGroup(
            btnReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReservasLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnReservasLayout.setVerticalGroup(
            btnReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReservasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BgLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BgLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(355, Short.MAX_VALUE))
            .addComponent(Content, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(Bg, new java.awt.GridBagConstraints());

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Acción para dirigirse a la pestaña de buscar habitaciones disponibles.
     */
    private void btnHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionesMouseClicked
        BuscarHabitaciones pbh = new BuscarHabitaciones();
        ShowPanel(pbh);
    }//GEN-LAST:event_btnHabitacionesMouseClicked
    /**
     * Acción para dirigirse a la pestaña de reservar una habitación.
     */
    private void btnReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservasMouseClicked
        Reservas pr = new Reservas();
        ShowPanel(pr);
    }//GEN-LAST:event_btnReservasMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private static javax.swing.JPanel Content;
    private javax.swing.JPanel btnHabitaciones;
    private javax.swing.JPanel btnReservas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
