package IGU;

import AdminIGU.MenuAdminEntrada;
import IGU.MenuUsuarioEntrada;
import Logica.AdminDAO;
import static Logica.ClientesDAO.inisioSesion;
import static Logica.ClientesDAO.obtenerContraseñaPorUser;
import static Seguridad.Seguridad.verificarPassword;
import gestor_campos_deportivos.Administrador;
import javax.swing.JOptionPane;

public class InicioSesion extends javax.swing.JFrame {

    public InicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblErrorContraUser.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnInicioSesion = new javax.swing.JButton();
        btnRegistrarte = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblErrorContraUser = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("MS UI Gothic", 2, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Flecha roja sobre fondo blanco_resized.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Niño jugando al tenis en arcilla_resized.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/titulo_resized.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 190, 142));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 182, 319, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 160, 51, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Contraseña");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 235, 70, -1));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 257, 319, -1));

        btnInicioSesion.setBackground(new java.awt.Color(153, 255, 153));
        btnInicioSesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnInicioSesion.setText("Continuar");
        btnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 130, -1));

        btnRegistrarte.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrarte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarte.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarte.setText("Registrate");
        btnRegistrarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarteActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarte, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 395, 160, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("¿No tienes cuenta?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 367, 117, -1));

        lblErrorContraUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblErrorContraUser.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorContraUser.setText("Usuario o contraseña Incorrectos");
        jPanel1.add(lblErrorContraUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("MS UI Gothic", 2, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Flecha roja sobre fondo blanco_resized.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 40, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 10, 470));

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

    private void btnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSesionActionPerformed
        String usuario = txtUsuario.getText();
        String clave = new String(txtContraseña.getPassword());

        // Primero verifica si es ADMINISTRADOR
        Administrador admin = AdminDAO.obtenerInfoAdmin(usuario);
        String contraseña = admin.getContraseña();
        if (contraseña != null) {
            if (clave.equals(contraseña)) {
                JOptionPane.showMessageDialog(null, "👮‍♂ Administrador autenticado correctamente");
                this.dispose();
                MenuAdminEntrada adminMenu = new MenuAdminEntrada(usuario); // ventana para administradores
                adminMenu.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "❌ Contraseña incorrecta ");
            }
        } else {
            // Si no es admin, verificar como cliente
            String passUsuario = obtenerContraseñaPorUser(usuario);
            if (passUsuario != null) {
                if (verificarPassword(clave, passUsuario)) {
                    if (inisioSesion(usuario, passUsuario)) {
                        JOptionPane.showMessageDialog(null, "✅ Usuario encontrado");
                        this.dispose();
                        MenuUsuarioEntrada next = new MenuUsuarioEntrada(usuario);
                        next.setVisible(true);
                    } else {
                        lblErrorContraUser.setVisible(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "❌ Contraseña incorrecta (usuario)");}
            
            } else {
                JOptionPane.showMessageDialog(null, "❓❔❓ ¿Seguro que tienes cuenta? ❓❔❓");}
        }

        
        
    }//GEN-LAST:event_btnInicioSesionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TipoIngresoIGU back = new TipoIngresoIGU();
        this.dispose();
        back.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnRegistrarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarteActionPerformed
        RegistrarseIGU registro = new RegistrarseIGU();
        registro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicioSesion;
    private javax.swing.JButton btnRegistrarte;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblErrorContraUser;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
