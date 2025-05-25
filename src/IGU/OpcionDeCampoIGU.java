package IGU;

import Logica.CamposDAO;
import Logica.ClientesDAO;
import gestor_campos_deportivos.Campos_Deportivos;
import gestor_campos_deportivos.Clientes;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class OpcionDeCampoIGU extends javax.swing.JFrame {
    String tipoDeporte;
    private String usuario;
    private Clientes cliente;
    private Campos_Deportivos campo;
    
    public OpcionDeCampoIGU(String tipoDeporte, String usuario) {
        initComponents();
            CamposDAO.llenarComboCampo(tipoDeporte, ListaCampos);
            this.setLocationRelativeTo(null);
            this.usuario= usuario;
            cliente = ClientesDAO.obtenerDatosClientes(usuario);
            lblNombre.setText(cliente.getNombre());
            String seleccion = ListaCampos.getSelectedItem().toString();
            campo = CamposDAO.obtenerInfoPorNombre(seleccion);
            
            lblNombre.setText(cliente.getNombre());
            
            lblName.setText(campo.getNombre());
            lblTipo.setText(campo.getTipoDeporte());
            lblUbicacion.setText(campo.getUbicacion());
            lblPrecio.setText(String.valueOf(campo.getPrecioPorHora()));
            lblEstado.setText(campo.getEstado());
            
            lblName.setVisible(false);
            lblTipo.setVisible(false);
            lblUbicacion.setVisible(false);
            lblPrecio.setVisible(false);
            lblTechado.setVisible(false);
            lblRepre.setVisible(false); 
            lblEstado.setVisible(false);
            
            String icono = "C:\\src\\img\\Campo de fútbol animado bajo techo_resized.png";//DATO CAMBIABLE
            lblRepre.setIcon(new ImageIcon(icono));
            
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSiguiente1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblUbicacion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        lblPrecio = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblRepre = new javax.swing.JLabel();
        lblTechado = new javax.swing.JLabel();
        ListaCampos = new javax.swing.JComboBox<>();
        lblNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/titulo_resized.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 200, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Aqui podras escoger tu campo;");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, -1, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, 37));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de pantalla 2025-05-01 175721_resized.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, 60, 56));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/perfil_resized.png"))); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 80, 55, 56));

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("MS UI Gothic", 2, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Flecha roja sobre fondo blanco_resized.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 60, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSiguiente1.setBackground(new java.awt.Color(153, 204, 255));
        btnSiguiente1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSiguiente1.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente1.setText("Confirmar");
        btnSiguiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSiguiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 560, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/titulo_resized.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 200, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Aqui podras escoger tu campo;");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, -1, 50));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, 37));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de pantalla 2025-05-01 175721_resized.png"))); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, 60, 56));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/perfil_resized.png"))); // NOI18N
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 80, 55, 56));

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("MS UI Gothic", 2, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Flecha roja sobre fondo blanco_resized.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 60, 60));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel15.setText("Nombre:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 80, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel16.setText("Ubicacion:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 90, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Vista aérea del estadio deportivo_resized.png"))); // NOI18N
        jLabel17.setText("jLabel8");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 400, 590));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel18.setText("Tipo deporte:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 110, 40));

        lblName.setText("jLabel9");
        jPanel2.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 160, -1));

        lblEstado.setText("jLabel10");
        jPanel2.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 160, -1));

        lblUbicacion.setText("jLabel11");
        jPanel2.add(lblUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 160, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setText("Estado:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 90, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel5.setText("Techado:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 110, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setText("Precio x hora:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 120, 30));

        btnSiguiente.setBackground(new java.awt.Color(153, 153, 255));
        btnSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, -1, -1));

        lblPrecio.setText("jLabel11");
        jPanel2.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 160, -1));

        lblTipo.setText("jLabel10");
        jPanel2.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 160, 20));

        lblRepre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRepre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Campo de fútbol animado bajo techo_resized.png"))); // NOI18N
        lblRepre.setText("jLabel9");
        jPanel2.add(lblRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 270, 180));

        lblTechado.setText("jLabel10");
        jPanel2.add(lblTechado, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 30, 30));

        ListaCampos.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        ListaCampos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(ListaCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 226, 57));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblNombre.setText("jLabel5");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 140, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
                                          
    String seleccion = ListaCampos.getSelectedItem().toString();

    campo = CamposDAO.obtenerInfoPorNombre(seleccion);

    lblName.setText(campo.getNombre());
    lblTipo.setText(campo.getTipoDeporte());
    lblUbicacion.setText(campo.getUbicacion());
    lblPrecio.setText(String.valueOf(campo.getPrecioPorHora()));
    lblEstado.setText(campo.getEstado());

    // ICONO DE TECHADO (rutas relativas desde /src/img/)
    String iconoTechado = campo.getTechado().equalsIgnoreCase("Sí") 
        ? "/img/Captura de pantalla 2025-05-12 193820_resized.png" 
        : "/img/Captura de pantalla 2025-05-12 193851_resized.png";
    
    try {
        lblTechado.setIcon(new ImageIcon(getClass().getResource(iconoTechado)));
    } catch (Exception e) {
        lblTechado.setIcon(null);
        JOptionPane.showMessageDialog(null, "⚠️ No se encontró el icono de techado: " + iconoTechado);
    }

    String ruta = campo.getUrlFoto().replace("\\", "/");

        // Elimina comillas dobles si hay
        ruta = ruta.replace("\"", "");

        // Verifica y carga
        File imgFile = new File(ruta);
        if (imgFile.exists()) {
            ImageIcon iconoOriginal = new ImageIcon(ruta);
            Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(
                lblRepre.getWidth(), lblRepre.getHeight(), Image.SCALE_SMOOTH
            );
            lblRepre.setIcon(new ImageIcon(imagenEscalada));
            lblRepre.repaint();
        } else {
            lblRepre.setIcon(null);
            JOptionPane.showMessageDialog(null, "Imagen no encontrada:\n" + ruta);
        }

    // Mostrar etiquetas
    lblName.setVisible(true);
    lblTipo.setVisible(true);
    lblUbicacion.setVisible(true);
    lblPrecio.setVisible(true);
    lblTechado.setVisible(true);
    lblRepre.setVisible(true);
    lblEstado.setVisible(true);

    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        JOptionPane.showMessageDialog(
            null,
            "🏟️ *Gestor Campos Deportivos* - Selección de Campo\n\n" +
            "👋 Hola " + cliente.getNombre() + ",\n" +
            "Aquí podrás escoger el campo donde deseas jugar.\n\n" +
            "📌 Usa el menú desplegable para elegir el campo disponible.\n" +
            "🖼️ La imagen del campo aparecerá junto con sus detalles:\n" +
            "   • Nombre\n" +
            "   • Tipo de deporte\n" +
            "   • Ubicación\n" +
            "   • Precio por hora\n" +
            "   • Si está techado o no\n" +
            "   • Estado actual\n\n" +
            "➡️ Haz clic en *Siguiente* para continuar con tu reserva.\n" +
            "✅ Finalmente, presiona *Confirmar* para guardar tu elección.\n\n" +
            "¡Disfruta tu deporte favorito! 💪",
            "Guía para escoger campo",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jButton6ActionPerformed

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ReservaEscogerDeporte back = new ReservaEscogerDeporte(usuario);
        this.dispose();
        back.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnSiguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente1ActionPerformed
        if ("No Disponible".equals(campo.getEstado())) {
            JOptionPane.showMessageDialog(
            null,
            "✅ Esta cancha no esta actualmente disponible \n" +  
            "Verifique mas tarde o comuniquese al 3008216417" +  
            JOptionPane.INFORMATION_MESSAGE
        );
        }else{
            EscogerFechaIGU NEXT = new EscogerFechaIGU(cliente, campo);
            this.dispose();
            NEXT.setVisible(true);
        }
        
                
    }//GEN-LAST:event_btnSiguiente1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ListaCampos;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnSiguiente1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblRepre;
    private javax.swing.JLabel lblTechado;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblUbicacion;
    // End of variables declaration//GEN-END:variables
}
