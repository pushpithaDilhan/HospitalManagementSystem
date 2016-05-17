/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import org.apache.log4j.*;

/**
 *
 * @author HP
 */
public class CheckappointmentsGUI extends javax.swing.JPanel {

    private static final Logger logger = Logger.getLogger(CheckappointmentsGUI.class.getName());

    private String docId;
    private int day = -1;
    private String docName;

    public CheckappointmentsGUI(String docName, String docId) {
        initComponents();

        if (logger.isInfoEnabled()) {
            logger.info("CheckappointmentsGUI created.");
        }

        ConnectionHandler.updateConnection(wifiButton);//check for internet connection
        this.docId = docId;
        this.docName = docName;
        docNameLbl.setText(docName);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        docNameLbl = new javax.swing.JLabel();
        backtBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        wifiButton = new javax.swing.JButton();
        paIdList = new java.awt.List();
        timeList = new java.awt.List();
        searchBtn = new javax.swing.JButton();
        day0 = new javax.swing.JCheckBox();
        day1 = new javax.swing.JCheckBox();
        day2 = new javax.swing.JCheckBox();
        day3 = new javax.swing.JCheckBox();
        day4 = new javax.swing.JCheckBox();
        day5 = new javax.swing.JCheckBox();
        day6 = new javax.swing.JCheckBox();
        dayLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel3.setBackground(new java.awt.Color(102, 141, 243));
        jPanel3.setPreferredSize(new java.awt.Dimension(366, 205));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(102, 141, 243));

        jPanel2.setBackground(new java.awt.Color(102, 97, 225));

        docNameLbl.setFont(new java.awt.Font("Buxton Sketch", 0, 30)); // NOI18N
        docNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        docNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(docNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(docNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backtBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/backButton.png"))); // NOI18N
        backtBtn.setBorder(null);
        backtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtBtnActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(77, 38, 249));
        jLabel2.setFont(new java.awt.Font("Buxton Sketch", 1, 44)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 39, 97));
        jLabel2.setText("CO-OPERATIVE HOSPITAL GALLE ");

        wifiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/Wifi-Error.png"))); // NOI18N
        wifiButton.setBorder(null);

        paIdList.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N

        timeList.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        timeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeListActionPerformed(evt);
            }
        });

        searchBtn.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/search1.png"))); // NOI18N
        searchBtn.setBorder(null);
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchBtnMouseExited(evt);
            }
        });
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        day0.setBackground(new java.awt.Color(102, 141, 225));
        day0.setFont(new java.awt.Font("Buxton Sketch", 0, 24)); // NOI18N
        day0.setForeground(new java.awt.Color(255, 255, 255));
        day0.setText("SUNDAY");
        day0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day0ActionPerformed(evt);
            }
        });

        day1.setBackground(new java.awt.Color(102, 141, 225));
        day1.setFont(new java.awt.Font("Buxton Sketch", 0, 24)); // NOI18N
        day1.setForeground(new java.awt.Color(255, 255, 255));
        day1.setText("MONDAY");
        day1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day1ActionPerformed(evt);
            }
        });

        day2.setBackground(new java.awt.Color(102, 141, 225));
        day2.setFont(new java.awt.Font("Buxton Sketch", 0, 24)); // NOI18N
        day2.setForeground(new java.awt.Color(255, 255, 255));
        day2.setText("TUESDAY");
        day2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day2ActionPerformed(evt);
            }
        });

        day3.setBackground(new java.awt.Color(102, 141, 225));
        day3.setFont(new java.awt.Font("Buxton Sketch", 0, 24)); // NOI18N
        day3.setForeground(new java.awt.Color(255, 255, 255));
        day3.setText("WEDNESDAY");
        day3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day3ActionPerformed(evt);
            }
        });

        day4.setBackground(new java.awt.Color(102, 141, 225));
        day4.setFont(new java.awt.Font("Buxton Sketch", 0, 24)); // NOI18N
        day4.setForeground(new java.awt.Color(255, 255, 255));
        day4.setText("THURSDAY");
        day4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day4ActionPerformed(evt);
            }
        });

        day5.setBackground(new java.awt.Color(102, 141, 225));
        day5.setFont(new java.awt.Font("Buxton Sketch", 0, 24)); // NOI18N
        day5.setForeground(new java.awt.Color(255, 255, 255));
        day5.setText("FRIDAY");
        day5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day5ActionPerformed(evt);
            }
        });

        day6.setBackground(new java.awt.Color(102, 141, 225));
        day6.setFont(new java.awt.Font("Buxton Sketch", 0, 24)); // NOI18N
        day6.setForeground(new java.awt.Color(255, 255, 255));
        day6.setText("SATURDAY");
        day6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day6ActionPerformed(evt);
            }
        });

        dayLbl.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        dayLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dayLbl.setText("TIME");

        jLabel3.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PATIENT NIC");

        jLabel1.setFont(new java.awt.Font("Buxton Sketch", 0, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DAY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(wifiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(paIdList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(timeList, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(dayLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(day1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(day3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(day4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(day0, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(day2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(day5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(day6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wifiButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(day0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(day1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(day2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(day3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(day4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(day5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(day6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(timeList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paIdList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1296, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtBtnActionPerformed
        if (evt.getSource() == backtBtn) {
            HospitalManagementSystem.update(this, new DoctorInterface(docName, docId));
        }
    }//GEN-LAST:event_backtBtnActionPerformed

    private void timeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeListActionPerformed

    private void searchBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseEntered
        if (evt.getSource() == searchBtn) {
            searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/search2.png")));
        }
    }//GEN-LAST:event_searchBtnMouseEntered

    private void searchBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseExited
        if (evt.getSource() == searchBtn) {
            searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/search1.png")));
        }
    }//GEN-LAST:event_searchBtnMouseExited

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        if (evt.getSource() == searchBtn) {
            paIdList.removeAll();   //clear lists
            timeList.removeAll();
            if (day == -1) {
                JOptionPane.showMessageDialog(null, "Please select a day."); //if day not selected.
            } else {
                ResultSet result = new CheckAppointments().check(docId.trim(), day);
                try {
                    String code = null;
                    while (result.next()) {
                        code = result.getString(1);
                    }
//                    System.out.println(code);

                    if (logger.isDebugEnabled()) {
                        logger.debug("Code : " + code);
                    }

                    if (code == null) {                     //Check for valid working day
                        paIdList.setForeground(Color.red);
                        paIdList.add("Not a working day.");
                    } else if (code.length() == 2 || code.length() == 0) { //check for appointments
                        paIdList.setForeground(Color.red);
                        paIdList.add("No Appointments.");
                    } else {
                        int cou = 0;
                        paIdList.setForeground(Color.BLACK);
                        while (code.length() >= 14 * (cou + 1)) {
                            String subCode = code.substring(2).substring(14 * (cou), 14 * (cou + 1)); //split patient nic and time from code
                            paIdList.add(subCode.substring(0, 10).toUpperCase());         //add patient nic and time to
                            String time = subCode.substring(10);
                            timeList.add(time.substring(0, 2) + ":" + time.substring(2));
                            cou++;
                        }
                    }
                } catch (SQLException ex) {
                }
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void day0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day0ActionPerformed
        if (evt.getSource() == day0) {
            setValue(day0, 0);
        }
    }//GEN-LAST:event_day0ActionPerformed

    private void day1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day1ActionPerformed
        if (evt.getSource() == day1) {
            setValue(day1, 1);
        }
    }//GEN-LAST:event_day1ActionPerformed

    private void day2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day2ActionPerformed
        if (evt.getSource() == day2) {
            setValue(day2, 2);
        }
    }//GEN-LAST:event_day2ActionPerformed

    private void day3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day3ActionPerformed
        if (evt.getSource() == day3) {
            setValue(day3, 3);
        }
    }//GEN-LAST:event_day3ActionPerformed

    private void day4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day4ActionPerformed
        if (evt.getSource() == day4) {
            setValue(day4, 4);
        }
    }//GEN-LAST:event_day4ActionPerformed

    private void day5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day5ActionPerformed
        if (evt.getSource() == day5) {
            setValue(day5, 5);
        }
    }//GEN-LAST:event_day5ActionPerformed

    private void day6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day6ActionPerformed
        if (evt.getSource() == day6) {
            setValue(day6, 6);
        }
    }//GEN-LAST:event_day6ActionPerformed

    private void clear(JCheckBox btn) { //chose only one check box
        JCheckBox[] list = {day0, day1, day2, day3, day4, day5, day6};
        for (JCheckBox Btn : list) {
            if (Btn.equals(btn)) {
                Btn.setSelected(true);
            } else {
                Btn.setSelected(false);
            }
        }
        repaint();
    }

    private void setValue(JCheckBox btn, int index) { //assign value to day
        if (btn.isSelected()) {
            day = index;
        }
        clear(btn);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backtBtn;
    private javax.swing.JCheckBox day0;
    private javax.swing.JCheckBox day1;
    private javax.swing.JCheckBox day2;
    private javax.swing.JCheckBox day3;
    private javax.swing.JCheckBox day4;
    private javax.swing.JCheckBox day5;
    private javax.swing.JCheckBox day6;
    private javax.swing.JLabel dayLbl;
    private javax.swing.JLabel docNameLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private java.awt.List paIdList;
    private javax.swing.JButton searchBtn;
    private java.awt.List timeList;
    private javax.swing.JButton wifiButton;
    // End of variables declaration//GEN-END:variables
}
