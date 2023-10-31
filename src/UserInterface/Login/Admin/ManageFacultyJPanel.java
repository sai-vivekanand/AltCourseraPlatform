/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Login.Admin;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.AdminPackage.Faculty;
import Business.AdminPackage.FacultyDirectory;
import Business.AdminPackage.Student;

/**
 *
 * @author dhwanil
 */
public class ManageFacultyJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    FacultyDirectory facultyDir;
    Faculty faculty;

    /**
     * Creates new form ManageFaculty
     */
    public ManageFacultyJPanel(JPanel userProcessContainer, FacultyDirectory facultyDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.facultyDir = facultyDir;
        this.hideInOutPanel.setVisible(false);
        this.hideInOutPanel.setVisible(false);
        this.isAccDisabled.setEnabled(false);      
        this.saveBtn.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createFacultyBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        facultyIdTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        hideInOutPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pwdTextArea = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        facultyIdTextArea = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        isAccDisabled = new javax.swing.JRadioButton();
        updateBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createFacultyBtn.setText("Create  a Faculty Profile");
        createFacultyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFacultyBtnActionPerformed(evt);
            }
        });
        add(createFacultyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 190, -1));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 22));
        add(facultyIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 196, -1));

        jLabel1.setText("or");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabel2.setText("Edit a Faculty Profile");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 130, 22));

        jLabel3.setText("Faculty ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        hideInOutPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hideInOutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Faculty ID :");
        hideInOutPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 18, 72, -1));

        pwdTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdTextAreaActionPerformed(evt);
            }
        });
        hideInOutPanel.add(pwdTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 55, 125, -1));

        jLabel5.setText("Password :");
        hideInOutPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 58, 102, -1));
        hideInOutPanel.add(facultyIdTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 15, 125, -1));

        jLabel6.setText("Disable Account :");
        hideInOutPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 102, 102, -1));
        hideInOutPanel.add(isAccDisabled, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        hideInOutPanel.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        hideInOutPanel.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        add(hideInOutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 225, 323, 208));
    }// </editor-fold>//GEN-END:initComponents

    private void createFacultyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFacultyBtnActionPerformed
        // TODO add your handling code here:
        CreateFacultyCredentialsJPanel createFacultyCredentials = new CreateFacultyCredentialsJPanel(userProcessContainer, facultyDir);
        userProcessContainer.add("createFacultyCredentials", createFacultyCredentials);
        ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_createFacultyBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);

    }//GEN-LAST:event_backBtnActionPerformed

    private void pwdTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdTextAreaActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        updateBtn.setEnabled(false);
        saveBtn.setEnabled(true);
        facultyIdTextArea.setEditable(true);
        pwdTextArea.setEditable(true);
        isAccDisabled.setEnabled(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String faculty_id = facultyIdTextArea.getText();
        String pwd = pwdTextArea.getText();
        Boolean isAccountDisabled = isAccDisabled.isSelected();
        if (faculty_id.isBlank() || pwd.isBlank()) {
            JOptionPane.showMessageDialog(this, "Credentials cannot be empty", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            this.faculty.setFacultyId(faculty_id);
            this.faculty.setPassword(pwd);
            this.faculty.setIsAccActive(!isAccountDisabled);
            JOptionPane.showMessageDialog(this, "Information Saved Successfully");
            hideInOutPanel.setVisible(false);
            facultyIdTextArea.setEditable(false);
            pwdTextArea.setEditable(false);
            saveBtn.setEnabled(false);
            updateBtn.setEnabled(true);
            facultyIdTextField.setText("");
            facultyIdTextArea.setText("");
            pwdTextArea.setText("");

        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String id = facultyIdTextField.getText();
        if (id == null) {
            JOptionPane.showMessageDialog(this, "Id cannot be empty", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            Faculty faculty = facultyDir.getFacultyByFacultyId(id);
            if (faculty == null) {
                JOptionPane.showMessageDialog(this, "Faculty ID NOT FOUND", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                this.faculty = faculty;
                this.isAccDisabled.setEnabled(false);
                this.isAccDisabled.setSelected(!this.faculty.getIsAccActive());
                this.facultyIdTextArea.setText(id);
                this.pwdTextArea.setText(faculty.getPassword());
                hideInOutPanel.setVisible(true);
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createFacultyBtn;
    private javax.swing.JTextField facultyIdTextArea;
    private javax.swing.JTextField facultyIdTextField;
    private javax.swing.JPanel hideInOutPanel;
    private javax.swing.JRadioButton isAccDisabled;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField pwdTextArea;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
