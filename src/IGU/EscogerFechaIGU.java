package IGU;


import Logica.ReservasDAO;
import gestor_campos_deportivos.Campos_Deportivos;
import gestor_campos_deportivos.Clientes;
import gestor_campos_deportivos.Reservas;
import java.util.Date;
import javax.swing.JOptionPane;

public class EscogerFechaIGU extends javax.swing.JFrame {
    
    private Clientes persona;
    private Campos_Deportivos campo;
    
    public EscogerFechaIGU(Clientes persona, Campos_Deportivos campo) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.campo= campo;
        this.persona= persona;
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jComboBox1.setVisible(false);
        HorasMañana.setVisible(false);
        HorasTarde.setVisible(false);
        HorasNoche.setVisible(false);
        
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        HorasMañana = new javax.swing.JComboBox<>();
        HorasTarde = new javax.swing.JComboBox<>();
        HorasNoche = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/titulo_resized.png"))); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de pantalla 2025-05-01 175721_resized.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel1.setText("Horario");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 78, -1));
        jPanel3.add(jdcFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 320, 28));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ASIGNAR FECHA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 160, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar Horario--", "Mañana", "Tarde", "Noche" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, -1));

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 140, -1));

        jLabel2.setText("Hora");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 78, -1));

        jButton3.setBackground(new java.awt.Color(255, 153, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Confirmar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 140, -1));

        HorasMañana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar Hora--", "7:00 AM", "8:00 AM", "9:00 AM", "10:00 AM", "11:00 AM" }));
        HorasMañana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorasMañanaActionPerformed(evt);
            }
        });
        jPanel3.add(HorasMañana, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 160, -1));

        HorasTarde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar Hora--", "12:00 PM", "1:00 PM", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM" }));
        jPanel3.add(HorasTarde, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 160, -1));

        HorasNoche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar Hora--", "6:00 PM", "7:00 PM", "8:00 PM", "9:00 PM", "10:00 PM" }));
        HorasNoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorasNocheActionPerformed(evt);
            }
        });
        jPanel3.add(HorasNoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 160, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/titulo_resized.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 190, 140));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Jugando al Tenis bajo el Sol_resized.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 530));

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

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 10, 530));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Date mFecha =  jdcFecha.getDate();
        long Fecha = mFecha.getTime();
        java.sql.Date Fecha_sql = new java.sql.Date(Fecha);
        
        
        Date fechaSeleccionada = jdcFecha.getDate();
        Date fechaHoy = new Date(); // Fecha hoy

        if (fechaSeleccionada == null) {
            JOptionPane.showMessageDialog(null, "Por favor selecciona una fecha.");
        } else if (fechaSeleccionada.before(fechaHoy)) {
            JOptionPane.showMessageDialog(null, "La fecha no puede ser menor al día de hoy.");
            jButton3.setVisible(false);
        jLabel2.setVisible(false);
            
        } else {
            JOptionPane.showMessageDialog(null, "Fecha válida.");
             jLabel1.setVisible(true);
        jButton2.setVisible(true);
        jComboBox1.setVisible(true);
            // Aquí podés continuar con lo que necesites
        }
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // 
        jButton3.setVisible(true);
        jLabel2.setVisible(true);
        String seleccion = jComboBox1.getSelectedItem().toString();
        
        switch (seleccion) {
        case "--Seleccionar Horario--":
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un horario válido.", "Error", JOptionPane.ERROR_MESSAGE);
            break;
        case "Mañana":
            HorasMañana.setVisible(true);
            HorasTarde.setVisible(false);
            HorasNoche.setVisible(false);
            break;
        case "Tarde":
            HorasMañana.setVisible(false);
            HorasNoche.setVisible(false);
            HorasTarde.setVisible(true);
            break;
        case "Noche":
            HorasMañana.setVisible(false);
            HorasTarde.setVisible(false);
            HorasNoche.setVisible(true);
            break;
        default:
            JOptionPane.showMessageDialog(this, "Selección no válida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void HorasNocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorasNocheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HorasNocheActionPerformed

    private void HorasMañanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorasMañanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HorasMañanaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String seleccion = jComboBox1.getSelectedItem().toString();  
    Date mFecha = jdcFecha.getDate();                            

    // Verificar si la fecha fue seleccionada
    if (mFecha == null) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una fecha válida.", "Fecha no válida", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String hora = null;

    switch (seleccion) {
        case "Mañana":
            if (HorasMañana.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Por favor, selecciona una hora en la mañana.", "Hora no válida", JOptionPane.ERROR_MESSAGE);
                return;
            }
            hora = HorasMañana.getSelectedItem().toString();
            break;
        case "Tarde":
            if (HorasTarde.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Por favor, selecciona una hora en la tarde.", "Hora no válida", JOptionPane.ERROR_MESSAGE);
                return;
            }
            hora = HorasTarde.getSelectedItem().toString();
            break;
        case "Noche":
            if (HorasNoche.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Por favor, selecciona una hora en la noche.", "Hora no válida", JOptionPane.ERROR_MESSAGE);
                return;
            }
            hora = HorasNoche.getSelectedItem().toString();
            break;
        default:
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un horario válido.", "Horario no válido", JOptionPane.ERROR_MESSAGE);
            return;
    }

    // Verificar si 'campo' no es null antes de continuar
    if (campo == null) {
        JOptionPane.showMessageDialog(this, "Campo no válido, por favor seleccione un campo.", "Error de campo", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        // Convertir fecha a SQL Date para almacenamiento
        long fechaMillis = mFecha.getTime();
        java.sql.Date fechaSql = new java.sql.Date(fechaMillis);
        
        // Crear string de fecha + hora para mostrar al usuario
        String fechaFormateada = new java.text.SimpleDateFormat("dd/MM/yyyy").format(mFecha);
        String fechaHoraString = fechaFormateada + " " + hora;
        
        // Para verificación de disponibilidad, asegurarse de usar el formato correcto
        System.out.println("Verificando disponibilidad para: " + campo.getNombre() + " en " + fechaFormateada + " a las " + hora);
        
        // Verificar disponibilidad explícitamente 
        boolean estaDisponible = ReservasDAO.verificarReservaDisponible(campo.getNombre(), fechaSql, hora);
        
        if (!estaDisponible) {
            JOptionPane.showMessageDialog(null,
                "❌ El campo ya está reservado en ese horario.",
                "Conflicto de Reserva", JOptionPane.WARNING_MESSAGE);  
            return; // Importante: salir del método si no está disponible
        }
        
        // Si llegamos aquí, el campo está disponible
        int precio = campo.getPrecioPorHora();
        Reservas reserva = new Reservas(persona, campo, fechaSql, seleccion, hora);
        int precioFinal = reserva.calcularPrecioFinal(precio, seleccion);
        
        // Intentar almacenar la reserva
        boolean reservaAlmacenada = ReservasDAO.almacenarReserva(reserva);
        
        if (reservaAlmacenada) {
            JOptionPane.showMessageDialog(this, 
                "✅ Reserva confirmada para el " + fechaHoraString + ".\nPrecio: $" + precioFinal,
                "Reserva Exitosa", JOptionPane.INFORMATION_MESSAGE);
            
            // Abrir factura
            this.dispose();
            String precioStr = String.valueOf(precioFinal);
            FacturaIGU next = new FacturaIGU(persona, campo, reserva, precioStr);
            next.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, 
                "❌ No se pudo almacenar la reserva. Por favor, inténtelo de nuevo.",
                "Error de Almacenamiento", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
            "Error al procesar la reserva: " + e.getMessage(), 
            "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String usuario = persona.getUsuario();
        ReservaEscogerDeporte back = new ReservaEscogerDeporte(usuario);
        this.dispose();
        back.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        JOptionPane.showMessageDialog(
            null,
            "🏟️ *Gestor Campos Deportivos* - Selección de Campo\n\n" +
            "👋 Hola " + persona.getNombre() + ",\n" +
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

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> HorasMañana;
    private javax.swing.JComboBox<String> HorasNoche;
    private javax.swing.JComboBox<String> HorasTarde;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private com.toedter.calendar.JDateChooser jdcFecha;
    // End of variables declaration//GEN-END:variables
}
