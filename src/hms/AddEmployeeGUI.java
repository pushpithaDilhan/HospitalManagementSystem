package hms;

import java.awt.Color;
import org.apache.log4j.*;

public class AddEmployeeGUI extends javax.swing.JPanel {

    private static final Logger logger = Logger.getLogger(AddEmployeeGUI.class.getName());
    private String maState;
    private String gender;
    private boolean check1;
    private boolean check2;

    public AddEmployeeGUI() {
        initComponents();

        if (logger.isInfoEnabled()) {
            logger.info("AddEmployeeGUI created.");
        }

        ConnectionHandler.updateConnection(wifiButton);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        otherTextArea = new javax.swing.JTextArea();
        moileLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        genderjLabel = new javax.swing.JLabel();
        maStCombo = new javax.swing.JComboBox();
        statusLabel = new javax.swing.JLabel();
        genderCombo = new javax.swing.JComboBox();
        addressLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fnameText = new javax.swing.JTextField();
        bdayLabel = new javax.swing.JLabel();
        fnameLabel = new javax.swing.JLabel();
        nicText = new javax.swing.JTextField();
        snameText = new javax.swing.JTextField();
        nicLabel = new javax.swing.JLabel();
        snameLabel = new javax.swing.JLabel();
        picLabel = new javax.swing.JLabel();
        bdayLabel1 = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        mobileText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();
        registertBtn = new javax.swing.JButton();
        wifiButton = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        moileLabel1 = new javax.swing.JLabel();
        positionCB = new javax.swing.JComboBox();
        pw1 = new javax.swing.JPasswordField();
        pw2 = new javax.swing.JPasswordField();
        picLabel1 = new javax.swing.JLabel();
        bdayDateChooser = new com.toedter.calendar.JDateChooser();
        regDateChooser = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        otherTextArea.setColumns(20);
        otherTextArea.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        otherTextArea.setRows(5);
        otherTextArea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                otherTextAreaMouseMoved(evt);
            }
        });
        jScrollPane1.setViewportView(otherTextArea);

        moileLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        moileLabel.setText("POSITION");

        emailLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        emailLabel.setText("EMAIL");

        genderjLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        genderjLabel.setText("GENDER");
        genderjLabel.setPreferredSize(new java.awt.Dimension(130, 40));

        maStCombo.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        maStCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SINGLE", "MARRIED", "SEPARATED", "DIVORCED", "WIDOWED" }));
        maStCombo.setPreferredSize(new java.awt.Dimension(150, 40));
        maStCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maStComboActionPerformed(evt);
            }
        });

        statusLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        statusLabel.setText("MARITAL STATUS");
        statusLabel.setPreferredSize(new java.awt.Dimension(130, 40));

        genderCombo.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        genderCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE" }));
        genderCombo.setPreferredSize(new java.awt.Dimension(150, 40));
        genderCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboActionPerformed(evt);
            }
        });

        addressLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        addressLabel.setText("ADDRESS");

        jLabel4.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("OTHER DETAILS");

        fnameText.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        fnameText.setPreferredSize(new java.awt.Dimension(200, 40));
        fnameText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                fnameTextMouseMoved(evt);
            }
        });

        bdayLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        bdayLabel.setText("DATE OF BIRTH");
        bdayLabel.setPreferredSize(new java.awt.Dimension(130, 40));

        fnameLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        fnameLabel.setText("FIRST NAME");
        fnameLabel.setPreferredSize(new java.awt.Dimension(130, 40));

        nicText.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        nicText.setPreferredSize(new java.awt.Dimension(200, 40));
        nicText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                nicTextMouseMoved(evt);
            }
        });
        nicText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nicTextMouseEntered(evt);
            }
        });

        snameText.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        snameText.setPreferredSize(new java.awt.Dimension(200, 40));
        snameText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                snameTextMouseMoved(evt);
            }
        });

        nicLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        nicLabel.setText("NATIONAL ID");
        nicLabel.setPreferredSize(new java.awt.Dimension(130, 40));

        snameLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        snameLabel.setText("SECOND NAME");
        snameLabel.setPreferredSize(new java.awt.Dimension(130, 40));

        picLabel.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        picLabel.setText("SET PASSWORD");
        picLabel.setPreferredSize(new java.awt.Dimension(130, 40));

        bdayLabel1.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        bdayLabel1.setText("DATE OF REGISTRATION");
        bdayLabel1.setPreferredSize(new java.awt.Dimension(130, 40));

        addressText.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
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

        mobileText.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        mobileText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mobileTextMouseMoved(evt);
            }
        });
        mobileText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mobileTextMouseEntered(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 141, 243));
        jPanel2.setPreferredSize(new java.awt.Dimension(389, 766));

        jLabel5.setFont(new java.awt.Font("Buxton Sketch", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 39, 97));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("EMPLOYEE");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Buxton Sketch", 1, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 39, 97));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("REGISTRATION");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/record.png"))); // NOI18N

        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/reset1.png"))); // NOI18N
        resetBtn.setBorder(null);
        resetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetBtnMouseExited(evt);
            }
        });
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        registertBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/reg1.png"))); // NOI18N
        registertBtn.setBorder(null);
        registertBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registertBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registertBtnMouseExited(evt);
            }
        });
        registertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registertBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );

        wifiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/Wifi-Error.png"))); // NOI18N
        wifiButton.setBorder(null);

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/backButton.png"))); // NOI18N
        backBtn.setBorder(null);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        moileLabel1.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        moileLabel1.setText("MOBILE");

        positionCB.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        positionCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Receptionist", "Lab Technician", "HR Staff" }));
        positionCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionCBActionPerformed(evt);
            }
        });

        pw1.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        pw1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pw1MouseEntered(evt);
            }
        });
        pw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pw1ActionPerformed(evt);
            }
        });

        pw2.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        pw2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pw2MouseEntered(evt);
            }
        });

        picLabel1.setFont(new java.awt.Font("Buxton Sketch", 0, 18)); // NOI18N
        picLabel1.setText("CONFORM PASSWORD");
        picLabel1.setPreferredSize(new java.awt.Dimension(130, 40));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(wifiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(picLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                            .addComponent(nicLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bdayLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fnameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(picLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(snameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nicText, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pw1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bdayDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pw2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(snameText, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(genderjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(maStCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bdayLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(regDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(moileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(moileLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(26, 26, 26)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(mobileText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(positionCB, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 45, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addComponent(wifiButton))
                .addGap(25, 25, 25)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mobileText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moileLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(moileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(positionCB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(snameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(snameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bdayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bdayDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nicText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(picLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pw1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(picLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pw2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maStCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bdayLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(regDateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void otherTextAreaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otherTextAreaMouseMoved
        otherTextArea.setBackground(Color.WHITE);
    }//GEN-LAST:event_otherTextAreaMouseMoved

    private void maStComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maStComboActionPerformed
        maState = maStCombo.getSelectedItem().toString();
    }//GEN-LAST:event_maStComboActionPerformed

    private void genderComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboActionPerformed
        if (evt.getSource() == genderCombo) {
            gender = genderCombo.getSelectedItem().toString();
        }
    }//GEN-LAST:event_genderComboActionPerformed

    private void fnameTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnameTextMouseMoved
        fnameText.setBackground(Color.WHITE);
    }//GEN-LAST:event_fnameTextMouseMoved

    private void nicTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nicTextMouseMoved
        nicText.setBackground(Color.WHITE);
    }//GEN-LAST:event_nicTextMouseMoved

    private void snameTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snameTextMouseMoved
        snameText.setBackground(Color.WHITE);
    }//GEN-LAST:event_snameTextMouseMoved

    private void addressTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressTextMouseMoved
        addressText.setBackground(Color.WHITE);
    }//GEN-LAST:event_addressTextMouseMoved

    private void emailTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailTextMouseMoved
        emailText.setBackground(Color.WHITE);
    }//GEN-LAST:event_emailTextMouseMoved

    private void mobileTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileTextMouseMoved
        mobileText.setBackground(Color.WHITE);
    }//GEN-LAST:event_mobileTextMouseMoved

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        if (evt.getSource() == resetBtn) {
            addressText.setText("");
            mobileText.setText("");
            pw1.setText("");
            pw2.setText("");
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

    private void registertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registertBtnActionPerformed

        boolean isok = true;
        String password = "";
        if (evt.getSource() == registertBtn) {
            check1 = true;
            check2 = true;
            AddEmployee obj = new AddEmployee();
            ConnectionHandler.updateConnection(wifiButton);

            if (pw1.getText().equals("") || pw2.getText().equals("")) {
                pw1.setBackground(Color.LIGHT_GRAY);
                pw2.setBackground(Color.LIGHT_GRAY);
                isok = false;
            }
            if (!pw1.getText().equals(pw2.getText())) {
                pw1.setForeground(Color.RED);
                pw2.setForeground(Color.RED);
                isok = false;
            }
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
            if (otherTextArea.getText().equals("")) {
                otherTextArea.setBackground(Color.LIGHT_GRAY);
                isok = false;
            }
            if (!obj.validateID(nicText, nicText.getText().toLowerCase()) && !nicText.getText().equals("")) {
                isok = false;
            }
            if (!obj.validateMobile(mobileText, mobileText.getText()) && !mobileText.getText().equals("")) {
                isok = false;
            }

            if (isok && password != "") {
                
                if (logger.isInfoEnabled()){
                    logger.info("Correct password given to register.");
                }
                
                obj.register(fnameText.getText() + " " + snameText.getText(), nicText.getText(), bdayDateChooser.getDate(), mobileText.getText(), addressText.getText(), positionCB.getSelectedItem().toString(), otherTextArea.getText(), maState, regDateChooser.getDate(), gender);

            }

        }
    }//GEN-LAST:event_registertBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        if (evt.getSource() == backBtn) {
            HospitalManagementSystem.update(this, new HRStaffInterface());
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void positionCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionCBActionPerformed

    }//GEN-LAST:event_positionCBActionPerformed

    private void pw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pw1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pw1ActionPerformed

    private void resetBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetBtnMouseEntered
        if (evt.getSource() == resetBtn) {
            resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/reset2.png")));
        }
    }//GEN-LAST:event_resetBtnMouseEntered

    private void resetBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetBtnMouseExited
        if (evt.getSource() == resetBtn) {
            resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/reset1.png")));
        }
    }//GEN-LAST:event_resetBtnMouseExited

    private void registertBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registertBtnMouseEntered
        if (evt.getSource() == registertBtn) {
            registertBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/reg2.png")));
        }
    }//GEN-LAST:event_registertBtnMouseEntered

    private void registertBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registertBtnMouseExited
        if (evt.getSource() == registertBtn) {
            registertBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/reg1.png")));
        }
    }//GEN-LAST:event_registertBtnMouseExited

    private void pw1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pw1MouseEntered
        if (evt.getSource() == pw1) {
            if (pw1.getBackground().equals(Color.LIGHT_GRAY) || pw1.getForeground().equals(Color.RED)) {
                pw1.setBackground(Color.WHITE);
                pw1.setForeground(Color.BLACK);
                pw1.setText("");
            }
        }
    }//GEN-LAST:event_pw1MouseEntered

    private void pw2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pw2MouseEntered
        if (evt.getSource() == pw2) {
            if (pw2.getBackground().equals(Color.LIGHT_GRAY) || pw2.getForeground().equals(Color.RED)) {
                pw2.setBackground(Color.WHITE);
                pw2.setForeground(Color.BLACK);
                pw2.setText("");
            }
        }
    }//GEN-LAST:event_pw2MouseEntered

    private void nicTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nicTextMouseEntered
        if (evt.getSource() == nicText && check1) {
            if (nicText.getBackground().equals(Color.LIGHT_GRAY)) {
                nicText.setBackground(Color.WHITE);
            }
            if (nicText.getForeground().equals(Color.RED)) {
                nicText.setForeground(Color.BLACK);
                nicText.setText("");
            }
            check1 = false;
        }
    }//GEN-LAST:event_nicTextMouseEntered

    private void mobileTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileTextMouseEntered
        if (evt.getSource() == mobileText && check2) {
            if (mobileText.getBackground().equals(Color.LIGHT_GRAY)) {
                mobileText.setBackground(Color.WHITE);
            }
            if (mobileText.getForeground().equals(Color.RED)) {
                mobileText.setForeground(Color.BLACK);
                mobileText.setText("");
            }
            check2 = false;
        }
    }//GEN-LAST:event_mobileTextMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JButton backBtn;
    private com.toedter.calendar.JDateChooser bdayDateChooser;
    private javax.swing.JLabel bdayLabel;
    private javax.swing.JLabel bdayLabel1;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel fnameLabel;
    private javax.swing.JTextField fnameText;
    private javax.swing.JComboBox genderCombo;
    private javax.swing.JLabel genderjLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox maStCombo;
    private javax.swing.JTextField mobileText;
    private javax.swing.JLabel moileLabel;
    private javax.swing.JLabel moileLabel1;
    private javax.swing.JLabel nicLabel;
    private javax.swing.JTextField nicText;
    private javax.swing.JTextArea otherTextArea;
    private javax.swing.JLabel picLabel;
    private javax.swing.JLabel picLabel1;
    private javax.swing.JComboBox positionCB;
    private javax.swing.JPasswordField pw1;
    private javax.swing.JPasswordField pw2;
    private com.toedter.calendar.JDateChooser regDateChooser;
    private javax.swing.JButton registertBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel snameLabel;
    private javax.swing.JTextField snameText;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton wifiButton;
    // End of variables declaration//GEN-END:variables

}
