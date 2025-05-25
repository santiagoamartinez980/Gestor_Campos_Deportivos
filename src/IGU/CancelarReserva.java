
package IGU;

import Logica.ClientesDAO;
import Logica.ReservasDAO;
import gestor_campos_deportivos.Clientes;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CancelarReserva extends javax.swing.JFrame {
    
    
    private String usuario;
    private Clientes cliente;
    DefaultTableModel modelo = new DefaultTableModel() {
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }};

    Date fechaHoy = new Date();
    
    public CancelarReserva(String usuario) {
        initComponents();
        this.usuario= usuario;
        cliente = ClientesDAO.obtenerDatosClientes(usuario);
        this.setLocationRelativeTo(null);
        lblNombre1.setText(cliente.getNombre());
        
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        modelo.addColumn("id");
        modelo.addColumn("Usuario");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Campo");
        modelo.addColumn("Deporte");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora inicio");
        modelo.addColumn("Hora registro");
        modelo.addColumn("Precio");
        ReservasDAO.consultaReservas(modelo, tblCancelar, usuario);
         
        tblCancelar.setModel(modelo);   
    
        
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Date fecha2 = (Date) tblCancelar.getValueAt(i, 6);
            System.out.println(fecha2);
            if (fecha2.before(fechaHoy)) {
                modelo.removeRow(i);
                 i--;
            }
        }

       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCancelar = new javax.swing.JTable();
        btnConfrimar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("MS UI Gothic", 2, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Flecha roja sobre fondo blanco_resized.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de pantalla 2025-04-30 125417_resized.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 115, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setText("HOLA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 75, 40));

        lblNombre1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblNombre1.setText("jLabel5");
        jPanel1.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 150, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setText("CANCELAR CITA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 60));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de pantalla 2025-05-01 175721_resized.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 60, 56));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/perfil_resized.png"))); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 55, 56));

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

        tblCancelar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jScrollPane1.setViewportView(tblCancelar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 960, 380));

        btnConfrimar.setBackground(new java.awt.Color(255, 51, 51));
        btnConfrimar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfrimar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfrimar.setText("CANCELAR");
        btnConfrimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfrimarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfrimar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 570, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("MS UI Gothic", 2, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Flecha roja sobre fondo blanco_resized.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 60, 60));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Si la reserva que buscas no se encuantra aqui es posible que que ya haya pasado o que este muy pronto para ser cancelada");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 660, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showMessageDialog(
            null,
            "❌ *Cancelar Reserva* – Ayuda\n\n" +
            "Aquí puedes anular una reserva que hayas hecho previamente.\n\n" +
            "📋 Si tu reserva no aparece en la tabla:\n" +
            "   • Puede que ya haya pasado.\n" +
            "   • O aún no se puede cancelar por estar muy próxima a la hora programada.\n\n" +
            "📌 Para cancelar:\n" +
            "   1. Busca tu reserva en la tabla.\n" +
            "   2. Haz clic en ella.\n" +
            "   3. Luego presiona el botón rojo ❌ 'CANCELAR' al final.\n\n" +
            "⚠️ Recuerda: Las cancelaciones tardías podrían estar deshabilitadas por políticas del sistema.\n\n" +
            "🏟️ ¡Esperamos que regreses pronto a jugar!",
            "Ayuda - Cancelar Cita",
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

    private void btnConfrimarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfrimarActionPerformed
    int fila = tblCancelar.getSelectedRow(); 
    if (fila >= 0) {
        
        int idReserva = (int) tblCancelar.getValueAt(fila, 0);
        String nombreReservante = (String) tblCancelar.getValueAt(fila, 2);
        String apellidosReservantes = (String)tblCancelar.getValueAt(fila, 3);
        String nombreCampo = (String)tblCancelar.getValueAt(fila, 4);
        //Time hora = (Time) tblCancelar.getValueAt(fila, 7);
        Date fecha = (Date) tblCancelar.getValueAt(fila, 6);

        if (fecha == null) {
            JOptionPane.showMessageDialog(null, "La reserva no tiene una fecha válida.");
            return;
        }

        

        if (fecha.after(fechaHoy)) {
            int opcion = JOptionPane.showConfirmDialog(null, 
              "¿Estás seguro de eliminar esta reserva?\n" +
              "A nombre de " + nombreReservante + " " + apellidosReservantes + "\n" +
              "El dia " + fecha.toString() + " en el campo "+ nombreCampo +" a las "//+ hora
                    ,
              "Confirmación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                try {
                    ReservasDAO.eliminarReserva(idReserva);
                    modelo.removeRow(fila); // Eliminar visualmente después de confirmar que se eliminó en BD
                    JOptionPane.showMessageDialog(null, "Reserva eliminada exitosamente.");
                    
                    MenuUsuarioEntrada next = new MenuUsuarioEntrada(usuario);
                    next.setVisible(true);
                    this.dispose();
                } catch (SQLException ex) {
                    Logger.getLogger(CancelarReserva.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Error al eliminar la reserva.");
                }
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila primero.");
    }
    }//GEN-LAST:event_btnConfrimarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MenuUsuarioEntrada back = new MenuUsuarioEntrada(usuario);
        this.dispose();
        back.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MenuUsuarioEntrada back = new MenuUsuarioEntrada(usuario);
        this.dispose();
        back.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfrimar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JTable tblCancelar;
    // End of variables declaration//GEN-END:variables
}
