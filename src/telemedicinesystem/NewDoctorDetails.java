
package telemedicinesystem;

import java.awt.Color;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class NewDoctorDetails extends javax.swing.JFrame {

    /**
     * Creates new form ProfilePage
     */
    public NewDoctorDetails() {
        initComponents();
        setBackground(new Color(0,0,0,0));
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
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        p4 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        g1 = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        pw1 = new javax.swing.JPasswordField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        pw2 = new javax.swing.JPasswordField();
        jLabel40 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        tf7 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        d1 = new com.toedter.calendar.JDateChooser();
        jLabel50 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf8 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        p3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("*");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("*");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(0,0,0,180));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        jPanel1.setToolTipText("");

        p4.setBackground(new java.awt.Color(0,0,0,40));
        p4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setBackground(new java.awt.Color(204, 204, 204));
        jLabel37.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 204, 204));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Enter Doctor's Details");
        jLabel37.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 8, 496, 35));

        jLabel38.setBackground(new java.awt.Color(204, 204, 204));
        jLabel38.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setText("Middle Name");
        p4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 114, -1, 30));

        jLabel39.setBackground(new java.awt.Color(204, 204, 204));
        jLabel39.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 204, 204));
        jLabel39.setText("First Name");
        p4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 70, 136, 30));

        jLabel41.setBackground(new java.awt.Color(204, 204, 204));
        jLabel41.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 204, 204));
        jLabel41.setText("Last Name");
        p4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 157, 122, 30));

        jLabel42.setBackground(new java.awt.Color(204, 204, 204));
        jLabel42.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(204, 204, 204));
        jLabel42.setText("Gender");
        p4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 200, 122, 30));

        g1.setBackground(new java.awt.Color(0,0,0,180));
        g1.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        g1.setForeground(new java.awt.Color(255, 255, 255));
        g1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\t", "Male", "Female", "Prefer not to Say" }));
        g1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        g1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                g1ItemStateChanged(evt);
            }
        });
        g1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                g1PopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                g1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                g1PopupMenuWillBecomeVisible(evt);
            }
        });
        g1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g1ActionPerformed(evt);
            }
        });
        p4.add(g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 200, -1, 30));

        jLabel43.setBackground(new java.awt.Color(204, 204, 204));
        jLabel43.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(204, 204, 204));
        jLabel43.setText("DOB");
        p4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 240, 122, 30));

        jLabel44.setBackground(new java.awt.Color(204, 204, 204));
        jLabel44.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(204, 204, 204));
        jLabel44.setText("Contact");
        p4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 278, 122, 30));

        jLabel45.setBackground(new java.awt.Color(204, 204, 204));
        jLabel45.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(204, 204, 204));
        jLabel45.setText("Email");
        p4.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 320, 122, 30));

        jLabel46.setBackground(new java.awt.Color(204, 204, 204));
        jLabel46.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(204, 204, 204));
        jLabel46.setText("Address");
        p4.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 362, 122, 30));

        jLabel47.setBackground(new java.awt.Color(204, 204, 204));
        jLabel47.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(204, 204, 204));
        jLabel47.setText("Username");
        p4.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 404, 122, 30));

        pw1.setFont(new java.awt.Font("Cambria Math", 0, 30)); // NOI18N
        pw1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p4.add(pw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 446, 215, 30));

        jLabel48.setBackground(new java.awt.Color(204, 204, 204));
        jLabel48.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(204, 204, 204));
        jLabel48.setText("Password");
        p4.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 446, 122, 30));

        jLabel49.setBackground(new java.awt.Color(204, 204, 204));
        jLabel49.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(204, 204, 204));
        jLabel49.setText("Meeting Link");
        p4.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 530, -1, 30));

        pw2.setFont(new java.awt.Font("Cambria Math", 0, 30)); // NOI18N
        pw2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p4.add(pw2, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 488, 215, 30));

        jLabel40.setBackground(new java.awt.Color(204, 204, 204));
        jLabel40.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 204, 204));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Add");
        jLabel40.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });
        p4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 520, 35));

        tf1.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        tf1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p4.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 70, 215, -1));

        tf2.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        tf2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p4.add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 115, 215, -1));

        tf3.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        tf3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p4.add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 158, 215, -1));

        tf4.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        tf4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p4.add(tf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 278, 215, -1));

        tf5.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        tf5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p4.add(tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 320, 215, -1));

        tf6.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        tf6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p4.add(tf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 362, 215, 30));

        tf7.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        tf7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p4.add(tf7, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 404, 215, 30));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("*");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        p4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 77, -1, 13));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("*");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        p4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 247, -1, 13));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("*");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        p4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 167, -1, 13));

        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("*");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        p4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 540, -1, 13));

        jLabel9.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("*");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        p4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 207, -1, 13));

        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("*");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        p4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 286, -1, 13));

        jLabel11.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("*");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        p4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 326, -1, 13));

        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("*");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        p4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 369, -1, 13));

        jLabel13.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("*");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        p4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 409, -1, 13));

        jLabel14.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("*");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        p4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 453, -1, 13));

        d1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d1.setDateFormatString("YYYY-MM-dd");
        d1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                d1FocusGained(evt);
            }
        });
        d1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                d1MousePressed(evt);
            }
        });
        p4.add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 240, 215, 30));

        jLabel50.setBackground(new java.awt.Color(204, 204, 204));
        jLabel50.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(204, 204, 204));
        jLabel50.setText("Re-enter Password");
        p4.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 488, -1, 30));

        jLabel15.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("*");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        p4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 495, -1, 13));

        tf8.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        tf8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p4.add(tf8, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 530, 215, 30));

        jPanel2.setBackground(new java.awt.Color(0,0,0,50));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 255), null, null));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p3.setBackground(new java.awt.Color(0,0,0,0));
        p3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        p3.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 3, -1, 34));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int xx,yy;      
Connection con;
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void g1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_g1PopupMenuWillBecomeInvisible
        p4.setBackground(new java.awt.Color(0,0,0,180));
    }//GEN-LAST:event_g1PopupMenuWillBecomeInvisible

    private void g1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_g1PopupMenuWillBecomeVisible
        p4.setBackground(new java.awt.Color(0,0,0,180));
    }//GEN-LAST:event_g1PopupMenuWillBecomeVisible

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx=evt.getX();
        yy=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx,y-yy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        p3.setBackground(Color.black);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        p3.setBackground(new Color(232,17,36,255));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void d1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d1MouseClicked
        p4.setBackground(new java.awt.Color(0,0,0,180));
    }//GEN-LAST:event_d1MouseClicked

    private void d1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d1MousePressed

    }//GEN-LAST:event_d1MousePressed

    private void d1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_d1FocusGained

    }//GEN-LAST:event_d1FocusGained

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
    String fname=tf1.getText();
    String mname=tf2.getText();
    String lname=tf3.getText();
    String dob=((JTextField)d1.getDateEditor().getUiComponent()).getText();
    String contact=tf4.getText();
    String email=tf5.getText();
    String address=tf6.getText();
    String username=tf7.getText();
    String password1=pw1.getText();
    String password2=pw2.getText();
    String link=tf8.getText();
    
    //Checking Mandatory Fields
    if(fname.equals("")){
        JOptionPane.showMessageDialog(null,"Please enter your First Name");
    }else if(lname.equals("")){
        JOptionPane.showMessageDialog(null,"Please enter your Last Name");
    }else if(gender.equals("")){
        JOptionPane.showMessageDialog(null,"Please select your Gender");
    }else if(dob.equals("")){
        JOptionPane.showMessageDialog(null,"Please select your Date of Birth");
    }else if(contact.equals("")){
        JOptionPane.showMessageDialog(null,"Please enter your Contact Number");
    }else if(email.equals("")){
        JOptionPane.showMessageDialog(null,"Please enter your Email");
    }else if(contact.equals("")){
        JOptionPane.showMessageDialog(null,"Please enter your Address");
    }else if(address.equals("")){
        JOptionPane.showMessageDialog(null,"Please enter your contact");
    }else if(username.equals("")){
        JOptionPane.showMessageDialog(null,"Please enter your Username");
    }else if(password1.equals("")){
        JOptionPane.showMessageDialog(null,"Please enter your Password");
    }else if(password2.equals("")){
        JOptionPane.showMessageDialog(null,"Please re-enter your Password");
    }else if(contact.length()!=10){
        JOptionPane.showMessageDialog(null,"Please enter valid Contact Number");
    }else if(link.equals("")){
        JOptionPane.showMessageDialog(null,"Please enter the Meeting Link");
    }else{
        try
        {
            if(gender.equals("Male")){
                gender="M";
            }else if(gender.equals("Female")){
                gender="F";
            }else{
                gender="NA";
            }
            Statement st=con.createStatement();
            if(password1.equals(password2)){
                st.executeUpdate("insert into Doctor(Fname,Mname,Lname,Gender,DOB,Contact,Email,Address,Username,Password,Account_Status,Meeting_Link) values('"+fname+"','"+mname+"','"+lname+"','"+gender+"','"+dob+"','"+contact+"','"+email+"','"+address+"','"+username+"','"+password1+"','Activated','"+link+"')");
                JOptionPane.showMessageDialog(null,"Data Saved Successfully");
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Password Not Match");
            }
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }
    }
    
    }//GEN-LAST:event_jLabel40MouseClicked
String gender;
    private void g1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g1ActionPerformed
        gender=(String)g1.getSelectedItem();
    }//GEN-LAST:event_g1ActionPerformed

    private void g1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_g1ItemStateChanged

    }//GEN-LAST:event_g1ItemStateChanged

    private void g1PopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_g1PopupMenuCanceled
        // TODO add your handling code here:
    }//GEN-LAST:event_g1PopupMenuCanceled

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
            java.util.logging.Logger.getLogger(NewDoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewDoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewDoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewDoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new NewDoctorDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser d1;
    private javax.swing.JComboBox<String> g1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPasswordField pw1;
    private javax.swing.JPasswordField pw2;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    // End of variables declaration//GEN-END:variables
}