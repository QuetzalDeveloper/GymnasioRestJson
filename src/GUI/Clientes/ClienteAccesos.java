package GUI.Clientes;

import API.Cliente;
import API.RegistroAPI;
import Contenedores.Acceso;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ritmosport.Eventos;
import ritmosport.Fechas;

public class ClienteAccesos extends javax.swing.JDialog {

    Eventos e = new Eventos();
    private String correo;
    private List<Acceso> accesos;
    private int filas=0;
    
    public ClienteAccesos(java.awt.Frame parent, boolean modal) {
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
        labelIngreso = new javax.swing.JLabel();
        labelRFID = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Accesos del cliente");
        jLabel1.setOpaque(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 100));

        labelNombre.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelNombre.setText("Nombre");

        labelCorreo.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
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

        labelIngreso.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelIngreso.setText("Miembro desde");

        labelRFID.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelRFID.setText("RFID");

        jLabel15.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel15.setText("Total de accesos:");

        labelTotal.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 36)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(153, 0, 0));
        labelTotal.setText("0000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRFID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)))
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
                .addComponent(labelIngreso)
                .addGap(18, 18, 18)
                .addComponent(labelRFID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabla.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Entrada", "Salida", "Área"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            tabla.getColumnModel().getColumn(0).setPreferredWidth(60);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(280);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(280);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(205);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
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
        int x = e.Teclado(evt);
        if(x == 2){
            Salir();
        }
    }//GEN-LAST:event_tablaKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelIngreso;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelRFID;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    private void Salir(){
        this.dispose();
    }
    
    private void LlenarTabla(){
        Fechas f = new Fechas();        
        DefaultTableModel dtm = (DefaultTableModel) tabla.getModel();
        Object nf[] = {null,null,null,null};
        RegistroAPI api = Cliente.getRetrofitInstance().create(RegistroAPI.class);
        Call<List<Acceso>> call = api.getAccesosCliente(correo);
        call.enqueue(new Callback<List<Acceso>>(){
            @Override
            public void onResponse(Call<List<Acceso>> call, Response<List<Acceso>> rspns) {
                accesos = rspns.body();
                for (int b = (filas - 1); b >= 0; b--) {
                    dtm.removeRow(b);
                }
                filas = 0;
                if (accesos.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay accesos que mostrar", "Información", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    while (filas < accesos.size()) {
                        dtm.addRow(nf);
                        tabla.setValueAt(accesos.get(filas).getIda()+"", filas, 0);
                        tabla.setValueAt(f.FechaHoraTexto(accesos.get(filas).getEntrada()), filas, 1);
                        tabla.setValueAt(f.FechaHoraTexto(accesos.get(filas).getSalida()), filas, 2);
                        String acceso = accesos.get(filas).getArea();
                        if(acceso.equals("Z")){
                            tabla.setValueAt("General", filas, 3);
                        }else{
                            tabla.setValueAt("Restringido", filas, 3);
                        }
                        filas++;
                    }
                    labelTotal.setText(filas+"");
                }
            }

            @Override
            public void onFailure(Call<List<Acceso>> call, Throwable thrwbl) {
                JOptionPane.showMessageDialog(null, "Error en el servidor", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
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

    void setDatos(String correo, String nombre, String apellidos, String ingreso, String rfid) {
        this.correo = correo;
        labelCorreo.setText(correo);
        labelNombre.setText(apellidos+" "+nombre);
        labelIngreso.setText(ingreso);
        labelRFID.setText(rfid);
        LlenarTabla();
    }
    
}
