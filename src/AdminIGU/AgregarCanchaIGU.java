package AdminIGU;
import Logica.AdminDAO;
import gestor_campos_deportivos.Campos_Deportivos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.UUID;



import javax.swing.JOptionPane;


public class AgregarCanchaIGU extends javax.swing.JFrame {
    String usuario;
    public AgregarCanchaIGU(String usuario) {
        initComponents();
        this.usuario= usuario;
        this.setLocationRelativeTo(null);
        lblVacios.setVisible(false);
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreCampo = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblVacios = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ListaTechado = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ListaTipo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        ListaEstado = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtUrl = new javax.swing.JTextField();

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

        jLabel3.setText("Ubicacion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 51, 102));
        jLabel1.setForeground(new java.awt.Color(255, 102, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ChatGPT Image 15 may 2025, 21_03_59 (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 290, 470));

        jLabel5.setText("<html>Nombre del <p> campo<html>");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 90, -1));
        jPanel1.add(txtNombreCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 130, -1));
        jPanel1.add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 140, -1));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 140, -1));

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("MS UI Gothic", 2, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CONTINUAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

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
        jPanel1.add(lblVacios, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 204));
        jLabel16.setText("Informacion del Campo Deportivo");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLabel10.setText("Techado");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

        ListaTechado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciona una opcion--", "Sí", "No " }));
        ListaTechado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaTechadoActionPerformed(evt);
            }
        });
        jPanel1.add(ListaTechado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 140, -1));

        jLabel15.setText("<html>Precio por<p> Hora<html>");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 100, 40));

        jLabel17.setText("Tipo de Deporte");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 90, 20));

        ListaTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciona una opcion--", "Fútbol 5", "Baloncesto", "Tenis" }));
        ListaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaTipoActionPerformed(evt);
            }
        });
        jPanel1.add(ListaTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 130, -1));

        jLabel11.setText("<html>Foto del <p>Campo<html>");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 90, -1));

        ListaEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciona una opcion--", "Disponible", "No Disponible" }));
        ListaEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(ListaEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 130, -1));

        jLabel12.setText("Estado");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        txtUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUrlActionPerformed(evt);
            }
        });
        jPanel1.add(txtUrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 350, -1));

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
        
        String nombre = txtNombreCampo.getText(); 
        String ubicacion = txtUbicacion.getText();
        String strPrecio = txtPrecio.getText();
        int precio = Integer.parseInt(strPrecio);
        String urlFoto = txtUrl.getText();
        String tipoDeporte = ListaTipo.getSelectedItem().toString();
        String techado = ListaTechado.getSelectedItem().toString();
        String estado = ListaEstado.getSelectedItem().toString();
        
         
        if (txtUrl.getText().isEmpty()||
        txtNombreCampo.getText().isEmpty() || 
        txtUbicacion.getText().isEmpty() || 
        txtPrecio.getText().isEmpty()||
        ListaTipo.getSelectedIndex() == 0||
        ListaTechado.getSelectedIndex() == 0||
        ListaEstado.getSelectedIndex() == 0) {
        
            lblVacios.setVisible(true);
        
        } else {
            
                    
            Campos_Deportivos campo = new Campos_Deportivos(nombre, tipoDeporte, ubicacion, precio, estado, techado, urlFoto  );
            AdminDAO.agregarCampo(campo);
          
        }
        
         MenuAdminEntrada inicio = new MenuAdminEntrada("");
                inicio.setVisible(true);
                this.dispose(); // Cierra la 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        MenuAdminEntrada back = new MenuAdminEntrada(usuario);
        back.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ListaTechadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaTechadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaTechadoActionPerformed

    private void ListaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaTipoActionPerformed

    private void ListaEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaEstadoActionPerformed

    private void txtUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUrlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUrlActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ListaEstado;
    private javax.swing.JComboBox<String> ListaTechado;
    private javax.swing.JComboBox<String> ListaTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblVacios;
    private javax.swing.JTextField txtNombreCampo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtUbicacion;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables
}
