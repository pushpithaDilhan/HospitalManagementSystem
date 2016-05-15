
package hms;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DoctorHandlerGUI extends javax.swing.JPanel {

    private int day = 0;
    private int cate = 0;
    
    public DoctorHandlerGUI() {
        initComponents();
        ConnectionHandler.updateConnection(wifiButton);
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
        searchBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        docNameText = new javax.swing.JTextField();
        wifiButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        docList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        docList.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 141, 243));

        cateCombo.setFont(new java.awt.Font("SansSerif", 0, 23)); // NOI18N
        cateCombo.setMaximumRowCount(19);
        cateCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " Cancer Surgeons", " Cardiologist Surgeons", " Cardiologist", " Chest Physicion", " Consultant Physicion", " Dental Surgeons", " Dermatologists", " ENT Surgeons", " Eye Surgeons", " Hematologists", " Neurologists", " Obstericians & Gynaecologists", " Oncologists(Cancer)", " Orthopaedic Surgeons", " Pathologists", " Pediatricians", " Psychiatrists", " Radiologists", " Rheumatologists", " Vascular Surgeons", " Venereologists" }));
        cateCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cateComboActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sinhala-Lasitha5", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 39, 97));
        jLabel1.setText("     CATEGORY");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 141, 243));

        jPanel3.setBackground(new java.awt.Color(102, 97, 225));

        tuesdayButton.setBackground(new java.awt.Color(102, 97, 225));
        tuesdayButton.setFont(new java.awt.Font("Sinhala-Lasitha5", 1, 14)); // NOI18N
        tuesdayButton.setText("TUESDAY");
        tuesdayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuesdayButtonActionPerformed(evt);
            }
        });

        mondayButton.setBackground(new java.awt.Color(102, 97, 225));
        mondayButton.setFont(new java.awt.Font("Sinhala-Lasitha5", 1, 14)); // NOI18N
        mondayButton.setText("MONDAY");
        mondayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mondayButtonActionPerformed(evt);
            }
        });

        SundayButton.setBackground(new java.awt.Color(102, 97, 225));
        SundayButton.setFont(new java.awt.Font("Sinhala-Lasitha5", 1, 14)); // NOI18N
        SundayButton.setText("SUNDAY");
        SundayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SundayButtonActionPerformed(evt);
            }
        });

        wednesdayButton.setBackground(new java.awt.Color(102, 97, 225));
        wednesdayButton.setFont(new java.awt.Font("Sinhala-Lasitha5", 1, 14)); // NOI18N
        wednesdayButton.setText("WEDNESDAY");
        wednesdayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wednesdayButtonActionPerformed(evt);
            }
        });

        thursdayButton.setBackground(new java.awt.Color(102, 97, 225));
        thursdayButton.setFont(new java.awt.Font("Sinhala-Lasitha5", 1, 14)); // NOI18N
        thursdayButton.setText("THURSDAY");
        thursdayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thursdayButtonActionPerformed(evt);
            }
        });

        fridayButton.setBackground(new java.awt.Color(102, 97, 225));
        fridayButton.setFont(new java.awt.Font("Sinhala-Lasitha5", 1, 14)); // NOI18N
        fridayButton.setText("FRIDAY");
        fridayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fridayButtonActionPerformed(evt);
            }
        });

        saturdayButton.setBackground(new java.awt.Color(102, 97, 225));
        saturdayButton.setFont(new java.awt.Font("Sinhala-Lasitha5", 1, 14)); // NOI18N
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
                .addContainerGap(11, Short.MAX_VALUE)
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

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/searchbutton.png"))); // NOI18N
        searchBtn.setBorder(null);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/nextbutton.png"))); // NOI18N
        nextBtn.setBorder(null);
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sinhala-Lasitha5", 1, 23)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 39, 97));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SEARCH YOUR DOCTOR");

        jLabel3.setFont(new java.awt.Font("Sinhala-Lasitha5", 1, 23)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 39, 97));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ENTER DOCTOR'S NAME");

        docNameText.setFont(new java.awt.Font("Sinhala-Lasitha5", 0, 18)); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(docList, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(docNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(wifiButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addComponent(wifiButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(docNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(docList, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        if(evt.getSource()== tuesdayButton){
            day = 2;
        }
    }//GEN-LAST:event_tuesdayButtonActionPerformed

    private void mondayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mondayButtonActionPerformed
        if(evt.getSource()== mondayButton){
            day = 1;
        }
    }//GEN-LAST:event_mondayButtonActionPerformed

    private void SundayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SundayButtonActionPerformed
        if(evt.getSource()== SundayButton){
            day = 0;
        }
    }//GEN-LAST:event_SundayButtonActionPerformed

    private void wednesdayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wednesdayButtonActionPerformed
        if(evt.getSource()== wednesdayButton){
            day = 3;
        }
    }//GEN-LAST:event_wednesdayButtonActionPerformed

    private void thursdayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thursdayButtonActionPerformed
        if(evt.getSource()== thursdayButton){
            day = 4;
        }
    }//GEN-LAST:event_thursdayButtonActionPerformed

    private void fridayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fridayButtonActionPerformed
        if(evt.getSource()== fridayButton){
            day = 5;
        }
    }//GEN-LAST:event_fridayButtonActionPerformed

    private void saturdayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saturdayButtonActionPerformed
        if(evt.getSource()== saturdayButton){
            day = 6;
        }
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
                //HospitalManagementSystem.update(this, new TimeSlotHandlerGUI());
            }
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        if(evt.getSource()== searchBtn){
            docList.removeAll();
            ConnectionHandler.updateConnection(wifiButton);
            try {
                ResultSet result = new DoctorHandler().getDoctorsList(day, cate);
                while(result.next()){
                    docList.add(result.getString(1));
                }
            }
            catch(SQLException | NullPointerException ex) {}
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void docNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docNameTextActionPerformed
        
    }//GEN-LAST:event_docNameTextActionPerformed

    private void docNameTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docNameTextMouseMoved
        docNameText.setBackground(Color.WHITE);
    }//GEN-LAST:event_docNameTextMouseMoved


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
    private javax.swing.JButton searchBtn;
    private javax.swing.JRadioButton thursdayButton;
    private javax.swing.JRadioButton tuesdayButton;
    private javax.swing.JRadioButton wednesdayButton;
    private javax.swing.JButton wifiButton;
    // End of variables declaration//GEN-END:variables
}
