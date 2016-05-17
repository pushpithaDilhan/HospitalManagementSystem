package hms;


/**
 *
 * @author HP
 */
public class DoctorInterface extends javax.swing.JPanel {
    
    private String docName;
    private String docId;
    private int day = -1;
    
    public DoctorInterface(String docName , String docId) {
        initComponents();
        ConnectionHandler.updateConnection(wifiButton);//check for internet connection
        this.docId = docId;
        this.docName = docName;
        docNameLbl.setText(docName);
        logOff.setVisible(false);
        cancel.setVisible(false);
        logOffText.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        logOff = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        logOffText = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addRecBtn = new javax.swing.JButton();
        appoinBtn = new javax.swing.JButton();
        pastReBtn = new javax.swing.JButton();
        docNameLbl = new javax.swing.JLabel();
        signOutBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        wifiButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel3.setBackground(new java.awt.Color(102, 141, 243));
        jPanel3.setPreferredSize(new java.awt.Dimension(366, 205));

        logOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/logOff1.png"))); // NOI18N
        logOff.setBorder(null);
        logOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOffMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOffMouseExited(evt);
            }
        });
        logOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOffActionPerformed(evt);
            }
        });

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/cancel1.png"))); // NOI18N
        cancel.setBorder(null);
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        logOffText.setFont(new java.awt.Font("Buxton Sketch", 1, 30)); // NOI18N
        logOffText.setForeground(new java.awt.Color(0, 39, 97));
        logOffText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logOffText.setText("LOGOFF FROM SYSTEM?");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logOffText, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOff, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(logOffText, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logOff, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 141, 243));

        jPanel2.setBackground(new java.awt.Color(102, 97, 225));

        addRecBtn.setPreferredSize(new java.awt.Dimension(150, 40));
        addRecBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecBtnActionPerformed(evt);
            }
        });

        appoinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appoinBtnActionPerformed(evt);
            }
        });

        pastReBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pastReBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/records1.png"))); // NOI18N
        pastReBtn.setBorder(null);
        pastReBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pastReBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pastReBtnMouseExited(evt);
            }
        });
        pastReBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastReBtnActionPerformed(evt);
            }
        });

        docNameLbl.setFont(new java.awt.Font("Buxton Sketch", 0, 30)); // NOI18N
        docNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        docNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addRecBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(appoinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pastReBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(docNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(docNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pastReBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(addRecBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(appoinBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        jLabel2.setBackground(new java.awt.Color(77, 38, 249));
        jLabel2.setFont(new java.awt.Font("Buxton Sketch", 1, 44)); // NOI18N
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(signOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wifiButton)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(573, Short.MAX_VALUE))
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

    private void logOffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOffMouseEntered
        if(evt.getSource()== logOff){
            logOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/logOff2.png")));
        }
    }//GEN-LAST:event_logOffMouseEntered

    private void logOffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOffMouseExited
        if(evt.getSource()== logOff){
            logOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/logOff1.png")));
        }
    }//GEN-LAST:event_logOffMouseExited

    private void logOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOffActionPerformed
        if(evt.getSource()== logOff){
            HospitalManagementSystem.update(this ,new LoginPageGUI());
        }
    }//GEN-LAST:event_logOffActionPerformed

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        if(evt.getSource()== cancel){
            cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/cancel2.png")));
        }
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        if(evt.getSource()== cancel){
            cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/cancel1.png")));
        }
    }//GEN-LAST:event_cancelMouseExited

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        if (evt.getSource() == cancel) {
            logOff.setVisible(false);
            cancel.setVisible(false);
            logOffText.setVisible(false);
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void signOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutBtnActionPerformed
        if(evt.getSource()== signOutBtn){
            logOff.setVisible(true);
            cancel.setVisible(true);
            logOffText.setVisible(true);
        }
    }//GEN-LAST:event_signOutBtnActionPerformed

    private void addRecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecBtnActionPerformed
        if(evt.getSource()== addRecBtn){
            HospitalManagementSystem.update(this,new AddRecordsGUI(docName,docId));
        }
    }//GEN-LAST:event_addRecBtnActionPerformed

    private void appoinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appoinBtnActionPerformed
        if(evt.getSource()== appoinBtn){
            HospitalManagementSystem.update(this,new CheckappointmentsGUI(docName,docId));
        }
    }//GEN-LAST:event_appoinBtnActionPerformed

    private void pastReBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pastReBtnMouseEntered
        if(evt.getSource()== pastReBtn){
            pastReBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/records2.png")));
        }
    }//GEN-LAST:event_pastReBtnMouseEntered

    private void pastReBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pastReBtnMouseExited
        if(evt.getSource()== pastReBtn){
            pastReBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/records1.png")));
        }
    }//GEN-LAST:event_pastReBtnMouseExited

    private void pastReBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastReBtnActionPerformed
        if(evt.getSource() == pastReBtn){
            HospitalManagementSystem.update(this ,new PastRecordsGUI());
        }
    }//GEN-LAST:event_pastReBtnActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRecBtn;
    private javax.swing.JButton appoinBtn;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel docNameLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton logOff;
    private javax.swing.JLabel logOffText;
    private javax.swing.JButton pastReBtn;
    private javax.swing.JButton signOutBtn;
    private javax.swing.JButton wifiButton;
    // End of variables declaration//GEN-END:variables
}
