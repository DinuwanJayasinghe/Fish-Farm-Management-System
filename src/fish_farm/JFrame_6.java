/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish_farm;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Nilma
 */
public class JFrame_6 extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_6
     */
    public JFrame_6() {
        initComponents();
        showTableData();
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
        jLabel_Date = new javax.swing.JLabel();
        jLabel_Time = new javax.swing.JLabel();
        jTextField_Fish_ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_Varaties = new javax.swing.JComboBox<>();
        jLabel_CheckFish_Id = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_size = new javax.swing.JTextField();
        jLabel_Select_Varaties = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Price = new javax.swing.JTextField();
        jLabel_Set_Size = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Availability = new javax.swing.JTextField();
        jLabel1_set_Price = new javax.swing.JLabel();
        jButton_Back = new javax.swing.JButton();
        jButton_Add = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jLabel_Set_availability = new javax.swing.JLabel();
        jButton_New = new javax.swing.JButton();
        jButton_Search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Details of Platy ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Details of Platy ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 30, 890, 29);

        jLabel_Date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Date.setText("Date");
        jPanel1.add(jLabel_Date);
        jLabel_Date.setBounds(20, 90, 180, 30);

        jLabel_Time.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Time.setText("Time");
        jPanel1.add(jLabel_Time);
        jLabel_Time.setBounds(730, 100, 140, 30);

        jTextField_Fish_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_Fish_IDKeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_Fish_ID);
        jTextField_Fish_ID.setBounds(180, 160, 220, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Fish ID : ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 170, 100, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Available Varieties : ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 230, 150, 20);

        jComboBox_Varaties.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~Select Varaties Of Platy~", "Black Platy", "Marigold Platy", "Sunderst Platy", "Sunset Platy", "Bloodred Platy" }));
        jComboBox_Varaties.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_VaratiesItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBox_Varaties);
        jComboBox_Varaties.setBounds(180, 220, 220, 30);

        jLabel_CheckFish_Id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_CheckFish_Id.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel_CheckFish_Id);
        jLabel_CheckFish_Id.setBounds(180, 190, 220, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Size :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 290, 80, 20);

        jTextField_size.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_sizeKeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_size);
        jTextField_size.setBounds(180, 280, 220, 30);

        jLabel_Select_Varaties.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Select_Varaties.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel_Select_Varaties);
        jLabel_Select_Varaties.setBounds(180, 250, 220, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Price : ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 350, 90, 20);

        jTextField_Price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_PriceKeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_Price);
        jTextField_Price.setBounds(180, 340, 220, 30);

        jLabel_Set_Size.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Set_Size.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel_Set_Size);
        jLabel_Set_Size.setBounds(180, 310, 220, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Availability :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 410, 110, 20);

        jTextField_Availability.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_AvailabilityKeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_Availability);
        jTextField_Availability.setBounds(180, 400, 220, 30);

        jLabel1_set_Price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1_set_Price.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel1_set_Price);
        jLabel1_set_Price.setBounds(180, 370, 220, 30);

        jButton_Back.setText("<<Back");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Back);
        jButton_Back.setBounds(40, 490, 90, 30);

        jButton_Add.setText("Add");
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Add);
        jButton_Add.setBounds(190, 490, 90, 30);

        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Delete);
        jButton_Delete.setBounds(340, 490, 90, 30);

        jButton_Update.setText("Update");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Update);
        jButton_Update.setBounds(480, 490, 90, 30);

        jLabel_Set_availability.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Set_availability.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel_Set_availability);
        jLabel_Set_availability.setBounds(180, 430, 220, 30);

        jButton_New.setText("New");
        jButton_New.setToolTipText("");
        jButton_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NewActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_New);
        jButton_New.setBounds(630, 490, 90, 30);

        jButton_Search.setText("Search");
        jButton_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Search);
        jButton_Search.setBounds(780, 490, 90, 30);

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(430, 160, 440, 270);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\My Works\\My Java Projects\\Fish_Farm\\Images\\ian-dooley-DuBNA1QMpPA-unsplash.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 880, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Fish_IDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Fish_IDKeyReleased
        jLabel_CheckFish_Id.setText(null);
    }//GEN-LAST:event_jTextField_Fish_IDKeyReleased

    private void jTextField_sizeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_sizeKeyReleased
        jLabel_Set_Size.setText(null);
    }//GEN-LAST:event_jTextField_sizeKeyReleased

    private void jTextField_PriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PriceKeyReleased
        jLabel1_set_Price.setText(null);
    }//GEN-LAST:event_jTextField_PriceKeyReleased

    private void jTextField_AvailabilityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_AvailabilityKeyReleased
        jLabel_Set_availability.setText(null);
    }//GEN-LAST:event_jTextField_AvailabilityKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        Thread JFrame_6 = new Thread() {
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
        JFrame_6.start();
    }//GEN-LAST:event_formWindowOpened

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed

        if (jTextField_Fish_ID.getText().trim().isEmpty()) {

            getToolkit().beep();
            jLabel_CheckFish_Id.setText("Enter fish id for serch");

        } else {

            try {

                String url = "jdbc:mysql://localhost:3306/";
                String db = "fishing_management_system";
                String user = "root";
                String pword = "123456";

                System.out.println(jTextField_Fish_ID.getText());
                Connection con = null;
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); //driver
                con = DriverManager.getConnection(url + db, user, pword);

                String query = "SELECT * FROM details_of_platy WHERE Fish_ID = '" + jTextField_Fish_ID.getText() + "'";

                ResultSet res = con.createStatement().executeQuery(query);
                System.out.println(query);

                if (res.next()) {

                    jComboBox_Varaties.setSelectedItem(res.getString("Available_Varieties"));
                    jTextField_size.setText(res.getString("Size"));
                    jTextField_Price.setText(res.getString("Price"));
                    jTextField_Availability.setText(res.getString("Availability"));

                    System.out.println(res.getString("Available_Varieties") + " " + res.getString("Price"));
                    System.out.println("Row Affected");

                }

                con.close();

            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {

                Logger.getLogger(JFrame_6.class.getName()).log(Level.SEVERE, null, ex);
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, ex);

                jTextField_Fish_ID.setText(null);
                jComboBox_Varaties.setSelectedItem("~Select Varaties Of Platy~");
                jTextField_Availability.setText(null);
                jTextField_Price.setText(null);
                jTextField_size.setText(null);
                jLabel_CheckFish_Id.setText(null);
                jLabel_Select_Varaties.setText(null);
                jLabel1_set_Price.setText(null);
                jLabel_Set_Size.setText(null);
                jLabel_Set_availability.setText(null);
                jTextField_Fish_ID.grabFocus();

            }

        }
        showTableData();
    }//GEN-LAST:event_jButton_SearchActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed

        if (jTextField_Fish_ID.getText().trim().isEmpty() && jComboBox_Varaties.getSelectedItem().equals("~Select Varaties Of Platy~") && jTextField_Availability.getText().trim().isEmpty() && jTextField_Price.getText().trim().isEmpty() && jTextField_size.getText().trim().isEmpty()) {

            getToolkit().beep();

            jLabel_CheckFish_Id.setText("Enter the fish id number.");
            jLabel_Select_Varaties.setText("Select Vairaty of the fish.");
            jLabel_Set_Size.setText("Enter the size.");
            jLabel1_set_Price.setText("Enter the price.");
            jLabel_Set_availability.setText("Enter the availability.");

        } else if (jTextField_Fish_ID.getText().trim().isEmpty()) {

            getToolkit().beep();
            jLabel_CheckFish_Id.setText("Enter the fish id number.");

        } else if (jComboBox_Varaties.getSelectedItem().equals("~Select Varaties Of Platy~")) {

            getToolkit().beep();
            jLabel_Select_Varaties.setText("Select Vairaty of the fish.");

        } else if (jTextField_Availability.getText().trim().isEmpty()) {

            getToolkit().beep();
            jLabel_Set_availability.setText("Enter the availability.");

        } else if (jTextField_Price.getText().trim().isEmpty()) {

            getToolkit().beep();
            jLabel1_set_Price.setText("Enter the price.");

        } else if (jTextField_size.getText().trim().isEmpty()) {

            getToolkit().beep();
            jLabel_Set_Size.setText("Enter the size.");

        } else {

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/";
                String db = "fishing_management_system";
                String user = "root";
                String pword = "123456";

                Connection con = null;
                con = DriverManager.getConnection(url + db, user, pword);

                String Query = "UPDATE details_of_platy SET Available_Varieties=? ,Size=? ,Price=? ,Availability=? WHERE Fish_ID=?";

                PreparedStatement pst = con.prepareStatement(Query);

                pst.setString(5, jTextField_Fish_ID.getText());
                pst.setString(1, jComboBox_Varaties.getSelectedItem().toString());
                pst.setString(2, jTextField_size.getText());
                pst.setString(3, jTextField_Price.getText());
                pst.setString(4, jTextField_Availability.getText());

                pst.executeUpdate();

                jTextField_Fish_ID.setText(null);
                jComboBox_Varaties.setSelectedItem("~Select Varaties Of Platy~");
                jTextField_Availability.setText(null);
                jTextField_Price.setText(null);
                jTextField_size.setText(null);
                jLabel_CheckFish_Id.setText(null);
                jLabel_Select_Varaties.setText(null);
                jLabel1_set_Price.setText(null);
                jLabel_Set_Size.setText(null);
                jLabel_Set_availability.setText(null);
                jTextField_Fish_ID.grabFocus();

                System.out.println(pst);
                System.out.println("1 row updated...");

                JOptionPane.showMessageDialog(null, "Record Update Succsessftlly...");

                con.close();

            } catch (HeadlessException | ClassNotFoundException | SQLException ex) {

                Logger.getLogger(JFrame_6.class.getName()).log(Level.SEVERE, null, ex);
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, ex);

                jTextField_Fish_ID.setText(null);
                jComboBox_Varaties.setSelectedItem("~Select Varaties Of Platy~");
                jTextField_Availability.setText(null);
                jTextField_Price.setText(null);
                jTextField_size.setText(null);
                jLabel_CheckFish_Id.setText(null);
                jLabel_Select_Varaties.setText(null);
                jLabel1_set_Price.setText(null);
                jLabel_Set_Size.setText(null);
                jLabel_Set_availability.setText(null);
                jTextField_Fish_ID.grabFocus();

            }

        }
        showTableData();
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed

        if (jTextField_Fish_ID.getText().trim().isEmpty()) {

            getToolkit().beep();
            jLabel_CheckFish_Id.setText("Enter fish id before delete.");

        } else {

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/";
                String db = "fishing_management_system";
                String user = "root";
                String pword = "123456";

                Connection con = null;
                con = DriverManager.getConnection(url + db, user, pword);

                String query = "DELETE FROM details_of_platy WHERE Fish_ID=?";

                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, jTextField_Fish_ID.getText());
                pst.executeUpdate();

                jTextField_Fish_ID.setText(null);
                jComboBox_Varaties.setSelectedItem("~Select Varaties Of Platy~");
                jTextField_Availability.setText(null);
                jTextField_Price.setText(null);
                jTextField_size.setText(null);
                jLabel_CheckFish_Id.setText(null);
                jLabel_Select_Varaties.setText(null);
                jLabel1_set_Price.setText(null);
                jLabel_Set_Size.setText(null);
                jLabel_Set_availability.setText(null);
                jTextField_Fish_ID.grabFocus();

                System.out.println(pst);
                System.out.println("1 row deleted...");

                JOptionPane.showMessageDialog(null, "Record Deleted Succsessftlly...");

                con.close();

            } catch (HeadlessException | ClassNotFoundException | SQLException ex) {

                Logger.getLogger(JFrame_6.class.getName()).log(Level.SEVERE, null, ex);
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, ex);

                jTextField_Fish_ID.setText(null);
                jComboBox_Varaties.setSelectedItem("~Select Varaties Of Platy~");
                jTextField_Availability.setText(null);
                jTextField_Price.setText(null);
                jTextField_size.setText(null);
                jLabel_CheckFish_Id.setText(null);
                jLabel_Select_Varaties.setText(null);
                jLabel1_set_Price.setText(null);
                jLabel_Set_Size.setText(null);
                jLabel_Set_availability.setText(null);
                jTextField_Fish_ID.grabFocus();

            }
        }

        showTableData();
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        JFrame_4 f4 = new JFrame_4();
        f4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_BackActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed

        if (jTextField_Fish_ID.getText().trim().isEmpty() && jComboBox_Varaties.getSelectedItem().equals("~Select Varaties Of Platy~") && jTextField_Availability.getText().trim().isEmpty() && jTextField_Price.getText().trim().isEmpty() && jTextField_size.getText().trim().isEmpty()) {

            getToolkit().beep();

            jLabel_CheckFish_Id.setText("Enter the fish id number.");
            jLabel_Select_Varaties.setText("Select Vairaty of the fish.");
            jLabel_Set_Size.setText("Enter the size.");
            jLabel1_set_Price.setText("Enter the price.");
            jLabel_Set_availability.setText("Enter the availability.");

        } else if (jTextField_Fish_ID.getText().trim().isEmpty()) {

            getToolkit().beep();
            jLabel_CheckFish_Id.setText("Enter the fish id number.");

        } else if (jComboBox_Varaties.getSelectedItem().equals("~Select Varaties Of Platy~")) {

            getToolkit().beep();
            jLabel_Select_Varaties.setText("Select Vairaty of the fish.");

        } else if (jTextField_Availability.getText().trim().isEmpty()) {

            getToolkit().beep();
            jLabel_Set_availability.setText("Enter the availability.");

        } else if (jTextField_Price.getText().trim().isEmpty()) {

            getToolkit().beep();
            jLabel1_set_Price.setText("Enter the price.");

        } else if (jTextField_size.getText().trim().isEmpty()) {

            getToolkit().beep();
            jLabel_Set_Size.setText("Enter the size.");

        } else {

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/";
                String db = "fishing_management_system";
                String user = "root";
                String pword = "123456";

                Connection con = null;
                con = DriverManager.getConnection(url + db, user, pword);

                String query = "INSERT INTO details_of_platy(Fish_ID, Available_Varieties, Size, Price, Availability)VALUES(?,?,?,?,?)";

                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, jTextField_Fish_ID.getText());
                pst.setString(2, jComboBox_Varaties.getSelectedItem().toString());
                pst.setString(3, jTextField_size.getText());
                pst.setString(4, jTextField_Price.getText());
                pst.setString(5, jTextField_Availability.getText());

                pst.executeUpdate();

                System.out.println(pst);
                System.out.println("1 row affected.");
                JOptionPane.showMessageDialog(null, "Data Added Succsessfully!!!");

                con.close();

            } catch (HeadlessException | ClassNotFoundException | SQLException ex) {

                Logger.getLogger(JFrame_6.class.getName()).log(Level.SEVERE, null, ex);
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, ex);

                jTextField_Fish_ID.setText(null);
                jComboBox_Varaties.setSelectedItem("~Select Varaties Of Platy~");
                jTextField_Availability.setText(null);
                jTextField_Price.setText(null);
                jTextField_size.setText(null);
                jLabel_CheckFish_Id.setText(null);
                jLabel_Select_Varaties.setText(null);
                jLabel1_set_Price.setText(null);
                jLabel_Set_Size.setText(null);
                jLabel_Set_availability.setText(null);
                jTextField_Fish_ID.grabFocus();

            }

        }

        showTableData();
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NewActionPerformed
        int a;
        getToolkit().beep();
        a = a = JOptionPane.showConfirmDialog(null, "Are you sure to you save that data into the database?", "Go to new form.", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (a == 0) {

            jTextField_Fish_ID.setText(null);
            jComboBox_Varaties.setSelectedItem("~Select Varaties Of Platy~");
            jTextField_Availability.setText(null);
            jTextField_Price.setText(null);
            jTextField_size.setText(null);
            jLabel_CheckFish_Id.setText(null);
            jLabel_Select_Varaties.setText(null);
            jLabel1_set_Price.setText(null);
            jLabel_Set_Size.setText(null);
            jLabel_Set_availability.setText(null);
            jTextField_Fish_ID.grabFocus();

        }
    }//GEN-LAST:event_jButton_NewActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int rows = jTable1.getRowCount();

        if (rows != 0) {

            int row_selected = jTable1.getSelectedRow();

            String Fish_ID = jTable1.getValueAt(row_selected, 0).toString();
            String Available_Varieties = jTable1.getValueAt(row_selected, 1).toString();
            String Size = jTable1.getValueAt(row_selected, 2).toString();
            String Price = jTable1.getValueAt(row_selected, 3).toString();
            String Availability = jTable1.getValueAt(row_selected, 4).toString();

            jTextField_Fish_ID.setText(Fish_ID);
            jComboBox_Varaties.setSelectedItem(Available_Varieties);
            jTextField_size.setText(Size);
            jTextField_Price.setText(Price);
            jTextField_Availability.setText(Availability);

        } else {

            JOptionPane.showMessageDialog(null, rows);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox_VaratiesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_VaratiesItemStateChanged
        jLabel_Select_Varaties.setText(null);
    }//GEN-LAST:event_jComboBox_VaratiesItemStateChanged

    public void showTableData() {

        try {

            String url = "jdbc:mysql://localhost:3306/";
            String db = "fishing_management_system";
            String user = "root";
            String pword = "123456";

            Connection con = null;
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url + db, user, pword);

            String queary = "SELECT * FROM details_of_platy;";

            PreparedStatement pst = con.prepareStatement(queary);
            ResultSet res = con.createStatement().executeQuery(queary);
            pst = con.prepareStatement(queary);

            res = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(res));

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {

            Logger.getLogger(JFrame_6.class.getName()).log(Level.SEVERE, null, ex);
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, ex);

        }

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
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;*/
                UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            }

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_New;
    private javax.swing.JButton jButton_Search;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JComboBox<String> jComboBox_Varaties;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_set_Price;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_CheckFish_Id;
    private javax.swing.JLabel jLabel_Date;
    private javax.swing.JLabel jLabel_Select_Varaties;
    private javax.swing.JLabel jLabel_Set_Size;
    private javax.swing.JLabel jLabel_Set_availability;
    private javax.swing.JLabel jLabel_Time;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Availability;
    private javax.swing.JTextField jTextField_Fish_ID;
    private javax.swing.JTextField jTextField_Price;
    private javax.swing.JTextField jTextField_size;
    // End of variables declaration//GEN-END:variables
}
