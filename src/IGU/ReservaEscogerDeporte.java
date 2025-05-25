
package IGU;

import Logica.ClientesDAO;
import gestor_campos_deportivos.Clientes;
import javax.swing.JOptionPane;

public class ReservaEscogerDeporte extends javax.swing.JFrame {
    private String usuario;
    private Clientes cliente;
    
    public ReservaEscogerDeporte(String usuario) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.usuario= usuario;
        cliente = ClientesDAO.obtenerDatosClientes(usuario);
        lblNombre.setText(cliente.getNombre());
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnTenis = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("deseas practicar?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, 37));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblNombre.setText("jLabel5");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 49, 140, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 3, 24)); // NOI18N
        jLabel5.setText("HOLA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 75, 37));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de pantalla 2025-04-30 125417_resized.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 115, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/perfil_resized.png"))); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 55, 56));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de pantalla 2025-05-01 175721_resized.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 60, 56));

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("MS UI Gothic", 2, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Flecha roja sobre fondo blanco_resized.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 60, 60));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1000, 10));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1000, 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("¿Que deporte");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnFutbol_resized.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 100, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnBaloncesto_resized.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 430, 110, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Niño jugando baloncesto al aire libre_resized.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 321, -1));

        btnTenis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnTenis_resized.png"))); // NOI18N
        btnTenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTenisActionPerformed(evt);
            }
        });
        jPanel2.add(btnTenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 100, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Jugador de tenis en acción_resized.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 0, 333, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Niño jugando al fútbol en el campo_resized.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 333, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    JOptionPane.showMessageDialog(
        null,
        "✅ Información personal \n" +
        "👤 Nombre: " + cliente.getNombre() + "\n" +
        "👤 Apellidos: " + cliente.getApellidos()+ "\n" +        
        "📧 Correo: " + cliente.getCorreo() + "\n" +
        "📱 Teléfono: " + cliente.getTelefono() + "\n\n" +
        "🎯          ¡Gracias!\n" ,
        "INFORMACION PERSONAL",
        JOptionPane.INFORMATION_MESSAGE
    );
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    
        JOptionPane.showMessageDialog(
        null,
        "ℹ️ ¡Bienvenido a *Gestor Campos Deportivos*! ⚽🏀🎾\n\n" +
        "👋 Hola " + cliente.getNombre() + ",\n" +
        "Aquí puedes elegir qué deporte deseas practicar hoy.\n\n" +
        "👉 Usa los botones debajo de cada imagen para elegir:\n" +
        "   • Fútbol (izquierda)\n" +
        "   • Tenis (centro)\n" +
        "   • Baloncesto (derecha)\n\n" +
        "🧾 También puedes acceder a info personal desde el botón de la derecha superior.\n\n" +
        "¡Diviértete y disfruta del deporte! 💪",
        "Ayuda de uso",
        JOptionPane.INFORMATION_MESSAGE
    );
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MenuUsuarioEntrada back = new MenuUsuarioEntrada(usuario);
        this.dispose();
        back.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String tipoDeporte = "Fútbol 5";
        OpcionDeCampoIGU next = new OpcionDeCampoIGU(tipoDeporte, usuario);
        this.dispose();
        next.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTenisActionPerformed
        String tipoDeporte= "Tenis";
        OpcionDeCampoIGU next = new OpcionDeCampoIGU(tipoDeporte, usuario);
        next.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTenisActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String tipoDeporte= "Baloncesto";
        OpcionDeCampoIGU next = new OpcionDeCampoIGU(tipoDeporte, usuario);
        next.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTenis;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
