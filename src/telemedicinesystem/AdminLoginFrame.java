/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telemedicinesystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AdminLoginFrame extends javax.swing.JFrame {

    public AdminLoginFrame(String status) {
        initComponents(); 
        setExtendedState(this.MAXIMIZED_BOTH);
        loginstatus=status;
        createConnection();
    }
    
    public void createConnection()
    {
        try
            {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Telemedicine","root","root");
            }
        catch(Exception e)
        {
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginform = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pw1 = new javax.swing.JPasswordField();
        ch1 = new javax.swing.JCheckBox();
        l3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        bgimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        loginform.setBackground(new java.awt.Color(0, 0, 0,100));
        loginform.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        loginform.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginform.setPreferredSize(new java.awt.Dimension(700, 307));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 35)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 238, 238));
        jLabel4.setText("Username");

        tf1.setFont(new java.awt.Font("Cambria Math", 0, 30)); // NOI18N
        tf1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf1KeyReleased(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 35)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 238, 238));
        jLabel5.setText("Password");

        pw1.setFont(new java.awt.Font("Cambria Math", 0, 30)); // NOI18N
        pw1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pw1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pw1KeyReleased(evt);
            }
        });

        ch1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        ch1.setForeground(new java.awt.Color(255, 255, 255));
        ch1.setText("Show Password");
        ch1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch1ActionPerformed(evt);
            }
        });

        l3.setBackground(new java.awt.Color(204, 204, 255));
        l3.setFont(new java.awt.Font("Cambria Math", 0, 40)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setText("Login");
        l3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        l3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
        });

        l2.setBackground(new java.awt.Color(204, 204, 255));
        l2.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("Back");
        l2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        l2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginformLayout = new javax.swing.GroupLayout(loginform);
        loginform.setLayout(loginformLayout);
        loginformLayout.setHorizontalGroup(
            loginformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginformLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addComponent(tf1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addComponent(pw1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginformLayout.createSequentialGroup()
                        .addGap(6, 576, Short.MAX_VALUE)
                        .addComponent(ch1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addGroup(loginformLayout.createSequentialGroup()
                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(l3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        loginformLayout.setVerticalGroup(
            loginformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginformLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(l2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pw1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ch1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l3)
                .addContainerGap())
        );

        getContentPane().add(loginform);
        loginform.setBounds(100, 170, 740, 460);

        bgimage.setIcon(new javax.swing.ImageIcon("C:\\Telemedicine\\Images\\telehealth-1-3-a_1920x1080.jpg")); // NOI18N
        getContentPane().add(bgimage);
        bgimage.setBounds(0, 0, 1535, 800);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
String loginstatus="";
Connection con;
    private void ch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch1ActionPerformed
        if(ch1.isSelected())
        {
            pw1.setEchoChar((char)0);
        }
        else
        {
            pw1.setEchoChar('*');
        }
    }//GEN-LAST:event_ch1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        LoginFrame l=new LoginFrame();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_l2MouseClicked

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        String username=tf1.getText();
        String password=pw1.getText();
        int count=0;
        int aid=0;
        try
        {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select count(*) from Admin where Username='"+username+"' and Password='"+password+"'");
            while(rs.next())
            {
                count=rs.getInt("count(*)");
                if(count==1){
                    ResultSet rs1=st.executeQuery("Select Admin_ID from Admin where Username='"+username+"' and Password='"+password+"'");
                    while(rs1.next())
                    {
                        aid=rs1.getInt("Admin_ID");
                        AdminDashBoard a=new AdminDashBoard();
                        a.setVisible(true);
                        this.dispose();
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Password or Username");
                }
            }
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_l3MouseClicked

    private void tf1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyReleased
        int code=evt.getKeyCode();
        if(code==10)
        {
            String username=tf1.getText();
            String password=pw1.getText();
            int count=0;
            int did=0;
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("Select count(*) from Doctor where Username='"+username+"' and Password='"+password+"'");
                while(rs.next())
                {
                    count=rs.getInt("count(*)");
                    if(count==1){
                        ResultSet rs1=st.executeQuery("Select Doctor_ID from Doctor where Username='"+username+"' and Password='"+password+"'");
                        while(rs1.next())
                        {
                            did=rs1.getInt("Doctor_ID");
                            DoctorDashBoard d=new DoctorDashBoard(did);
                            d.setVisible(true);
                            this.dispose();
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Incorrect Password or Username");
                    }
                }
            }
            catch(Exception e)
            {

            }
        }
    }//GEN-LAST:event_tf1KeyReleased

    private void pw1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pw1KeyReleased
        int code=evt.getKeyCode();
        if(code==10)
        {
            String username=tf1.getText();
            String password=pw1.getText();
            int count=0;
            int did=0;
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("Select count(*) from Doctor where Username='"+username+"' and Password='"+password+"'");
                while(rs.next())
                {
                    count=rs.getInt("count(*)");
                    if(count==1){
                        ResultSet rs1=st.executeQuery("Select Doctor_ID from Doctor where Username='"+username+"' and Password='"+password+"'");
                        while(rs1.next())
                        {
                            did=rs1.getInt("Doctor_ID");
                            DoctorDashBoard d=new DoctorDashBoard(did);
                            d.setVisible(true);
                            this.dispose();
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Incorrect Password or Username");
                    }
                }
            }
            catch(Exception e)
            {

            }
        }
    }//GEN-LAST:event_pw1KeyReleased

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
            java.util.logging.Logger.getLogger(AdminLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLoginFrame("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgimage;
    private javax.swing.JCheckBox ch1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JPanel loginform;
    private javax.swing.JPasswordField pw1;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
