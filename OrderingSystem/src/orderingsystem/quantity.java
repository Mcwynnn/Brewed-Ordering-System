/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderingsystem;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
//OTHERS
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JTextField;







/**
 *
 * @author NewUser
 */
public class quantity extends javax.swing.JFrame {
    
   

    /**
     * Creates new form quantity
     */
    public quantity() {
        initComponents();
         lblcappu.setVisible(false);
        lblmachi.setVisible(false);
        lbllatte.setVisible(false);
        lblameri.setVisible(false);
        lblflat.setVisible(false);
        lblcaramo.setVisible(false);
        lblcamo.setVisible(false);
        lblchomo.setVisible(false);
        //dessert
        lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
        
        //tea
        lblchai.setVisible(false);
        lblearl.setVisible(false);
        lbllondon.setVisible(false);
        lblroya.setVisible(false);
        lblcloud.setVisible(false);
        lblmat.setVisible(false);
        lblhon.setVisible(false);
        lbljade.setVisible(false);
        
        jButton1.setEnabled(false);
        lblfood.setVisible(false);
       add.setEnabled(false);
       
       
        
        
    }
        DefaultTableModel model;
        String  item;
        int price;
        
                
        Connection con;
        PreparedStatement pst;
        PreparedStatement pst1;
        
      
      
        
        
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        des2 = new javax.swing.JLabel();
        lblss = new javax.swing.JLabel();
        lbls = new javax.swing.JLabel();
        lblm = new javax.swing.JLabel();
        lbll = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        des1 = new javax.swing.JLabel();
        TXT2 = new javax.swing.JLabel();
        cbo3 = new javax.swing.JComboBox<>();
        cbo1 = new javax.swing.JComboBox<>();
        cbo2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        des4 = new javax.swing.JLabel();
        lblcappu = new javax.swing.JLabel();
        des3 = new javax.swing.JLabel();
        des5 = new javax.swing.JLabel();
        lblmachi = new javax.swing.JLabel();
        lbllatte = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblameri = new javax.swing.JLabel();
        lblflat = new javax.swing.JLabel();
        lblcaramo = new javax.swing.JLabel();
        lblcamo = new javax.swing.JLabel();
        lblchomo = new javax.swing.JLabel();
        lblancho = new javax.swing.JLabel();
        lbllamin = new javax.swing.JLabel();
        lblcarnita = new javax.swing.JLabel();
        lbltuna = new javax.swing.JLabel();
        lbluji = new javax.swing.JLabel();
        lblmelt = new javax.swing.JLabel();
        lblpuff = new javax.swing.JLabel();
        lblbag = new javax.swing.JLabel();
        lblchai = new javax.swing.JLabel();
        lblearl = new javax.swing.JLabel();
        lbllondon = new javax.swing.JLabel();
        lblroya = new javax.swing.JLabel();
        lblcloud = new javax.swing.JLabel();
        lblmat = new javax.swing.JLabel();
        lblhon = new javax.swing.JLabel();
        lbljade = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        lblsmall = new javax.swing.JRadioButton();
        lblmedium = new javax.swing.JRadioButton();
        lbllarge = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtbal = new javax.swing.JTextField();
        txtpay = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbli = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl16 = new javax.swing.JLabel();
        lbl17 = new javax.swing.JLabel();
        lbl18 = new javax.swing.JLabel();
        lbl19 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lbl23 = new javax.swing.JLabel();
        lbl24 = new javax.swing.JLabel();
        lbl25 = new javax.swing.JLabel();
        lbl26 = new javax.swing.JLabel();
        lbl27 = new javax.swing.JLabel();
        lbl28 = new javax.swing.JLabel();
        lbl29 = new javax.swing.JLabel();
        lbl30 = new javax.swing.JLabel();
        lbl31 = new javax.swing.JLabel();
        lbl32 = new javax.swing.JLabel();
        lbl33 = new javax.swing.JLabel();
        lbl34 = new javax.swing.JLabel();
        lbl355 = new javax.swing.JLabel();
        lbl43 = new javax.swing.JLabel();
        lbl44 = new javax.swing.JLabel();
        lbl45 = new javax.swing.JLabel();
        lbl46 = new javax.swing.JLabel();
        lbl47 = new javax.swing.JLabel();
        lbl48 = new javax.swing.JLabel();
        lbl49 = new javax.swing.JLabel();
        lbl50 = new javax.swing.JLabel();
        lbl51 = new javax.swing.JLabel();
        lbl52 = new javax.swing.JLabel();
        lbl53 = new javax.swing.JLabel();
        lbl54 = new javax.swing.JLabel();
        lbl55 = new javax.swing.JLabel();
        lbl56 = new javax.swing.JLabel();
        lbl36 = new javax.swing.JLabel();
        lbl37 = new javax.swing.JLabel();
        lbl38 = new javax.swing.JLabel();
        lbl39 = new javax.swing.JLabel();
        lbl40 = new javax.swing.JLabel();
        lbl41 = new javax.swing.JLabel();
        lbl42 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        lblfood = new javax.swing.JLabel();
        txtquantity = new javax.swing.JTextField();
        lblstock = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(99, 47, 6)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setBackground(new java.awt.Color(0, 0, 153));
        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 160, 48));

        jButton4.setBackground(new java.awt.Color(204, 0, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 160, 48));

        des2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        des2.setForeground(new java.awt.Color(99, 47, 6));
        jPanel1.add(des2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, 50));

        lblss.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblss.setForeground(new java.awt.Color(99, 47, 6));
        lblss.setText("Select a size:");
        jPanel1.add(lblss, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, 40));

        lbls.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lbls.setForeground(new java.awt.Color(99, 47, 6));
        lbls.setText("P 130.00     ");
        jPanel1.add(lbls, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 120, 40));

        lblm.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblm.setForeground(new java.awt.Color(99, 47, 6));
        lblm.setText("P 150.00     ");
        jPanel1.add(lblm, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 120, 40));

        lbll.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lbll.setForeground(new java.awt.Color(99, 47, 6));
        lbll.setText("P 170.00     ");
        jPanel1.add(lbll, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 120, 40));

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(99, 47, 6));
        jLabel8.setText("Foods: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, 40));

        des1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        des1.setForeground(new java.awt.Color(99, 47, 6));
        jPanel1.add(des1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, 50));

        TXT2.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        TXT2.setForeground(new java.awt.Color(99, 47, 6));
        TXT2.setText("kayee");
        jPanel1.add(TXT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 530, -1));

        cbo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a food", "Ancho-Chipotle Chicken", "Red Velvet Lamington", "Pork Carnitas Wrap", "Tuna Melt on Rye Bread", "Uji Matcha Chiffon Cake", "Ricotta Melting Cake", "Chocolate Creme Puffin", "Ham & Cheese Baguette" }));
        cbo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo3ActionPerformed(evt);
            }
        });
        jPanel1.add(cbo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 140, 40));

        cbo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a coffee", "Cappuccino", "Caramel Machiatto", "Caffe Latte", "Caffe Americano", "Flat White", "Caramel Mocha", "White Choco Mocha", "Caffe Mocha", " ", " ", " ", " " }));
        cbo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo1ActionPerformed(evt);
            }
        });
        jPanel1.add(cbo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 140, 40));

        cbo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a Tea", "Chai Latte", "Earl Grey Tea", "London Fog Tea", "Royal English Tea", "Emperor’s Clouds & Mist", "Matcha Tea", "Honey Citrus Mint Tea", "Jade Citrus Mint Tea", " ", " " }));
        cbo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo2ActionPerformed(evt);
            }
        });
        jPanel1.add(cbo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 140, 40));

        jButton1.setBackground(new java.awt.Color(99, 47, 6));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 160, 50));

        jButton2.setBackground(new java.awt.Color(99, 47, 6));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Show Image and Description");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 220, -1));

        des4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        des4.setForeground(new java.awt.Color(204, 0, 51));
        jPanel1.add(des4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, 50));

        lblcappu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/cappu1.png"))); // NOI18N
        jPanel1.add(lblcappu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 200, 220));

        des3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        des3.setForeground(new java.awt.Color(99, 47, 6));
        jPanel1.add(des3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, 40));

        des5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        des5.setForeground(new java.awt.Color(204, 0, 51));
        jPanel1.add(des5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, 50));

        lblmachi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/Caramel Macchiato.jpg"))); // NOI18N
        jPanel1.add(lblmachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lbllatte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/caffe_latteee.jpg"))); // NOI18N
        jPanel1.add(lbllatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(99, 47, 6));
        jLabel9.setText("Balance:   ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 480, 100, 40));

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(99, 47, 6));
        jLabel10.setText("Beverages:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 40));

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(99, 47, 6));
        jLabel11.setText("Teas:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, 40));

        lblameri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/caffe_americano.jpg"))); // NOI18N
        lblameri.setText("jLabel2");
        jPanel1.add(lblameri, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lblflat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/flatwhite.jpg"))); // NOI18N
        jPanel1.add(lblflat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lblcaramo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/caramel_mocha.jpg"))); // NOI18N
        jPanel1.add(lblcaramo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lblcamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/caffe_mocha.jpg"))); // NOI18N
        jPanel1.add(lblcamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lblchomo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/White Chocolate Mocha.jpg"))); // NOI18N
        jPanel1.add(lblchomo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lblancho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/Ancho-Chipotle Chicken Panini.png"))); // NOI18N
        jPanel1.add(lblancho, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lbllamin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/Red Velvet Lamington.png"))); // NOI18N
        jPanel1.add(lbllamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lblcarnita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/CARNITAD.png"))); // NOI18N
        jPanel1.add(lblcarnita, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lbltuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/tuna.png"))); // NOI18N
        jPanel1.add(lbltuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lbluji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/Uji Matcha Chiffon Cake (Japan).png"))); // NOI18N
        jPanel1.add(lbluji, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lblmelt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/CAKE.png"))); // NOI18N
        jPanel1.add(lblmelt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lblpuff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/Chocolate Creme Puffin.png"))); // NOI18N
        jPanel1.add(lblpuff, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lblbag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/b.png"))); // NOI18N
        jPanel1.add(lblbag, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lblchai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/Chai Latte.png"))); // NOI18N
        jPanel1.add(lblchai, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lblearl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/Earl Grey Tea.png"))); // NOI18N
        jPanel1.add(lblearl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lbllondon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/London Fog Tea Latte.png"))); // NOI18N
        lbllondon.setText("jLabel2");
        jPanel1.add(lbllondon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lblroya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/roya.png"))); // NOI18N
        jPanel1.add(lblroya, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lblcloud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/cloud.png"))); // NOI18N
        jPanel1.add(lblcloud, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lblmat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/mat.png"))); // NOI18N
        jPanel1.add(lblmat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lblhon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/hon.png"))); // NOI18N
        jPanel1.add(lblhon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lbljade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/jade.png"))); // NOI18N
        jPanel1.add(lbljade, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        jTable1.setForeground(new java.awt.Color(99, 47, 6));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Order Type", "Item", "Price", "Quantity", "Total"
            }
        ));
        jScrollPane2.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleName("");
        jTable1.getAccessibleContext().setAccessibleDescription("");

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 650, 110));

        lblsmall.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblsmall.setForeground(new java.awt.Color(99, 47, 6));
        lblsmall.setText("Small  ");
        lblsmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblsmallActionPerformed(evt);
            }
        });
        jPanel1.add(lblsmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 120, -1));

        lblmedium.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblmedium.setForeground(new java.awt.Color(99, 47, 6));
        lblmedium.setText("Medium  ");
        lblmedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblmediumActionPerformed(evt);
            }
        });
        jPanel1.add(lblmedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 120, -1));

        lbllarge.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lbllarge.setForeground(new java.awt.Color(99, 47, 6));
        lbllarge.setText("Large  ");
        lbllarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbllargeActionPerformed(evt);
            }
        });
        jPanel1.add(lbllarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 120, -1));

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(99, 47, 6));
        jLabel6.setText("Hello,");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, -1, -1));

        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });
        jPanel1.add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 340, 130, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/logsss.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 190, 170));

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Remove Item");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, 160, 50));

        jLabel2.setFont(new java.awt.Font("Arial Nova Cond Light", 0, 24)); // NOI18N
        jLabel2.setText("Adding moments of perfect sip.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 290, 40));

        jLabel3.setFont(new java.awt.Font("Arial Nova Cond Light", 0, 48)); // NOI18N
        jLabel3.setText("Brewed");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, 150, 40));
        jPanel1.add(txtbal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 470, 130, 50));

        txtpay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpayKeyPressed(evt);
            }
        });
        jPanel1.add(txtpay, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 400, 130, 50));

        jLabel12.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(99, 47, 6));
        jLabel12.setText("Quantity:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, 40));

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(99, 47, 6));
        jLabel13.setText("Total:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 360, 70, 40));

        jLabel14.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(99, 47, 6));
        jLabel14.setText("Payment:   ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 410, 100, 40));

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("EXIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 160, 50));

        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 450, -1, -1));

        lbli.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbli, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 150, 60));

        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, -1));

        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, -1));

        lbl3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, -1, -1));

        lbl4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        lbl5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, -1));

        lbl6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, -1, -1));

        lbl7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, -1, -1));

        lbl8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, -1));

        lbl9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        lbl10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));

        lbl11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        lbl13.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, -1, -1));

        lbl14.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, -1, -1));

        lbl15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, -1, -1));

        lbl16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl16, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, -1, -1));

        lbl17.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl17, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, -1, -1));

        lbl18.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, -1, -1));

        lbl19.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl19, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, -1, -1));

        lbl20.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl20, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, -1, -1));

        lbl21.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl21, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, -1, -1));

        lbl22.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl22, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, -1, -1));

        lbl23.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl23, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, -1, -1));

        lbl24.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl24, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, -1, -1));

        lbl25.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl25, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, -1, -1));

        lbl26.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl26, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, -1, -1));

        lbl27.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl27, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, -1, -1));

        lbl28.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl28, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, -1, -1));

        lbl29.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl29, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, -1, -1));

        lbl30.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl30, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, -1, -1));

        lbl31.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl31, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 510, -1, -1));

        lbl32.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl32, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, -1, -1));

        lbl33.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl33, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, -1, -1));

        lbl34.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl34, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, -1, -1));

        lbl355.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl355, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, -1, -1));

        lbl43.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl43, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, -1, -1));

        lbl44.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl44, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, -1, -1));

        lbl45.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl45, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, -1, -1));

        lbl46.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl46, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, -1, -1));

        lbl47.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl47, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 430, -1, -1));

        lbl48.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl48, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, -1, -1));

        lbl49.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl49, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, -1, -1));

        lbl50.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl50, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, -1, -1));

        lbl51.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl51, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, -1, -1));

        lbl52.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl52, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, -1, -1));

        lbl53.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl53, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 350, -1, -1));

        lbl54.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl54, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, -1, -1));

        lbl55.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl55, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, -1, -1));

        lbl56.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl56, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, -1, -1));

        lbl36.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl36, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, -1, -1));

        lbl37.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl37, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, -1, -1));

        lbl38.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl38, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, -1, -1));

        lbl39.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl39, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, -1, -1));

        lbl40.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl40, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, -1, -1));

        lbl41.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl41, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 510, -1, -1));

        lbl42.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl42, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, -1, -1));

        lbl12.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, -1, -1));

        jButton6.setBackground(new java.awt.Color(99, 47, 6));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Print Receipt");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 550, 160, 50));

        lblfood.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblfood.setText("PRICE: 130");
        jPanel1.add(lblfood, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        txtquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquantityActionPerformed(evt);
            }
        });
        jPanel1.add(txtquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 120, 30));

        lblstock.setText("STOCK:");
        jPanel1.add(lblstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
           
       int cappu =200;
       int qtyy= Integer.parseInt(txtquantity.getText());
    
   
        //Cappucino
        if(cbo1.getSelectedItem().equals("Cappuccino")&&lblsmall.isSelected() ==  true){
           item="Cappucino(S)";
            price = 130;
            lbli.setText("Cappucino(S)");
            lbl1.setText("\nCappucino(S)");
            lblstock.setText("Stock: 200");
            
            String total=String.valueOf((cappu-qtyy));
   
            lblstock.setText("Stock: "+total);
            
            
          
            
            
            
            
        }else if(cbo1.getSelectedItem().equals("Cappuccino")&&lblmedium.isSelected() ==  true){
            item="Cappucino(M)";
            price =  150;
             lbli.setText("Cappucino(M)");
             lbl2.setText("\nCappucino(M)");
 
            
            
        }else if(cbo1.getSelectedItem().equals("Cappuccino")&&lbllarge.isSelected() ==  true){
            item="Cappucino(L)";
            price = 170;
             lbli.setText("Cappucino(L)");
             lbl3.setText("\nCappucino(L)");
            
            
            //Macchiatto
        }else if(cbo1.getSelectedItem().equals("Caramel Machiatto")&&lblsmall.isSelected() == true){
            item="Caramel Machiatto(S)";
            price = 130;
             lbli.setText("Caramel Machiatto(S)");
              lbl4.setText("\nCaramel Machiatto(S)");
          


        }else if(cbo1.getSelectedItem().equals("Caramel Machiatto")&&lblmedium.isSelected() == true){
            item="Caramel Machiatto(M)";
            price = 150;
            lbli.setText("Caramel Machiatto(M)");
            lbl5.setText("\nCaramel Machiatto(M)");
         


        }else if(cbo1.getSelectedItem().equals("Caramel Machiatto")&&lbllarge.isSelected() == true){
            item="Caramel Machiatto(L)";
            price = 170;
            lbli.setText("Caramel Machiatto(L)");
            lbl6.setText("\nCaramel Machiatto(L)");
         
            
            //Caffe Latte
            
        }else if(cbo1.getSelectedItem().equals("Caffe Latte")&&lblsmall.isSelected() == true){
            item="Caffe Latte(S)";
            price = 130;
            lbli.setText("Caffe Latte(S)");
            lbl7.setText("\nCaffe Latte(S)");



        }else if(cbo1.getSelectedItem().equals("Caffe Latte")&&lblmedium.isSelected() == true){
            item="Caffe Latte(M)";
            price = 150;
            lbli.setText("Caffe Latte(M)");
            lbl8.setText("\nCaffe Latte(M)");



        }else if(cbo1.getSelectedItem().equals("Caffe Latte")&&lbllarge.isSelected() == true){
            item="Caffe Latte(L)";
            price = 170;
            lbli.setText("Caffe Latte(L)");
            lbl9.setText("\nCaffe Latte(L)");
    

           //Caffe Americano
        }else if(cbo1.getSelectedItem().equals("Caffe Americano")&&lblsmall.isSelected() == true){
            item="Caffe Americano(S)";
            price = 130;
            lbli.setText("Caffe Americano(S)");
            lbl10.setText("\nCaffe Americano(S)");
     

        }else if(cbo1.getSelectedItem().equals("Caffe Americano")&&lblmedium.isSelected() == true){
            item="Caffe Americano(M)";
            price = 150;
            lbli.setText("Caffe Americano(M)");
            lbl11.setText("\nCaffe Americano(M)");
         

        }else if(cbo1.getSelectedItem().equals("Caffe Americano")&&lbllarge.isSelected() == true){
            item="Caffe Americano(L)";
            price = 170;
            lbli.setText("Caffe Americano(L)");
            lbl12.setText("\nCaffe Americano(L)");
       
            
            //flat white
        }else if(cbo1.getSelectedItem().equals("Flat White")&&lblsmall.isSelected() == true){
            item="Flat White(S)";
            price = 130;
            lbli.setText("Flat White(S)");
            lbl13.setText("\nFlat White(S)");
          


        }else if(cbo1.getSelectedItem().equals("Flat White")&&lblmedium.isSelected() == true){
            item="Flat White(M)";
            price = 150;
            lbli.setText("Flat White(M)");
            lbl14.setText("\nFlat White(M)");
           

        }else if(cbo1.getSelectedItem().equals("Flat White")&&lbllarge.isSelected() == true){
            item="Flat White(L)";
            price = 170;
            lbli.setText("Flat White(L)");
            lbl15.setText("\nFlat White(L)");
        
            //Caramel
        }else if(cbo1.getSelectedItem().equals("Caramel Mocha")&&lblsmall.isSelected() == true){
            item="Caramel Mocha(S)";
            price = 130;
            lbli.setText("Caramel Mocha(S)");
            lbl16.setText("\nCaramel Mocha(S)");
        



        }else if(cbo1.getSelectedItem().equals("Caramel Mocha")&&lblmedium.isSelected() == true){
            item="Caramel Mocha(M)";
            price = 150;
            lbli.setText("Caramel Mocha(M)");
            lbl17.setText("\nCaramel Mocha(M)");
          

        }else if(cbo1.getSelectedItem().equals("Caramel Mocha")&&lbllarge.isSelected() == true){
            item="Caramel Mocha(L)";
            price = 170;
            lbli.setText("Caramel Mocha(L)");
            lbl18.setText("\nCaramel Mocha(L)");
       
            //choco
        }else if(cbo1.getSelectedItem().equals("White Choco Mocha")&&lblsmall.isSelected() == true){
            item="White Choco Mocha(S)";
            price = 130;
            lbli.setText("White Choco Mocha(S)");
            lbl19.setText("\nWhite Choco Mocha(S)");
        

        }else if(cbo1.getSelectedItem().equals("White Choco Mocha")&&lblmedium.isSelected() == true){
            item="White Choco Mocha(M)";
            price = 150;
            lbli.setText("White Choco Mocha(M)");
            lbl20.setText("\nWhite Choco Mocha(M)");
       

        }else if(cbo1.getSelectedItem().equals("White Choco Mocha")&&lbllarge.isSelected() == true){
            item="White Choco Mocha(L)";
            price = 170;
            lbli.setText("White Choco Mocha(L)");
            lbl21.setText("\nWhite Choco Mocha(L)");
        
         }else if(cbo1.getSelectedItem().equals("Caffe Mocha")&&lblsmall.isSelected() == true){
            item="Caffe Mocha(S)";
            price = 130;
            lbli.setText("Caffe Mocha(S)");
            lbl22.setText("\nCaffe Mocha(S)");
         

        }else if(cbo1.getSelectedItem().equals("Caffe Mocha")&&lblmedium.isSelected() == true){
            item="Caffe Mocha(M)";
            price = 150;
            lbli.setText("Caffe Mocha(M)");
            lbl23.setText("\nCaffe Mocha(M)");
         

        }else if(cbo1.getSelectedItem().equals("Caffe Mocha")&&lbllarge.isSelected() == true){
            item="Caffe Mocha(L)";
            price = 170;
            lbli.setText("Caffe Mocha(L)");
            lbl24.setText("\nCaffe Mocha(L)");
       
      //TEAAAAAAAAAAAAA
      

        }else if(cbo2.getSelectedItem().equals("Chai Latte")&&lblsmall.isSelected() == true){
            item="Chai Latte(S)";
            price = 30;
            lbli.setText("Chai Latte(S)");
            lbl25.setText("\nChai Latte(S)");
       

        }else if(cbo2.getSelectedItem().equals("Chai Latte")&&lblmedium.isSelected() == true){
            item="Chai Latte(M)";
            price = 50;
            lbli.setText("Chai Latte(M)");
            lbl26.setText("\nChai Latte(M)");
        


        }else if(cbo2.getSelectedItem().equals("Chai Latte")&&lbllarge.isSelected() == true){
            item="Chai Latte(L)";
            price = 70;
            lbli.setText("Chai Latte(L)");
            lbl27.setText("\nChai Latte(L)");
      

        }else if(cbo2.getSelectedItem().equals("Earl Grey Tea")&&lblsmall.isSelected() == true){
            item="Earl Grey Tea(S)";
            price = 30;
            lbli.setText("Earl Grey Tea(S)");
            lbl28.setText("\nEarl Grey Tea(S)");
        

        }else if(cbo2.getSelectedItem().equals("Earl Grey Tea")&&lblmedium.isSelected() == true){
            item="Earl Grey Tea(M)";
            price = 50;
            lbli.setText("Earl Grey Tea(M)");
            lbl29.setText("\nEarl Grey Tea(M)");
       

        }else if(cbo2.getSelectedItem().equals("Earl Grey Tea")&&lbllarge.isSelected() == true){
            item="Earl Grey Tea(L)";
            price = 70;
            lbli.setText("Earl Grey Tea(L)");
            lbl30.setText("\nEarl Grey Tea(L)");
           

        }else if(cbo2.getSelectedItem().equals("London Fog Tea")&&lblsmall.isSelected() == true){
            item="London Fog Tea(S)";
            price = 30;
            lbli.setText("London Fog Tea(S)");
            lbl31.setText("\nLondon Fog Tea(S)");
          

        }else if(cbo2.getSelectedItem().equals("London Fog Tea")&&lblmedium.isSelected() == true){
            item="London Fog Tea(M)";
            price = 50;
            lbli.setText("London Fog Tea(M)");
            lbl32.setText("\nLondon Fog Tea(M)");
           

        }else if(cbo2.getSelectedItem().equals("London Fog Tea")&&lbllarge.isSelected() == true){
            item="London Fog Tea(L)";
            price = 70;
            lbli.setText("London Fog Tea(L)");
            lbl33.setText("\nLondon Fog Tea(L)");
           
        }else if(cbo2.getSelectedItem().equals("Royal English Tea")&&lblsmall.isSelected() == true){
            item="Royal English Tea(S)";
            price = 30;
            lbli.setText("Royal English Tea(S)");
            lbl34.setText("\nRoyal English Tea(S)");
            
        }else if(cbo2.getSelectedItem().equals("Royal English Tea")&&lblmedium.isSelected() == true){
            item="Royal English Tea(M)";
            price = 50;
            lbli.setText("Royal English Tea(M)");
            lbl355.setText("\nRoyal English Tea(M)");
           
        }else if(cbo2.getSelectedItem().equals("Royal English Tea")&&lbllarge.isSelected() == true){
            item="Royal English Tea(L)";
            price = 70;
            lbli.setText("Royal English Tea(L)");
            lbl36.setText("\nRoyal English Tea(L)");
          

        }else if(cbo2.getSelectedItem().equals("Emperor’s Clouds & Mist")&&lblsmall.isSelected() == true){
            item="Emperor’s Clouds & Mist(S)";
            price = 30;
            lbli.setText("Emperor’s Clouds & Mist(S)");
            lbl37.setText("\nEmperor’s Clouds & Mist(S)");
           

        }else if(cbo2.getSelectedItem().equals("Emperor’s Clouds & Mist")&&lblmedium.isSelected() == true){
            item="Emperor’s Clouds & Mist(M)";
            price = 50;
            lbli.setText("Emperor’s Clouds & Mist(M)");
            lbl38.setText("\nEmperor’s Clouds & Mist(M)");
           


        }else if(cbo2.getSelectedItem().equals("Emperor’s Clouds & Mist")&&lbllarge.isSelected() == true){
            item="Emperor’s Clouds & Mist(L)";
            price = 70;
            lbli.setText("Emperor’s Clouds & Mist(L)");
            lbl39.setText("\nEmperor’s Clouds & Mist(L)");
          
        }else if(cbo2.getSelectedItem().equals("Matcha Tea")&&lblsmall.isSelected() == true){
            item="Matcha Tea(S)";
            price = 30;
            lbli.setText("Matcha Tea(S)");
            lbl40.setText("\nMatcha Tea(S)");
          

        }else if(cbo2.getSelectedItem().equals("Matcha Tea")&&lblmedium.isSelected() == true){
            item="Matcha Tea(M)";
            price = 50;
            lbli.setText("Matcha Tea(M)");
            lbl41.setText("\nMatcha Tea(M)");
          

        }else if(cbo2.getSelectedItem().equals("Matcha Tea")&&lbllarge.isSelected() == true){
            item="Matcha Tea(L)";
            price = 70;
            lbli.setText("Matcha Tea(L)");
            lbl42.setText("\nMatcha Tea(L)");
         
        }else if(cbo2.getSelectedItem().equals("Honey Citrus Mint Tea")&&lblsmall.isSelected() == true){
            item="Honey Citrus Mint Tea(S)";
            price = 30;
            lbli.setText("Honey Citrus Mint Tea(S)");
            lbl43.setText("\nHoney Citrus Mint Tea(S)"); 
         

        }else if(cbo2.getSelectedItem().equals("Honey Citrus Mint Tea")&&lblmedium.isSelected() == true){
            item="Honey Citrus Mint Tea(M)";
            price = 50;
            lbli.setText("Honey Citrus Mint Tea(M)");
            lbl44.setText("\nHoney Citrus Mint Tea(M)");
      

        }else if(cbo2.getSelectedItem().equals("Honey Citrus Mint Tea")&&lbllarge.isSelected() == true){
            item="Honey Citrus Mint Tea(L)";
            price = 70;
            lbli.setText("Honey Citrus Mint Tea(L)");
            lbl45.setText("\nHoney Citrus Mint Tea(L)");
     
        }else if(cbo2.getSelectedItem().equals("Jade Citrus Mint Tea")&&lblsmall.isSelected() == true){
            item="Jade Citrus Mint Tea(S)";
            price = 30;
            lbli.setText("Jade Citrus Mint Tea(S)");
            lbl46.setText("\nJade Citrus Mint Tea(S)");
        

        }else if(cbo2.getSelectedItem().equals("Jade Citrus Mint Tea")&&lblmedium.isSelected() == true){
            
            item="Jade Citrus Mint Tea(M)";
            price = 50;
            lbli.setText("Jade Citrus Mint Tea(M)");
            lbl47.setText("\nJade Citrus Mint Tea(M)");
          

        }else if(cbo2.getSelectedItem().equals("Jade Citrus Mint Tea")&&lbllarge.isSelected() == true){
            item="Jade Citrus Mint Tea(L)";
            price = 70;
            lbli.setText("Jade Citrus Mint Tea(L)");
            lbl48.setText("\nJade Citrus Mint Tea(L)");
            //FOOOOOOOOOOOOOOOD

        }else if(cbo3.getSelectedItem().equals("Ancho-Chipotle Chicken")){
            item="Ancho-Chipotle Chicken";
            price = 89;
            lbli.setText("Ancho-Chipotle Chicken");
            lbl49.setText("\nAncho-Chipotle Chicken");
         
       
            
        }else if(cbo3.getSelectedItem().equals("Red Velvet Lamington")){
            item="Red Velvet Lamington";
            price = 79;
            lbli.setText("Red Velvet Lamington");
            lbl50.setText("\nRed Velvet Lamington");
        
            
       
        }else if(cbo3.getSelectedItem().equals("Pork Carnitas Wrap")){
            item="Pork Carnitas Wrap";
            price = 99;
            lbli.setText("Pork Carnitas Wrap");
            lbl51.setText("\nPork Carnitas Wrap");
            
            
        
            
        }else if(cbo3.getSelectedItem().equals("Tuna Melt on Rye Bread")){
            item="Tuna Melt on Rye Bread";
            price = 105;
            lbli.setText("Tuna Melt on Rye Bread");
            lbl52.setText("\nTuna Melt on Rye Bread");
            
            
      
            
        }else if(cbo3.getSelectedItem().equals("Uji Matcha Chiffon Cake")){
            item="Uji Matcha Chiffon Cake";
            price = 120;
            lbli.setText("Uji Matcha Chiffon Cake");
            lbl53.setText("\nUji Matcha Chiffon Cake");
            
            
        
            
        }else if(cbo3.getSelectedItem().equals("Ricotta Melting Cake")){
            item="Ricotta Melting Cake";
            price = 130;
            lbli.setText("Ricotta Melting Cake");
            lbl54.setText("\nRicotta Melting Cake");
          
            
      
            
        }else if(cbo3.getSelectedItem().equals("Chocolate Creme Puffin")){
            item="Chocolate Creme Puffin";
            price = 88;
            lbli.setText("Chocolate Creme Puffin");
            lbl55.setText("\nChocolate Creme Puffin");
           
            
      
            
        }else if(cbo3.getSelectedItem().equals("Ham & Cheese Baguette")){
            item="Ham & Cheese Baguette";
            price = 110;
            lbli.setText("Ham & Cheese Baguette");
            lbl56.setText("\nHam & Cheese Baguette");
        }else if(qtyy>cappu){
            JOptionPane.showMessageDialog(null,"Sorry, we only have 200 cups per day.");
            
            
        
            
            
        }else{
            JOptionPane.showMessageDialog(null,"Please fill up the form!");
        }
       
        cbo1.setSelectedItem("Choose a coffee");
        cbo2.setSelectedItem("Choose a Tea");
        cbo3.setSelectedItem("Choose a food");
        //date
        
        
        
        String names = (name.txt1.getText());
        String Otype = (Inout.inout.getText());
        
       int qty = Integer.parseInt(txtquantity.getText().toString());
       int tot = qty * price;
       
       model = (DefaultTableModel)jTable1.getModel();
       model.addRow(new Object[]
       {
           names,
           Otype,
           
           item,
           price,
           qty,
           tot
           
              
       });
              int sum = 0;
              for(int a=0; a<jTable1.getRowCount(); a++){
                  sum = sum + Integer.parseInt(jTable1.getValueAt(a, 5).toString()); 
              }
              txttotal.setText(Integer.toString(sum));
       
       
        
        
       /** 
           
           
           
     
    }//GEN-LAST:event_addActionPerformed
*/  
       txtquantity.setText("");
       cbo1.setSelectedItem("Choose a coffee");
       cbo2.setSelectedItem("Choose a Tea");
       cbo3.setSelectedItem("Choose a food");
       lblsmall.setSelected(false);
       lblmedium.setSelected(false);
       lbllarge.setSelected(false);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        int tot = Integer.parseInt(txttotal.getText());
        int pay = Integer.parseInt(txtpay.getText());
        int bal= pay-tot;
        
        
        if(pay<tot){
            JOptionPane.showMessageDialog(null,"Please input higher amount.");
        txtpay.setText("");
        }else{
            txtbal.setText(String.valueOf(bal));
            JOptionPane.showMessageDialog(null,"Successfully Ordered!\nYou can now print the receipt and proceed to the cashier.\nThank You!");
             
            try {
                sales();
            } catch (SQLException ex) {
                Logger.getLogger(quantity.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo1ActionPerformed
    
    }//GEN-LAST:event_cbo1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int cap=200;
        
        if(cbo1.getSelectedItem().equals("Cappuccino")){
            
            
            des1.setText("Dark, rich espresso lies in wait under a smoothed stretched  ");
            des2.setText("layer of thick milk foam. An alchemy of barista artistry and craft. ");
            des3.setText("");
            des4.setText("*Best Seller!");
           des5.setText("");
           lblcappu.setVisible(true);
           lblmachi.setVisible(false);
           lbllatte.setVisible(false);
           lblameri.setVisible(false);
           lblflat.setVisible(false);
           lblcaramo.setVisible(false);
           lblchomo.setVisible(false);
           lblcamo.setVisible(false);
              lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
         lblchai.setVisible(false);
        lblearl.setVisible(false);
        lbllondon.setVisible(false);
        lblroya.setVisible(false);
        lblcloud.setVisible(false);
        lblmat.setVisible(false);
        lblhon.setVisible(false);
        lbljade.setVisible(false);
        //invisible
           lblsmall.setVisible(true);
           lblmedium.setVisible(true);
           lbllarge.setVisible(true);
           lbls.setVisible(true);
            lblss.setVisible(true);
           lblm.setVisible(true);
           lbll.setVisible(true);
           lblfood.setVisible(false);
           
           int st = Integer.parseInt(txtquantity.getText().toString());
           String ca=String.valueOf((cap-st));
   
    lblstock.setText(ca);
        
         
        
        }else if(cbo1.getSelectedItem().equals("Caramel Machiatto")){
            des1.setText("Freshly steamed milk with vanilla-flavored syrup marked with  ");
            des2.setText("espresso and topped with a caramel drizzle for an oh-so-sweet finish.");
            des3.setText("");
            des4.setText("*Best Seller!");
            des5.setText("");
            lblmachi.setVisible(true);
            lblcappu.setVisible(false);
            lbllatte.setVisible(false);
            lblameri.setVisible(false);
            lblflat.setVisible(false);
            lblcaramo.setVisible(false);
            lblchomo.setVisible(false);
            lblcamo.setVisible(false);
               lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
         lblchai.setVisible(false);
        lblearl.setVisible(false);
        lbllondon.setVisible(false);
        lblroya.setVisible(false);
        lblcloud.setVisible(false);
        lblmat.setVisible(false);
        lblhon.setVisible(false);
        lbljade.setVisible(false);
          //invisible
           lblsmall.setVisible(true);
           lblmedium.setVisible(true);
           lbllarge.setVisible(true);
           lbls.setVisible(true);
            lblss.setVisible(true);
           lblm.setVisible(true);
           lbll.setVisible(true);
           lblfood.setVisible(false);
       
        
        }else if(cbo1.getSelectedItem().equals("Caffe Latte")){
            des1.setText("Our dark, rich espresso balanced with steamed milk and a light  ");
            des2.setText("layer of foam. A perfect milk-forward warm-up."); 
            des3.setText("");
            des4.setText("*Best Seller!");
            des5.setText("");
            lbllatte.setVisible(true);
            lblcappu.setVisible(false);
            lblmachi.setVisible(false);
            lblameri.setVisible(false);
            lblflat.setVisible(false);
            lblcaramo.setVisible(false);
            lblchomo.setVisible(false);
            lblcamo.setVisible(false);
               lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
         lblchai.setVisible(false);
        lblearl.setVisible(false);
        lbllondon.setVisible(false);
        lblroya.setVisible(false);
        lblcloud.setVisible(false);
        lblmat.setVisible(false);
        lblhon.setVisible(false);
        lbljade.setVisible(false);
          //invisible
           lblsmall.setVisible(true);
           lblmedium.setVisible(true);
           lbllarge.setVisible(true);
           lbls.setVisible(true);
            lblss.setVisible(true);
           lblm.setVisible(true);
           lbll.setVisible(true);
           lblfood.setVisible(false);
       
        } else if(cbo1.getSelectedItem().equals("Caffe Americano")){
            des1.setText("Espresso shots topped with hot water create a light layer of crema  ");
            des2.setText("culminating in this wonderfully rich cup with depth and nuance.  ");
            des3.setText("");
            des4.setText("Pro Tip: For an additional boost, ask your barista to try this with an");
            des5.setText("extra shot.");
            lblameri.setVisible(true);
            lblcappu.setVisible(false);
           lblmachi.setVisible(false);
           lbllatte.setVisible(false);
           lblflat.setVisible(false);
           lblcaramo.setVisible(false);
           lblchomo.setVisible(false);
           lblcamo.setVisible(false);
              lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
         lblchai.setVisible(false);
        lblearl.setVisible(false);
        lbllondon.setVisible(false);
        lblroya.setVisible(false);
        lblcloud.setVisible(false);
        lblmat.setVisible(false);
        lblhon.setVisible(false);
        lbljade.setVisible(false);
          //invisible
           lblsmall.setVisible(true);
           lblmedium.setVisible(true);
           lbllarge.setVisible(true);
           lbls.setVisible(true);
            lblss.setVisible(true);
           lblm.setVisible(true);
           lbll.setVisible(true);
           lblfood.setVisible(false);
        }else if(cbo1.getSelectedItem().equals("Flat White")){
            des1.setText("Smooth ristretto shots of espresso get the perfect amount of  ");
            des2.setText("steamed whole milk to create a not-too-strong, not-too-creamy, ");
            des3.setText("just-right flavor.");
            des4.setText("");
            des5.setText("");
            lblflat.setVisible(true);
            lblcappu.setVisible(false);
           lblmachi.setVisible(false);
           lbllatte.setVisible(false);
           lblameri.setVisible(false);
           lblcaramo.setVisible(false);
           lblchomo.setVisible(false);
           lblcamo.setVisible(false);
              lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
         lblchai.setVisible(false);
        lblearl.setVisible(false);
        lbllondon.setVisible(false);
        lblroya.setVisible(false);
        lblcloud.setVisible(false);
        lblmat.setVisible(false);
        lblhon.setVisible(false);
        lbljade.setVisible(false);
         //invisible
           lblsmall.setVisible(true);
           lblmedium.setVisible(true);
           lbllarge.setVisible(true);
           lbls.setVisible(true);
            lblss.setVisible(true);
           lblm.setVisible(true);
           lbll.setVisible(true);
           lblfood.setVisible(false);
        }else if(cbo1.getSelectedItem().equals("Caramel Mocha")){
            des1.setText("Dark, rich espresso lies in wait under a smoothed stretched  ");
            des2.setText("layer of thick milk foam. An alchemy of barista artistry and craft.");  
            des3.setText("");
            des4.setText("*Best Seller!");
            des5.setText("");
            lblcaramo.setVisible(true);
            lblcappu.setVisible(false);
           lblmachi.setVisible(false);
           lbllatte.setVisible(false);
           lblameri.setVisible(false);
           lblflat.setVisible(false);
           lblchomo.setVisible(false);
           lblcamo.setVisible(false);
              lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
         lblchai.setVisible(false);
        lblearl.setVisible(false);
        lbllondon.setVisible(false);
        lblroya.setVisible(false);
        lblcloud.setVisible(false);
        lblmat.setVisible(false);
        lblhon.setVisible(false);
        lbljade.setVisible(false);
          //invisible
           lblsmall.setVisible(true);
           lblmedium.setVisible(true);
           lbllarge.setVisible(true);
           lbls.setVisible(true);
            lblss.setVisible(true);
           lblm.setVisible(true);
           lbll.setVisible(true);
           lblfood.setVisible(false);
        } else if(cbo1.getSelectedItem().equals("White Choco Mocha")){
            des1.setText("Our signature espresso meets white chocolate sauce and  ");
            des2.setText("steamed milk, and then is finished off with sweetened whipped");   
            des3.setText("cream to create this supreme white chocolate delight.");
            des4.setText("");
            des5.setText("");
            lblchomo.setVisible(true);
           lblcappu.setVisible(false);
           lblmachi.setVisible(false);
           lbllatte.setVisible(false);
           lblameri.setVisible(false);
           lblflat.setVisible(false);
           lblcaramo.setVisible(false);
           lblcamo.setVisible(false);
              lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
         lblchai.setVisible(false);
        lblearl.setVisible(false);
        lbllondon.setVisible(false);
        lblroya.setVisible(false);
        lblcloud.setVisible(false);
        lblmat.setVisible(false);
        lblhon.setVisible(false);
        lbljade.setVisible(false);
          //invisible
           lblsmall.setVisible(true);
           lblmedium.setVisible(true);
           lbllarge.setVisible(true);
           lbls.setVisible(true);
            lblss.setVisible(true);
           lblm.setVisible(true);
           lbll.setVisible(true);
           lblfood.setVisible(false);
        } else if(cbo1.getSelectedItem().equals("Caffe Mocha")){
            des1.setText("Our rich, full-bodied espresso combined with bittersweet mocha  ");
            des2.setText("sauce and steamed milk, then topped with sweetened whipped");  
            des3.setText("cream. The classic coffee drink that always sweetly satisfies.");
            des4.setText("");
            des5.setText("");
             lblcamo.setVisible(true);
            lblchomo.setVisible(false);
           lblcappu.setVisible(false);
           lblmachi.setVisible(false);
           lbllatte.setVisible(false);
           lblameri.setVisible(false);
           lblflat.setVisible(false);
           lblcaramo.setVisible(false);
              lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
         lblchai.setVisible(false);
        lblearl.setVisible(false);
        lbllondon.setVisible(false);
        lblroya.setVisible(false);
        lblcloud.setVisible(false);
        lblmat.setVisible(false);
        lblhon.setVisible(false);
        lbljade.setVisible(false);
           //invisible
           lblsmall.setVisible(true);
           lblmedium.setVisible(true);
           lbllarge.setVisible(true);
           lbls.setVisible(true);
            lblss.setVisible(true);
           lblm.setVisible(true);
           lbll.setVisible(true);
           lblfood.setVisible(false);
           
           // EEEEEENNDD OF CBO1
           
           
           
           }else if(cbo2.getSelectedItem().equals("Chai Latte")){
            
            
            des1.setText("Black tea infused with cinnamon, clove and other warming ");
            des2.setText("spices is combined with steamed milk and topped with foam");
            des3.setText("for the perfect balance of sweet and spicy. An iconic chai cup");
            des4.setText("");
           des5.setText("");
            lblchai.setVisible(true);
        lblearl.setVisible(false);
        lbllondon.setVisible(false);
        lblroya.setVisible(false);
        lblcloud.setVisible(false);
        lblmat.setVisible(false);
        lblhon.setVisible(false);
        lbljade.setVisible(false);
              lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
           lblcappu.setVisible(false);
           lblmachi.setVisible(false);
           lbllatte.setVisible(false);
           lblameri.setVisible(false);
           lblflat.setVisible(false);
           lblcaramo.setVisible(false);
           lblchomo.setVisible(false);
           lblcamo.setVisible(false);
           //invisible
           lblsmall.setVisible(true);
           lblmedium.setVisible(true);
           lbllarge.setVisible(true);
           lbls.setVisible(true);
           
           lblm.setVisible(true);
           lbll.setVisible(true);
           lblfood.setVisible(false);
           lbls.setText("P 30.00 ");
           lblm.setText("P 50.00 ");
           lbll.setText("P 70.00 ");
        }else if(cbo2.getSelectedItem().equals("Earl Grey Tea")){
            des1.setText("We take a strong black tea base and add the essence of bergamot, ");
            des2.setText("a citrus fruit with subtle lemon and floral lavender notes, ");
            des3.setText("to create this aromatically awesome tea flavor. ");
            des4.setText("");
            des5.setText("");
             lblchai.setVisible(false);
        lblearl.setVisible(true);
        lbllondon.setVisible(false);
        lblroya.setVisible(false);
        lblcloud.setVisible(false);
        lblmat.setVisible(false);
        lblhon.setVisible(false);
        lbljade.setVisible(false);
               lbllamin.setVisible(false);
               lblancho.setVisible(false);
     
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
            lblmachi.setVisible(false);
            lblcappu.setVisible(false);
            lbllatte.setVisible(false);
            lblameri.setVisible(false);
            lblflat.setVisible(false);
            lblcaramo.setVisible(false);
            lblchomo.setVisible(false);
            lblcamo.setVisible(false);
         //invisible
           lblsmall.setVisible(true);
           lblmedium.setVisible(true);
           lbllarge.setVisible(true);
           lbls.setVisible(true);
            lblss.setVisible(true);
           lblm.setVisible(true);
           lbll.setVisible(true);
           lblfood.setVisible(false);
           lbls.setText("P 30.00 ");
           lblm.setText("P 50.00 ");
           lbll.setText("P 70.00 ");
        }else if(cbo2.getSelectedItem().equals("London Fog Tea")){
            des1.setText("Bright, citrusy spark of Italian bergamot blends with subtle hints of lavender,");
            des2.setText(" vanilla syrup, and steamed milk for this frothy reinvention of classic Earl Grey tea. "); 
            des3.setText("");
            des4.setText("*Best Seller!");
            des5.setText("");
             lblchai.setVisible(false);
        lblearl.setVisible(false);
        lbllondon.setVisible(true);
        lblroya.setVisible(false);
        lblcloud.setVisible(false);
        lblmat.setVisible(false);
        lblhon.setVisible(false);
        lbljade.setVisible(false);
            lblcarnita.setVisible(false);
               lblancho.setVisible(false);
        lbllamin.setVisible(false);
       
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
            lbllatte.setVisible(false);
            lblcappu.setVisible(false);
            lblmachi.setVisible(false);
            lblameri.setVisible(false);
            lblflat.setVisible(false);
            lblcaramo.setVisible(false);
            lblchomo.setVisible(false);
            lblcamo.setVisible(false);
            //invisible
           lblsmall.setVisible(true);
           lblmedium.setVisible(true);
           lbllarge.setVisible(true);
           lbls.setVisible(true);
            lblss.setVisible(true);
           lblm.setVisible(true);
           lbll.setVisible(true);
           lblfood.setVisible(false);
           lbls.setText("P 30.00 ");
           lblm.setText("P 50.00 ");
           lbll.setText("P 70.00 ");
        } else if(cbo2.getSelectedItem().equals("Royal English Tea")){
            des1.setText("Each sip of this beloved morning black tea unfolds ");
            des2.setText("to reveal the complexity of the high-grown full leaves. ");
            des3.setText("An elegant, time-honored classic that brings a royal nod to every cup.");
            des4.setText("");
            des5.setText("");
             lblchai.setVisible(false);
        lblearl.setVisible(false);
        lbllondon.setVisible(false);
        lblroya.setVisible(true);
        lblcloud.setVisible(false);
        lblmat.setVisible(false);
        lblhon.setVisible(false);
        lbljade.setVisible(false);
            lbltuna.setVisible(false);
               lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
            lblameri.setVisible(false);
            lblcappu.setVisible(false);
           lblmachi.setVisible(false);
           lbllatte.setVisible(false);
           lblflat.setVisible(false);
           lblcaramo.setVisible(false);
           lblchomo.setVisible(false);
           lblcamo.setVisible(false);
           //invisible
           lblsmall.setVisible(true);
           lblmedium.setVisible(true);
           lbllarge.setVisible(true);
           lbls.setVisible(true);
            lblss.setVisible(true);
           lblm.setVisible(true);
           lbll.setVisible(true);
           lblfood.setVisible(false);
           lbls.setText("P 30.00 ");
           lblm.setText("P 50.00 ");
           lbll.setText("P 70.00 ");
        }else if(cbo2.getSelectedItem().equals("Emperor’s Clouds & Mist")){
            des1.setText("This gently smoky, softly sweet green tea—cultivated ");
            des2.setText("at 3,500 feet and shrouded in ethereal clouds and mist—is tasty ");
            des3.setText("no matter what language you say it in.");
            des4.setText("");
            des5.setText("");
             lblchai.setVisible(false);
        lblearl.setVisible(false);
        lbllondon.setVisible(false);
        lblroya.setVisible(false);
        lblcloud.setVisible(true);
        lblmat.setVisible(false);
        lblhon.setVisible(false);
        lbljade.setVisible(false);
            lbluji.setVisible(false);
               lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
            lblflat.setVisible(false);
            lblcappu.setVisible(false);
           lblmachi.setVisible(false);
           lbllatte.setVisible(false);
           lblameri.setVisible(false);
           lblcaramo.setVisible(false);
           lblchomo.setVisible(false);
           lblcamo.setVisible(false);
              //invisible
           lblsmall.setVisible(true);
           lblmedium.setVisible(true);
           lbllarge.setVisible(true);
           lbls.setVisible(true);
            lblss.setVisible(true);
           lblm.setVisible(true);
           lbll.setVisible(true);
           lblfood.setVisible(false);
           lbls.setText("P 30.00 ");
           lblm.setText("P 50.00 ");
           lbll.setText("P 70.00 ");
        }else if(cbo2.getSelectedItem().equals("Matcha Tea")){
            des1.setText("Smooth and creamy matcha sweetened just right and served with steamed milk.");
            des2.setText("This favorite will transport your senses to pure green delight. ");  
            des3.setText("");
            des4.setText("");
            des5.setText("*Limited Edition!");
             lblchai.setVisible(false);
        lblearl.setVisible(false);
        lbllondon.setVisible(false);
        lblroya.setVisible(false);
        lblcloud.setVisible(false);
        lblmat.setVisible(true);
        lblhon.setVisible(false);
        lbljade.setVisible(false);
            lblmelt.setVisible(false);
            lblcaramo.setVisible(false);
            lblcappu.setVisible(false);
           lblmachi.setVisible(false);
           lbllatte.setVisible(false);
           lblameri.setVisible(false);
           lblflat.setVisible(false);
           lblchomo.setVisible(false);
           lblcamo.setVisible(false);
              lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
        
            //invisible
           lblsmall.setVisible(true);
           lblmedium.setVisible(true);
           lbllarge.setVisible(true);
           lbls.setVisible(true);
            lblss.setVisible(true);
           lblm.setVisible(true);
           lbll.setVisible(true);
           lblfood.setVisible(false);
           lbls.setText("P 30.00 ");
           lblm.setText("P 50.00 ");
           lbll.setText("P 70.00 ");
        } else if(cbo2.getSelectedItem().equals("Honey Citrus Mint Tea")){
            des1.setText("A customer creation so popular it’s now on the menu. Jade Citrus Mint green tea,Peach Tranquility   ");
            des2.setText("herbal tea, hot water,steamed lemonade and a touch of honey mingle tastefully well together ");   
            des3.setText("for a tea that comforts from the inside out.");
            des4.setText("");
            des5.setText("");
             lblchai.setVisible(false);
        lblearl.setVisible(false);
        lbllondon.setVisible(false);
        lblroya.setVisible(false);
        lblcloud.setVisible(false);
        lblmat.setVisible(false);
        lblhon.setVisible(true);
        lbljade.setVisible(false);
            lblpuff.setVisible(false);
               lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblbag.setVisible(false);
            lblchomo.setVisible(false);
           lblcappu.setVisible(false);
           lblmachi.setVisible(false);
           lbllatte.setVisible(false);
           lblameri.setVisible(false);
           lblflat.setVisible(false);
           lblcaramo.setVisible(false);
           lblcamo.setVisible(false);
             //invisible
           lblsmall.setVisible(true);
           lblmedium.setVisible(true);
           lbllarge.setVisible(true);
           lbls.setVisible(true);
            lblss.setVisible(true);
           lblm.setVisible(true);
           lbll.setVisible(true);
           lblfood.setVisible(false);
           lbls.setText("P 30.00 ");
           lblm.setText("P 50.00 ");
           lbll.setText("P 70.00 ");
        } else if(cbo2.getSelectedItem().equals("Jade Citrus Mint Tea")){
            des1.setText("Brewed Tea\n" +
"Green tea, lemon verbena, lemongrass and a hint of spearmint mingle for a bright, refreshing, ");
            des2.setText("citrusy green tea experience.");  
            des3.setText("");
            des4.setText("");
            des5.setText("");
             lblchai.setVisible(false);
        lblearl.setVisible(false);
        lbllondon.setVisible(false);
        lblroya.setVisible(false);
        lblcloud.setVisible(false);
        lblmat.setVisible(false);
        lblhon.setVisible(false);
        lbljade.setVisible(true);
            lblbag.setVisible(false);
               lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
             lblcamo.setVisible(false);
            lblchomo.setVisible(false);
           lblcappu.setVisible(false);
           lblmachi.setVisible(false);
           lbllatte.setVisible(false);
           lblameri.setVisible(false);
           lblflat.setVisible(false);
           lblcaramo.setVisible(false);
           //invisible
           lblsmall.setVisible(true);
           lblmedium.setVisible(true);
           lbllarge.setVisible(true);
           lbls.setVisible(true);
            lblss.setVisible(true);
           lblm.setVisible(true);
           lbll.setVisible(true);
           lblfood.setVisible(false);
           lbls.setText("P 30.00 ");
           lblm.setText("P 50.00 ");
           lbll.setText("P 70.00 ");
                           
           //cbo3
           
           
        }else if(cbo3.getSelectedItem().equals("Ancho-Chipotle Chicken")){
            
            
            des1.setText("a shredded chicken breast in ancho-chipotle sauce, ");
            des2.setText("fire-roasted poblano peppers, red onion, Gouda cheese ");
            des3.setText("and spicy cilantro pesto on a ciabatta roll.");
            des4.setText("");
           des5.setText("");
              lblancho.setVisible(true);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
           lblcappu.setVisible(false);
           lblmachi.setVisible(false);
           lbllatte.setVisible(false);
           lblameri.setVisible(false);
           lblflat.setVisible(false);
           lblcaramo.setVisible(false);
           lblchomo.setVisible(false);
           lblcamo.setVisible(false);
           lblfood.setVisible(true);
           lblfood.setText("Price : P 89 ");
           
           //invisible
           lblsmall.setVisible(false);
           lblmedium.setVisible(false);
           lbllarge.setVisible(false);
           lbls.setVisible(false);
            lblss.setVisible(false);
           lblm.setVisible(false);
           lbll.setVisible(false);
           
        }else if(cbo3.getSelectedItem().equals("Red Velvet Lamington")){
            des1.setText(" a decadent red velvet cake coated with creamy cheese frosting ");
            des2.setText("and desiccated coconut.");
            des3.setText("");
            des4.setText("*Best Seller!");
            des5.setText("");
               lbllamin.setVisible(true);
               lblancho.setVisible(false);
     
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
            lblmachi.setVisible(false);
            lblcappu.setVisible(false);
            lbllatte.setVisible(false);
            lblameri.setVisible(false);
            lblflat.setVisible(false);
            lblcaramo.setVisible(false);
            lblchomo.setVisible(false);
            lblcamo.setVisible(false);
            //invisible
           lblsmall.setVisible(false);
           lblmedium.setVisible(false);
           lbllarge.setVisible(false);
           lbls.setVisible(false);
            lblss.setVisible(false);
           lblm.setVisible(false);
           lbll.setVisible(false);
           lblfood.setVisible(true);
            lblfood.setText("Price : P 79 ");
            
        }else if(cbo3.getSelectedItem().equals("Pork Carnitas Wrap")){
            des1.setText("A whole wheat tortilla wrap filled with pork flakes,");
            des2.setText("tomatoes, onions, cilantro and guacamole."); 
            des3.setText("");
            des4.setText("*Best Seller!");
            des5.setText("");
            lblcarnita.setVisible(true);
               lblancho.setVisible(false);
        lbllamin.setVisible(false);
       
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
            lbllatte.setVisible(false);
            lblcappu.setVisible(false);
            lblmachi.setVisible(false);
            lblameri.setVisible(false);
            lblflat.setVisible(false);
            lblcaramo.setVisible(false);
            lblchomo.setVisible(false);
            lblcamo.setVisible(false);
            //invisible
           lblsmall.setVisible(false);
           lblmedium.setVisible(false);
           lbllarge.setVisible(false);
           lbls.setVisible(false);
            lblss.setVisible(false);
           lblm.setVisible(false);
           lbll.setVisible(false);
           lblfood.setVisible(true);
             lblfood.setText("Price : P 99 ");
        } else if(cbo3.getSelectedItem().equals("Tuna Melt on Rye Bread")){
            des1.setText("a flavor-packed tuna spread made tastier with");
            des2.setText("mozzarella cheese and cream cheese on top of a slice of rye.");
            des3.setText("");
            des4.setText("*Best Seller!");
            des5.setText("");
            lbltuna.setVisible(true);
               lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
            lblameri.setVisible(false);
            lblcappu.setVisible(false);
           lblmachi.setVisible(false);
           lbllatte.setVisible(false);
           lblflat.setVisible(false);
           lblcaramo.setVisible(false);
           lblchomo.setVisible(false);
           lblcamo.setVisible(false);
            //invisible
           lblsmall.setVisible(false);
           lblmedium.setVisible(false);
           lbllarge.setVisible(false);
           lbls.setVisible(false);
            lblss.setVisible(false);
           lblm.setVisible(false);
           lbll.setVisible(false);
           lblfood.setVisible(true);
           lblfood.setText("Price : P 105 ");
        }else if(cbo3.getSelectedItem().equals("Uji Matcha Chiffon Cake")){
            des1.setText("This Uji Matcha Chiffon cake combines earthy matcha flavor");
            des2.setText("with a rich chiffon dough. It's topped with whipped cream");
            des3.setText("swirled with matcha just to really rub in how gorgeous it is.");
            des4.setText("");
            des5.setText("*Limited Edition!");
            lbluji.setVisible(true);
               lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
            lblflat.setVisible(false);
            lblcappu.setVisible(false);
           lblmachi.setVisible(false);
           lbllatte.setVisible(false);
           lblameri.setVisible(false);
           lblcaramo.setVisible(false);
           lblchomo.setVisible(false);
           lblcamo.setVisible(false);
           //invisible
           lblsmall.setVisible(false);
           lblmedium.setVisible(false);
           lbllarge.setVisible(false);
           lbls.setVisible(false);
            lblss.setVisible(false);
           lblm.setVisible(false);
           lbll.setVisible(false);
           lblfood.setVisible(true);
           lblfood.setText("Price : P 120 ");
        }else if(cbo3.getSelectedItem().equals("Ricotta Melting Cake")){
            des1.setText("This blessing from the cake gods is a Baumkuchen cake ");
            des2.setText("filled with ricotta cream. Baumkuchen cakes are often called \"tree cakes\" ");  
            des3.setText("as they have rings when you slice them. Wow, a nature lesson and a dessert. ");
            des4.setText("");
            des5.setText("*Limited Edition!");
            lblmelt.setVisible(true);
            lblcaramo.setVisible(false);
            lblcappu.setVisible(false);
           lblmachi.setVisible(false);
           lbllatte.setVisible(false);
           lblameri.setVisible(false);
           lblflat.setVisible(false);
           lblchomo.setVisible(false);
           lblcamo.setVisible(false);
              lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        
        lblpuff.setVisible(false);
        lblbag.setVisible(false);
        //invisible
           lblsmall.setVisible(false);
           lblmedium.setVisible(false);
           lbllarge.setVisible(false);
           lbls.setVisible(false);
            lblss.setVisible(false);
           lblm.setVisible(false);
           lbll.setVisible(false);
           lblfood.setVisible(true);
           lblfood.setText("Price : P 130 ");
        } else if(cbo3.getSelectedItem().equals("Chocolate Creme Puffin")){
            des1.setText("Our own take on the classic French dessert,  ");
            des2.setText("a cream puff filled with luscious chocolate cream.");   
            des3.setText("");
            des4.setText("Best Seller!");
            des5.setText("");
            lblpuff.setVisible(true);
               lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblbag.setVisible(false);
            lblchomo.setVisible(false);
           lblcappu.setVisible(false);
           lblmachi.setVisible(false);
           lbllatte.setVisible(false);
           lblameri.setVisible(false);
           lblflat.setVisible(false);
           lblcaramo.setVisible(false);
           lblcamo.setVisible(false);
           //invisible
           lblsmall.setVisible(false);
           lblmedium.setVisible(false);
           lbllarge.setVisible(false);
           lbls.setVisible(false);
            lblss.setVisible(false);
           lblm.setVisible(false);
           lbll.setVisible(false);
           lblfood.setVisible(true);
           lblfood.setText("Price : P 88 ");
        } else if(cbo3.getSelectedItem().equals("Ham & Cheese Baguette")){
            des1.setText("Ham, Emmental cheese and arugula with pickled Dijon  ");
            des2.setText("on a crusty and chewy French baguette");  
            des3.setText("");
            des4.setText("*Ultimate Favorite!");
            des5.setText("");
            lblbag.setVisible(true);
               lblancho.setVisible(false);
        lbllamin.setVisible(false);
        lblcarnita.setVisible(false);
        lbltuna.setVisible(false);
        lbluji.setVisible(false);
        lblmelt.setVisible(false);
        lblpuff.setVisible(false);
             lblcamo.setVisible(false);
            lblchomo.setVisible(false);
           lblcappu.setVisible(false);
           lblmachi.setVisible(false);
           lbllatte.setVisible(false);
           lblameri.setVisible(false);
           lblflat.setVisible(false);
           lblcaramo.setVisible(false);
           //invisible
           lblsmall.setVisible(false);
           lblmedium.setVisible(false);
           lbllarge.setVisible(false);
           lbls.setVisible(false);
            lblss.setVisible(false);
           lblm.setVisible(false);
           lbll.setVisible(false);
           lblfood.setVisible(true);
           lblfood.setText("Price : P 110 ");
          
        }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new order().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    
    public void sales() throws SQLException{
      
        int lastid=0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/coffee","root","");
            
            String total=txttotal.getText();
            String bal=txtbal.getText();
            String pay=txtpay.getText();
            String cname=name.txt1.getText();
            String ordertype=Inout.inout.getText();
            String item = lbli.getText();
            String a=lbl1.getText();
        String b= lbl2.getText();
        
        String c= lbl3.getText();
        String d=lbl4.getText();
        String e= lbl5.getText();
        String f=lbl6.getText();
        String g= lbl7.getText();
        String h=lbl8.getText();
        String i= lbl9.getText();
        String j=lbl10.getText();
        String k= lbl11.getText();
        String l=lbl12.getText();
        String m= lbl13.getText();
        String n=lbl14.getText();
        String o= lbl15.getText();
        String p=lbl6.getText();
        String q= lbl17.getText();
        String r=lbl8.getText();
        String s= lbl19.getText();
            String t=lbl20.getText();
        String u= lbl21.getText();
        String v=lbl22.getText();
        String w= lbl23.getText();
        String x=lbl24.getText();
        String y= lbl25.getText();
        String z=lbl26.getText();
        String aa= lbl27.getText();
        String bb=lbl28.getText();
        String cc= lbl29.getText();
            String dd=lbl30.getText();
        String ee= lbl31.getText();
        String ff=lbl32.getText();
        String gg= lbl33.getText();
        String hh=lbl34.getText();
        String ii= lbl355.getText();
        String jj=lbl36.getText();
        String kk= lbl37.getText();
        String ll=lbl38.getText();
        String mm= lbl39.getText();
            String nn=lbl40.getText();
        String oo= lbl41.getText();
        String pp=lbl42.getText();
        String qq= lbl43.getText();
        String rr=lbl44.getText();
        String ss= lbl45.getText();
        String tt=lbl46.getText();
        String uu= lbl47.getText();
        String vv=lbl48.getText();
        String ww= lbl49.getText();
            String xx=lbl50.getText();
        String yy= lbl51.getText();
        String aaa=lbl52.getText();
        String bbb= lbl53.getText();
        String ccc=lbl54.getText();
         String ddd= lbl55.getText();
        String eee=lbl56.getText();
        
        
        
        String ab= a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+
                x+y+z+aa+bb+cc+dd+ee+ff+gg+hh+ii+
                jj+kk+ll+mm+nn+oo+pp+qq+rr+ss+tt+uu+
                vv+ww+xx+yy+aaa+bbb+ccc+ddd+eee;
            
            int price;
            
            String query="insert into sales(Total,Payment,Balance,Name,Ordertype,Item)values(?,?,?,?,?,?)";
            pst=  con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, total);
            pst.setString(2, pay);
            pst.setString(3, bal);
            pst.setString(4, cname);
            pst.setString(5, ordertype);
            pst.setString(6, ab);
          
            
            pst.executeUpdate();
            
            
            ResultSet rs = pst.getGeneratedKeys();
            if(rs.next()){
                lastid=rs.getInt(1);
                
            }
          
        } catch (ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(quantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
                    
        
    
    
    }
    
    
    
    
    
    
    
    
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        model.removeRow(jTable1.getSelectedRow());
         int sum = 0;
         
              for(int a=0; a<jTable1.getRowCount(); a++){
                  sum = sum + Integer.parseInt(jTable1.getValueAt(a, 6).toString()); 
              }
              txttotal.setText(Integer.toString(sum));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtpayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpayKeyPressed
         char c= evt.getKeyChar();
       if(Character.isLetter(c)|| txtpay.equals("")){
              txtpay.setEditable(false);
           jLabel4.setText("invalid input");
           jButton1.setEnabled(false);
           
           
       }else{
           txtpay.setEditable(true);
            jButton1.setEnabled(true);
            jLabel4.setText("");
       }
    }//GEN-LAST:event_txtpayKeyPressed

    private void lblsmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblsmallActionPerformed
        
        if(lblsmall.isSelected()== false && cbo1.getSelectedItem().equals("")&& txtquantity.getText().equals("") ){
           add.setEnabled(false);
           lblmedium.setSelected(false);
           lbllarge.setSelected(false);
           JOptionPane.showMessageDialog(null,"Please fill up the form!");
       
       }else{
           add.setEnabled(true);
           lblmedium.setSelected(false);
           lbllarge.setSelected(false);
        }
    }//GEN-LAST:event_lblsmallActionPerformed

    private void lblmediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblmediumActionPerformed
          if(lblmedium.isSelected()){
           lblsmall.setSelected(false);
           lbllarge.setSelected(false);
       }
    }//GEN-LAST:event_lblmediumActionPerformed

    private void lbllargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbllargeActionPerformed
          if(lbllarge.isSelected()){
           lblmedium.setSelected(false);
           lblsmall.setSelected(false);
       }
    }//GEN-LAST:event_lbllargeActionPerformed

    private void cbo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo2ActionPerformed
        
    }//GEN-LAST:event_cbo2ActionPerformed

    private void cbo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquantityActionPerformed
       
       
    }//GEN-LAST:event_txtquantityActionPerformed
    
               
                
                
    
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(quantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
    

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quantity().setVisible(true);
          }
        });
    }
        
  
                
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel TXT2;
    private javax.swing.JButton add;
    private javax.swing.JComboBox<String> cbo1;
    private javax.swing.JComboBox<String> cbo2;
    private javax.swing.JComboBox<String> cbo3;
    private javax.swing.JLabel des1;
    private javax.swing.JLabel des2;
    private javax.swing.JLabel des3;
    private javax.swing.JLabel des4;
    private javax.swing.JLabel des5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl19;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lbl23;
    private javax.swing.JLabel lbl24;
    private javax.swing.JLabel lbl25;
    private javax.swing.JLabel lbl26;
    private javax.swing.JLabel lbl27;
    private javax.swing.JLabel lbl28;
    private javax.swing.JLabel lbl29;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl30;
    private javax.swing.JLabel lbl31;
    private javax.swing.JLabel lbl32;
    private javax.swing.JLabel lbl33;
    private javax.swing.JLabel lbl34;
    private javax.swing.JLabel lbl355;
    private javax.swing.JLabel lbl36;
    private javax.swing.JLabel lbl37;
    private javax.swing.JLabel lbl38;
    private javax.swing.JLabel lbl39;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl40;
    private javax.swing.JLabel lbl41;
    private javax.swing.JLabel lbl42;
    private javax.swing.JLabel lbl43;
    private javax.swing.JLabel lbl44;
    private javax.swing.JLabel lbl45;
    private javax.swing.JLabel lbl46;
    private javax.swing.JLabel lbl47;
    private javax.swing.JLabel lbl48;
    private javax.swing.JLabel lbl49;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl50;
    private javax.swing.JLabel lbl51;
    private javax.swing.JLabel lbl52;
    private javax.swing.JLabel lbl53;
    private javax.swing.JLabel lbl54;
    private javax.swing.JLabel lbl55;
    private javax.swing.JLabel lbl56;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblameri;
    private javax.swing.JLabel lblancho;
    private javax.swing.JLabel lblbag;
    private javax.swing.JLabel lblcamo;
    private javax.swing.JLabel lblcappu;
    private javax.swing.JLabel lblcaramo;
    private javax.swing.JLabel lblcarnita;
    private javax.swing.JLabel lblchai;
    private javax.swing.JLabel lblchomo;
    private javax.swing.JLabel lblcloud;
    private javax.swing.JLabel lblearl;
    private javax.swing.JLabel lblflat;
    private javax.swing.JLabel lblfood;
    private javax.swing.JLabel lblhon;
    private javax.swing.JLabel lbli;
    private javax.swing.JLabel lbljade;
    public static javax.swing.JLabel lbll;
    private javax.swing.JLabel lbllamin;
    private javax.swing.JRadioButton lbllarge;
    private javax.swing.JLabel lbllatte;
    private javax.swing.JLabel lbllondon;
    public static javax.swing.JLabel lblm;
    private javax.swing.JLabel lblmachi;
    private javax.swing.JLabel lblmat;
    private javax.swing.JRadioButton lblmedium;
    private javax.swing.JLabel lblmelt;
    private javax.swing.JLabel lblpuff;
    private javax.swing.JLabel lblroya;
    public static javax.swing.JLabel lbls;
    private javax.swing.JRadioButton lblsmall;
    private javax.swing.JLabel lblss;
    private javax.swing.JLabel lblstock;
    private javax.swing.JLabel lbltuna;
    private javax.swing.JLabel lbluji;
    private javax.swing.JTextField txtbal;
    private javax.swing.JTextField txtpay;
    private javax.swing.JTextField txtquantity;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
