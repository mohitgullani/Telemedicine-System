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
public class DoctorDashBoard extends javax.swing.JFrame {

    /**
     * Creates new form PatientDashBoard
     */
    public DoctorDashBoard(int did) {
        initComponents();
        this.did=did;
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
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel51 = new javax.swing.JLabel();
        g1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

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

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));
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
        label2.setText("Age:");
        jPanel2.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 270, 40));

        label3.setFont(new java.awt.Font("Cambria Math", 1, 23)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Contact");
        jPanel2.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 270, 40));

        label4.setFont(new java.awt.Font("Cambria Math", 1, 23)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Gender:");
        jPanel2.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 270, 40));

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

        label7.setFont(new java.awt.Font("Cambria Math", 1, 23)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 200, 40));

        label5.setFont(new java.awt.Font("Cambria Math", 1, 23)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Email: ");
        jPanel2.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 270, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 291, 801));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel5.setText("Scheduled Appointment");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 30));

        tb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tb1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SNO", "Apt_ID", "Doctor_Name", "Service_Name", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            tb1.getColumnModel().getColumn(0).setPreferredWidth(80);
            tb1.getColumnModel().getColumn(1).setResizable(false);
            tb1.getColumnModel().getColumn(2).setResizable(false);
            tb1.getColumnModel().getColumn(2).setPreferredWidth(220);
            tb1.getColumnModel().getColumn(3).setResizable(false);
            tb1.getColumnModel().getColumn(3).setPreferredWidth(300);
            tb1.getColumnModel().getColumn(4).setResizable(false);
            tb1.getColumnModel().getColumn(4).setPreferredWidth(250);
            tb1.getColumnModel().getColumn(5).setResizable(false);
            tb1.getColumnModel().getColumn(5).setPreferredWidth(250);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 1210, 700));

        jLabel51.setBackground(new java.awt.Color(204, 204, 204));
        jLabel51.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Cancel Appointment");
        jLabel51.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 760, 230, 35));

        g1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        g1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Today's", "All Upcoming", "Previous" }));
        g1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        g1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g1ActionPerformed(evt);
            }
        });
        jPanel1.add(g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 8, 230, 30));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 760, 410, 35));

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
int did=0;
Connection con;
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        String gender="";
        try
        {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from Doctor where Doctor_ID="+did+"");
            while(rs.next())
            {
                label6.setText(""+rs.getString("Username"));
                label1.setText("Name: "+rs.getString("Fname")+rs.getString("Lname"));
                label3.setText("Contact: "+rs.getString("Contact"));
                label5.setText("Email: "+rs.getString("Email").substring(0,13));
                label7.setText(""+rs.getString("Email").substring(13));
                gender=rs.getString("Gender");
            }
            ResultSet rs1=st.executeQuery("select date_format(from_days(Datediff(now(),DOB)),'%Y')+0 as age from Doctor where Doctor_ID="+did+"");
            while(rs1.next())
            {
                label2.setText("Age: "+rs1.getString("Age"));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        if(gender.equals("M")){
            label4.setText("Gender: Male");
        }else if(gender.equals("F")){
            label4.setText("Gender: Female");
        }else{
            label4.setText("Gender: Prefer not to say");
        }
    
        DefaultTableModel model2=(DefaultTableModel)tb1.getModel();
        try
        {
            while(model2.getRowCount()>0)
            {
                for(int i=0;i<model2.getRowCount();i++)
                model2.removeRow(i);
            }
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select a.Appointment_ID,a.Patient_ID, p.Fname, p.Mname, p.Lname, s.Service_Name, a.Date, a.Time from Appointment a, Patient p, Services s where a.Patient_ID=p.Patient_ID and s.Service_ID=a.Service_ID and a.Doctor_ID="+did+" and date=(select curdate()) and Time=(select curtime())order by a.Date,a.Time");
            int sno=1;
            while(rs.next())
            {
                String name=rs.getString("Fname")+" "+rs.getString("Mname")+" "+rs.getString("Lname");
                model2.addRow(new Object[]{sno++,rs.getString(1),name,rs.getString(6),rs.getString(7),rs.getString(8)});
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
        int deletedpid=0, deleteddid=0;
        try        
        {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select Patient_ID, Doctor_ID from Appointment where Appointment_ID="+aid+"");
            while(rs.next())
            {
                deletedpid=rs.getInt("Patient_ID");
                deleteddid=rs.getInt("Doctor_ID");
            }
            st.executeUpdate("insert into AppointmentDeleted values("+deletedpid+","+deleteddid+")");
            st.executeUpdate("delete from Appointment where Appointment_ID="+aid+"");
            JOptionPane.showMessageDialog(null,"Appointment Cancelled");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jLabel51MouseClicked
String tempaid="";
int aid=0;
    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
        try{
            DefaultTableModel model=(DefaultTableModel)tb1.getModel();
            tempaid=model.getValueAt(tb1.getSelectedRow(),1).toString(); 
            aid=Integer.parseInt(tempaid);
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_tb1MouseClicked
String datestatus="";
    private void g1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g1ActionPerformed
        datestatus=(String)g1.getSelectedItem();
        DefaultTableModel model2=(DefaultTableModel)tb1.getModel();
        try
        {
            while(model2.getRowCount()>0)
            {
                for(int i=0;i<model2.getRowCount();i++)
                model2.removeRow(i);
            }
            Statement st=con.createStatement();
            if(datestatus.equals("Today's")){
                ResultSet rs=st.executeQuery("select a.Appointment_ID,a.Patient_ID, p.Fname, p.Mname, p.Lname, s.Service_Name, a.Date, a.Time from Appointment a, Patient p, Services s where a.Patient_ID=p.Patient_ID and s.Service_ID=a.Service_ID and a.Doctor_ID="+did+" and a.Date=(select curdate()) and a.Time>(select curTime()) order by a.Date,a.Time");
                int sno=1;
                while(rs.next())
                {
                    String name=rs.getString("Fname")+" "+rs.getString("Mname")+" "+rs.getString("Lname");
                    model2.addRow(new Object[]{sno++,rs.getString(1),name,rs.getString(6),rs.getString(7),rs.getString(8)});
                }
                jLabel1.setText("");
            }else if(datestatus.equals("All Upcoming")){
                ResultSet rs1=st.executeQuery("select a.Appointment_ID,a.Patient_ID, p.Fname, p.Mname, p.Lname, s.Service_Name, a.Date, a.Time from Appointment a, Patient p, Services s where a.Patient_ID=p.Patient_ID and s.Service_ID=a.Service_ID and a.Doctor_ID="+did+" and a.Date=(select curdate()) and a.Time>(select curTime()) order by a.Date,a.Time");
                int sno=1;
                while(rs1.next())
                {
                    String name=rs1.getString("Fname")+" "+rs1.getString("Mname")+" "+rs1.getString("Lname");
                    model2.addRow(new Object[]{sno++,rs1.getString(1),name,rs1.getString(6),rs1.getString(7),rs1.getString(8)});
                }
                ResultSet rs=st.executeQuery("select a.Appointment_ID,a.Patient_ID, p.Fname, p.Mname, p.Lname, s.Service_Name, a.Date, a.Time from Appointment a, Patient p, Services s where a.Patient_ID=p.Patient_ID and s.Service_ID=a.Service_ID and a.Doctor_ID="+did+" and a.Date>(select curdate())order by a.Date,a.Time");
                while(rs.next())
                {
                    String name=rs.getString("Fname")+" "+rs.getString("Mname")+" "+rs.getString("Lname");
                    model2.addRow(new Object[]{sno++,rs.getString(1),name,rs.getString(6),rs.getString(7),rs.getString(8)});
                }
                jLabel1.setText("");
            }else{
                ResultSet rs=st.executeQuery("select a.Appointment_ID,a.Patient_ID, p.Fname, p.Mname, p.Lname, s.Service_Name, a.Date, a.Time from Appointment a, Patient p, Services s where a.Patient_ID=p.Patient_ID and s.Service_ID=a.Service_ID and a.Doctor_ID="+did+" and a.Date<(select curdate())order by a.Date,a.Time");
                int sno=1;
                while(rs.next())
                {
                    String name=rs.getString("Fname")+" "+rs.getString("Mname")+" "+rs.getString("Lname");
                    model2.addRow(new Object[]{sno++,rs.getString(1),name,rs.getString(6),rs.getString(7),rs.getString(8)});
                }
                ResultSet rs1=st.executeQuery("select a.Appointment_ID,a.Patient_ID, p.Fname, p.Mname, p.Lname, s.Service_Name, a.Date, a.Time from Appointment a, Patient p, Services s where a.Patient_ID=p.Patient_ID and s.Service_ID=a.Service_ID and a.Doctor_ID="+did+" and a.Date=(select curdate()) and a.Time<(select curtime())order by a.Date,a.Time");
                while(rs1.next())
                {
                    String name=rs1.getString("Fname")+" "+rs1.getString("Mname")+" "+rs1.getString("Lname");
                    model2.addRow(new Object[]{sno++,rs1.getString(1),name,rs1.getString(6),rs1.getString(7),rs1.getString(8)});
                }
                ResultSet rs2=st.executeQuery("select sum(a.Amount) from Appointment a, Patient p, Services s where a.Patient_ID=p.Patient_ID and s.Service_ID=a.Service_ID and a.Doctor_ID="+did+" and a.Date=(select curdate()) and a.Time<(select curtime())order by a.Date,a.Time");
                int sum=0;
                while(rs2.next())
                {
                    sum+=rs2.getInt("sum(a.Amount)");
                }
                System.out.println(sum);
                ResultSet rs3=st.executeQuery("select sum(a.Amount) from Appointment a, Patient p, Services s where a.Patient_ID=p.Patient_ID and s.Service_ID=a.Service_ID and a.Doctor_ID="+did+" and a.Date<(select curdate())order by a.Date,a.Time");
                while(rs3.next())
                {
                    sum+=rs3.getInt("sum(a.Amount)");
                }
                jLabel1.setText("Total Earning Till Now: $"+sum);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_g1ActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorDashBoard(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> g1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel profileimage;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
