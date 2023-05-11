/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telemedicinesystem;

import java.awt.Color;

public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
        initComponents(); 
        setExtendedState(this.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginform = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        bgimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        loginform.setBackground(new java.awt.Color(0, 0, 0,100));
        loginform.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        loginform.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        loginform.setPreferredSize(new java.awt.Dimension(700, 307));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Telemedicine System");

        l1.setBackground(new java.awt.Color(204, 204, 255));
        l1.setFont(new java.awt.Font("Cambria Math", 0, 40)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setText("PATIENT");
        l1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        l1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l1MouseEntered(evt);
            }
        });

        l2.setBackground(new java.awt.Color(204, 204, 255));
        l2.setFont(new java.awt.Font("Cambria Math", 0, 40)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("DOCTOR");
        l2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        l2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l2MouseEntered(evt);
            }
        });

        l3.setBackground(new java.awt.Color(204, 204, 255));
        l3.setFont(new java.awt.Font("Cambria Math", 0, 40)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setText("PAYMENT AUTHORIZER");
        l3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        l3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l3MouseEntered(evt);
            }
        });

        l4.setBackground(new java.awt.Color(204, 204, 255));
        l4.setFont(new java.awt.Font("Cambria Math", 0, 40)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l4.setText("ADMIN");
        l4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        l4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l4MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout loginformLayout = new javax.swing.GroupLayout(loginform);
        loginform.setLayout(loginformLayout);
        loginformLayout.setHorizontalGroup(
            loginformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
            .addGroup(loginformLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        loginformLayout.setVerticalGroup(
            loginformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginformLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(loginform);
        loginform.setBounds(80, 80, 740, 630);

        bgimage.setIcon(new javax.swing.ImageIcon("C:\\Telemedicine\\Images\\telehealth-1-3-a_1920x1080.jpg")); // NOI18N
        getContentPane().add(bgimage);
        bgimage.setBounds(0, 0, 1535, 800);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void l1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseEntered
       
    }//GEN-LAST:event_l1MouseEntered

    private void l2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_l2MouseEntered

    private void l3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_l3MouseEntered

    private void l4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_l4MouseEntered

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        DoctorLoginFrame d=new DoctorLoginFrame("Doctor");
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_l2MouseClicked

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        PatientLoginFrame d=new PatientLoginFrame("Patient");
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_l1MouseClicked

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        PaymentAuthorizerLoginFrame p=new PaymentAuthorizerLoginFrame("User");
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_l3MouseClicked

    private void l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseClicked
        AdminLoginFrame a=new AdminLoginFrame("Admin");
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_l4MouseClicked

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgimage;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JPanel loginform;
    // End of variables declaration//GEN-END:variables
}
