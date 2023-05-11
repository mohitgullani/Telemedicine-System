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
import javax.swing.table.DefaultTableModel;

public class PaymentAuthrozerInfo extends javax.swing.JFrame {

    public PaymentAuthrozerInfo() {
        initComponents(); 
        setExtendedState(this.MAXIMIZED_BOTH);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
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
        jLabel2.setText("Payment Authrozier Information");

        tb1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "SNO", "U_ID", "Fname", "Mname", "Lname", "Email", "Contact", "Acc. Status", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb1.setRowHeight(30);
        jScrollPane1.setViewportView(tb1);
        if (tb1.getColumnModel().getColumnCount() > 0) {
            tb1.getColumnModel().getColumn(0).setPreferredWidth(40);
            tb1.getColumnModel().getColumn(1).setPreferredWidth(40);
            tb1.getColumnModel().getColumn(2).setPreferredWidth(120);
            tb1.getColumnModel().getColumn(3).setPreferredWidth(50);
            tb1.getColumnModel().getColumn(4).setPreferredWidth(120);
            tb1.getColumnModel().getColumn(5).setPreferredWidth(200);
            tb1.getColumnModel().getColumn(6).setPreferredWidth(150);
            tb1.getColumnModel().getColumn(7).setPreferredWidth(100);
            tb1.getColumnModel().getColumn(8).setPreferredWidth(100);
            tb1.getColumnModel().getColumn(9).setPreferredWidth(100);
        }

        javax.swing.GroupLayout loginformLayout = new javax.swing.GroupLayout(loginform);
        loginform.setLayout(loginformLayout);
        loginformLayout.setHorizontalGroup(
            loginformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginformLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1490, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );
        loginformLayout.setVerticalGroup(
            loginformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginformLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(loginform);
        loginform.setBounds(20, 50, 1500, 740);

        l2.setBackground(new java.awt.Color(204, 204, 255));
        l2.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("Back");
        l2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        l2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });
        getContentPane().add(l2);
        l2.setBounds(10, 10, 73, 28);

        bgimage.setIcon(new javax.swing.ImageIcon("C:\\Telemedicine\\Images\\telehealth-1-3-a_1920x1080.jpg")); // NOI18N
        getContentPane().add(bgimage);
        bgimage.setBounds(0, 0, 1535, 800);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

Connection con;
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        DefaultTableModel model=(DefaultTableModel)tb1.getModel();
        try
        {
            while(model.getRowCount()>0)
            {
                for(int i=0;i<model.getRowCount();i++)
                model.removeRow(i);
            }
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from User");
            int sno=1;
            while(rs.next())
            {
                model.addRow(new Object[]{sno++,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)});   
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        AdminDashBoard l=new AdminDashBoard();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_l2MouseClicked

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
            java.util.logging.Logger.getLogger(PaymentAuthrozerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentAuthrozerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentAuthrozerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentAuthrozerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PaymentAuthrozerInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgimage;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l2;
    private javax.swing.JPanel loginform;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
