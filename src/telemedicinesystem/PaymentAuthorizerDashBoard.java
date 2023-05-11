/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telemedicinesystem;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class PaymentAuthorizerDashBoard extends javax.swing.JFrame {

    /**
     * Creates new form PatientDashBoard
     */
    public PaymentAuthorizerDashBoard(int uid) {
        initComponents();
        this.uid=uid;
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        profileimage = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel51 = new javax.swing.JLabel();
        namefield = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profileimage.setIcon(new javax.swing.ImageIcon("C:\\TelemedicineSystem\\Images\\Profile Image.png")); // NOI18N
        profileimage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(profileimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        label6.setFont(new java.awt.Font("Cambria Math", 3, 24)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("UserName:");
        jPanel2.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 25, 200, 40));

        label2.setFont(new java.awt.Font("Cambria Math", 1, 23)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Contact");
        jPanel2.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 270, 40));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Logout");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(58, 48, 129), null, new java.awt.Color(58, 48, 129)));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 750, 90, 40));

        label1.setFont(new java.awt.Font("Cambria Math", 1, 23)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Name:");
        jPanel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 270, 40));

        label4.setFont(new java.awt.Font("Cambria Math", 1, 23)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 200, 40));

        label3.setFont(new java.awt.Font("Cambria Math", 1, 23)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Email: ");
        jPanel2.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 270, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 291, 801));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel5.setText("Pending Payments");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 180, 30));

        tb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tb1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SNO", "Apt ID", "Patient ID", "Doctor ID", "Service ID", "Amount", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tb1.setRowHeight(30);
        tb1.setShowGrid(true);
        tb1.getTableHeader().setResizingAllowed(false);
        tb1.getTableHeader().setReorderingAllowed(false);
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb1);
        if (tb1.getColumnModel().getColumnCount() > 0) {
            tb1.getColumnModel().getColumn(0).setResizable(false);
            tb1.getColumnModel().getColumn(0).setPreferredWidth(40);
            tb1.getColumnModel().getColumn(1).setResizable(false);
            tb1.getColumnModel().getColumn(1).setPreferredWidth(100);
            tb1.getColumnModel().getColumn(2).setResizable(false);
            tb1.getColumnModel().getColumn(2).setPreferredWidth(200);
            tb1.getColumnModel().getColumn(3).setResizable(false);
            tb1.getColumnModel().getColumn(3).setPreferredWidth(200);
            tb1.getColumnModel().getColumn(4).setResizable(false);
            tb1.getColumnModel().getColumn(4).setPreferredWidth(200);
            tb1.getColumnModel().getColumn(5).setResizable(false);
            tb1.getColumnModel().getColumn(5).setPreferredWidth(100);
            tb1.getColumnModel().getColumn(6).setResizable(false);
            tb1.getColumnModel().getColumn(6).setPreferredWidth(135);
            tb1.getColumnModel().getColumn(7).setResizable(false);
            tb1.getColumnModel().getColumn(7).setPreferredWidth(135);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 1210, 660));

        jLabel51.setBackground(new java.awt.Color(204, 204, 204));
        jLabel51.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Approve Payment");
        jLabel51.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 760, 230, 35));

        namefield.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        namefield.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namefield.setText("Name");
        jPanel1.add(namefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 720, 1210, 35));

        jLabel52.setBackground(new java.awt.Color(204, 204, 204));
        jLabel52.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Reject Payment");
        jLabel52.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 760, 230, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int uid=0;
Connection con;
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        try
        {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from User where User_ID="+uid+"");
            while(rs.next())
            {
                label6.setText(""+rs.getString("Username"));
                label1.setText("Name: "+rs.getString("Fname")+rs.getString("Lname"));
                label2.setText("Contact: "+rs.getString("Contact"));
                label3.setText("Email: "+rs.getString("Email").substring(0,13));
                label4.setText(""+rs.getString("Email").substring(13));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try
        {
            DefaultTableModel model=(DefaultTableModel)tb1.getModel();
            while(model.getRowCount()>0)
            {
                for(int i=0;i<model.getRowCount();i++)
                model.removeRow(i);
            }
            Statement st=con.createStatement();
            int sno=1;
            ResultSet rs=st.executeQuery("Select * from Appointment a where a.Appointment_ID Not in (select p.Appointment_ID from Payment p) order by Date, Time");
            while(rs.next())
            {
                model.addRow(new Object[]{sno++,rs.getInt(1),rs.getInt(8),rs.getInt(2),rs.getInt(3),rs.getInt(5),rs.getString(6),rs.getString(7)});
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        LoginFrame l=new LoginFrame();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked
        try        
        {
            Statement st=con.createStatement();
            st.executeUpdate("insert into Payment(Doctor_ID,Patient_ID,Service_ID,Amount,Payment_Status,User_ID,Appointment_ID) values ("+did+","+pid+","+sid+","+amount+",'Approved',"+uid+","+aid+")");
            JOptionPane.showMessageDialog(null,"Payment Approved");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jLabel51MouseClicked
String tempaid="", temppid="", tempdid="", tempsid="",tempamount="",date="",time="";
int aid=0, pid=0, did=0, sid=0,amount=0;
    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
        try{
            DefaultTableModel model=(DefaultTableModel)tb1.getModel();
            tempaid=model.getValueAt(tb1.getSelectedRow(),1).toString(); 
            temppid=model.getValueAt(tb1.getSelectedRow(),2).toString();
            tempdid=model.getValueAt(tb1.getSelectedRow(),3).toString();
            tempsid=model.getValueAt(tb1.getSelectedRow(),4).toString();
            tempamount=model.getValueAt(tb1.getSelectedRow(),5).toString();
            date=model.getValueAt(tb1.getSelectedRow(),5).toString();
            time=model.getValueAt(tb1.getSelectedRow(),5).toString();
            aid=Integer.parseInt(tempaid);
            pid=Integer.parseInt(temppid);
            did=Integer.parseInt(tempdid);
            sid=Integer.parseInt(tempsid);
            amount=Integer.parseInt(tempamount);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(" select p.Fname, p.Lname, d.Fname, d.Lname, s.Service_Name from Patient p, Doctor d, Services s where Patient_ID="+pid+" and Doctor_ID="+did+" and Service_ID="+sid+";");
            while(rs.next())
            {
                namefield.setText("Patient Name: "+rs.getString("p.Fname")+" "+rs.getString("p.Lname")+" || Doctor Name: "+rs.getString("d.Fname")+" "+rs.getString("d.Lname")+" || Service Name: "+rs.getString("s.Service_Name"));
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_tb1MouseClicked

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
        try        
        {
            Statement st=con.createStatement();
            st.executeUpdate("insert into AppointmentDeleted values("+pid+","+did+")");
            st.executeUpdate("delete from Appointment where Appointment_ID="+aid+"");
            JOptionPane.showMessageDialog(null,"Payment Rejected");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jLabel52MouseClicked
String datestatus="";
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
            java.util.logging.Logger.getLogger(PaymentAuthorizerDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentAuthorizerDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentAuthorizerDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentAuthorizerDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentAuthorizerDashBoard(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel namefield;
    private javax.swing.JLabel profileimage;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
