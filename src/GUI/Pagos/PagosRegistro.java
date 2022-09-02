package GUI.Pagos;

import API.Cliente;
import Contenedores.Plan;
import java.awt.Color;
import java.util.List;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import API.RegistroAPI;
import Contenedores.Pago;
import javax.swing.JOptionPane;
import okhttp3.ResponseBody;
import ritmosport.Eventos;
import ritmosport.Fechas;

public class PagosRegistro extends javax.swing.JDialog {
    
    Eventos evento = new Eventos();
    private List<Plan> plan;
    private List<Pago> actual;
    private boolean cli = false, combo = false;
    
    private String correo, fecini, fecfin, metodo, referencia;
    private int idplan;
    private double costo=0, adeudo=0, pago=0;

    public PagosRegistro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        labelNActual = new javax.swing.JLabel();
        labelFActual = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelInicio1 = new javax.swing.JLabel();
        labelInicio = new javax.swing.JLabel();
        labelFin1 = new javax.swing.JLabel();
        labelFin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelPeriodo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboPlanes = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        labelGimnasio = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        comboMetodo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        textReferencia = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        labelSubtotal = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        labelAdeudo = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        textCantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1143, 590));
        setMinimumSize(new java.awt.Dimension(1143, 590));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1143, 590));

        jLabel1.setBackground(new java.awt.Color(0, 153, 255));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pagos");
        jLabel1.setOpaque(true);

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
                jButton9KeyPressed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 153, 255));
        jLabel11.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Plan actual");
        jLabel11.setOpaque(true);

        labelNActual.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelNActual.setText("Sin plan");

        labelFActual.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelFActual.setText("Sin fecha");

        jLabel13.setBackground(new java.awt.Color(0, 153, 255));
        jLabel13.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Plan solicitado");
        jLabel13.setOpaque(true);

        labelInicio1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelInicio1.setText("Inicio:");

        labelInicio.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelInicio.setForeground(new java.awt.Color(0, 153, 0));
        labelInicio.setText("Selecciona un cliente");

        labelFin1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelFin1.setText("Fin: ");

        labelFin.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelFin.setForeground(new java.awt.Color(0, 153, 0));
        labelFin.setText("Selecciona un plan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addComponent(labelNActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelInicio1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelFin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelNActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(labelFActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInicio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelInicio)
                .addGap(18, 18, 18)
                .addComponent(labelFin1)
                .addGap(18, 18, 18)
                .addComponent(labelFin)
                .addGap(90, 90, 90)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel6.setText("Correo :");

        jLabel2.setBackground(new java.awt.Color(0, 153, 255));
        jLabel2.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
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
                jButton9KeyPressed(evt);
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
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jLabel7.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel7.setText("Nombre:");

        jLabel9.setBackground(new java.awt.Color(0, 153, 255));
        jLabel9.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Plan");
        jLabel9.setOpaque(true);

        labelPeriodo.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        labelPeriodo.setText("0");

        jLabel8.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel8.setText("Periodo:");

        comboPlanes.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        comboPlanes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPlanesItemStateChanged(evt);
            }
        });
        comboPlanes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton9KeyPressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel16.setText("Accesos:");

        labelGimnasio.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        labelGimnasio.setText("Gimnasio");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboPlanes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(labelPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelGimnasio, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelGimnasio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setBackground(new java.awt.Color(0, 153, 255));
        jLabel10.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
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
                jButton9KeyPressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel15.setText("Referencia:");

        textReferencia.setEditable(false);
        textReferencia.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        textReferencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton9KeyPressed(evt);
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

        jLabel17.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel17.setText("Subtotal:");

        labelSubtotal.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        labelSubtotal.setForeground(new java.awt.Color(0, 102, 102));
        labelSubtotal.setText("$ 0.00");

        jLabel18.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel18.setText("Adeudo:");

        labelAdeudo.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        labelAdeudo.setForeground(new java.awt.Color(153, 0, 0));
        labelAdeudo.setText("$ 0.00");

        jLabel19.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel19.setText("Cantidad:");

        textCantidad.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        textCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton9KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCantidadKeyTyped(evt);
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
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel12)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelAdeudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(29, 29, 29)
                        .addComponent(textCantidad)))
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
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(labelSubtotal))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(labelAdeudo))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(labelTotal))
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Salir();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        BuscarCliente();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        RealizarPago();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void comboPlanesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPlanesItemStateChanged
        EspecificarPlan(comboPlanes.getSelectedIndex(), combo);
    }//GEN-LAST:event_comboPlanesItemStateChanged

    private void comboMetodoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMetodoItemStateChanged
       if(comboMetodo.getSelectedIndex() == 0){
           textReferencia.setEditable(false);
           referencia = "N/A";
       }else{
           textReferencia.setEditable(true);
           referencia = null;
       }
    }//GEN-LAST:event_comboMetodoItemStateChanged

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

    private void textCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCantidadKeyTyped
        evento.NumerosDecimales(evt, textCantidad);
    }//GEN-LAST:event_textCantidadKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboMetodo;
    private javax.swing.JComboBox<String> comboPlanes;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelAdeudo;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelFActual;
    private javax.swing.JLabel labelFin;
    private javax.swing.JLabel labelFin1;
    private javax.swing.JLabel labelGimnasio;
    private javax.swing.JLabel labelInicio;
    private javax.swing.JLabel labelInicio1;
    private javax.swing.JLabel labelNActual;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPeriodo;
    private javax.swing.JLabel labelSubtotal;
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
        if(cli && combo){
            metodo = comboMetodo.getSelectedItem().toString();
            if(comboMetodo.getSelectedIndex() > 0){
                referencia = textReferencia.getText();
                if(referencia.isEmpty()){
                    JOptionPane.showMessageDialog(this, "Ingresa la referencia del pago", "Pago", JOptionPane.WARNING_MESSAGE);
                    return false;
                }
            }else{
                referencia = "N/A";
            }
            if(textCantidad.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Ingresa la cantidad a pagar", "Pago", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }else {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un cliente o un plan", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        int x = JOptionPane.showConfirmDialog(this, "¿Estas seguro de registrar el pago?", "Pagar", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            
            pago = Double.parseDouble(textCantidad.getText());
            if (pago < (costo + adeudo)) {
                adeudo = (costo + adeudo) - pago;
                JOptionPane.showMessageDialog(this, "El saldo negativo es de " + evento.FormatoMoneda(adeudo), "Pago", JOptionPane.WARNING_MESSAGE);
            } else if (pago > (costo + adeudo)) {
                adeudo = (costo + adeudo) - pago;
                JOptionPane.showMessageDialog(this, "El saldo positivo es de " + evento.FormatoMoneda(adeudo * -1), "Pago", JOptionPane.WARNING_MESSAGE);
            } else {
                adeudo = 0.0;
            }
            //System.out.println("1 // "+idplan+" // "+fecini+" // "+fecfin+" // "+costo+" // "+metodo+" // "+referencia+" // "+f.getFechaActual()+" // "+adeudo+" // "+pago);
            Call<ResponseBody> call = Cliente.getInstance().getMyApi().InsertarPago(correo, idplan, fecini, fecfin, costo, metodo, referencia, f.getFechaActual(), adeudo,pago);
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
    
    private void EspecificarPlan(int pos, boolean edo) {
        Fechas f = new Fechas();
        idplan = plan.get(pos).getId();
        costo = plan.get(pos).getPrecio();
        labelGimnasio.setForeground(Color.RED);
        String[] acc = plan.get(pos).getAccesos().split("-");
        for (String acc1 : acc) {
            if ("G".equals(acc1)) {
                labelGimnasio.setForeground(Color.BLUE);
            }
        }
        labelPeriodo.setText(plan.get(pos).getPeriodo()+" dias");
        labelSubtotal.setText(evento.FormatoMoneda(costo));
        labelTotal.setText(evento.FormatoMoneda(costo+adeudo));
        if (edo) {
            if (actual.isEmpty()) {
                fecini = f.getFechaActual();
                fecfin = f.SumarFechaPeriodo(fecini, plan.get(pos).getPeriodo());
                labelFin.setText("Vence : " + f.FechaTexto(fecfin));
                labelFin.setForeground(Color.red);
            } else {
                fecini = actual.get(0).getFecfin();
                fecfin = f.SumarFechaPeriodo(fecini, plan.get(pos).getPeriodo());
                labelFin.setText("Vence : " + f.FechaTexto(fecfin));
                labelFin.setForeground(Color.red);
            }
        }
    }
    
    private void BuscarCliente(){
        Fechas re = new Fechas();
        PagosBuscarCliente pbc = new PagosBuscarCliente(this,true);
        pbc.setLocationRelativeTo(null);
        pbc.CargarVentana();
        pbc.LlenarTabla(0);
        pbc.setVisible(true);
        if (pbc.Resultado()) {
            correo = pbc.Correo();
            adeudo = pbc.Adeudo();
            labelCorreo.setText(pbc.Correo());
            labelNombre.setText(pbc.Nombre());
            labelAdeudo.setText(evento.FormatoMoneda(adeudo));
            labelTotal.setText(evento.FormatoMoneda(adeudo+costo));
            cli = true;
            RegistroAPI api = Cliente.getRetrofitInstance().create(RegistroAPI.class);
            Call<List<Pago>> call = api.getPlanActual(pbc.Correo());
            call.enqueue(new Callback<List<Pago>>() {
                @Override
                public void onResponse(Call<List<Pago>> call, Response<List<Pago>> rspns) {
                    actual = rspns.body();
                    combo = true;
                    if(!actual.isEmpty()){
                        labelNActual.setText("Plan actual: " +actual.get(0).getNombre());
                        labelFActual.setText("Vencimiento:" +re.FechaTexto(actual.get(0).getFecfin()));
                        labelInicio.setText(re.FechaTexto(actual.get(0).getFecfin()));
                        labelInicio.setForeground(Color.BLUE);
                    }else{
                        labelNActual.setText("Plan actual: Sin plan");
                        labelFActual.setText("Vencimiento: Sin fecha");
                        labelInicio.setText(re.FechaTexto(re.getFechaActual()));
                        labelInicio.setForeground(Color.BLUE);
                    }
                    EspecificarPlan(0, combo);
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
    
    private void ObtenerPlanes(){
        RegistroAPI api = Cliente.getRetrofitInstance().create(RegistroAPI.class);
        Call<List<Plan>> call = api.getPlanes(1);
        call.enqueue(new Callback<List<Plan>>(){
            @Override
            public void onResponse(Call<List<Plan>> call, Response<List<Plan>> rspns) {
                plan = rspns.body();
                for (Plan plan1 : plan) {
                    comboPlanes.addItem(plan1.getNombre());
                    System.out.println(plan1.getNombre());
                }
            }

            @Override
            public void onFailure(Call<List<Plan>> call, Throwable t) {
                JOptionPane.showMessageDialog(null, "Error en el servidor >> "+t.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
        ObtenerPlanes();
        //EspecificarPlan(0,false);
    }
    
}
