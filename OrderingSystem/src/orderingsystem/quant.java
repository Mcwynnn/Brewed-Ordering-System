/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderingsystem;

/**
 *
 * @author NewUser
 */
public class quant extends javax.swing.JFrame {

    /**
     * Creates new form quant
     */
    public quant() {
        initComponents();
    
    bill();
    }
        
       private void bill(){
           area.setText("===================================\n                   Starbucks Coffee Shop\nTel. No. 123-456-789\nArellano St.Dagupan City, Pangasinan\n "
            + "===================================\nName:     "
            +name.txt1.getText()+ "\nOrder Type: "+Inout.inout.getText()+"\n ==================================="+
            "\nQuantity             Description                        Price\n");
        
      
       
       
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        y = new javax.swing.JTextField();
        des2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblstock = new javax.swing.JLabel();
        si = new javax.swing.JComboBox<>();
        lblcara = new javax.swing.JLabel();
        price2 = new javax.swing.JLabel();
        price3 = new javax.swing.JLabel();
        price4 = new javax.swing.JLabel();
        price5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        des1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
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
        price1 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(51, 153, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setBackground(new java.awt.Color(204, 0, 0));
        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, 115, 48));

        jButton4.setBackground(new java.awt.Color(0, 0, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("CANCEL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 115, 48));

        y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yActionPerformed(evt);
            }
        });
        jPanel1.add(y, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 114, 33));

        des2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        des2.setForeground(new java.awt.Color(51, 153, 0));
        jPanel1.add(des2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, 50));

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 0));
        jLabel7.setText("Size:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, 40));

        lblstock.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblstock.setForeground(new java.awt.Color(51, 153, 0));
        lblstock.setText("stock: ");
        jPanel1.add(lblstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 100, 20));

        si.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        jPanel1.add(si, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 114, 40));

        lblcara.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblcara.setForeground(new java.awt.Color(51, 153, 0));
        lblcara.setText("P 130.00     ");
        jPanel1.add(lblcara, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 114, 40));

        price2.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        price2.setForeground(new java.awt.Color(51, 153, 0));
        price2.setText("medium:");
        jPanel1.add(price2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 77, 40));

        price3.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        price3.setForeground(new java.awt.Color(51, 153, 0));
        price3.setText("P 150.00     ");
        jPanel1.add(price3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, 40));

        price4.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        price4.setForeground(new java.awt.Color(51, 153, 0));
        price4.setText("large:");
        jPanel1.add(price4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 57, 40));

        price5.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        price5.setForeground(new java.awt.Color(51, 153, 0));
        price5.setText("P 170.00     ");
        jPanel1.add(price5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 159, 40));

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 0));
        jLabel8.setText("Foods: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, 40));

        des1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        des1.setForeground(new java.awt.Color(51, 153, 0));
        jPanel1.add(des1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, 50));

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setText("Hello,");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        txt2.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        txt2.setForeground(new java.awt.Color(51, 153, 0));
        txt2.setText("KAYE");
        jPanel1.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/Starbucks-logo12.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 280, 260));

        cbo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 160, 40));

        cbo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cappuccino", "Caramel Machiatto", "Caffe Latte ", "Caffe Americano", "Flat White", "Caramel Mocha", "White Choco Mocha", "Caffe Mocha", " ", " ", " ", " " }));
        cbo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo1ActionPerformed(evt);
            }
        });
        jPanel1.add(cbo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 160, 40));

        cbo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 160, 40));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 550, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
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
        des3.setForeground(new java.awt.Color(51, 153, 0));
        jPanel1.add(des3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, 40));

        des5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        des5.setForeground(new java.awt.Color(204, 0, 51));
        jPanel1.add(des5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, 50));

        lblmachi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/Caramel Macchiato.jpg"))); // NOI18N
        jPanel1.add(lblmachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        lbllatte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingsystem/caffe_latteee.jpg"))); // NOI18N
        jPanel1.add(lbllatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 200));

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 0));
        jLabel9.setText("Quantity:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, 40));

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 0));
        jLabel10.setText("Beverages:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 40));

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 153, 0));
        jLabel11.setText("Teas:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, 40));

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

        price1.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        price1.setForeground(new java.awt.Color(51, 153, 0));
        price1.setText("small:");
        jPanel1.add(price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 57, 40));

        lbltotal.setText("jLabel2");
        jPanel1.add(lbltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        double small=130.00;
        double medium=150.00;
        double large=170.00;
        double quantity =Double.parseDouble(y.getText());

        double S=((quantity*small));
        double M=((quantity*medium));
        double L=((quantity*large));
        double total=0;

        order.txt2.setText(name.txt1.getText() +"!  ");

        
       

        if(si.getSelectedItem().equals("Small")){
            area.append(y.getText()+ "\t"+cbo1.getSelectedItem()+"("+ "small" +") \t"+ S+"\n");
            y.setText("");

            lbltotal.setText("total: "+S);

        }else if(si.getSelectedItem().equals("Medium")){
            area.append(y.getText()+"\t"+ cbo1.getSelectedItem()+"("+ "medium" +") \t"+ M+"\n");
            y.setText("");
            total= total+M;
        }else if(si.getSelectedItem().equals("Large")){
            area.append(y.getText()+ "\t"+cbo1.getSelectedItem()+"("+ "large" +") \t"+ L+"\n");
            y.setText("");
            total= total+L;

            {

            }
        }

    }//GEN-LAST:event_addActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yActionPerformed

    }//GEN-LAST:event_yActionPerformed

    private void cbo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo1ActionPerformed

    }//GEN-LAST:event_cbo1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            area.print();
        }catch(Exception e){

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

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
        }else if(cbo1.getSelectedItem().equals("Caffe Latte ")){
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

    }//GEN-LAST:event_jButton2ActionPerformed
    }
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
            java.util.logging.Logger.getLogger(quant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    public static javax.swing.JTextArea area;
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
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblameri;
    private javax.swing.JLabel lblcamo;
    private javax.swing.JLabel lblcappu;
    public static javax.swing.JLabel lblcara;
    private javax.swing.JLabel lblcaramo;
    private javax.swing.JLabel lblchomo;
    private javax.swing.JLabel lblflat;
    private javax.swing.JLabel lbllatte;
    private javax.swing.JLabel lblmachi;
    public static javax.swing.JLabel lblstock;
    public static javax.swing.JLabel lbltotal;
    public static javax.swing.JLabel price1;
    public static javax.swing.JLabel price2;
    public static javax.swing.JLabel price3;
    public static javax.swing.JLabel price4;
    public static javax.swing.JLabel price5;
    private javax.swing.JComboBox<String> si;
    public static javax.swing.JLabel txt2;
    public static javax.swing.JTextField y;
    // End of variables declaration//GEN-END:variables
}
