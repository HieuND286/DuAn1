/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Services.impl.NhanVienService;
import ViewModels.NhanVien_VM;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author dongl
 */
public class FrameLogin extends javax.swing.JFrame {

    private NhanVienService nhanVienService = new NhanVienService();

    public FrameLogin() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src\\img\\logo_30px.jpg"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        chkShowPass = new javax.swing.JCheckBox();
        btnDangNhap = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập ");

        jPanel1.setBackground(new java.awt.Color(176, 176, 176));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Tên đăng nhập");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Mật khẩu");

        txtUserName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtUserName.setPreferredSize(new java.awt.Dimension(193, 22));

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPass.setPreferredSize(new java.awt.Dimension(90, 22));
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });

        chkShowPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chkShowPass.setText("Hiện mật khẩu");
        chkShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowPassActionPerformed(evt);
            }
        });

        btnDangNhap.setBackground(new java.awt.Color(0, 102, 255));
        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setPreferredSize(new java.awt.Dimension(100, 26));
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(0, 102, 255));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnExit.setText("Thoát");
        btnExit.setPreferredSize(new java.awt.Dimension(60, 26));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkShowPass)
                            .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 80, Short.MAX_VALUE)
                        .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPass, txtUserName});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkShowPass)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtPass, txtUserName});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowPassActionPerformed
        // TODO add your handling code here:
        if (chkShowPass.isSelected()) {
            txtPass.setEchoChar((char) 0);
        } else {
            txtPass.setEchoChar('*');
        }
    }//GEN-LAST:event_chkShowPassActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        String userName = txtUserName.getText().trim();
        String pass = new String(txtPass.getPassword()).trim();
        if (txtUserName.getText().trim().length() == 0 || new String(txtPass.getPassword()).trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống tài khoản và mật khẩu");
            return;
        }
        if (userName.equalsIgnoreCase("QuanLy") && pass.equalsIgnoreCase("admin")) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
            new JFrame(txtUserName.getText().trim()).setVisible(true);
            this.setVisible(false);
            return;
        }

//        if (userName.equalsIgnoreCase("NhanVien") && pass.equalsIgnoreCase("nhanvien")) {
//            JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
//            new JFrame(txtUserName.getText().trim()).setVisible(true);
//            this.setVisible(false);
//            return;
//        }
//
//        JOptionPane.showMessageDialog(this, "Sai tài khoản và mật khẩu");
        if (login(userName, pass)) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
            ManHinhChinh manHinhChinh = new ManHinhChinh(this);
            manHinhChinh.setVisible(true);
            this.dispose();
        } else
            JOptionPane.showMessageDialog(this, "Sai tài khoản và mật khẩu");
    }//GEN-LAST:event_btnDangNhapActionPerformed
    private boolean login(String userName, String passWord) {
        List<NhanVien_VM> list = this.nhanVienService.getAllNhanVien();
        for (NhanVien_VM nhanVien_VM : list) {
            if (nhanVien_VM.getMANV().equals(userName)
                    && nhanVien_VM.getMatKhau().equals(passWord)) {
                return true;
            }
        }
        return false;
    }

    public NhanVien_VM getNhanVien_VM() {
        String userName = txtUserName.getText().trim();
        String pass = new String(txtPass.getPassword()).trim();
        NhanVien_VM nhanVien_VMA = null;
        List<NhanVien_VM> list = this.nhanVienService.getAllNhanVien();
        for (NhanVien_VM nhanVien_VM : list) {
            if (nhanVien_VM.getMANV().equals(userName)
                    && nhanVien_VM.getMatKhau().equals(pass))  {
                nhanVien_VMA = new NhanVien_VM(nhanVien_VM.getIDNV(), 
                        nhanVien_VM.getMANV(), nhanVien_VM.getHoVaTen(), 
                        nhanVien_VM.getGioiTinh(), nhanVien_VM.getNgaySinh(),
                        nhanVien_VM.getDiaChi(), nhanVien_VM.getSdt(), 
                        nhanVien_VM.getChucVu(), nhanVien_VM.getMatKhau(),
                        nhanVien_VM.getHinhAnh(), nhanVien_VM.getTrangThai());
            }
        }
        return nhanVien_VMA;
    }
    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        // TODO add your handling code here:

        if (new String(txtPass.getPassword()).equals("password")) {
            txtPass.setText("");
        }
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        // TODO add your handling code here:
        if (new String(txtPass.getPassword()).isEmpty()) {
            txtPass.setText("password");
        }
    }//GEN-LAST:event_txtPassFocusLost

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
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnExit;
    private javax.swing.JCheckBox chkShowPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
