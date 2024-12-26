/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish_farm;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;

/**
 *
 * @author Nilma
 */
public class JFrame_4 extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_4
     */
    public JFrame_4() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

        Border JPanel_title__Border = BorderFactory.createMatteBorder(7, 7, 7, 7, Color.black);
        jPanel1.setBorder(JPanel_title__Border);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel_Time = new javax.swing.JLabel();
        jLabel_Date = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton_Open_Swan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton_Open_Platy = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton_Open_Betta = new javax.swing.JButton();
        jButton_Open_Resource = new javax.swing.JButton();
        jButton_Logout = new javax.swing.JButton();
        jButton_Close = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton_Open_Zebra5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton_Open_Customer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Main Menu");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 30, 780, 50);

        jLabel_Time.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Time.setText("Time");
        jPanel1.add(jLabel_Time);
        jLabel_Time.setBounds(620, 90, 150, 30);

        jLabel_Date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Date.setText("Date");
        jPanel1.add(jLabel_Date);
        jLabel_Date.setBounds(20, 90, 180, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Swordtail ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 390, 130, 30);

        jButton_Open_Swan.setText("Open");
        jButton_Open_Swan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Open_SwanActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Open_Swan);
        jButton_Open_Swan.setBounds(270, 400, 90, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Resourse Details");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 570, 180, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Platy ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 230, 100, 30);

        jButton_Open_Platy.setText("Open");
        jButton_Open_Platy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Open_PlatyActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Open_Platy);
        jButton_Open_Platy.setBounds(270, 240, 90, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setText("Betta ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 310, 60, 30);

        jButton_Open_Betta.setText("Open");
        jButton_Open_Betta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Open_BettaActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Open_Betta);
        jButton_Open_Betta.setBounds(270, 320, 90, 30);

        jButton_Open_Resource.setText("Open");
        jButton_Open_Resource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Open_ResourceActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Open_Resource);
        jButton_Open_Resource.setBounds(270, 570, 90, 30);

        jButton_Logout.setText("Logout");
        jButton_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LogoutActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Logout);
        jButton_Logout.setBounds(30, 630, 90, 30);

        jButton_Close.setText("Close");
        jButton_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CloseActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Close);
        jButton_Close.setBounds(660, 630, 90, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setText("Zebra ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 160, 100, 30);

        jButton_Open_Zebra5.setText("Open");
        jButton_Open_Zebra5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Open_Zebra5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Open_Zebra5);
        jButton_Open_Zebra5.setBounds(270, 160, 90, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setText("Customer  Details");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(50, 480, 180, 30);

        jButton_Open_Customer.setText("Open");
        jButton_Open_Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Open_CustomerActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Open_Customer);
        jButton_Open_Customer.setBounds(270, 480, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\My Works\\My Java Projects\\Fish_Farm\\Images\\72630969_436173710373271_3068569062851215360_n.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 770, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        Thread JFrame_4 = new Thread() {
            public void run() {
                for (;;) {
                    Calendar cal = new GregorianCalendar();
                    //Time:
                    int second = cal.get(Calendar.SECOND);
                    int minute = cal.get(Calendar.MINUTE);
                    int hour = cal.get(Calendar.HOUR);
                    //Date:
                    int day = cal.get(Calendar.DAY_OF_MONTH);
                    int month = cal.get(Calendar.MONTH);
                    int year = cal.get(Calendar.YEAR);

                    jLabel_Time.setText("Time :- " + hour + ":" + minute + ":" + second);
                    jLabel_Date.setText("Date :-" + " " + year + "-" + month + "-" + day);

                    try {
                        sleep(1000);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
        };
        JFrame_4.start();
    }//GEN-LAST:event_formWindowOpened

    private void jButton_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CloseActionPerformed

        int a;
        a = JOptionPane.showConfirmDialog(null, "Are you sure to you went to close this program now?", "Close Program", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (a == 0) {
            System.exit(a);
        }
    }//GEN-LAST:event_jButton_CloseActionPerformed

    private void jButton_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LogoutActionPerformed
       
        int a;
        a = JOptionPane.showConfirmDialog(null, "Are you sure to tou went to logout to the system","Logout System",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if (a==0){
           JFrame_11 f11 = new JFrame_11();
           f11.setVisible(true);
           this.dispose();        
        }
        
    }//GEN-LAST:event_jButton_LogoutActionPerformed

    private void jButton_Open_Zebra5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Open_Zebra5ActionPerformed
        
        JFrame_5 f5 = new JFrame_5();
        f5.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton_Open_Zebra5ActionPerformed

    private void jButton_Open_PlatyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Open_PlatyActionPerformed
        
        JFrame_6 f6 = new JFrame_6();
        f6.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton_Open_PlatyActionPerformed

    private void jButton_Open_BettaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Open_BettaActionPerformed
    
        JFrame_7 f7 = new JFrame_7();
        f7.setVisible(true);
        this.dispose(); 

    }//GEN-LAST:event_jButton_Open_BettaActionPerformed

    private void jButton_Open_SwanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Open_SwanActionPerformed
        
        JFrame_8 f8 = new JFrame_8();
        f8.setVisible(true);
        this.dispose(); 
        
    }//GEN-LAST:event_jButton_Open_SwanActionPerformed

    private void jButton_Open_CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Open_CustomerActionPerformed
        
        JFrame_9 f9 = new JFrame_9();
        f9.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton_Open_CustomerActionPerformed

    private void jButton_Open_ResourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Open_ResourceActionPerformed
        
        JFrame_10 f10 = new JFrame_10();
        f10.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton_Open_ResourceActionPerformed

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
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;*/
                UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            }

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Close;
    private javax.swing.JButton jButton_Logout;
    private javax.swing.JButton jButton_Open_Betta;
    private javax.swing.JButton jButton_Open_Customer;
    private javax.swing.JButton jButton_Open_Platy;
    private javax.swing.JButton jButton_Open_Resource;
    private javax.swing.JButton jButton_Open_Swan;
    private javax.swing.JButton jButton_Open_Zebra5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Date;
    private javax.swing.JLabel jLabel_Time;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
