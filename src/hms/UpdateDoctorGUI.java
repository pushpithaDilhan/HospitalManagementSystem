
package hms;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JCheckBox;
import org.apache.log4j.*;


public class UpdateDoctorGUI extends javax.swing.JPanel {
    
    private static final Logger logger = Logger.getLogger(UpdateDoctorGUI.class.getName());
    
    private String Availability = "1";
    private int cate = 0;
    
    public UpdateDoctorGUI() {
        initComponents();
        
        if (logger.isInfoEnabled()){
            logger.info("UpdateDoctorGUI created.");
        }
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
        backBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        docNameText = new javax.swing.JTextField();
        wifiButton = new javax.swing.JButton();
        searchtBtn = new javax.swing.JButton();
        nava = new javax.swing.JCheckBox();
        ava = new javax.swing.JCheckBox();
        Calendar = new com.toedter.calendar.JCalendar();

        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        docList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addContainerGap(42, Short.MAX_VALUE)
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

        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/next1.png"))); // NOI18N
        updateBtn.setBorder(null);
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateBtnMouseExited(evt);
            }
        });
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Buxton Sketch", 0, 26)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NAME OF DOCTOR");

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

        nava.setBackground(new java.awt.Color(102, 141, 225));
        nava.setFont(new java.awt.Font("Buxton Sketch", 0, 24)); // NOI18N
        nava.setForeground(new java.awt.Color(255, 255, 255));
        nava.setText("NOT AVAILABLE");
        nava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navaActionPerformed(evt);
            }
        });

        ava.setBackground(new java.awt.Color(102, 141, 225));
        ava.setFont(new java.awt.Font("Buxton Sketch", 0, 24)); // NOI18N
        ava.setForeground(new java.awt.Color(255, 255, 255));
        ava.setSelected(true);
        ava.setText("AVAILABLE");
        ava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(wifiButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 17, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(docList, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(docNameText)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ava, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nava, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Calendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(searchtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(searchtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(docNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nava, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ava, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(docList, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void docListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docListMouseClicked
        if(evt.getSource()== docList){
            docNameText.setText(docList.getSelectedItem());
        }
    }//GEN-LAST:event_docListMouseClicked

    private void docListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docListActionPerformed

    private void cateComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cateComboActionPerformed
        if (evt.getSource() == cateCombo) {
            cate = cateCombo.getSelectedIndex();
        }
    }//GEN-LAST:event_cateComboActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        if(evt.getSource()== backBtn){
            HospitalManagementSystem.update(this ,new HRStaffInterface());
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseEntered
        if(evt.getSource()== updateBtn){
            updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/next2.png")));
        }
    }//GEN-LAST:event_updateBtnMouseEntered

    private void updateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseExited
        if(evt.getSource()== updateBtn){
            updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/next1.png")));
        }
    }//GEN-LAST:event_updateBtnMouseExited

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        if(evt.getSource()== updateBtn){
            if(ava.isSelected()){
                Availability = "1";
            }else if(nava.isSelected()){
                Availability = "0";
            }
            if (docNameText.getText().equals("")) {
                docNameText.setBackground(Color.lightGray);
            }else{
                new UpdateDoctor().update(Calendar.getDate(),Availability ,docNameText.getText());
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void docNameTextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docNameTextMouseMoved
        docNameText.setBackground(Color.WHITE);
    }//GEN-LAST:event_docNameTextMouseMoved

    private void docNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docNameTextActionPerformed

    }//GEN-LAST:event_docNameTextActionPerformed

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
                while (result.next()) {
                    docList.add(result.getString(1));
                }
            }
            catch(SQLException | NullPointerException ex) {
                logger.error(ex);
            }
        }
    }//GEN-LAST:event_searchtBtnActionPerformed

    private void avaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaActionPerformed
        if(evt.getSource() == ava){
            clear(ava);
        }
    }//GEN-LAST:event_avaActionPerformed

    private void navaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navaActionPerformed
        if(evt.getSource() == nava){
            clear(nava);
        }
    }//GEN-LAST:event_navaActionPerformed
    
    private void clear(JCheckBox btn){
        JCheckBox[] list = {ava ,nava};
        for(JCheckBox Btn:list){
            if(Btn.equals(btn)){
                Btn.setSelected(true);
            }else{
                Btn.setSelected(false);
            }
        }repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar Calendar;
    private javax.swing.JCheckBox ava;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox cateCombo;
    private java.awt.List docList;
    private javax.swing.JTextField docNameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JCheckBox nava;
    private javax.swing.JButton searchtBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton wifiButton;
    // End of variables declaration//GEN-END:variables
    

}
