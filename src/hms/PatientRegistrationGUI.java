package hms;

import java.awt.Color;

public class PatientRegistrationGUI extends javax.swing.JPanel {
    
    private String maState;
    private String gender;
    
    public PatientRegistrationGUI() {
        initComponents();
        ConnectionHandler.updateConnection(wifiButton);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();
        registertBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        fnameText = new javax.swing.JTextField();
        fnameLabel = new javax.swing.JLabel();
        bdayLabel = new javax.swing.JLabel();
        nicLabel = new javax.swing.JLabel();
        nicText = new javax.swing.JTextField();
        picText = new javax.swing.JTextField();
        picLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        mobileText = new javax.swing.JTextField();
        moileLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        statusLabel = new javax.swing.JLabel();
        maStCombo = new javax.swing.JComboBox();
        genderjLabel = new javax.swing.JLabel();
        genderCombo = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        snameLabel = new javax.swing.JLabel();
        snameText = new javax.swing.JTextField();
        bdayLabel1 = new javax.swing.JLabel();
        regDateChooser = new com.toedter.calendar.JDateChooser();
        bdayDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        otherTextArea = new javax.swing.JTextArea();
        wifiButton = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(102, 141, 243));

        jLabel1.setFont(new java.awt.Font("Sinhala-Lasitha5", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 39, 97));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PATIENT");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Sinhala-Lasitha5", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 39, 97));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRATION");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/record.png"))); // NOI18N

        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/resetbutton.png"))); // NOI18N
        resetBtn.setBorder(null);
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        registertBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/regbutton.png"))); // NOI18N
        registertBtn.setBorder(null);
        registertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registertBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/backButton.png"))); // NOI18N
        backBtn.setBorder(null);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        fnameText.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        fnameText.setPreferredSize(new java.awt.Dimension(200, 40));
        fnameText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                fnameTextMouseMoved(evt);
            }
        });

        fnameLabel.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        fnameLabel.setText("FIRST NAME");
        fnameLabel.setPreferredSize(new java.awt.Dimension(130, 40));

        bdayLabel.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        bdayLabel.setText("DATE OF BIRTH");
        bdayLabel.setPreferredSize(new java.awt.Dimension(130, 40));

        nicLabel.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        nicLabel.setText("NATIONAL ID");
        nicLabel.setPreferredSize(new java.awt.Dimension(130, 40));

        nicText.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        nicText.setPreferredSize(new java.awt.Dimension(200, 40));
        nicText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                nicTextMouseMoved(evt);
            }
        });

        picText.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        picText.setPreferredSize(new java.awt.Dimension(200, 40));
        picText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                picTextMouseMoved(evt);
            }
        });

        picLabel.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        picLabel.setText("PATIENT ID");
        picLabel.setPreferredSize(new java.awt.Dimension(130, 40));

        addressLabel.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        addressLabel.setText("ADDRESS");

        addressText.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        addressText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                addressTextMouseMoved(evt);
            }
        });

        emailText.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        emailText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                emailTextMouseMoved(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        emailLabel.setText("EMAIL");

        mobileText.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        mobileText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mobileTextMouseMoved(evt);
            }
        });

        moileLabel.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        moileLabel.setText("MOBILE");

        cityLabel.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        cityLabel.setText("CITY/TOWN");

        cityText.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        cityText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cityTextMouseMoved(evt);
            }
        });

        statusLabel.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        statusLabel.setText("MARITAL STATUS");
        statusLabel.setPreferredSize(new java.awt.Dimension(130, 40));

        maStCombo.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        maStCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SINGLE", "MARRIED", "SEPARATED", "DIVORCED", "WIDOWED" }));
        maStCombo.setPreferredSize(new java.awt.Dimension(150, 40));
        maStCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maStComboActionPerformed(evt);
            }
        });

        genderjLabel.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        genderjLabel.setText("GENDER");
        genderjLabel.setPreferredSize(new java.awt.Dimension(130, 40));

        genderCombo.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        genderCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE" }));
        genderCombo.setPreferredSize(new java.awt.Dimension(150, 40));
        genderCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 141, 243));

        jPanel3.setBackground(new java.awt.Color(102, 97, 225));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 837, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        snameLabel.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        snameLabel.setText("SECOND NAME");
        snameLabel.setPreferredSize(new java.awt.Dimension(130, 40));

        snameText.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        snameText.setPreferredSize(new java.awt.Dimension(200, 40));
        snameText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                snameTextMouseMoved(evt);
            }
        });

        bdayLabel1.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        bdayLabel1.setText("DATE OF REGISTRATION");
        bdayLabel1.setPreferredSize(new java.awt.Dimension(130, 40));

        jLabel4.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("OTHER DETAILS");

        jTextField1.setText("jTextField1");

        otherTextArea.setColumns(20);
        otherTextArea.setRows(5);
        otherTextArea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                otherTextAreaMouseMoved(evt);
            }
        });
        jScrollPane1.setViewportView(otherTextArea);

        wifiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/Wifi-Error.png"))); // NOI18N
        wifiButton.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(wifiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(genderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maStCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(picLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nicLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bdayLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fnameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(snameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fnameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(snameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nicText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(picText, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(bdayDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bdayLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(regDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(276, 276, 276))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(moileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(mobileText)
                                            .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(addressText)
                                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wifiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fnameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(fnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(snameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(snameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(moileLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(mobileText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(bdayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bdayDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(nicText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(picLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(picText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(maStCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(genderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(74, 74, 74)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(regDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bdayLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(15, 15, 15)))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        if(evt.getSource()== backBtn){
            HospitalManagementSystem.update(this ,new ReceptionInterface());
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void maStComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maStComboActionPerformed
        if(evt.getSource() == maStCombo){
            if(maStCombo.getSelectedIndex() == 0){
                maState = "Single";
            }else if(maStCombo.getSelectedIndex() == 1){
                maState = "Married";
            }else if(maStCombo.getSelectedIndex() == 2){
                maState = "Separated";
            }else if(maStCombo.getSelectedIndex() == 3){
                maState = "Devorced";
            }else if(maStCombo.getSelectedIndex() == 4){
                maState = "Widowed";
            }
        }
    }//GEN-LAST:event_maStComboActionPerformed

    private void genderComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboActionPerformed
        if(evt.getSource() == genderCombo){
            if(genderCombo.getSelectedIndex() == 0){
                gender = "Male";
            }else if(genderCombo.getSelectedIndex() == 1){
                gender = "Female";
            }
        }
    }//GEN-LAST:event_genderComboActionPerformed

    private void registertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registertBtnActionPerformed
        boolean isok = true;
        if (evt.getSource() == registertBtn) {
            
            ConnectionHandler
                    .updateConnection(wifiButton);
            
            if (fnameText.getText().equals("")) {
                fnameText.setBackground(Color.LIGHT_GRAY);
                isok = false;
            }
            if (snameText.getText().equals("")) {
                snameText.setBackground(Color.LIGHT_GRAY);
                isok = false;
            }
            if (nicText.getText().equals("")) {
                nicText.setBackground(Color.LIGHT_GRAY);
                isok = false;
            }
            if (addressText.getText().equals("")) {
                addressText.setBackground(Color.LIGHT_GRAY);
                isok = false;
            }
            if (emailText.getText().equals("")) {
                emailText.setBackground(Color.LIGHT_GRAY);
                isok = false;
            }
            if (mobileText.getText().equals("")) {
                mobileText.setBackground(Color.LIGHT_GRAY);
                isok = false;
            }
            if (cityText.getText().equals("")) {
                cityText.setBackground(Color.LIGHT_GRAY);
                isok = false;
            }
            if (otherTextArea.getText().equals("")) {
                otherTextArea.setBackground(Color.LIGHT_GRAY);
                isok = false;
            }
            if (picText.getText().equals("")) {
                picText.setBackground(Color.LIGHT_GRAY);
                isok = false;
            }
            if (isok) {
                new PatientRegistration().register(
                        fnameText.getText() + " " + snameText.getText(),
                        nicText.getText(),
                        picText.getText(),
                        addressText.getText(),
                        emailText.getText(),
                        mobileText.getText(),
                        cityText.getText(),
                        otherTextArea.getText(),
                        maState, gender,
                        bdayDateChooser.getDate(),
                        regDateChooser.getDate()
                );
            }
               
            
        }
    }//GEN-LAST:event_registertBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        if (evt.getSource() == resetBtn) {
            addressText.setText("");
            mobileText.setText("");
            cityText.setText("");
            picText.setText("");
            fnameText.setText("");
            snameText.setText("");
            nicText.setText("");
            emailText.setText("");
            otherTextArea.setText("");
            bdayDateChooser.setDate(null);
            regDateChooser.setDate(null);
            maState = null;
            gender = null;
        }
    }//GEN-LAST:event_resetBtnActionPerformed

    private void fnameTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnameTextMouseMoved
        fnameText.setBackground(Color.WHITE);
    }//GEN-LAST:event_fnameTextMouseMoved

    private void snameTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snameTextMouseMoved
        snameText.setBackground(Color.WHITE);
    }//GEN-LAST:event_snameTextMouseMoved

    private void nicTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nicTextMouseMoved
        nicText.setBackground(Color.WHITE);
    }//GEN-LAST:event_nicTextMouseMoved

    private void picTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_picTextMouseMoved
        picText.setBackground(Color.WHITE);
    }//GEN-LAST:event_picTextMouseMoved

    private void addressTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressTextMouseMoved
        addressText.setBackground(Color.WHITE);
    }//GEN-LAST:event_addressTextMouseMoved

    private void emailTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailTextMouseMoved
        emailText.setBackground(Color.WHITE);
    }//GEN-LAST:event_emailTextMouseMoved

    private void mobileTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileTextMouseMoved
        mobileText.setBackground(Color.WHITE);
    }//GEN-LAST:event_mobileTextMouseMoved

    private void cityTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cityTextMouseMoved
        cityText.setBackground(Color.WHITE);
    }//GEN-LAST:event_cityTextMouseMoved

    private void otherTextAreaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otherTextAreaMouseMoved
        otherTextArea.setBackground(Color.WHITE);
    }//GEN-LAST:event_otherTextAreaMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JButton backBtn;
    private com.toedter.calendar.JDateChooser bdayDateChooser;
    private javax.swing.JLabel bdayLabel;
    private javax.swing.JLabel bdayLabel1;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityText;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel fnameLabel;
    private javax.swing.JTextField fnameText;
    private javax.swing.JComboBox genderCombo;
    private javax.swing.JLabel genderjLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox maStCombo;
    private javax.swing.JTextField mobileText;
    private javax.swing.JLabel moileLabel;
    private javax.swing.JLabel nicLabel;
    private javax.swing.JTextField nicText;
    private javax.swing.JTextArea otherTextArea;
    private javax.swing.JLabel picLabel;
    private javax.swing.JTextField picText;
    private com.toedter.calendar.JDateChooser regDateChooser;
    private javax.swing.JButton registertBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel snameLabel;
    private javax.swing.JTextField snameText;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton wifiButton;
    // End of variables declaration//GEN-END:variables
}
