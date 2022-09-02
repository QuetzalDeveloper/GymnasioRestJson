package GUI.Clientes;

import Contenedores.ClienteBase;
import java.awt.Color;
import java.util.List;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import API.Cliente;
import API.RegistroAPI;
import Contenedores.Pago;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ritmosport.Eventos;
import ritmosport.Fechas;

public class ClientePagos extends javax.swing.JDialog {

    Eventos evento = new Eventos();
    private String correo;
    private List<ClienteBase> cliente;
    private List <Pago> pagos;
    int filas = 0;
    

    public ClientePagos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        labelDesde = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        labelRfid = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pagos del cliente");
        jLabel1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 100));

        labelNombre.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        labelNombre.setText("Nombre");

        labelCorreo.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        labelCorreo.setText("Correo");

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
                tablaKeyPressed(evt);
            }
        });

        labelDesde.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        labelDesde.setText("Miembro desde");

        jLabel16.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel16.setText("RFID");

        jLabel20.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel20.setText("Miembro desde:");

        labelRfid.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        labelRfid.setText("RFID");

        labelTelefono.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        labelTelefono.setText("Teléfono: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addComponent(labelDesde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelRfid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(labelTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDesde)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelRfid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabla.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Fecha", "Plan", "Inicio", "Fin", "Método", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setRowHeight(25);
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(43);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(153);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(133);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(173);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(173);
            tabla.getColumnModel().getColumn(5).setResizable(false);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(133);
            tabla.getColumnModel().getColumn(6).setResizable(false);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(153);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Salir();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyPressed
        int x = evento.Teclado(evt);
        if(x == 2){
            Salir();
        }
    }//GEN-LAST:event_tablaKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDesde;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelRfid;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JTable tabla;
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
    
    public void Datos(String correo){
            Fechas f = new Fechas();
            Eventos evento = new Eventos();
            this.correo = correo;
            //Right Data
            RegistroAPI api = Cliente.getRetrofitInstance().create(RegistroAPI.class);
            Call<List<ClienteBase>> call = api.getCliente(correo);
            call.enqueue(new Callback<List<ClienteBase>>(){
                @Override
                public void onResponse(Call<List<ClienteBase>> call, Response<List<ClienteBase>> rspns) {
                    cliente = rspns.body();
                    if(cliente.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Error en el servidor. Verificar el acceso del cliente", "Error", JOptionPane.ERROR_MESSAGE);
                    }else{
                        labelCorreo.setText(correo);
                        labelNombre.setText(cliente.get(0).getApellidos()+ " " + cliente.get(0).getNombre());
                        labelDesde.setText(f.FechaTexto(cliente.get(0).getIngreso()));
                        labelTelefono.setText(cliente.get(0).getTelefono());
                        labelRfid.setText(cliente.get(0).getRfid());
                    }
                }
                
                @Override
                public void onFailure(Call<List<ClienteBase>> call, Throwable thrwbl) {
                    JOptionPane.showMessageDialog(null, "Error en el servidor", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            });
           // for(int i=0; i<1000000; i++){}
            //Table Data
            DefaultTableModel dtm = (DefaultTableModel) tabla.getModel();
            Object nf[] = {null,null,null,null,null,null,null};
            RegistroAPI api2 = Cliente.getRetrofitInstance().create(RegistroAPI.class);
            Call<List<Pago>> call2 = api2.getPagosCliente(this.correo);
            call2.enqueue(new Callback<List<Pago>>(){
                @Override
                public void onResponse(Call<List<Pago>> call, Response<List<Pago>> rspns) {
                    pagos = rspns.body();
                    if(pagos.isEmpty()){
                        JOptionPane.showMessageDialog(null, "El cliente no ha realizado pagos", "Información", JOptionPane.INFORMATION_MESSAGE);
                    }else{                       
                        for(int b=(filas -1); b>=0; b--){
                            dtm.removeRow(b);
                        }
                        filas = 0;
                        while(filas < pagos.size()){
                            System.out.println(pagos.get(filas).getId()+ " - "+pagos.get(filas).getFecha());
                            dtm.addRow(nf);
                            tabla.setValueAt(pagos.get(filas).getId()+"", filas, 0);
                            tabla.setValueAt(f.FechaTexto(pagos.get(filas).getFecha()), filas, 1);
                            tabla.setValueAt(pagos.get(filas).getNombre(), filas, 2);
                            tabla.setValueAt(f.FechaTexto(pagos.get(filas).getFecfin()), filas, 3);
                            tabla.setValueAt(f.FechaTexto(pagos.get(filas).getFecfin()), filas, 4);
                            tabla.setValueAt(pagos.get(filas).getMetodo(), filas, 5);                        
                            tabla.setValueAt(evento.FormatoMoneda(pagos.get(filas).getCosto()), filas, 6);
                            filas ++;
                        }
                    }
                }
                
                @Override
                public void onFailure(Call<List<Pago>> call, Throwable thrwbl) {
                    JOptionPane.showMessageDialog(null, "Error en el servidor", "Error", JOptionPane.ERROR_MESSAGE);
                }
            });
    }
    
}
