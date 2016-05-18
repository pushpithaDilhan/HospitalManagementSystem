/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.awt.Color;
import java.util.Arrays;
import javax.swing.JOptionPane;
import org.apache.log4j.*;

/**
 *
 * @author HP
 */
public class AddDoctorGUI extends javax.swing.JPanel {
    
    private static final Logger logger = Logger.getLogger(AddDoctorGUI.class.getName());
    
    private String code0 = "000000";
    private String code1 = "100000";
    private String code2 = "200000";
    private String code3 = "300000";
    private String code4 = "400000";
    private String code5 = "500000";
    private String code6 = "600000";
    private int cate = -1;
    private boolean check1;
    private boolean check2;
    
    public AddDoctorGUI() {
        initComponents();
        
        if (logger.isInfoEnabled()){
            logger.info("AddDoctorGUI created.");
        }
        
        ConnectionHandler.updateConnection(wifiButton);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cateCombo = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        signOutBtn = new javax.swing.JButton();
        wifiButton = new javax.swing.JButton();
        day1 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        time1 = new javax.swing.JComboBox();
        day2 = new javax.swing.JCheckBox();
        time2 = new javax.swing.JComboBox();
        day3 = new javax.swing.JCheckBox();
        time3 = new javax.swing.JComboBox();
        time4 = new javax.swing.JComboBox();
        day4 = new javax.swing.JCheckBox();
        day5 = new javax.swing.JCheckBox();
        time5 = new javax.swing.JComboBox();
        day6 = new javax.swing.JCheckBox();
        time6 = new javax.swing.JComboBox();
        day0 = new javax.swing.JCheckBox();
        time0 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        birthDayChooser = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        docNameTxt = new javax.swing.JTextField();
        docId = new javax.swing.JTextField();
        mobileText = new javax.swing.JTextField();
        docAddText = new javax.swing.JTextField();
        PassField = new javax.swing.JPasswordField();
        conPassField = new javax.swing.JPasswordField();
        slot0 = new javax.swing.JComboBox();
        slot1 = new javax.swing.JComboBox();
        slot2 = new javax.swing.JComboBox();
        slot3 = new javax.swing.JComboBox();
        slot4 = new javax.swing.JComboBox();
        slot5 = new javax.swing.JComboBox();
        slot6 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel3.setBackground(new java.awt.Color(102, 141, 243));

        jLabel8.setFont(new java.awt.Font("Buxton Sketch", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 39, 97));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DOCTOR");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel12.setFont(new java.awt.Font("Buxton Sketch", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 39, 97));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("REGISTRATION");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cateCombo.setFont(new java.awt.Font("Buxton Sketch", 0, 24)); // NOI18N
        cateCombo.setMaximumRowCount(16);
        cateCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " Cancer Surgeons", " Cardiologist Surgeons", " Cardiologist", " Chest Physicion", " Consultant Physicion", " Dental Surgeons", " Dermatologists", " ENT Surgeons", " Eye Surgeons", " Hematologists", " Neurologists", " Obstericians & Gynaecologists", " Oncologists(Cancer)", " Orthopaedic Surgeons", " Pathologists", " Pediatricians", " Psychiatrists", " Radiologists", " Rheumatologists", " Vascular Surgeons", " Venereologists" }));
        cateCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cateComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(cateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 141, 243));

        jPanel2.setBackground(new java.awt.Color(102, 97, 225));

        jLabel2.setBackground(new java.awt.Color(77, 38, 249));
        jLabel2.setFont(new java.awt.Font("Buxton Sketch", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CO-OPERATIVE HOSPITAL GALLE ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 271, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        signOutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/backButton.png"))); // NOI18N
        signOutBtn.setBorder(null);
        signOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutBtnActionPerformed(evt);
            }
        });

        wifiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/Wifi-Error.png"))); // NOI18N
        wifiButton.setBorder(null);

        day1.setBackground(new java.awt.Color(255, 255, 255));
        day1.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        day1.setText("Monday");
        day1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText(" SCHEDULE");

        time1.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        time1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00" }));
        time1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time1ActionPerformed(evt);
            }
        });

        day2.setBackground(new java.awt.Color(255, 255, 255));
        day2.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        day2.setText("Tuesday");

        time2.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        time2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00" }));
        time2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time2ActionPerformed(evt);
            }
        });

        day3.setBackground(new java.awt.Color(255, 255, 255));
        day3.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        day3.setText("Wednesday");

        time3.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        time3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00" }));
        time3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time3ActionPerformed(evt);
            }
        });

        time4.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        time4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00" }));
        time4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time4ActionPerformed(evt);
            }
        });

        day4.setBackground(new java.awt.Color(255, 255, 255));
        day4.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        day4.setText("Thursday");
        day4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day4ActionPerformed(evt);
            }
        });

        day5.setBackground(new java.awt.Color(255, 255, 255));
        day5.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        day5.setText("Friday");

        time5.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        time5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00" }));
        time5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time5ActionPerformed(evt);
            }
        });

        day6.setBackground(new java.awt.Color(255, 255, 255));
        day6.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        day6.setText("Saturday");

        time6.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        time6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00" }));
        time6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time6ActionPerformed(evt);
            }
        });

        day0.setBackground(new java.awt.Color(255, 255, 255));
        day0.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        day0.setText("Sunday");

        time0.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        time0.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00" }));
        time0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time0ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        jLabel1.setText("ID NUMBER");
        jLabel1.setMaximumSize(new java.awt.Dimension(150, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(150, 50));

        jLabel11.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        jLabel11.setText("PASSWORD");

        jLabel10.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        jLabel10.setText("CONFIRM PASSWORD");

        jLabel3.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        jLabel3.setText("DOCTOR NAME");
        jLabel3.setMaximumSize(new java.awt.Dimension(150, 50));
        jLabel3.setMinimumSize(new java.awt.Dimension(150, 50));

        jLabel13.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        jLabel13.setText("BIRTHDAY");

        birthDayChooser.setPreferredSize(new java.awt.Dimension(220, 40));
        birthDayChooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                birthDayChooserMouseEntered(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        jLabel4.setText("MOBILE");
        jLabel4.setMaximumSize(new java.awt.Dimension(150, 50));
        jLabel4.setMinimumSize(new java.awt.Dimension(150, 50));

        jLabel5.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        jLabel5.setText("ADDRESS");
        jLabel5.setMaximumSize(new java.awt.Dimension(150, 50));
        jLabel5.setMinimumSize(new java.awt.Dimension(150, 50));

        addBtn.setText("add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        docNameTxt.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        docNameTxt.setPreferredSize(new java.awt.Dimension(220, 40));
        docNameTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                docNameTxtMouseEntered(evt);
            }
        });

        docId.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        docId.setPreferredSize(new java.awt.Dimension(220, 40));
        docId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                docIdMouseEntered(evt);
            }
        });
        docId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docIdActionPerformed(evt);
            }
        });

        mobileText.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        mobileText.setPreferredSize(new java.awt.Dimension(220, 40));
        mobileText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mobileTextMouseEntered(evt);
            }
        });

        docAddText.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        docAddText.setPreferredSize(new java.awt.Dimension(220, 40));
        docAddText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                docAddTextMouseEntered(evt);
            }
        });

        PassField.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        PassField.setPreferredSize(new java.awt.Dimension(220, 40));
        PassField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PassFieldMouseEntered(evt);
            }
        });
        PassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassFieldActionPerformed(evt);
            }
        });

        conPassField.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        conPassField.setPreferredSize(new java.awt.Dimension(220, 40));
        conPassField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                conPassFieldMouseEntered(evt);
            }
        });

        slot0.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        slot0.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "15", "20", "25", "30" }));
        slot0.setSelectedIndex(-1);

        slot1.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        slot1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "15", "20", "25", "30" }));
        slot1.setSelectedIndex(-1);

        slot2.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        slot2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "15", "20", "25", "30" }));
        slot2.setSelectedIndex(-1);

        slot3.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        slot3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "15", "20", "25", "30" }));
        slot3.setSelectedIndex(-1);

        slot4.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        slot4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "15", "20", "25", "30" }));
        slot4.setSelectedIndex(-1);

        slot5.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        slot5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "15", "20", "25", "30" }));
        slot5.setSelectedIndex(-1);

        slot6.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        slot6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "15", "20", "25", "30" }));
        slot6.setSelectedIndex(-1);

        jLabel14.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        jLabel14.setText("TIME       TIME SOLTS");

        jLabel15.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        jLabel15.setText("DATE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(signOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(wifiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(conPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobileText, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(PassField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(docAddText, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(docId, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(docNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthDayChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(day1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(time1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(time0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(slot1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel14))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(day3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(day4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(time3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(time4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(slot3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(slot4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(day0, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(day2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(time2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(slot2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(96, 96, 96)
                                                .addComponent(slot0, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(day5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(day6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(time5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(time6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(slot5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(7, 7, 7)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wifiButton))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(time0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(day0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(time1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(day1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(time2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(day2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(time3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(slot3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(time4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(slot4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(day3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(day4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(slot5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(slot6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(time6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(day5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(time5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addComponent(day6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(docNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(docId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(birthDayChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mobileText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(docAddText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PassField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(conPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1369, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if (evt.getSource() == addBtn) {
            check1 = true;
            check2 = true;
            boolean isok;
            AddDoctor obj = new AddDoctor();
            if (evt.getSource() == addBtn) {
                ConnectionHandler.updateConnection(wifiButton);
                
                isok = obj.validate(docNameTxt,
                                    docId,
                                    mobileText,
                                    docAddText,
                                    PassField,
                                    conPassField,
                                    cate
                            );
                
                if(isok){
                    String ScheduleCode = code0 + code1 + code2 + code3 + code4 + code5 + code6;
                    obj.addToDoctor(docId.getText().toLowerCase(),
                            docNameTxt.getText(),
                            ScheduleCode,
                            cate,
                            mobileText.getText(),
                            birthDayChooser.getDate(),
                            docAddText.getText(),
                            Arrays.toString(PassField.getPassword())
                    );
                    
                    obj.addToLogin(docId.getText().toLowerCase(),
                                   docNameTxt.getText(),
                                   PassField.getText(),
                                   "Doctor"
                    );
                    
                    obj.addToPastRecords(
                            docId.getText().toLowerCase(),
                            String.valueOf(slot0.getSelectedItem()),
                            String.valueOf(slot1.getSelectedItem()),
                            String.valueOf(slot2.getSelectedItem()),
                            String.valueOf(slot3.getSelectedItem()),
                            String.valueOf(slot4.getSelectedItem()),
                            String.valueOf(slot5.getSelectedItem()),
                            String.valueOf(slot6.getSelectedItem())
                    );

                }
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void signOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutBtnActionPerformed
        if (evt.getSource() == signOutBtn) {
            HospitalManagementSystem.update(this, new LoginPageGUI());          // added
        }
    }//GEN-LAST:event_signOutBtnActionPerformed

    private void day1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_day1ActionPerformed

    private void time1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time1ActionPerformed
        if (evt.getSource() == time1 && day1.isSelected()) {
            code1 = "11" + String.valueOf((10 + time1.getSelectedIndex()) * 100);
        }
    }//GEN-LAST:event_time1ActionPerformed

    private void time0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time0ActionPerformed
        if(evt.getSource() == time0 && day0.isSelected()){
            code0 = "01"+String.valueOf((10+time0.getSelectedIndex())*100);
        }
    }//GEN-LAST:event_time0ActionPerformed

    private void time2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time2ActionPerformed
        if(evt.getSource() == time2 && day2.isSelected()){
            code2 = "21"+String.valueOf((10+time2.getSelectedIndex())*100);
        }
    }//GEN-LAST:event_time2ActionPerformed

    private void time3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time3ActionPerformed
        if(evt.getSource() == time3 && day3.isSelected()){
            code3 = "31"+String.valueOf((10+time3.getSelectedIndex())*100);
        }
    }//GEN-LAST:event_time3ActionPerformed

    private void time4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time4ActionPerformed
        if(evt.getSource() == time4 && day4.isSelected()){
            code4 = "41"+String.valueOf((10+time4.getSelectedIndex())*100);
        }
    }//GEN-LAST:event_time4ActionPerformed

    private void time5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time5ActionPerformed
        if(evt.getSource() == time5 && day5.isSelected()){
            code5 = "51"+String.valueOf((10+time5.getSelectedIndex())*100);
        }
    }//GEN-LAST:event_time5ActionPerformed

    private void time6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time6ActionPerformed
        if(evt.getSource() == time6 && day6.isSelected()){
            code6 = "61"+String.valueOf((10+time6.getSelectedIndex())*100);
        }
    }//GEN-LAST:event_time6ActionPerformed

    private void cateComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cateComboActionPerformed
        if (evt.getSource() == cateCombo) {
            cate = cateCombo.getSelectedIndex();
        }
    }//GEN-LAST:event_cateComboActionPerformed

    private void docNameTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docNameTxtMouseEntered
        if(evt.getSource() == docNameTxt && docNameTxt.getBackground().equals(Color.LIGHT_GRAY)){
            docNameTxt.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_docNameTxtMouseEntered

    private void docIdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docIdMouseEntered
        if(evt.getSource() == docId && check1){
            if(docId.getBackground().equals(Color.LIGHT_GRAY)){
                docId.setBackground(Color.WHITE);
            }
            if(docId.getForeground().equals(Color.RED)){
                docId.setForeground(Color.BLACK);
                docId.setText("");
            }check1 = false;
        }
    }//GEN-LAST:event_docIdMouseEntered

    private void birthDayChooserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birthDayChooserMouseEntered
        if(evt.getSource() == birthDayChooser && birthDayChooser.getBackground().equals(Color.LIGHT_GRAY)){
            birthDayChooser.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_birthDayChooserMouseEntered

    private void mobileTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileTextMouseEntered
        if(evt.getSource() == mobileText && check2){
            if(mobileText.getBackground().equals(Color.LIGHT_GRAY)){
                mobileText.setBackground(Color.WHITE);
            }
            if(mobileText.getForeground().equals(Color.RED)){
                mobileText.setForeground(Color.BLACK);
                mobileText.setText("");
            }check2 = false;
        }
    }//GEN-LAST:event_mobileTextMouseEntered

    private void docAddTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docAddTextMouseEntered
        if(evt.getSource() == docAddText && docAddText.getBackground().equals(Color.LIGHT_GRAY)){
            docAddText.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_docAddTextMouseEntered

    private void PassFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassFieldMouseEntered
        if(evt.getSource() == PassField){
            if(PassField.getBackground().equals(Color.LIGHT_GRAY) || PassField.getForeground().equals(Color.RED)){
                PassField.setBackground(Color.WHITE);
                PassField.setForeground(Color.BLACK);
                PassField.setText("");
            }
        }
    }//GEN-LAST:event_PassFieldMouseEntered

    private void conPassFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conPassFieldMouseEntered
        if(evt.getSource() == conPassField){
            if(conPassField.getBackground().equals(Color.LIGHT_GRAY) || conPassField.getForeground().equals(Color.RED)){
                conPassField.setBackground(Color.WHITE);
                conPassField.setForeground(Color.BLACK);
                conPassField.setText("");
            }
        }
    }//GEN-LAST:event_conPassFieldMouseEntered

    private void PassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassFieldActionPerformed

    private void docIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docIdActionPerformed

    private void day4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_day4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PassField;
    private javax.swing.JButton addBtn;
    private com.toedter.calendar.JDateChooser birthDayChooser;
    private javax.swing.JComboBox cateCombo;
    private javax.swing.JPasswordField conPassField;
    private javax.swing.JCheckBox day0;
    private javax.swing.JCheckBox day1;
    private javax.swing.JCheckBox day2;
    private javax.swing.JCheckBox day3;
    private javax.swing.JCheckBox day4;
    private javax.swing.JCheckBox day5;
    private javax.swing.JCheckBox day6;
    private javax.swing.JTextField docAddText;
    private javax.swing.JTextField docId;
    private javax.swing.JTextField docNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField mobileText;
    private javax.swing.JButton signOutBtn;
    private javax.swing.JComboBox slot0;
    private javax.swing.JComboBox slot1;
    private javax.swing.JComboBox slot2;
    private javax.swing.JComboBox slot3;
    private javax.swing.JComboBox slot4;
    private javax.swing.JComboBox slot5;
    private javax.swing.JComboBox slot6;
    private javax.swing.JComboBox time0;
    private javax.swing.JComboBox time1;
    private javax.swing.JComboBox time2;
    private javax.swing.JComboBox time3;
    private javax.swing.JComboBox time4;
    private javax.swing.JComboBox time5;
    private javax.swing.JComboBox time6;
    private javax.swing.JButton wifiButton;
    // End of variables declaration//GEN-END:variables
}
