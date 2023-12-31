/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Login.Student;

import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.AdminPackage.Student;

/**
 *
 * @author aayushi
 */
public class ViewTransciriptJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TransciriptJPanel
     */
    JPanel userProcessContainer;
    Student student;
    
    public ViewTransciriptJPanel(JPanel userProcessContainer ,Student student) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.student = student;
        this.transcriptDispTextArea.setText(this.student.getTranscript().generateTranscript());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        transcriptDispTextArea = new javax.swing.JTextArea();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 153, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("VIEW TRANSCRIPT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 47, -1, -1));

        transcriptDispTextArea.setEditable(false);
        transcriptDispTextArea.setColumns(20);
        transcriptDispTextArea.setRows(5);
        jScrollPane1.setViewportView(transcriptDispTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 93, 411, 434));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea transcriptDispTextArea;
    // End of variables declaration//GEN-END:variables
}
