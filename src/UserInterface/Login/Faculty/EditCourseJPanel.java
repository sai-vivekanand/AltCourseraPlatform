/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Login.Faculty;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.AdminPackage.Faculty;
import Business.AdminPackage.StudentDirectory;
import Business.CoursePackage.Course;
import Business.CoursePackage.CourseCatalog;

/**
 *
 * @author sai_vivek_vangala
 */
public class EditCourseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EditCourseJPanel
     */
    JPanel userProcessContainer;
    Course course;

    public EditCourseJPanel(JPanel userProcessContainer, Course course) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.course = course;
        populateCourseDetails();

    }

    private void populateCourseDetails() {
        txtCourseId.setText(String.valueOf(course.getCourseId()));
        txtCourseName.setText(course.getCourseName());
        txtRegion.setText(course.getRegion());
        txtLanguage.setText(course.getLanguage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCourseId = new javax.swing.JTextField();
        txtCourseName = new javax.swing.JTextField();
        txtRegion = new javax.swing.JTextField();
        txtLanguage = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Edit Course Details");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 151, 29));

        jLabel2.setText("Course ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jLabel3.setText("Course Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jLabel4.setText("Region");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        jLabel5.setText("Language");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));
        add(txtCourseId, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 147, -1));

        txtCourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseNameActionPerformed(evt);
            }
        });
        add(txtCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 147, -1));
        add(txtRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 147, -1));

        txtLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLanguageActionPerformed(evt);
            }
        });
        add(txtLanguage, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 147, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 15, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        course.setCourseId(Integer.parseInt(txtCourseId.getText()));
        course.setCourseName(txtCourseName.getText());
        course.setRegion(txtRegion.getText());
        course.setLanguage(txtLanguage.getText());
        JOptionPane.showMessageDialog(null, "Course Details Updated successfully!");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseNameActionPerformed

    private void txtLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLanguageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLanguageActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCourseId;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtLanguage;
    private javax.swing.JTextField txtRegion;
    // End of variables declaration//GEN-END:variables
}