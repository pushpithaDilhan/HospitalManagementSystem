/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ReceptionInterface extends javax.swing.JPanel {

    /**
     * Creates new form ChannlingHandler
     */
    public ReceptionInterface() {
        initComponents();
        ConnectionHandler.updateConnection(wifiButton);
        yesBtn.setVisible(false);
        noBtn.setVisible(false);
        logOffText.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        yesBtn = new javax.swing.JButton();
        noBtn = new javax.swing.JButton();
        logOffText = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pastReBtn = new javax.swing.JButton();
        chargersBtn = new javax.swing.JButton();
        availabilityBtn = new javax.swing.JButton();
        channelBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        signOutBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        wifiButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/DSC_1514.jpg"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(102, 141, 243));

        yesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/logoffbutton.png"))); // NOI18N
        yesBtn.setBorder(null);
        yesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesBtnActionPerformed(evt);
            }
        });

        noBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/cancelbutton.png"))); // NOI18N
        noBtn.setBorder(null);
        noBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noBtnActionPerformed(evt);
            }
        });

        logOffText.setFont(new java.awt.Font("Sinhala-Lasitha5", 1, 24)); // NOI18N
        logOffText.setForeground(new java.awt.Color(0, 39, 97));
        logOffText.setText("LOGOFF FROM SYSTEM?");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logOffText, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(logOffText, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 141, 243));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(102, 141, 243));

        jPanel2.setBackground(new java.awt.Color(102, 97, 225));

        pastReBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pastReBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/Recordsbutton.png"))); // NOI18N
        pastReBtn.setBorder(null);
        pastReBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastReBtnActionPerformed(evt);
            }
        });

        chargersBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chargersBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/Chargersbutton.png"))); // NOI18N
        chargersBtn.setBorder(null);
        chargersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargersBtnActionPerformed(evt);
            }
        });

        availabilityBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        availabilityBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/Doctorbutton.png"))); // NOI18N
        availabilityBtn.setBorder(null);
        availabilityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availabilityBtnActionPerformed(evt);
            }
        });

        channelBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        channelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/Appointmentbutton.png"))); // NOI18N
        channelBtn.setBorder(null);
        channelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                channelBtnActionPerformed(evt);
            }
        });

        registerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/registerbutton.png"))); // NOI18N
        registerBtn.setBorder(null);
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(channelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(availabilityBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chargersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pastReBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(availabilityBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(channelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pastReBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chargersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(29, 29, 29))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        signOutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/backButton.png"))); // NOI18N
        signOutBtn.setBorder(null);
        signOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutBtnActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(77, 38, 249));
        jLabel2.setFont(new java.awt.Font("Sinhala-Lasitha5", 1, 44)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 39, 97));
        jLabel2.setText("CO-OPERATIVE HOSPITAL GALLE ");

        wifiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/Wifi-Error.png"))); // NOI18N
        wifiButton.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(signOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(wifiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(68, 68, 68))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(30, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(signOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wifiButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pastReBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastReBtnActionPerformed
        if(evt.getSource() == pastReBtn){
            HospitalManagementSystem.update(this ,new PastRecordsGUI());
        }
    }//GEN-LAST:event_pastReBtnActionPerformed

    private void channelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_channelBtnActionPerformed
        if(evt.getSource() == channelBtn){
            HospitalManagementSystem.update(this ,new ChannelingHandlerGUI());
        }
    }//GEN-LAST:event_channelBtnActionPerformed

    private void chargersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargersBtnActionPerformed
        if(evt.getSource() == chargersBtn){
            HospitalManagementSystem.update(this ,new ServiceChargeGUI());
        }
    }//GEN-LAST:event_chargersBtnActionPerformed

    private void availabilityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availabilityBtnActionPerformed
        if(evt.getSource() == availabilityBtn){
            HospitalManagementSystem.update(this ,new DoctorAvailabilityGUI());
        }
    }//GEN-LAST:event_availabilityBtnActionPerformed

    private void signOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutBtnActionPerformed
        if(evt.getSource()== signOutBtn){
            yesBtn.setVisible(true);
            noBtn.setVisible(true);
            logOffText.setVisible(true);
        }
    }//GEN-LAST:event_signOutBtnActionPerformed

    private void yesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesBtnActionPerformed
        if(evt.getSource()== yesBtn){
            HospitalManagementSystem.update(this ,new LoginPageGUI());
        }
    }//GEN-LAST:event_yesBtnActionPerformed

    private void noBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noBtnActionPerformed
        if (evt.getSource() == noBtn) {
            yesBtn.setVisible(false);
            noBtn.setVisible(false);
            logOffText.setVisible(false);
        }
    }//GEN-LAST:event_noBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        if(evt.getSource()== registerBtn){
            HospitalManagementSystem.update(this ,new PatientRegistrationGUI());
        }
    }//GEN-LAST:event_registerBtnActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton availabilityBtn;
    private javax.swing.JButton channelBtn;
    private javax.swing.JButton chargersBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel logOffText;
    private javax.swing.JButton noBtn;
    private javax.swing.JButton pastReBtn;
    private javax.swing.JButton registerBtn;
    private javax.swing.JButton signOutBtn;
    private javax.swing.JButton wifiButton;
    private javax.swing.JButton yesBtn;
    // End of variables declaration//GEN-END:variables
}
