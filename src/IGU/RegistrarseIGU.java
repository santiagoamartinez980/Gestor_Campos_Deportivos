package IGU;

import Logica.ClientesDAO;
import gestor_campos_deportivos.Clientes;
import javax.swing.JOptionPane;


public class RegistrarseIGU extends javax.swing.JFrame {

    public RegistrarseIGU() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblVacios.setVisible(false);
        lblValidaCC.setVisible(false);
        lblValidadorUsuario.setVisible(false);
        lblContraseñas.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtClave1 = new javax.swing.JPasswordField();
        txtClave2 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblVacios = new javax.swing.JLabel();
        lblContraseñas = new javax.swing.JLabel();
        lblValidaCC = new javax.swing.JLabel();
        lblValidadorUsuario = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jTextField7.setText("jTextField7");

        jPasswordField1.setText("jPasswordField1");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/titulo_resized.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 198, 130));

        jLabel3.setText("Apellidos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        jLabel4.setText("Numero de ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 70, -1));

        jLabel1.setBackground(new java.awt.Color(255, 51, 102));
        jLabel1.setForeground(new java.awt.Color(255, 102, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ChatGPT Image 1 may 2025, 10_05_34_resized.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 470));

        jLabel5.setText("Nombre (s)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 130, -1));
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 140, -1));

        jLabel6.setText("Identificacion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 80, -1));
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 130, -1));

        jLabel7.setText("Telefono");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 140, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("Registro");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        jLabel9.setText("Correo personal");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, 20));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 130, -1));

        jLabel11.setText("Usuario");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 140, -1));

        jLabel12.setText("Contraseña");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        jLabel13.setText("Repetir ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));
        jPanel1.add(txtClave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 140, -1));
        jPanel1.add(txtClave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 140, -1));

        jLabel14.setText("contraseña");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("MS UI Gothic", 2, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CONTINUAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("MS UI Gothic", 2, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Flecha roja sobre fondo blanco_resized.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 40, 40));

        lblVacios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblVacios.setForeground(new java.awt.Color(255, 51, 51));
        lblVacios.setText("Los campos no pueden estar vacios");
        jPanel1.add(lblVacios, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, 20));

        lblContraseñas.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        lblContraseñas.setForeground(new java.awt.Color(255, 0, 0));
        lblContraseñas.setText("Las contraseñas no son iguales");
        jPanel1.add(lblContraseñas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 130, -1));

        lblValidaCC.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        lblValidaCC.setForeground(new java.awt.Color(255, 0, 0));
        lblValidaCC.setText(" Numero de indentificacion ya en uso");
        jPanel1.add(lblValidaCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 150, -1));

        lblValidadorUsuario.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        lblValidadorUsuario.setForeground(new java.awt.Color(255, 0, 0));
        lblValidadorUsuario.setText("Usuario ya en uso");
        jPanel1.add(lblValidadorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 110, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 204));
        jLabel16.setText("Informacion Personal");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cedula = txtCedula.getText();
        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String telefono = txtTelefono.getText();
        String correo = txtCorreo.getText();
        String usuario = txtUsuario.getText();
        String clave1 = new String(txtClave1.getPassword()); 
        String clave2 = new String(txtClave2.getPassword()); 
        
        if (txtCedula.getText().isEmpty() || 
        txtNombre.getText().isEmpty() || 
        txtApellidos.getText().isEmpty() || 
        txtUsuario.getText().isEmpty() || 
        txtCorreo.getText().isEmpty() || 
        txtTelefono.getText().isEmpty()||
        clave1.isEmpty()||clave2.isEmpty()) {
        lblVacios.setVisible(true);
        
        } else {

        if (clave1.equals(clave2)) {
            
        Clientes persona = new Clientes(cedula, nombre, apellidos, telefono, correo, usuario, clave1);
             boolean cedulaExiste = ClientesDAO.validarCedula(persona);
             boolean usuarioExiste = ClientesDAO.validarExistencia(persona);

            if (!cedulaExiste && !usuarioExiste) {
                lblValidadorUsuario.setVisible(false);
                lblValidaCC.setVisible(false);
                ClientesDAO.registrarCliente(persona);
                JOptionPane.showMessageDialog(null, "✅ Registro exitoso");
                this.dispose();
                MenuUsuarioEntrada next = new MenuUsuarioEntrada(usuario);
                next.setVisible(true);
            } else {

                if (cedulaExiste) {
                    lblValidaCC.setVisible(true);
                } else {
                    lblValidaCC.setVisible(false);
                }

                if (usuarioExiste) {
                    lblValidadorUsuario.setVisible(true);
                } else {
                    lblValidadorUsuario.setVisible(false);
                }}
        } else {
            lblContraseñas.setVisible(true);}}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TipoIngresoIGU back = new TipoIngresoIGU();
        this.dispose();
        back.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblContraseñas;
    private javax.swing.JLabel lblVacios;
    private javax.swing.JLabel lblValidaCC;
    private javax.swing.JLabel lblValidadorUsuario;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtClave1;
    private javax.swing.JPasswordField txtClave2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
