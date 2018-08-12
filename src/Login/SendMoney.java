/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Login.User;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author mrrob
 */
public class SendMoney extends javax.swing.JFrame {

    public User tempUser;
//    public void set(){
//        TA1.setText(
//                "Your Balance:"+tempUser.balCh()+"\nLast Debited:"+
//                tempUser.lastDr+"\nLast Credited:"+
//                tempUser.lastCr);
//    }
    public SendMoney() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    ImageIcon nw6 = new ImageIcon("gasbill.png");
    ImageIcon nw7 = new ImageIcon("elictricbill.png");
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gasbill.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setToolTipText("Gas BillPay");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 130, 110, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transfer money.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        jLabel2.setToolTipText("Transfer Money");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 280, 110, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/electricbill.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        jLabel3.setToolTipText("Electricity BillPay");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 130, 110, 110);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backbutton.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 20, 80, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        String a=(String)JOptionPane.showInputDialog(this, "Enter gas bill Number", "Gas Bill",JOptionPane.INFORMATION_MESSAGE);
        String a1=(String)JOptionPane.showInputDialog(this, "Enter Amount", "Gas Bill",JOptionPane.INFORMATION_MESSAGE);
        double g=Double.parseDouble(a1);
       
        boolean b2=tempUser.topUpcr(g);
        try {
            Variable.save();
        } catch (IOException ex) {
            Logger.getLogger(SendMoney.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        if(b2){
            JOptionPane.showMessageDialog(null,"Successfully Bill Paid");
        }
        else{
            JOptionPane.showMessageDialog(null, "Insufficient balance");
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        String a=(String)JOptionPane.showInputDialog(this, "Enter Meter Number", "Electricity Bill",JOptionPane.INFORMATION_MESSAGE);
        String a1=(String)JOptionPane.showInputDialog(this, "Enter Amount", "Electricity Bill",JOptionPane.INFORMATION_MESSAGE);
        double g=Double.parseDouble(a1);
       
        boolean b2=tempUser.topUpcr(g);
        try {
            Variable.save();
        } catch (IOException ex) {
            Logger.getLogger(SendMoney.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        if(b2){
            JOptionPane.showMessageDialog(null,"Successfully Bill Paid");
        }
        else{
            JOptionPane.showMessageDialog(null, "Insufficient balance");
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        String a=(String)JOptionPane.showInputDialog(this, "Enter an Account Number", "Transfer Money",JOptionPane.INFORMATION_MESSAGE);
        String a1=(String)JOptionPane.showInputDialog(this, "Enter Amount", "Transfer Money",JOptionPane.INFORMATION_MESSAGE);
        double g=Double.parseDouble(a1);
       
        boolean b2=tempUser.topUpcr(g);
        try {
            Variable.save();
        } catch (IOException ex) {
            Logger.getLogger(SendMoney.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        if(b2){
            JOptionPane.showMessageDialog(null,"Successfully Transfered");
        }
        else{
            JOptionPane.showMessageDialog(null, "Insufficient balance");
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       Home h=new Home();
       h.setVisible(true);
       h.tempUser = tempUser;
       h.set();
       this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    
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
            java.util.logging.Logger.getLogger(SendMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SendMoney().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}