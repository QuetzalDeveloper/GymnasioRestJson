package GUI.Pagos;

import API.Cliente;
import API.RegistroAPI;
import Contenedores.Pago;
import Contenedores.Plan;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ritmosport.Eventos;
import ritmosport.Fechas;

public class PagoAdeudo extends javax.swing.JDialog {

    Eventos evento = new Eventos();
    private List<Plan> plan;
    private List<Pago> actual;
    private boolean cli = false;
    
    private String correo, fecini, fecfin, metodo, referencia;
    private int idplan;
    private double adeudo = 0, pago = 0;
    
    public PagoAdeudo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        labelNActual = new javax.swing.JLabel();
        labelInicio2 = new javax.swing.JLabel();
        labelInicio = new javax.swing.JLabel();
        labelFin2 = new javax.swing.JLabel();
        labelFin = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        comboMetodo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        textReferencia = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        textCantidad = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(204, 0, 51));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pago de adeudos");
        jLabel1.setOpaque(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel6.setText("Correo :");

        jLabel2.setBackground(new java.awt.Color(204, 0, 51));
        jLabel2.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cliente");
        jLabel2.setOpaque(true);

        labelCorreo.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        labelCorreo.setText(" ");

        labelNombre.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        labelNombre.setText(" ");

        jButton8.setBackground(new java.awt.Color(204, 153, 0));
        jButton8.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevousuario.png"))); // NOI18N
        jButton8.setText("Buscar cliente");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8jButton9KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCorreo)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setBackground(new java.awt.Color(204, 0, 51));
        jLabel9.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Plan actual");
        jLabel9.setOpaque(true);

        labelNActual.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelNActual.setText("Sin plan");

        labelInicio2.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelInicio2.setText("Inicio:");

        labelInicio.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelInicio.setForeground(new java.awt.Color(0, 153, 0));
        labelInicio.setText("Selecciona un cliente");

        labelFin2.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelFin2.setText("Fin: ");

        labelFin.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelFin.setForeground(new java.awt.Color(0, 153, 0));
        labelFin.setText("Selecciona un plan");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelInicio2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelNActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(labelInicio2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelInicio)
                .addGap(18, 18, 18)
                .addComponent(labelFin2)
                .addGap(18, 18, 18)
                .addComponent(labelFin)
                .addGap(28, 28, 28))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setBackground(new java.awt.Color(204, 0, 51));
        jLabel10.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Pago");
        jLabel10.setOpaque(true);

        jLabel12.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel12.setText("Total:");

        labelTotal.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 36)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(102, 0, 102));
        labelTotal.setText("$ 0.00");

        jLabel14.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel14.setText("Método de pago:");

        comboMetodo.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        comboMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta", "Deposito" }));
        comboMetodo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMetodoItemStateChanged(evt);
            }
        });
        comboMetodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboMetodojButton9KeyPressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel15.setText("Referencia:");

        textReferencia.setEditable(false);
        textReferencia.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        textReferencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textReferenciajButton9KeyPressed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(204, 153, 0));
        jButton9.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagos.png"))); // NOI18N
        jButton9.setText("Pagar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jButton9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton9KeyPressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel19.setText("Cantidad:");

        textCantidad.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        textCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textCantidadjButton9KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCantidadKeyTyped(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 153, 0));
        jButton3.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3jButton9KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboMetodo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(textReferencia))
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(46, 46, 46)
                        .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(29, 29, 29)
                        .addComponent(textCantidad))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboMetodo)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textReferencia))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textCantidad))
                .addGap(98, 98, 98)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotal)
                    .addComponent(jLabel12))
                .addGap(14, 14, 14)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        BuscarCliente();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton8jButton9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton8jButton9KeyPressed
        int x = evento.Teclado(evt);
        switch (x) {
            case 2 -> Salir();
            case 3 -> BuscarCliente();
            case 14 -> RealizarPago();
            default -> {
            }
        }
    }//GEN-LAST:event_jButton8jButton9KeyPressed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        RealizarPago();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton9KeyPressed
        int x = evento.Teclado(evt);
        switch (x) {
            case 2 -> Salir();
            case 3 -> BuscarCliente();
            case 14 -> RealizarPago();
            default -> {
            }
        }
    }//GEN-LAST:event_jButton9KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Salir();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3jButton9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3jButton9KeyPressed
        int x = evento.Teclado(evt);
        switch (x) {
            case 2 -> Salir();
            case 3 -> BuscarCliente();
            case 14 -> RealizarPago();
            default -> {
            }
        }
    }//GEN-LAST:event_jButton3jButton9KeyPressed

    private void textCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCantidadKeyTyped
        evento.NumerosDecimales(evt, textCantidad);
    }//GEN-LAST:event_textCantidadKeyTyped

    private void textCantidadjButton9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCantidadjButton9KeyPressed
        int x = evento.Teclado(evt);
        switch (x) {
            case 2 -> Salir();
            case 3 -> BuscarCliente();
            case 14 -> RealizarPago();
            default -> {
            }
        }
    }//GEN-LAST:event_textCantidadjButton9KeyPressed

    private void textReferenciajButton9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textReferenciajButton9KeyPressed
        int x = evento.Teclado(evt);
        switch (x) {
            case 2 -> Salir();
            case 3 -> BuscarCliente();
            case 14 -> RealizarPago();
            default -> {
            }
        }
    }//GEN-LAST:event_textReferenciajButton9KeyPressed

    private void comboMetodojButton9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboMetodojButton9KeyPressed
        int x = evento.Teclado(evt);
        switch (x) {
            case 2 -> Salir();
            case 3 -> BuscarCliente();
            case 14 -> RealizarPago();
            default -> {
            }
        }
    }//GEN-LAST:event_comboMetodojButton9KeyPressed

    private void comboMetodoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMetodoItemStateChanged
        if(comboMetodo.getSelectedIndex() == 0){
            textReferencia.setEditable(false);
            referencia = "N/A";
        }else{
            textReferencia.setEditable(true);
            referencia = null;
        }
    }//GEN-LAST:event_comboMetodoItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboMetodo;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelFin;
    private javax.swing.JLabel labelFin2;
    private javax.swing.JLabel labelInicio;
    private javax.swing.JLabel labelInicio2;
    private javax.swing.JLabel labelNActual;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTextField textCantidad;
    private javax.swing.JTextField textReferencia;
    // End of variables declaration//GEN-END:variables

    private void Salir(){
        this.dispose();
    }
    
    private void RealizarPago(){
        if(Pagar()){
            this.dispose();
        }
    }
    
    private boolean Pagar(){
        Fechas f = new Fechas();
        if(cli){
            metodo = comboMetodo.getSelectedItem().toString();
            if(comboMetodo.getSelectedIndex() > 0){
                referencia = textReferencia.getText();
                if(referencia.isEmpty()){
                    JOptionPane.showMessageDialog(this, "Ingresa la referencia del pago", "Pago", JOptionPane.WARNING_MESSAGE);
                    return false;
                }else{
                    referencia = "Adeudo - "+adeudo;
                }
            }else{
                referencia = "Adeudo - ";
            }
            if(textCantidad.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Ingresa la cantidad a pagar", "Pago", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }else {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un cliente", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        int x = JOptionPane.showConfirmDialog(this, "¿Estas seguro de registrar el pago?", "Pagar", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            
            pago = Double.parseDouble(textCantidad.getText());
            if (pago < adeudo) {
                adeudo = adeudo - pago;
                JOptionPane.showMessageDialog(this, "El saldo negativo es de " + evento.FormatoMoneda(adeudo), "Pago", JOptionPane.WARNING_MESSAGE);
            } else if (pago > adeudo) {
                adeudo = adeudo - pago;
                JOptionPane.showMessageDialog(this, "El saldo positivo es de " + evento.FormatoMoneda(adeudo * -1), "Pago", JOptionPane.WARNING_MESSAGE);
            } else {
                adeudo = 0.0;
            }
            //System.out.println("1 // "+idplan+" // "+fecini+" // "+fecfin+" // "+costo+" // "+metodo+" // "+referencia+" // "+f.getFechaActual()+" // "+adeudo+" // "+pago);
            Call<ResponseBody> call = Cliente.getInstance().getMyApi().InsertarPago(correo, idplan, fecini, fecfin, 0, metodo, referencia, f.getFechaActual(), adeudo,pago);
            call.enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> rspns) {
                    if (rspns != null && rspns.isSuccessful()) {
                        JOptionPane.showMessageDialog(null, "Exito", "Información", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("Exito");
                    }
                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable thrwbl) {
                    JOptionPane.showMessageDialog(null, "Error en el servidor", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Fallo");
                }
            });
            return true;
        }else{
            return false;
        }
    }
    
    private void BuscarCliente(){
        Fechas re = new Fechas();
        PagosBuscarCliente pbc = new PagosBuscarCliente(this,true);
        pbc.setLocationRelativeTo(null);
        pbc.CargarVentana();
        pbc.LlenarTabla(1);
        pbc.setVisible(true);
        if (pbc.Resultado()) {
            correo = pbc.Correo();
            adeudo = pbc.Adeudo();
            labelCorreo.setText(pbc.Correo());
            labelNombre.setText(pbc.Nombre());
            labelTotal.setText(evento.FormatoMoneda(adeudo));
            cli = true;
            RegistroAPI api = Cliente.getRetrofitInstance().create(RegistroAPI.class);
            Call<List<Pago>> call = api.getPlanActual(pbc.Correo());
            call.enqueue(new Callback<List<Pago>>() {
                @Override
                public void onResponse(Call<List<Pago>> call, Response<List<Pago>> rspns) {
                    actual = rspns.body();
                    if(!actual.isEmpty()){
                        idplan = actual.get(0).getPlan();
                        labelNActual.setText("Plan actual: " +actual.get(0).getNombre());
                        fecini = actual.get(0).getFecini();
                        labelInicio.setText(re.FechaTexto(actual.get(0).getFecini()));
                        labelInicio.setForeground(Color.BLUE);
                        fecfin = actual.get(0).getFecfin();
                        labelFin.setText(re.FechaTexto(actual.get(0).getFecfin()));
                        labelInicio.setForeground(Color.BLUE);
                    }
                }

                @Override
                public void onFailure(Call<List<Pago>> call, Throwable t) {
                    JOptionPane.showMessageDialog(null, "Error en el servidor >> " + t.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            });
        } else {
            if(!cli){
                cli = false;
            }else{
                cli=true;
            }
        }        
    }
    
    public void CargarVentana(){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
            updateComponentTreeUI(this);
            //Image icon = new ImageIcon(getClass().getResource("/Images/icono.png")).getImage();
            //setIconImage(icon);
            this.getContentPane().setBackground(Color.WHITE);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
    }
    
}
