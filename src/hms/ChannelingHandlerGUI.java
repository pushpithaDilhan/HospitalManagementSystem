
package hms;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JRadioButton;

public class ChannelingHandlerGUI extends javax.swing.JPanel {

    private int day = 0;
    private int cate = 0;
    
    public ChannelingHandlerGUI() {
        initComponents();
        ConnectionHandler.updateConnection(wifiButton);
        SundayButton.setSelected(true);
        cateCombo.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        docList = new java.awt.List();
        jPanel2 = new javax.swing.JPanel();
        cateCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tuesdayButton = new javax.swing.JRadioButton();
        mondayButton = new javax.swing.JRadioButton();
        SundayButton = new javax.swing.JRadioButton();
        wednesdayButton = new javax.swing.JRadioButton();
        thursdayButton = new javax.swing.JRadioButton();
        fridayButton = new javax.swing.JRadioButton();
        saturdayButton = new javax.swing.JRadioButton();
        backBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        docNameText = new javax.swing.JTextField();
        wifiButton = new javax.swing.JButton();
        searchtBtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        docList.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        docList.setFont(new java.awt.Font("Buxton Sketch", 0, 24)); // NOI18N
        docList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docListMouseClicked(evt);
            }
        });
        docList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docListActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 141, 243));
        jPanel2.setPreferredSize(new java.awt.Dimension(390, 132));

        cateCombo.setFont(new java.awt.Font("Buxton Sketch", 0, 24)); // NOI18N
        cateCombo.setMaximumRowCount(18);
        cateCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " Cancer Surgeons", " Cardiologist Surgeons", " Cardiologist", " Chest Physicion", " Consultant Physicion", " Dental Surgeons", " Dermatologists", " ENT Surgeons", " Eye Surgeons", " Hematologists", " Neurologists", " Obstericians & Gynaecologists", " Oncologists(Cancer)", " Orthopaedic Surgeons", " Pathologists", " Pediatricians", " Psychiatrists", " Radiologists", " Rheumatologists", " Vascular Surgeons", " Venereologists" }));
        cateCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cateComboActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Buxton Sketch", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 39, 97));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CATEGORY");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 141, 243));
        jPanel4.setPreferredSize(new java.awt.Dimension(860, 70));

        jPanel3.setBackground(new java.awt.Color(102, 97, 225));

        tuesdayButton.setBackground(new java.awt.Color(102, 97, 225));
        tuesdayButton.setFont(new java.awt.Font("Buxton Sketch", 0, 20)); // NOI18N
        tuesdayButton.setForeground(new java.awt.Color(255, 255, 255));
        tuesdayButton.setText("TUESDAY");
        tuesdayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuesdayButtonActionPerformed(evt);
            }
        });

        mondayButton.setBackground(new java.awt.Color(102, 97, 225));
        mondayButton.setFont(new java.awt.Font("Buxton Sketch", 0, 20)); // NOI18N
        mondayButton.setForeground(new java.awt.Color(255, 255, 255));
        mondayButton.setText("MONDAY");
        mondayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mondayButtonActionPerformed(evt);
            }
        });

        SundayButton.setBackground(new java.awt.Color(102, 97, 225));
        SundayButton.setFont(new java.awt.Font("Buxton Sketch", 0, 20)); // NOI18N
        SundayButton.setForeground(new java.awt.Color(255, 255, 255));
        SundayButton.setText("SUNDAY");
        SundayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SundayButtonActionPerformed(evt);
            }
        });

        wednesdayButton.setBackground(new java.awt.Color(102, 97, 225));
        wednesdayButton.setFont(new java.awt.Font("Buxton Sketch", 0, 20)); // NOI18N
        wednesdayButton.setForeground(new java.awt.Color(255, 255, 255));
        wednesdayButton.setText("WEDNESDAY");
        wednesdayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wednesdayButtonActionPerformed(evt);
            }
        });

        thursdayButton.setBackground(new java.awt.Color(102, 97, 225));
        thursdayButton.setFont(new java.awt.Font("Buxton Sketch", 0, 20)); // NOI18N
        thursdayButton.setForeground(new java.awt.Color(255, 255, 255));
        thursdayButton.setText("THURSDAY");
        thursdayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thursdayButtonActionPerformed(evt);
            }
        });

        fridayButton.setBackground(new java.awt.Color(102, 97, 225));
        fridayButton.setFont(new java.awt.Font("Buxton Sketch", 0, 20)); // NOI18N
        fridayButton.setForeground(new java.awt.Color(255, 255, 255));
        fridayButton.setText("FRIDAY");
        fridayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fridayButtonActionPerformed(evt);
            }
        });

        saturdayButton.setBackground(new java.awt.Color(102, 97, 225));
        saturdayButton.setFont(new java.awt.Font("Buxton Sketch", 0, 20)); // NOI18N
        saturdayButton.setForeground(new java.awt.Color(255, 255, 255));
        saturdayButton.setText("SATURDAY");
        saturdayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saturdayButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(SundayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mondayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tuesdayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wednesdayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(thursdayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fridayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saturdayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SundayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mondayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tuesdayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wednesdayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thursdayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fridayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saturdayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/backButton.png"))); // NOI18N
        backBtn.setBorder(null);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/next1.png"))); // NOI18N
        nextBtn.setBorder(null);
        nextBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextBtnMouseExited(evt);
            }
        });
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Buxton Sketch", 0, 26)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SEARCH YOUR DOCTOR");

        jLabel3.setFont(new java.awt.Font("Buxton Sketch", 0, 26)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ENTER DOCTOR'S NAME");

        docNameText.setFont(new java.awt.Font("Buxton Sketch", 0, 20)); // NOI18N
        docNameText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                docNameTextMouseMoved(evt);
            }
        });
        docNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docNameTextActionPerformed(evt);
            }
        });

        wifiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/Wifi-Error.png"))); // NOI18N
        wifiButton.setBorder(null);

        searchtBtn.setFont(new java.awt.Font("Buxton Sketch", 0, 20)); // NOI18N
        searchtBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchtBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/search1.png"))); // NOI18N
        searchtBtn.setBorder(null);
        searchtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchtBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchtBtnMouseExited(evt);
            }
        });
        searchtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(wifiButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(46, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(docList, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(searchtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(docNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)))))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addComponent(wifiButton))
                .addGap(27, 27, 27)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(docNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(docList, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cateComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cateComboActionPerformed
        if (evt.getSource() == cateCombo) {
            if (cateCombo.getSelectedIndex() == 0) {
                cate = 0;
            } else if (cateCombo.getSelectedIndex() == 1) {
                cate = 1;
            } else if (cateCombo.getSelectedIndex() == 2) {
                cate = 2;
            } else if (cateCombo.getSelectedIndex() == 3) {
                cate = 3;
            } else if (cateCombo.getSelectedIndex() == 4) {
                cate = 4;
            } else if (cateCombo.getSelectedIndex() == 5) {
                cate = 5;
            } else if (cateCombo.getSelectedIndex() == 6) {
                cate = 6;
            } else if (cateCombo.getSelectedIndex() == 7) {
                cate = 7;
            } else if (cateCombo.getSelectedIndex() == 8) {
                cate = 8;
            } else if (cateCombo.getSelectedIndex() == 9) {
                cate = 9;
            } else if (cateCombo.getSelectedIndex() == 10) {
                cate = 10;
            } else if (cateCombo.getSelectedIndex() == 11) {
                cate = 11;
            } else if (cateCombo.getSelectedIndex() == 12) {
                cate = 12;
            } else if (cateCombo.getSelectedIndex() == 13) {
                cate = 13;
            } else if (cateCombo.getSelectedIndex() == 14) {
                cate = 14;
            } else if (cateCombo.getSelectedIndex() == 15) {
                cate = 15;
            } else if (cateCombo.getSelectedIndex() == 16) {
                cate = 16;
            } else if (cateCombo.getSelectedIndex() == 17) {
                cate = 17;
            } else if (cateCombo.getSelectedIndex() == 18) {
                cate = 18;
            } else if (cateCombo.getSelectedIndex() == 19) {
                cate = 19;
            } else if (cateCombo.getSelectedIndex() == 20) {
                cate = 20;
            }
        }
    }//GEN-LAST:event_cateComboActionPerformed

    private void tuesdayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuesdayButtonActionPerformed
        if(evt.getSource()== tuesdayButton ){
            setValue(tuesdayButton , 2);
        }
    }//GEN-LAST:event_tuesdayButtonActionPerformed

    private void mondayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mondayButtonActionPerformed
        setValue(mondayButton,1);
    }//GEN-LAST:event_mondayButtonActionPerformed

    private void SundayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SundayButtonActionPerformed
        setValue(SundayButton,0);
    }//GEN-LAST:event_SundayButtonActionPerformed

    private void wednesdayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wednesdayButtonActionPerformed
        setValue(wednesdayButton,3);
    }//GEN-LAST:event_wednesdayButtonActionPerformed

    private void thursdayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thursdayButtonActionPerformed
        setValue(thursdayButton,4);
    }//GEN-LAST:event_thursdayButtonActionPerformed

    private void fridayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fridayButtonActionPerformed
        setValue(fridayButton,5);
    }//GEN-LAST:event_fridayButtonActionPerformed

    private void saturdayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saturdayButtonActionPerformed
        setValue(saturdayButton,6);
    }//GEN-LAST:event_saturdayButtonActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        if(evt.getSource()== backBtn){
            HospitalManagementSystem.update(this ,new ReceptionInterface());
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        if(evt.getSource()== nextBtn){
            if (docNameText.getText().equals("")) {
                docNameText.setBackground(Color.lightGray);
            } else {
                String details = new TimeSlotHandler().getTimeSlot(docNameText.getText().trim(),day);
                HospitalManagementSystem.update(this, new TimeSlotHandlerGUI(docNameText.getText(),details,day));
            }
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void docNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docNameTextActionPerformed
        
    }//GEN-LAST:event_docNameTextActionPerformed

    private void docNameTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docNameTextMouseMoved
        docNameText.setBackground(Color.WHITE);
    }//GEN-LAST:event_docNameTextMouseMoved

    private void searchtBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchtBtnMouseEntered
        if(evt.getSource()== searchtBtn){
            searchtBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/search2.png")));
        }
    }//GEN-LAST:event_searchtBtnMouseEntered

    private void searchtBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchtBtnMouseExited
        if(evt.getSource()== searchtBtn){
            searchtBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/search1.png")));
        }
    }//GEN-LAST:event_searchtBtnMouseExited

    private void searchtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtBtnActionPerformed
        if(evt.getSource()== searchtBtn){
            docList.removeAll();
            ConnectionHandler.updateConnection(wifiButton);
            try {
                ResultSet result = new ChannelingHandler().getDoctorsList(cate);
                while(result.next()){
                    if(result.getString(2).charAt(day*6+1) == '1'){
                     docList.add(result.getString(1));
                }
                }
            }
            catch(SQLException | NullPointerException ex) {}
        }
    }//GEN-LAST:event_searchtBtnActionPerformed

    private void nextBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseEntered
        if(evt.getSource()== nextBtn){
            nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/next2.png")));
        }
    }//GEN-LAST:event_nextBtnMouseEntered

    private void nextBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseExited
        if(evt.getSource()== nextBtn){
            nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/next1.png")));
        }
    }//GEN-LAST:event_nextBtnMouseExited

    private void docListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docListMouseClicked
        if(evt.getSource()== docList){
            docNameText.setText(docList.getSelectedItem());
        }
    }//GEN-LAST:event_docListMouseClicked

    private void docListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docListActionPerformed
    
    private void clear(JRadioButton btn){
        JRadioButton[] list = {SundayButton,mondayButton,tuesdayButton,wednesdayButton,thursdayButton,fridayButton,saturdayButton};
        for(JRadioButton Btn:list){
            if(Btn.equals(btn)){
                Btn.setSelected(true);
            }else{
                Btn.setSelected(false);
            }
        }repaint();
    }
    
    private void setValue(JRadioButton btn ,int index){
        if (btn.isSelected()) {
            day = index;
        } else {
            day = -1;
        }clear(btn);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton SundayButton;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox cateCombo;
    private java.awt.List docList;
    private javax.swing.JTextField docNameText;
    private javax.swing.JRadioButton fridayButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton mondayButton;
    private javax.swing.JButton nextBtn;
    private javax.swing.JRadioButton saturdayButton;
    private javax.swing.JButton searchtBtn;
    private javax.swing.JRadioButton thursdayButton;
    private javax.swing.JRadioButton tuesdayButton;
    private javax.swing.JRadioButton wednesdayButton;
    private javax.swing.JButton wifiButton;
    // End of variables declaration//GEN-END:variables
}
