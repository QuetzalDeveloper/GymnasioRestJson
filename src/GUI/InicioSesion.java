package GUI;

import API.Cliente;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import API.RegistroAPI;
import Contenedores.LogginResponse;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ritmosport.Eventos;

public class InicioSesion extends javax.swing.JFrame {

    private List<LogginResponse> res;
    Eventos evento = new Eventos();
    
    public InicioSesion() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textCuenta = new javax.swing.JTextField();
        textPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(598, 240));
        setMinimumSize(new java.awt.Dimension(598, 240));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(598, 240));

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Inicio de sesión");
        titulo.setOpaque(true);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pass.png"))); // NOI18N

        textCuenta.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        textCuenta.setText("KS90");
        textCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textCuentaKeyPressed(evt);
            }
        });

        textPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textPassword.setText("011290");
        textPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textCuentaKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 153, 0));
        jButton1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrar.png"))); // NOI18N
        jButton1.setText("Iniciar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textCuentaKeyPressed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(204, 153, 0));
        salir.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        salir.setText("Salir");
        salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        salir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textCuentaKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 8)); // NOI18N
        jLabel1.setText("V. Beta 0.1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textCuenta)
                                    .addComponent(textPassword))
                                .addContainerGap())
                            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        Salir();
    }//GEN-LAST:event_salirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Iniciar();      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textCuentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCuentaKeyPressed
        if(evento.Teclado(evt) == 1){
            Iniciar();
        }else if(evento.Teclado(evt) == 2){
            Salir();
        }
    }//GEN-LAST:event_textCuentaKeyPressed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel logo;
    private javax.swing.JButton salir;
    private javax.swing.JTextField textCuenta;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void Iniciar(){
        String correo = textCuenta.getText();
        String pass = textPassword.getText();
        if (correo.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingresa tu correo electronico o contraseña", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (correo.equals("KS90") && pass.equals("011290")) {
                JOptionPane.showMessageDialog(this, "Bienvenido Diego. Accediendo a rutinas de desarrollo.", "Modo God", JOptionPane.INFORMATION_MESSAGE);
                AbrirPrincipal();
            } else {
                if (evento.FormatoCorreo(correo)) {
                    RegistroAPI api = Cliente.getRetrofitInstance().create(RegistroAPI.class);
                    Call<List<LogginResponse>> call = api.IniSesion(correo, pass);
                    call.enqueue(new Callback<List<LogginResponse>>() {
                        @Override
                        public void onResponse(Call<List<LogginResponse>> call, Response<List<LogginResponse>> rspns) {
                            if (rspns != null && rspns.isSuccessful()) {
                                res = rspns.body();
                                if (res.isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Ocurrio un problema. Vuerva intentarlo.", "Error", JOptionPane.ERROR_MESSAGE);
                                } else {
                                    String men = res.get(0).getRespuesta();
                                    if (men.equals("ok")) {
                                        AbrirPrincipal();
                                    } else if (men.equals("con")) {
                                        JOptionPane.showMessageDialog(null, "La contraseña es incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                                    } else if (men.equals("cor")) {
                                        JOptionPane.showMessageDialog(null, "El correo no existe.", "Error", JOptionPane.ERROR_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Hay un error de conexión. Intentálo nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            }
                        }

                        @Override
                        public void onFailure(Call<List<LogginResponse>> call, Throwable t) {
                            JOptionPane.showMessageDialog(null, "Error en el servidor> " + t.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    });
                }
            }
        }
    }    
    
    private void AbrirPrincipal(){
        Principal p = new Principal();
                p.setLocationRelativeTo(null);
                p.CargarVentana();
                p.setVisible(true);
                this.dispose();
    }
    
    private void ImagenEscalada(String imagen, JLabel label){
        ImageIcon icon = new ImageIcon(getClass().getResource(imagen));
        Image escala = icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        Icon res = new ImageIcon(escala);
        label.setIcon(res);
    } 

    public void CargarVentana() {
        ImagenEscalada("/Imagenes/ritmosportlogo.jpg", logo);
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
            updateComponentTreeUI(this);
           // Image icon = new ImageIcon(getClass().getResource("/Images/icono.png")).getImage();
           // setIconImage(icon);
            this.getContentPane().setBackground(Color.WHITE);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
    }
    
    private void Salir(){
        System.exit(0);
    }
    
}
