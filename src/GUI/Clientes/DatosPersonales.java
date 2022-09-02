package GUI.Clientes;

import Contenedores.Pago;
import java.util.List;
import java.awt.Color;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import API.Cliente;
import API.RegistroAPI;
import javax.swing.JOptionPane;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ritmosport.Eventos;

public class DatosPersonales extends javax.swing.JDialog {

    Eventos evento = new Eventos();
    private String correo, nombre, apellidos, emergencia, telefono, seguro, rfid, ingreso, fecnac;
    private List <Pago> pago;

    public DatosPersonales(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelEmergencia = new javax.swing.JLabel();
        labelSeguro = new javax.swing.JLabel();
        labelFinplan = new javax.swing.JLabel();
        labelRFID = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApellidos = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelDesde = new javax.swing.JLabel();
        labelPlan = new javax.swing.JLabel();
        labelFecnac = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(830, 520));
        setModal(true);
        setUndecorated(true);
        setSize(new java.awt.Dimension(830, 520));

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos del cliente");
        jLabel1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelEmergencia.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelEmergencia.setText("Número de emergencia:");

        labelSeguro.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelSeguro.setText("Institución aseguradora:");

        labelFinplan.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelFinplan.setText("Fin de plan: ");

        labelRFID.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelRFID.setText("RFID:");

        labelCorreo.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelCorreo.setText("Correo");

        labelNombre.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelNombre.setText("Nombre");

        labelApellidos.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelApellidos.setText("Apellidos");

        labelTelefono.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelTelefono.setText("Teléfono");

        labelDesde.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelDesde.setText("Miembro desde:");

        labelPlan.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelPlan.setText("Plan actual:");

        labelFecnac.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelFecnac.setText("Fecha de nacimiento:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSeguro, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPlan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFinplan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFecnac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                    .addComponent(labelEmergencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelRFID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelDesde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCorreo)
                .addGap(18, 18, 18)
                .addComponent(labelNombre)
                .addGap(18, 18, 18)
                .addComponent(labelApellidos)
                .addGap(18, 18, 18)
                .addComponent(labelTelefono)
                .addGap(18, 18, 18)
                .addComponent(labelFecnac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSeguro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEmergencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelRFID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDesde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPlan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelFinplan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
                jButton4KeyPressed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 153, 0));
        jButton4.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Salir();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ModificarCliente();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        int x = evento.Teclado(evt);
        if(x == 1){
            ModificarCliente();
        }else if(x == 2){
            Salir();
        }
    }//GEN-LAST:event_jButton4KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDesde;
    private javax.swing.JLabel labelEmergencia;
    private javax.swing.JLabel labelFecnac;
    private javax.swing.JLabel labelFinplan;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPlan;
    private javax.swing.JLabel labelRFID;
    private javax.swing.JLabel labelSeguro;
    private javax.swing.JLabel labelTelefono;
    // End of variables declaration//GEN-END:variables

    private void Salir(){
        this.dispose();
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

    private void ModificarCliente(){
        ClienteModificar cm = new ClienteModificar(this,true);
        cm.setLocationRelativeTo(null);
        cm.CargarVentana();
        cm.CargarDatos(correo,nombre,apellidos,telefono,emergencia,fecnac,rfid,seguro);
        cm.setVisible(true);
        this.dispose();
    }
    
    public void LlenarDatos(String correo, String nombre, String apellidos, String telefono, String emergencia, String fecnac, String ingreso, String rfid, String seguro) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.emergencia = emergencia;
        this.fecnac = fecnac;
        this.ingreso = ingreso;
        this.rfid = rfid;
        this.seguro = seguro;
        
        labelCorreo.setText("Correo : "+correo);
        labelNombre.setText("Nombre: "+nombre);
        labelApellidos.setText("Apellidos : "+apellidos);
        labelTelefono.setText("Teléfono : "+telefono);
        labelEmergencia.setText("Teléfono de emergencia: "+emergencia);
        labelFecnac.setText("Fecha de nacimiento : "+FechaTexto(fecnac));
        labelDesde.setText("Miembro desde : "+FechaTexto(ingreso));
        labelRFID.setText("RFID : "+rfid);
        labelSeguro.setText("Seguro : "+seguro);
        
        RegistroAPI api = Cliente.getRetrofitInstance().create(RegistroAPI.class);
        Call<List<Pago>> call = api.getPlanActual(correo);
        call.enqueue(new Callback<List<Pago>>(){
            @Override
            public void onResponse(Call<List<Pago>> call, Response<List<Pago>> rspns) {
                pago = rspns.body();
                if(pago.isEmpty()){
                    labelPlan.setText("Plan actual: Sin plan vigente");
                    labelFinplan.setText("Fin de plan: Sin plan vigente");
                }else{
                    labelPlan.setText(pago.get(0).getNombre());
                    labelFinplan.setText(FechaTexto(pago.get(0).getFecfin()));
                }
            }

            @Override
            public void onFailure(Call<List<Pago>> call, Throwable thrwbl) {
                JOptionPane.showMessageDialog(null, "Error en el servidor", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
    
    private String FechaTexto(String date){
        String[] division = date.split("-");
        String texto = division[2] + " de "; //dia
        switch(division[1]){
            case "01" -> texto += "enero de ";
            case "02" -> texto += "febrero de ";
            case "03" -> texto += "marzo de ";
            case "04" -> texto += "abril de ";
            case "05" -> texto += "mayo de ";
            case "06" -> texto += "junio de ";
            case "07" -> texto += "julio de ";
            case "08" -> texto += "agosto de ";
            case "09" -> texto += "septiembre de ";
            case "10" -> texto += "octubre de ";
            case "11" -> texto += "noviembre de ";
            case "12" -> texto += "diciembre de ";
            default -> texto += " ? de ";
        }
        texto += division[0];
        return texto;
    }
    
}
