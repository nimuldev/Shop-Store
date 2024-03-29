
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rayha
 */
public class Stores extends javax.swing.JFrame {

    /**
     * Creates new form Store
     */
    DefaultTableModel model1;
    Database  ob = new Database();
    public Stores() {
        initComponents();
        Display();
    }
    
    void Display(){
        model1= (DefaultTableModel) Table2.getModel();   
              
        model1.setRowCount(0); 
        
        String strFrom = "Select * from  StoreProduct"; 
        ResultSet rs1 =null; 
      
      rs1=ob.select(strFrom);
        try {
                while (rs1.next())
                {
                 int  record=rs1.getInt("ID");
                 
                   
                   String sname=rs1.getString("name");
                    
                    String serial=rs1.getString("serial");
                   String Catagory=rs1.getString("Catagory");
                     String Price=rs1.getString("Price")+"TK";
                     String Stock=rs1.getString("Stock");
                    
                    
                    Object[] objs = {serial,sname,Catagory,Price,Stock};
                    model1.addRow(objs);
                   
                }
               
            } catch (SQLException ex) {
                Logger.getLogger(Stores.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        jSerial0 = new javax.swing.JTextField();
        jName = new javax.swing.JTextField();
        jCatagory = new javax.swing.JTextField();
        prices = new javax.swing.JTextField();
        jStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        New = new javax.swing.JButton();
        Modify = new javax.swing.JButton();
        Remove = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jStock1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSerial = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Table2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial", "Name", "Catagory", "Price", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table2);

        jSerial0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSerial0ActionPerformed(evt);
            }
        });

        jName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameActionPerformed(evt);
            }
        });

        prices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricesActionPerformed(evt);
            }
        });
        prices.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pricesKeyTyped(evt);
            }
        });

        jStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStockActionPerformed(evt);
            }
        });
        jStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jStockKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Stock");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Price");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Catagory");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Name");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Serial");

        New.setBackground(new java.awt.Color(153, 255, 153));
        New.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });

        Modify.setBackground(new java.awt.Color(255, 255, 153));
        Modify.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Modify.setText("Modify");
        Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyActionPerformed(evt);
            }
        });

        Remove.setBackground(new java.awt.Color(255, 204, 204));
        Remove.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Remove.setText("Remove");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Serial(Remove)");

        jStock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStock1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Serial");

        jSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSerialActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(prices, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jStock, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jStock1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 55, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(New, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(Modify, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(Remove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSerial0, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(jSerial0))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(prices, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jStock1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(New, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Modify, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table2MouseClicked
      

    }//GEN-LAST:event_Table2MouseClicked

    private void jSerial0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSerial0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSerial0ActionPerformed

    private void jNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNameActionPerformed

    private void pricesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricesActionPerformed

    private void jStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jStockActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
     String price,stock;
     String serial,name,cata;
     
     serial=jSerial.getText();
            name= jName.getText();
                  cata=   jCatagory.getText();
                          price=   prices.getText();
                                 stock=    jStock.getText();
     
     int c=input();
     
     if(c==1){
         ResultSet rs =null;
             String sql = "insert into StoreProduct(Serial,Name,Catagory,Price,Stock) values('"+serial+"','"+name+"','"+cata+"','"+price+"','"+stock+"')";
                    ob.insert(sql);
                    JOptionPane.showMessageDialog(null,"Store is Successfull","Success",JOptionPane.INFORMATION_MESSAGE);
                    clear();
         Display();
         
         
     }
     
     else{
         JOptionPane.showMessageDialog(null,"Something is empty","Error",JOptionPane.ERROR_MESSAGE);//   jodi value alrready thakle tokon
              
         
     }
   
        
    }//GEN-LAST:event_NewActionPerformed
   void clear(){
       
       jSerial.setText("");
       jName.setText("");
               jCatagory.setText("");
               prices.setText("");
                       jStock.setText("");
   }
    
    int input(){
        if(!jSerial.getText().isEmpty() &&!jName.getText().isEmpty() && ! jCatagory.getText().isEmpty()&& !prices.getText().isEmpty()&& !jStock.getText().isEmpty()){
            
            return 1;
        }
        else{
           return 0;
        } 
        } 
        
    
    
    
    
    private void ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyActionPerformed
 String price,stock;
     String serial,name,cata;
     
     serial=jSerial.getText();
            name= jName.getText();
                  cata=   jCatagory.getText();
                          price= prices.getText();
                                 stock=    jStock.getText();
                                 
   
   String str;
        str = "update StoreProduct set Serial = '" + serial +"' where Name='"+name+"' and Catagory='"+cata+"'and Price='"+price+"'and Stock='"+stock+"'";
       ob.update(str);                                       
       str=null;
       str = "update StoreProduct set Name = '" + name + "' where Serial='"+serial+"'and Catagory='"+cata+"'and Price='"+price+"'and Stock='"+stock+"'";
       ob.update(str);
       str=null;
       str = "update StoreProduct set Catagory = '" + cata + "' where Serial='"+serial+"'and Name='"+name+"'and Price='"+price+"'and Stock='"+stock+"'";
       ob.update(str);
       str=null;
       str = "update StoreProduct set Price = '" + price + "' where Serial='"+serial+"'and Name='"+name+"'and Catagory='"+cata+"'and Stock='"+stock+"'";
       ob.update(str);
       str=null;
       str = "update StoreProduct set Stock = '" +stock +"' where Serial='"+serial+"'and Name='"+name+"'and Catagory='"+cata+"'and Price='"+price+"'";
       ob.update(str);
        Display();
        JOptionPane.showMessageDialog(null,"Successfully Update","Success",JOptionPane.INFORMATION_MESSAGE);
                   
    }//GEN-LAST:event_ModifyActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
   ResultSet rs =null;
        String str = "delete * from StoreProduct where Serial='"+jStock1.getText()+"'";
         ob.delete(str);   
         Display();
         JOptionPane.showMessageDialog(null,"Remove is Successfull ","Success",JOptionPane.INFORMATION_MESSAGE);
         
        jStock1.setText("");
        
        
    }//GEN-LAST:event_RemoveActionPerformed

    private void jStock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStock1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jStock1ActionPerformed

    private void jSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSerialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSerialActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         model1= (DefaultTableModel) Table2.getModel();   
              
        model1.setRowCount(0); 
        
        String strFrom = "Select * from  StoreProduct where Serial='"+jSerial0.getText()+"'"; 
        ResultSet rs1 =null; 
      
      rs1=ob.select(strFrom);
        try {
               if (rs1.next())
                {
                
                   
                    
                    
                    jSerial.setText(rs1.getString("serial"));
       jName.setText(rs1.getString("name"));
               jCatagory.setText(rs1.getString("Catagory"));
               prices.setText(rs1.getString("Price"));
                       jStock.setText(rs1.getString("Stock"));
                    Display();
                }
               else
            {
                Display();
                 JOptionPane.showMessageDialog(null,"Incorrect Serial","Error",JOptionPane.ERROR_MESSAGE);
            }
             Display();  
            } catch (SQLException ex) {
                Logger.getLogger(Stores.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jStockKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
        
        boolean max = jStock.getText().length() > 10;
        if ( max ){
        evt.consume();
        } 
    }//GEN-LAST:event_jStockKeyTyped

    private void pricesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pricesKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
        
        boolean max = prices.getText().length() > 10;
        if ( max ){
        evt.consume();
        } 
    }//GEN-LAST:event_pricesKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Sell ob1=new Sell();
        ob1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Stores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modify;
    private javax.swing.JButton New;
    private javax.swing.JButton Remove;
    private javax.swing.JTable Table2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jCatagory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jName;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jSerial;
    private javax.swing.JTextField jSerial0;
    private javax.swing.JTextField jStock;
    private javax.swing.JTextField jStock1;
    private javax.swing.JTextField prices;
    // End of variables declaration//GEN-END:variables
}
