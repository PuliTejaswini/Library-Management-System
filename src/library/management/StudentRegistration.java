/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.management;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author P Tejaswini
 */
public class StudentRegistration extends javax.swing.JFrame {

    /**
     * Creates new form StudentRegistration
     */
    public StudentRegistration() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtstdname = new javax.swing.JTextField();
        txtBranch = new javax.swing.JTextField();
        txtcourse = new javax.swing.JTextField();
        txtSemester = new javax.swing.JTextField();
        txtsave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(896, 736));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/close icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(854, 0, 42, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/isue.jpg"))); // NOI18N
        jLabel1.setText("Student Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 38, -1, 35));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("Student Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 252, 100, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("Course");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 316, 82, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setText("Branch");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 375, 82, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setText("Semester");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 82, -1));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 194, 223, -1));
        getContentPane().add(txtstdname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 253, 223, -1));
        getContentPane().add(txtBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 373, 223, -1));
        getContentPane().add(txtcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 314, 223, -1));
        getContentPane().add(txtSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 223, -1));

        txtsave.setBackground(new java.awt.Color(153, 0, 153));
        txtsave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtsave.setForeground(new java.awt.Color(242, 242, 242));
        txtsave.setText("Save");
        txtsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsaveActionPerformed(evt);
            }
        });
        getContentPane().add(txtsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 520, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Student Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 80, -1));

        jLabel8.setForeground(new java.awt.Color(242, 242, 242));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/justnow.jpg"))); // NOI18N
        jLabel8.setText("Student");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsaveActionPerformed
        if(txtId.getText().equals("")){// TODO add your handling code here:
            JOptionPane.showMessageDialog(this, "Please enter Id");
            txtId.requestFocus();
          }
        else if(txtstdname.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter Student Name");
                txtstdname.requestFocus();
        }
        else if(txtcourse.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter Course");
                txtcourse.requestFocus();
        }
        else if(txtBranch.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter Branch of Student");
                txtBranch.requestFocus();
        }
        else if(txtSemester.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter Semester");
                txtSemester.requestFocus();
        }
        else{
            try {
                Connection con=Connect.Connection();
                PreparedStatement pst=con.prepareStatement("INSERT INTO `library`.`Student` (`Id`, `stdname`, `course`, `Branch`, `Semester`) VALUES (?,?,?,?,?)");
                pst.setString(1, txtId.getText());
                pst.setString(2, txtstdname.getText());
                pst.setString(3, txtcourse.getText());
                pst.setString(4, txtBranch.getText());
                pst.setString(5, txtSemester.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "record is saved");
                txtId.setText("");
                txtstdname.setText("");
                txtcourse.setText("");
                txtBranch.setText("");
                txtSemester.setText("");
                
            } catch (SQLException ex) {
                Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_txtsaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtBranch;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JTextField txtcourse;
    private javax.swing.JButton txtsave;
    private javax.swing.JTextField txtstdname;
    // End of variables declaration//GEN-END:variables
}
