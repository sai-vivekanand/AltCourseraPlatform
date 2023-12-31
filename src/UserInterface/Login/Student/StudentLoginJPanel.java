/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Login.Student;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.AdminPackage.FacultyDirectory;
import Business.AdminPackage.Student;
import Business.AdminPackage.StudentDirectory;
import Business.CoursePackage.CourseCatalog;

/**
 *
 * @author aayushi
 */
public class StudentLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminLandingPage
     */
    JPanel userProcessContainer;
    StudentDirectory studentDir;
    FacultyDirectory facultyDir;
    CourseCatalog courseCatalog;

    public StudentLoginJPanel(JPanel userProcessContainer, StudentDirectory studentDir, FacultyDirectory facultyDir, CourseCatalog courseCatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.studentDir = studentDir;
        this.facultyDir = facultyDir;
        this.courseCatalog = courseCatalog;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentIdTextField = new javax.swing.JTextField();
        pwdTextField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bypassBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 153, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(studentIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 156, -1));
        add(pwdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 156, -1));

        loginBtn.setText("Sign In");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        jLabel1.setText("Password :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 74, 22));

        jLabel2.setText("Student ID :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 74, 22));

        bypassBtn.setText("Bypass");
        bypassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bypassBtnActionPerformed(evt);
            }
        });
        add(bypassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 6, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("WELCOME TO STUDENT LOGIN");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String student_id = this.studentIdTextField.getText();
        String pwd = String.valueOf(this.pwdTextField.getPassword());
        System.out.println(student_id);
        System.out.println(pwd);
        System.out.println(studentDir.getStudentByUserId(student_id));
        if (student_id.isBlank() || pwd.isBlank()) {
            JOptionPane.showMessageDialog(this, "Admin id or password is empty", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            Student student = studentDir.getStudentByUserId(student_id);
            if (student != null) {
                if (student.getPassword().equals(pwd) && student.getIsAccActive()==true) {
                    StudentLandingPageJPanel studentProfileJPanel = new StudentLandingPageJPanel(userProcessContainer, courseCatalog, student, facultyDir);
                    userProcessContainer.add("studentProfileJPanel", studentProfileJPanel);
                    CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
                    cardLayout.next(userProcessContainer);
                } else {
                    JOptionPane.showMessageDialog(this, "Student id or password is incorrect", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Student Account does not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void bypassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bypassBtnActionPerformed
        // TODO add your handling code here:
        Student student = studentDir.getStudentByUserId("stest");
        StudentLandingPageJPanel studentProfileJPanel = new StudentLandingPageJPanel(userProcessContainer, courseCatalog, student, facultyDir);
        userProcessContainer.add("studentProfileJPanel", studentProfileJPanel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_bypassBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bypassBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField pwdTextField;
    private javax.swing.JTextField studentIdTextField;
    // End of variables declaration//GEN-END:variables
}
