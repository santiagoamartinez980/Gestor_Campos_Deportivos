package AdminIGU ;
import IGU.InicioSesion;
import Logica.AdminDAO;
import gestor_campos_deportivos.Administrador;
import javax.swing.JOptionPane;

public class MenuAdminEntrada extends javax.swing.JFrame {
    private Administrador admin;
    private String usuario;
    String nombreAdmin;
    String ApellidoAdmin;
    
    
    public MenuAdminEntrada(String usuario) {
        initComponents();
        this.usuario= usuario;
        admin =  AdminDAO.obtenerInfoAdmin(usuario);
        nombreAdmin = admin.getNombre();
        ApellidoAdmin = admin.getApellido();
        lblNombre1.setText(nombreAdmin);
        lblNombre2.setText(nombreAdmin);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        textoplano1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnApartar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblNombre1 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCerrarSssion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setText("HOLA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 75, 40));

        textoplano1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoplano1.setText("Bienvenido a tu administración de campos deportivos ¿Que deseas hacer ?");
        jPanel1.add(textoplano1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 580, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de pantalla 2025-04-30 125417_resized.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 115, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setText("BIENVENIDO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, 37));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de pantalla 2025-05-01 175721_resized.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 22, 60, 56));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/perfil_resized.png"))); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(911, 22, 55, 56));

        btnApartar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ChatGPT Image 15 may 2025, 18_39_35 (1).png"))); // NOI18N
        btnApartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApartarActionPerformed(evt);
            }
        });
        jPanel1.add(btnApartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 140, 140));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1000, 10));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ChatGPT Image 15 may 2025, 18_58_50 (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 140, 140));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ChatGPT Image 15 may 2025, 13_23_58 (1).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 140, 140));

        lblNombre1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblNombre1.setText("jLabel5");
        jPanel1.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 190, -1));

        lblNombre2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre2.setText("jLabel5");
        jPanel1.add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 560, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de pantalla 2025-05-11 191711_resized.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 1000, 100));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, -1, -1));

        btnCerrarSssion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Imagen de WhatsApp 2025-05-19 a las 11.18.50_848f6c55_resized.png"))); // NOI18N
        btnCerrarSssion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSssion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSssionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSssion, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 400, 70, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        JOptionPane.showMessageDialog(
            null,
            "👋 ¡Bienvenido a *Administrador de Campos Deportivos*! ⚽🏀🎾\n" +
            "Hola " + nombreAdmin+"\n" +
            "En esta pantalla principal puedes realizar acciones clave relacionadas con el manejo de las canchas:\n\n" +
            "📅 Usa los botones disponibles:\n" +
            "   ✅ *Agregar Cancha* → para agregar una nuevo  espacio deportivo\n" +
            "   ❌ *Eliminar Cancha* → si deseas eliminar o borrar una cancha\n" +
            "   📖 *Aculizaar Cancha* → para actualizar los datos o ianformacion delos campos deportivos\n\n" +
            "👤 Puedes acceder a tu perfil o ayuda en la parte superior derecha.\n" +
            "🏟️ ¡La tribuna te espera! Disfruta gestionando tu deporte favorito.\n",
            "Ayuda - Pantalla de Inicio",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        JOptionPane.showMessageDialog(
            null,
            "✅ Información personal \n" +
            "👤 Nombre: " + nombreAdmin + "\n" +
            "👤 Apellidos: " + ApellidoAdmin+ "\n" +
            "🎯          ¡Gracias!\n" ,
            "INFORMACION PERSONAL",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnApartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApartarActionPerformed
        AgregarCanchaIGU panta = new AgregarCanchaIGU(usuario);
        this.dispose();
        panta.setVisible(true);
    }//GEN-LAST:event_btnApartarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EliminarCanchaIGU panta = new EliminarCanchaIGU(usuario);
         this.dispose();
        panta.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         ActualizarCanchaIGU panta = new   ActualizarCanchaIGU (usuario);
        this.dispose();
        panta.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCerrarSssionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSssionActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(
        null,
        "¿Seguro deseas cerrar sesion?\n",
        "Cerrar Sesion",
        JOptionPane.YES_NO_OPTION
    );
        if (confirmacion == JOptionPane.YES_OPTION) {
            this.dispose();
            InicioSesion next = new InicioSesion();
            next.setVisible(true);
        }
    }//GEN-LAST:event_btnCerrarSssionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApartar;
    private javax.swing.JButton btnCerrarSssion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel textoplano1;
    // End of variables declaration//GEN-END:variables
}
