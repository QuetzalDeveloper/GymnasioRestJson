package GUI;

import GUI.Accesos.Accesos;
import GUI.Accesos.RegistrarAccesos;
import GUI.Administradores.Administradores;
import GUI.Clientes.Clientes;
import GUI.Pagos.PagoAdeudo;
import GUI.Pagos.Pagos;
import GUI.Pagos.PagosRegistro;
import GUI.Planes.Planes;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import ritmosport.Eventos;

public class Principal extends javax.swing.JFrame {
    
    Eventos evento = new Eventos();

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1366, 768));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu2KeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 153, 0));
        jButton1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu2KeyPressed(evt);
            }
        });

        logo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu2KeyPressed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 255));
        jButton4.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagos.png"))); // NOI18N
        jButton4.setText("Registro de pago");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu2KeyPressed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 0, 51));
        jButton5.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/deuda.png"))); // NOI18N
        jButton5.setText("Pago de adeudo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu2KeyPressed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(102, 0, 102));
        jButton6.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pesa.png"))); // NOI18N
        jButton6.setText("Registrar accesos");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu2KeyPressed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar1.setMaximumSize(new java.awt.Dimension(119, 50));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(119, 50));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(870, 50));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setBorder(null);
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente.png"))); // NOI18N
        jMenu1.setText("Clientes");
        jMenu1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 15)); // NOI18N
        jMenu1.setMaximumSize(new java.awt.Dimension(175, 32767));
        jMenu1.setPreferredSize(new java.awt.Dimension(165, 45));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu2KeyPressed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setBorder(null);
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/planes.png"))); // NOI18N
        jMenu2.setText("Planes");
        jMenu2.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 15)); // NOI18N
        jMenu2.setMaximumSize(new java.awt.Dimension(175, 32767));
        jMenu2.setPreferredSize(new java.awt.Dimension(165, 49));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu2KeyPressed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setBorder(null);
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagos.png"))); // NOI18N
        jMenu3.setText("Pagos");
        jMenu3.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 15)); // NOI18N
        jMenu3.setMaximumSize(new java.awt.Dimension(175, 32767));
        jMenu3.setPreferredSize(new java.awt.Dimension(165, 49));
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu2KeyPressed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu5.setBackground(new java.awt.Color(255, 255, 255));
        jMenu5.setBorder(null);
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acceso.png"))); // NOI18N
        jMenu5.setText("Accesos");
        jMenu5.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 15)); // NOI18N
        jMenu5.setMaximumSize(new java.awt.Dimension(175, 32767));
        jMenu5.setPreferredSize(new java.awt.Dimension(165, 49));
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu2KeyPressed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu4.setBackground(new java.awt.Color(255, 255, 255));
        jMenu4.setBorder(null);
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seguridad.png"))); // NOI18N
        jMenu4.setText("Administradores");
        jMenu4.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 15)); // NOI18N
        jMenu4.setMaximumSize(new java.awt.Dimension(175, 32767));
        jMenu4.setPreferredSize(new java.awt.Dimension(165, 49));
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu2KeyPressed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                        .addGap(281, 281, 281)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 1292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Salir();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        AbrirClientes();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        AbrirPlanes();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        AbrirPagos();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        AbrirAdministradores();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        AbrirAccesos();
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AbrirPagosRegistro();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenu2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu2KeyPressed
        int x = evento.Teclado(evt);
        switch (x) {
            case 2 -> Salir();
            case 3 -> AbrirClientes();
            case 4 -> AbrirPlanes();
            case 5 -> AbrirPagos();
            case 6 -> AbrirAdministradores();
            case 7 -> AbrirAccesos();
            case 14 -> AbrirPagosRegistro();
            case 13 -> AbrirAdeudosRegistro();
            default -> {
            }
        }
    }//GEN-LAST:event_jMenu2KeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AbrirAdeudosRegistro();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        RegistroAcceso();
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables

    private void AbrirClientes(){
        Clientes c = new Clientes();
        c.CargarVentana();
        c.LlenarTabla(0, "");
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }  
    
    private void AbrirPlanes(){
        Planes p = new Planes();
        p.setLocationRelativeTo(null);
        p.CargarVentana();
        p.LlenarTabla(0);
        p.setVisible(true);
    }
    
    private void AbrirPagos(){
        Pagos p = new Pagos();
        p.setLocationRelativeTo(null);
        p.CargarVentana();
        p.setVisible(true);
    }
    
    private void AbrirAdministradores(){
        Administradores a = new Administradores();
        a.setLocationRelativeTo(null);
        a.CargarVentana();
        a.LlenarTabla();
        a.setVisible(true);
    }
    
    private void AbrirPagosRegistro(){
        PagosRegistro pr = new PagosRegistro(this, true);
        pr.setLocationRelativeTo(null);
        pr.CargarVentana();
        pr.setVisible(true);
    }
    
    private void RegistroAcceso(){
        RegistrarAccesos ra = new RegistrarAccesos(this, true);
        ra.setLocationRelativeTo(null);
        ra.CargarVentana();
        ra.setVisible(true);
    }
    
    private void AbrirAccesos(){
        Accesos a = new Accesos();
        a.setLocationRelativeTo(null);
        a.CargarVentana();
        a.setVisible(true);
    }
    
    private void Salir(){
        System.exit(0);
    }
    
    public void CargarVentana(){
        ImagenEscalada("/Imagenes/ritmosportlogo.jpg", logo);
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
    
    private void ImagenEscalada(String imagen, JLabel label){
        ImageIcon icon = new ImageIcon(getClass().getResource(imagen));
        Image escala = icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        Icon res = new ImageIcon(escala);
        label.setIcon(res);
    } 

    private void AbrirAdeudosRegistro() {
        PagoAdeudo pa = new PagoAdeudo(this, true);
        pa.setLocationRelativeTo(null);
        pa.CargarVentana();
        pa.setVisible(true);
    }


}
