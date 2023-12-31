/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Login.Student;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.AdminPackage.Student;
import Business.CoursePackage.Course;
import Business.CoursePackage.CourseCatalog;


/**
 *
 * @author aayushi
 */
public class CourseRegisterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CourseRegisterJPanel
     */
    private Course course;
    private JPanel userProcessContainer;
    private Student student;

    public CourseRegisterJPanel(JPanel userProcessContainer, Course course, Student student) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.course = course;
        this.student = student;
        courseIdTextArea.setText(Integer.toString(course.getCourseId()));
        courseNameTextArea.setText(course.getCourseName());
        facultyNameTextArea.setText(course.getFaculty().getFullName());
        regionTextArea.setText(course.getRegion());
        langTextArea.setText(course.getLanguage());
        creditsTextArea.setText(String.valueOf(course.getCredit()));
        priceTextArea.setText(String.valueOf(course.getPrice()));
        ratingTextArea.setText(String.valueOf(course.getFaculty().getRating()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        courseIdTextArea = new javax.swing.JTextField();
        courseNameTextArea = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        facultyNameTextArea = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        regionTextArea = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        langTextArea = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        creditsTextArea = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ratingTextArea = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        priceTextArea = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 153, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("View Course Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 131, 38));

        jLabel2.setText("Course ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel3.setText("Course Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        courseIdTextArea.setEditable(false);
        add(courseIdTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 146, -1));

        courseNameTextArea.setEditable(false);
        add(courseNameTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 146, -1));

        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        jLabel4.setText("Faculty");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        facultyNameTextArea.setEditable(false);
        facultyNameTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyNameTextAreaActionPerformed(evt);
            }
        });
        add(facultyNameTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 146, -1));

        jLabel5.setText("Region");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        regionTextArea.setEditable(false);
        regionTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionTextAreaActionPerformed(evt);
            }
        });
        add(regionTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 146, -1));

        jLabel6.setText("Language");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        langTextArea.setEditable(false);
        langTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                langTextAreaActionPerformed(evt);
            }
        });
        add(langTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 146, -1));

        jLabel7.setText("Credits");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        creditsTextArea.setEditable(false);
        creditsTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsTextAreaActionPerformed(evt);
            }
        });
        add(creditsTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 146, -1));

        jLabel8.setText("Rating");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        ratingTextArea.setEditable(false);
        ratingTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingTextAreaActionPerformed(evt);
            }
        });
        add(ratingTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 146, -1));

        jLabel9.setText("Price");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        priceTextArea.setEditable(false);
        priceTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTextAreaActionPerformed(evt);
            }
        });
        add(priceTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 146, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);

    }//GEN-LAST:event_backBtnActionPerformed

    private void facultyNameTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyNameTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyNameTextAreaActionPerformed

    private void regionTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionTextAreaActionPerformed

    private void langTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_langTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_langTextAreaActionPerformed

    private void creditsTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditsTextAreaActionPerformed

    private void ratingTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ratingTextAreaActionPerformed

    private void priceTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTextAreaActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        student.addCourseToStudent(course);

    }//GEN-LAST:event_registerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField courseIdTextArea;
    private javax.swing.JTextField courseNameTextArea;
    private javax.swing.JTextField creditsTextArea;
    private javax.swing.JTextField facultyNameTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField langTextArea;
    private javax.swing.JTextField priceTextArea;
    private javax.swing.JTextField ratingTextArea;
    private javax.swing.JTextField regionTextArea;
    private javax.swing.JButton registerBtn;
    // End of variables declaration//GEN-END:variables
}
