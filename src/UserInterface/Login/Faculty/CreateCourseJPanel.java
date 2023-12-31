/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Login.Faculty;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.AdminPackage.Faculty;
import Business.AdminPackage.Semester;
import Business.AdminPackage.StudentDirectory;
import Business.CoursePackage.Course;
import Business.CoursePackage.CourseCatalog;

/**
 *
 * @author sai_vivek_vangala
 */
public class CreateCourseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCourseJPanel
     */
    JPanel userProcessContainer;
    StudentDirectory studentDir;
    Faculty faculty;
    CourseCatalog courseCatalog;
    Course course;

    public CreateCourseJPanel(JPanel userProcessContainer, StudentDirectory studentDir, Faculty faculty, CourseCatalog courseCatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.courseCatalog = courseCatalog;
        this.faculty = faculty;
        this.studentDir = studentDir;
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
        courseIdTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        courseNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        creditsTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        regionTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        langTextField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setForeground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("CREATE COURSE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        jLabel2.setText("Course ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 59, 25));
        add(courseIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 124, -1));

        jLabel3.setText("Course Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 84, 25));
        add(courseNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 124, -1));

        jLabel4.setText("Price");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 59, 25));
        add(priceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 124, -1));

        jLabel5.setText("Credits");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 59, 25));
        add(creditsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 124, -1));

        jLabel6.setText("Region");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 59, 25));
        add(regionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 124, -1));

        jLabel7.setText("Language");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 59, 25));
        add(langTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 124, -1));

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 6, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        float Price;
        int Credits;
        int CourseID;
        String course_id = courseIdTextField.getText();
        String course_name = courseNameTextField.getText();
        String price = priceTextField.getText();
        String credits = creditsTextField.getText();
        String region = regionTextField.getText();
        String lang = langTextField.getText();
        try{
            Price = Float.parseFloat(price);
            Credits = Integer.parseInt(credits);
            CourseID = Integer.parseInt(course_id);
            Course course = new Course();
            course.setCourseId(CourseID);
            course.setCourseName(course_name);
            course.setFaculty(faculty);
            course.setCredit(Credits);
            course.setPrice(Price);
            course.setFaculty(faculty);
            course.setLanguage(lang);
            course.setRegion(region);
            course.setSemester(Semester.getSemester());
            courseCatalog.addCourseToCourseList(course);
            JOptionPane.showMessageDialog(this, "Course Created Successfully");
        }
        catch(Exception e){
          e.printStackTrace();
        }

    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField courseIdTextField;
    private javax.swing.JTextField courseNameTextField;
    private javax.swing.JTextField creditsTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField langTextField;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JTextField regionTextField;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
