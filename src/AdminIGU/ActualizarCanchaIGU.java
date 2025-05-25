package AdminIGU;


import IGU.*;
import Persistencia.Persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.swing.JOptionPane;

public class ActualizarCanchaIGU extends javax.swing.JFrame {
    
   private String usuario;
    
    public ActualizarCanchaIGU(String usuario) {
        initComponents();
        this.usuario= usuario;
        this.setLocationRelativeTo(null);
        ListaCanchas.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        txtNombreCampo.setVisible(false);
            txtUbicacion.setVisible(false);
            ListaTipo.setVisible(false);
            ListaEstado.setVisible(false);
            ListaTechado.setVisible(false);
            txtUrl.setVisible(false);
            txtPrecio.setVisible(false);
            jLabel8.setVisible(false);
            jLabel6.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            jLabel12.setVisible(false);
            jLabel15.setVisible(false);
            jLabel17.setVisible(false);
           
            
            
       
        
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ListaCanchas = new javax.swing.JComboBox<>();
        txtUbicacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombreCampo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        ListaTipo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ListaEstado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        ListaTechado = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtUrl = new javax.swing.JTextField();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/titulo_resized.png"))); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de pantalla 2025-05-01 175721_resized.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cargar Canchas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 160, 30));

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Actualizar");
        jButton2.setActionCommand("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 140, -1));

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("MS UI Gothic", 2, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Flecha roja sobre fondo blanco_resized.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 40, 40));

        jButton3.setBackground(new java.awt.Color(0, 153, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Ok");
        jButton3.setActionCommand("Confirmar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 140, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/titulo_resized.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 190, 140));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ChatGPT Image 16 may 2025, 21_57_58 (1).png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 380, 530));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 10, 530));

        ListaCanchas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ListaCanchas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaCanchasActionPerformed(evt);
            }
        });
        jPanel3.add(ListaCanchas, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 150, -1));
        jPanel3.add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 140, -1));

        jLabel6.setText("Ubicacion");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, 20));

        jLabel8.setText("<html>Nombre del <p>     campo<html>");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 100, 20));
        jPanel3.add(txtNombreCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 130, -1));

        jLabel17.setText("<html>Tipo de <p> Deporte<html>");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 90, 30));

        ListaTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciona una opcion--", "Fútbol 5", "Baloncesto", "Tenis" }));
        ListaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaTipoActionPerformed(evt);
            }
        });
        jPanel3.add(ListaTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 130, -1));

        jLabel15.setText("<html>Precio por<p>      Hora<html>");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 100, 40));
        jPanel3.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 140, -1));

        jLabel12.setText("Estado");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 40, -1));

        ListaEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "No Disponible" }));
        ListaEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaEstadoActionPerformed(evt);
            }
        });
        jPanel3.add(ListaEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 130, -1));

        jLabel10.setText("Techado");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, -1, -1));

        ListaTechado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No " }));
        ListaTechado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaTechadoActionPerformed(evt);
            }
        });
        jPanel3.add(ListaTechado, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 140, -1));

        jLabel11.setText("<html>Foto del <p>Campo<html>");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 80, -1));

        txtUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUrlActionPerformed(evt);
            }
        });
        jPanel3.add(txtUrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 350, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   try {
       Connection conexion = Persistencia.conectar();

        
        String sql = "SELECT nombre FROM campos_deportivos";
        PreparedStatement stmt = conexion.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        
        ListaCanchas.removeAllItems();

        
        while (rs.next()) {
            String nombre = rs.getString("nombre");
            ListaCanchas.addItem(nombre);
        }

        
        rs.close();
        stmt.close();
        conexion.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "No se encontró el Driver JDBC: " + e.getMessage());
    }
   jButton1.setVisible(false);
   jButton2.setVisible(true);
   jButton3.setVisible(true);
   ListaCanchas.setVisible(true);

        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nombreOriginal;
        String nuevoNombre;
        String tipoDeporte;
        String ubicacion;
        String precio;
        String estado;
        String techado;
        String urlFoto;
        
        nombreOriginal = (String) ListaCanchas.getSelectedItem(); // nombre actual desde la lista
        nuevoNombre = txtNombreCampo.getText();
        tipoDeporte = (String) ListaTipo.getSelectedItem();
        ubicacion = txtUbicacion.getText();
        precio = txtPrecio.getText();
        estado = (String) ListaEstado.getSelectedItem();
        techado = (String) ListaTechado.getSelectedItem();

        if ("--Selecciona una opcion--".equals(techado) || "--Selecciona una opcion--".equals(estado)) {
            JOptionPane.showMessageDialog(null, "Ingrese valor en Estado o techado");

        }
        urlFoto = txtUrl.getText();
        
    try {
        Connection conexion = Persistencia.conectar();

        String sql = "UPDATE campos_deportivos SET nombre = ?, tipoDeporte = ?, ubicacion = ?, precioPorHora = ?, estado = ?, techado = ?, urlFoto = ? WHERE nombre = ?";
        PreparedStatement stmt = conexion.prepareStatement(sql);

        stmt.setString(1, nuevoNombre);
        stmt.setString(2, tipoDeporte);
        stmt.setString(3, ubicacion);
        stmt.setString(4, precio);
        stmt.setString(5, estado);
        stmt.setString(6, techado);
        stmt.setString(7, urlFoto);
        stmt.setString(8, nombreOriginal); // WHERE condición

        int filas = stmt.executeUpdate();

        if (filas > 0) {
            JOptionPane.showMessageDialog(null, "Cancha actualizada correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar la cancha.");
        }

        stmt.close();
        conexion.close();

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al actualizar la cancha.");
    }
    
     MenuAdminEntrada inicio = new MenuAdminEntrada(usuario);
                inicio.setVisible(true);
                this.dispose(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MenuAdminEntrada back = new MenuAdminEntrada(usuario);
        back.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void ListaCanchasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaCanchasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaCanchasActionPerformed

    private void ListaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaTipoActionPerformed

    private void ListaEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaEstadoActionPerformed

    private void ListaTechadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaTechadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaTechadoActionPerformed

    private void txtUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUrlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUrlActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String nombreSeleccionado = (String) ListaCanchas.getSelectedItem();

    try {
        Connection conexion = Persistencia.conectar();

        String sql = "SELECT * FROM campos_deportivos WHERE nombre = ?";
        PreparedStatement stmt = conexion.prepareStatement(sql);
        stmt.setString(1, nombreSeleccionado);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            txtNombreCampo.setText(rs.getString("nombre"));
            txtUbicacion.setText(rs.getString("ubicacion"));
            ListaTipo.setSelectedItem(rs.getString("tipoDeporte"));
            ListaEstado.setSelectedItem(rs.getString("estado"));
            ListaTechado.setSelectedItem(rs.getString("techado"));
            txtUrl.setText(rs.getString("urlFoto"));
            txtPrecio.setText(rs.getString("precioPorHora"));
        }

        rs.close();
        stmt.close();
        conexion.close();

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al cargar datos.");
    }
    
    jButton2.setVisible(true);
        txtNombreCampo.setVisible(true);
            txtUbicacion.setVisible(true);
            ListaTipo.setVisible(true);
            ListaEstado.setVisible(true);
            ListaTechado.setVisible(true);
            txtUrl.setVisible(true);
            txtPrecio.setVisible(true);
            jLabel8.setVisible(true);
            jLabel6.setVisible(true);
            jLabel10.setVisible(true);
            jLabel11.setVisible(true);
            jLabel12.setVisible(true);
            jLabel15.setVisible(true);
            jLabel17.setVisible(true);
    

    }//GEN-LAST:event_jButton3ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ListaCanchas;
    private javax.swing.JComboBox<String> ListaEstado;
    private javax.swing.JComboBox<String> ListaTechado;
    private javax.swing.JComboBox<String> ListaTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtNombreCampo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtUbicacion;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables
}
