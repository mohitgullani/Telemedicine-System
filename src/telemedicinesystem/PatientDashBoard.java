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
public class PatientDashBoard extends javax.swing.JFrame {

    /**
     * Creates new form PatientDashBoard
     */
    public PatientDashBoard(int pid) {
        initComponents();
        this.pid=pid;
        setExtendedState(this.MAXIMIZED_BOTH);
        createConnection();
        
    }

    public void RemoveCurrentAppointmentLabels(){
        ca1.setVisible(false);
        ca2.setVisible(false);
        ca3.setVisible(false);
        ca4.setVisible(false);
        ca5.setVisible(false);
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
        searchfield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        ca1 = new javax.swing.JLabel();
        appmsg = new javax.swing.JLabel();
        ca2 = new javax.swing.JLabel();
        ca3 = new javax.swing.JLabel();
        ca4 = new javax.swing.JLabel();
        ca5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();

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

        jPanel2.setBackground(new java.awt.Color(58, 48, 129));
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

        searchfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchfield.setForeground(new java.awt.Color(204, 204, 204));
        searchfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchfield.setText(" Search doctor..");
        searchfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 48, 129)));
        searchfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchfieldFocusGained(evt);
            }
        });
        searchfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchfieldMouseClicked(evt);
            }
        });
        searchfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchfieldKeyReleased(evt);
            }
        });
        jPanel1.add(searchfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 6, 1232, 30));

        tb1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "DID", "Dname"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tb1.setGridColor(new java.awt.Color(255, 255, 255));
        tb1.setRowHeight(25);
        tb1.setSelectionBackground(new java.awt.Color(51, 204, 255));
        tb1.setShowGrid(false);
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb1);
        if (tb1.getColumnModel().getColumnCount() > 0) {
            tb1.getColumnModel().getColumn(0).setResizable(false);
            tb1.getColumnModel().getColumn(1).setResizable(false);
            tb1.getColumnModel().getColumn(1).setPreferredWidth(1250);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 10, 1236, 100));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ca1.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        ca1.setText("Appointment ID: ");
        jPanel3.add(ca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 1220, 30));

        appmsg.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        appmsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appmsg.setText("Current Appointment");
        jPanel3.add(appmsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1230, 30));

        ca2.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        ca2.setText("Doctor Name:");
        jPanel3.add(ca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 1220, 30));

        ca3.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        ca3.setText("Date of Appointment: ");
        jPanel3.add(ca3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 95, 1220, 30));

        ca4.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        ca4.setText("Time of Appointment: ");
        jPanel3.add(ca4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, 1220, 30));

        ca5.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        ca5.setText("Meeting Link:");
        jPanel3.add(ca5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 1220, 30));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel4.setText("Upcoming Appointment");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 120, 1230, 180));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel5.setText("Appointment History");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 30));

        tb2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tb2.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SNO", "Doctor_Name", "Service_Name", "Amount", "Date", "Time"
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
        tb2.setRowHeight(30);
        tb2.setShowGrid(true);
        tb2.getTableHeader().setResizingAllowed(false);
        tb2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tb2);
        if (tb2.getColumnModel().getColumnCount() > 0) {
            tb2.getColumnModel().getColumn(0).setResizable(false);
            tb2.getColumnModel().getColumn(0).setPreferredWidth(80);
            tb2.getColumnModel().getColumn(1).setResizable(false);
            tb2.getColumnModel().getColumn(1).setPreferredWidth(220);
            tb2.getColumnModel().getColumn(2).setResizable(false);
            tb2.getColumnModel().getColumn(2).setPreferredWidth(300);
            tb2.getColumnModel().getColumn(3).setResizable(false);
            tb2.getColumnModel().getColumn(3).setPreferredWidth(100);
            tb2.getColumnModel().getColumn(4).setResizable(false);
            tb2.getColumnModel().getColumn(4).setPreferredWidth(250);
            tb2.getColumnModel().getColumn(5).setResizable(false);
            tb2.getColumnModel().getColumn(5).setPreferredWidth(250);
        }

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 30, 1220, 450));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 1230, 480));

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
int pid=0;
Connection con;
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        try
        {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select Count(*) from AppointmentDeleted where Patient_ID="+pid+"");
            while(rs.next())
            {
                if(rs.getInt("Count(*)")!=0){
                    st.executeUpdate("delete from AppointmentDeleted where Patient_ID="+pid+"");
                    JOptionPane.showMessageDialog(null,"Sorry, Your last Scheduled Appointment was cancelled by Doctor");
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        DefaultTableModel model1=(DefaultTableModel)tb1.getModel();
        String gender="";
        try
        {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from Patient where Patient_ID="+pid+"");
            while(rs.next())
            {
                label6.setText(""+rs.getString("Username"));
                label1.setText("Name: "+rs.getString("Fname")+rs.getString("Lname"));
                label3.setText("Contact: "+rs.getString("Contact"));
                label5.setText("Email: "+rs.getString("Email").substring(0,13));
                label7.setText(""+rs.getString("Email").substring(13));
                gender=rs.getString("Gender");
            }
            ResultSet rs1=st.executeQuery("select date_format(from_days(Datediff(now(),DOB)),'%Y')+0 as age from Patient where Patient_ID="+pid+"");
            while(rs1.next())
            {
                label2.setText("Age: "+rs1.getString("Age"));
            }
            
            
            ResultSet rs3=st.executeQuery("select count(*) from Appointment a,Doctor d  where a.Doctor_ID=d.Doctor_ID and a.Patient_ID="+pid+" and date=(select curdate()) and Time>(select current_Time())");
            while(rs3.next())
            {
                if(rs3.getInt("Count(*)")==0){
                    ResultSet rs4=st.executeQuery("select count(*) from Appointment a,Doctor d  where a.Doctor_ID=d.Doctor_ID and a.Patient_ID="+pid+" and date>(select curdate())");
                    while(rs4.next())
                    {
                        if(rs4.getInt("Count(*)")==0){
                            appmsg.setText("You have no current Appointment");
                            RemoveCurrentAppointmentLabels();
                        }else{
                            ResultSet rs2=st.executeQuery("select Appointment_ID, d.Fname, d.Mname, d.Lname, Date, Time, Meeting_link from Appointment a,Doctor d  where a.Doctor_ID=d.Doctor_ID and a.Patient_ID="+pid+" and date>(select curdate()) order by Date,Time limit 1");
                            while(rs2.next())
                            {
                                ca1.setText("Appointment ID: "+rs2.getInt("Appointment_ID"));
                                ca2.setText("Doctor Name: "+rs2.getString("Fname")+" "+rs2.getString("Mname")+" "+rs2.getString("Lname"));
                                ca3.setText("Date of Appointment: "+rs2.getString("Date"));
                                ca4.setText("Time of Appointment: "+rs2.getString("Time"));
                                ca5.setText("Meeting Link: "+rs2.getString("Meeting_Link"));
                                System.out.println("Hello");
                            }
                            appmsg.setVisible(false);
                        }
                    }
                }else{
                    ResultSet rs5=st.executeQuery("select Appointment_ID, d.Fname, d.Mname, d.Lname, Date, Time, Meeting_link from Appointment a,Doctor d  where a.Doctor_ID=d.Doctor_ID and a.Patient_ID="+pid+" and date>=(select curdate())");
                    while(rs5.next())
                    {
                        ca1.setText("Appointment ID: "+rs5.getInt("Appointment_ID"));
                        ca2.setText("Doctor Name: "+rs5.getString("Fname")+" "+rs5.getString("Mname")+" "+rs5.getString("Lname"));
                        ca3.setText("Date of Appointment: "+rs5.getString("Date"));
                        ca4.setText("Time of Appointment: "+rs5.getString("Time"));
                        ca5.setText("Meeting Link: "+rs5.getString("Meeting_Link"));
                        appmsg.setVisible(false);
                    }
                }
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
        while(model1.getRowCount()>0)
        {
            for(int i=0;i<model1.getRowCount();i++)
            model1.removeRow(i);
        }
        
        DefaultTableModel model2=(DefaultTableModel)tb2.getModel();
        try
        {
            while(model2.getRowCount()>0)
            {
                for(int i=0;i<model2.getRowCount();i++)
                model2.removeRow(i);
            }
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select d.Fname, d.Mname, d.Lname, s.Service_Name, a.Amount, a.Date, a.Time from Appointment a, Services s, Doctor d where a.Date<(select curdate()) and a.Service_ID=s.Service_ID and a.Doctor_ID=d.Doctor_ID and a.Patient_ID='"+pid+"'");
            int sno=1;
            while(rs.next())
            {
                String name=rs.getString("Fname")+" "+rs.getString("Mname")+" "+rs.getString("Lname");
                model2.addRow(new Object[]{sno++,name,rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7)});
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

    private void searchfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchfieldKeyReleased
        if(searchfield.getText().length()==0){
            DefaultTableModel model1=(DefaultTableModel)tb1.getModel();
            try
            {
                while(model1.getRowCount()>0)
                {
                    for(int i=0;i<model1.getRowCount();i++)
                    model1.removeRow(i);
                }
            }
            catch(Exception e)
            {

            }
        }else{
            DefaultTableModel model1=(DefaultTableModel)tb1.getModel();
            try
            {
                while(model1.getRowCount()>0)
                {
                    for(int i=0;i<model1.getRowCount();i++)
                    model1.removeRow(i);
                }
            }
            catch(Exception e)
            {

            }
            DefaultTableModel model=(DefaultTableModel)tb1.getModel();
            try
            {
                while(model.getRowCount()>0)
                {
                    for(int i=0;i<model.getRowCount();i++)
                    model.removeRow(i);
                }
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("Select Doctor_ID,Fname,Mname,Lname from Doctor where Fname like '"+searchfield.getText()+"%' limit 3");
                while(rs.next())
                {
                    String name=rs.getString("Fname")+" "+rs.getString("Mname")+" "+rs.getString("Lname");
                    model.addRow(new Object[]{rs.getInt(1),name});
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_searchfieldKeyReleased

    private void searchfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchfieldFocusGained
        searchfield.setText("");
    }//GEN-LAST:event_searchfieldFocusGained

    private void searchfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchfieldMouseClicked
        
    }//GEN-LAST:event_searchfieldMouseClicked
int did=0;
    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
        DefaultTableModel model=(DefaultTableModel)tb1.getModel();
        did=(int) model.getValueAt(tb1.getSelectedRow(),0);        
        System.out.println(did);
        MakeAnAppointment m=new MakeAnAppointment(did, pid);
        m.setVisible(true);
    }//GEN-LAST:event_tb1MouseClicked

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
            java.util.logging.Logger.getLogger(PatientDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDashBoard(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appmsg;
    private javax.swing.JLabel ca1;
    private javax.swing.JLabel ca2;
    private javax.swing.JLabel ca3;
    private javax.swing.JLabel ca4;
    private javax.swing.JLabel ca5;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel profileimage;
    private javax.swing.JTextField searchfield;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    // End of variables declaration//GEN-END:variables
}
