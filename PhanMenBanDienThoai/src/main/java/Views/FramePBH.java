/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import Services.impl.GoiBaoHanhService;
import Services.impl.PhieuBaoHanhService;
import ViewModels.GoiBaoHanhviewModel;
import ViewModels.HoaDonCTViewModel;
import ViewModels.HoaDonViewModel;
import ViewModels.PhieuBaoHanhViewModels;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class FramePBH extends javax.swing.JPanel {

    private PhieuBaoHanhService PBH = new PhieuBaoHanhService();
    private GoiBaoHanhService GBH = new GoiBaoHanhService();
    private ManHinhChinh manHinhChinh;
    public FramePBH(ManHinhChinh manHinhChinh) {
        this.manHinhChinh = manHinhChinh;
        initComponents();
        LoadTablePBH();
        Loadcbb();
    }

 public String setTextIdhd(String idHD) {
        this.txtHD.setText(idHD);
        String idhd = this.txtHD.getText();
        return idhd;
    }

    public void setTextIdSP(String idSP) {
        this.txtSP.setText(idSP);

    }

    public void LoadTablePBH() {
        DefaultTableModel dtm = (DefaultTableModel) this.jTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<PhieuBaoHanhViewModels> list = this.PBH.getAll();
        for (PhieuBaoHanhViewModels p : list) {

            Object[] row = new Object[]{
                p.getIDPBH(),
                p.getMota(),
                p.getTen(),
                p.getTrangThai() == 1 ? "chờ sử dụng" : " đã sử dụng",
                p.getNgayBatDau(),
                p.getNGayKetThuc(),
                p.getDiaChi(),
                p.getSdtCH()
            };
            dtm.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtTrangT = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        txtKetThuc = new javax.swing.JTextField();
        jlbIDHD = new javax.swing.JLabel();
        txtBatDau = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        TxtDC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtHD = new javax.swing.JLabel();
        txtID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbbGoiBaoHanh = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtSP = new javax.swing.JLabel();
        rdoCho = new javax.swing.JRadioButton();
        rdoOk = new javax.swing.JRadioButton();
        btnChonSP = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id Phieu Bao Hanh", "goi bao hanh", "Ten KH", "TrangThai", "Ngay Bat Dau", "Ngay Ket Thuc", "Dia Chi CH", "SDT CuaHang"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Phieu Bao Hanh");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTrangT.setText("Trang Thai");

        jlbIDHD.setText("ID Hoa Don");

        txtBatDau.setText("Ngay Bat Dau");

        jLabel6.setText("Ngay Ket Thuc");

        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });

        jLabel8.setText("SDT Cua Hang");

        jLabel1.setText("id");

        jLabel2.setText("ten KH");

        jLabel3.setText("Dia Chi CH");

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        txtHD.setText("-");

        txtID.setText("-");

        jLabel4.setText("gói bảo hành");

        cbbGoiBaoHanh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "gói bảo hành thường", "gói bảo hành mở rộng (loại 1 năm)", "gói bảo hành mở rộng (loại 2 năm)" }));

        jLabel7.setText("ID San Pham");

        txtSP.setText("-");

        rdoCho.setSelected(true);
        rdoCho.setText("chờ sử dụng");

        rdoOk.setText("đã sử dụng");

        btnChonSP.setText("Chọn Sản Phẩm");
        btnChonSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonSPActionPerformed(evt);
            }
        });

        btnSua.setText("Sua");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        btnXoa.setText("Xoa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThem.setText("Them");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTen)
                    .addComponent(TxtDC)
                    .addComponent(txtSDT)
                    .addComponent(txtID)
                    .addComponent(cbbGoiBaoHanh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txtBatDau)
                    .addComponent(jlbIDHD)
                    .addComponent(txtTrangT)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdoCho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoOk))
                    .addComponent(jTextField5)
                    .addComponent(txtKetThuc)
                    .addComponent(txtHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChonSP, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoa)
                            .addComponent(btnThem)
                            .addComponent(btnSua))
                        .addGap(20, 20, 20)))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbIDHD)
                    .addComponent(txtHD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBatDau)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTrangT)
                    .addComponent(rdoCho)
                    .addComponent(rdoOk)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnChonSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbbGoiBaoHanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 881, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(324, 324, 324)
                            .addComponent(jLabel9)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(44, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = this.jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "hãy chọn một dòng trên bảng ");
            return;
        }
        String id = this.jTable1.getValueAt(row, 0).toString();
        String tenkh = this.jTable1.getValueAt(row, 2).toString();
        String trangThai = this.jTable1.getValueAt(row, 3).toString();
        String ngaybatdau = this.jTable1.getValueAt(row, 4).toString();
        String ngayketthuc = this.jTable1.getValueAt(row, 5).toString();
        String diachiCh = this.jTable1.getValueAt(row, 6).toString();
        String sdtch = this.jTable1.getValueAt(row, 7).toString();

        this.txtID.setText(id);
        this.txtTen.setText(tenkh);
        this.jTextField5.setText(ngaybatdau);
        this.txtKetThuc.setText(ngayketthuc);
        this.TxtDC.setText(diachiCh);
        this.txtSDT.setText(sdtch);
        if (trangThai == "chờ sử dụng") {
            this.rdoCho.setSelected(true);
        } else if (trangThai == "đã sử dụng") {
            this.rdoOk.setSelected(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void btnChonSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonSPActionPerformed
        // TODO add your handling code here:

        HoaDon_GBHjFrame hd = new HoaDon_GBHjFrame(this);
        this.txtHD.setText(hd.getIdtxt());
        this.txtSP.setText(hd.getIdSPtxt());
        hd.setVisible(true);
        hd.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnChonSPActionPerformed

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        // TODO add your handling code here:
        int row = this.jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "hãy chọn một dòng trên bảng ");
            return;
        }
        PhieuBaoHanhViewModels ds = this.getfromdata();
        int sua = this.PBH.update(ds);
        if (sua != 0) {
            JOptionPane.showMessageDialog(this, "sưa thành công ");
        } else {
            JOptionPane.showMessageDialog(this, "sửa thất bại ");
        }
        this.LoadTablePBH();
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        PhieuBaoHanhViewModels ds = this.getfromdata();
        int row = this.jTable1.getRowCount();
        if (row == -1) {

            return;
        }
        int confim = JOptionPane.showConfirmDialog(this, "bạn chắc chắn muốn xóa ");
        if (confim != JOptionPane.YES_OPTION) {
            return;
        } else {
            this.PBH.delete(ds);
            JOptionPane.showMessageDialog(this, "xóa thành công ");
        }
        this.LoadTablePBH();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        PhieuBaoHanhViewModels ds = this.getfromdata();
        int insert = this.PBH.add(ds);
        int inserts = this.PBH.updateHDCT(ds);
        if (insert != 0 && inserts != 0) {
            JOptionPane.showMessageDialog(this, "insert thành công");
        } else {
            JOptionPane.showMessageDialog(this, "insert thất bại ");
        }
        this.LoadTablePBH();
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed
 public PhieuBaoHanhViewModels getfromdata() {
        try {

            String idString = this.txtID.getText();
            String idhd = this.txtHD.getText();
            String IdSp = this.txtSP.getText();
            String ten = this.txtTen.getText();
            int tt = this.rdoCho.isSelected() == true ? 1 : 0;
            String checkSDT = "^0+[1-9]{1}+\\d{8}";

            if (this.jTextField5.getText().trim().length() == 0
                    || this.txtKetThuc.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(this, "không được để trống giữ liệu");
                return null;

            }
            String now = LocalDate.now().toString();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date bd = sdf.parse(this.jTextField5.getText());
            Date kt = sdf.parse(this.txtKetThuc.getText());
            Date date1 = sdf.parse(now);
            if (date1.compareTo(kt) < 0) {
                tt = 0;
            }
            String GBH = this.cbbGoiBaoHanh.getSelectedItem().toString();
            String dc = this.TxtDC.getText();
            String sdt = this.txtSDT.getText();

            if (ten.trim().length() == 0
                    || dc.trim().length() == 0
                    || sdt.trim().length() == 0) {
                JOptionPane.showMessageDialog(this, "không được để trống giữ liệu");
                return null;
            }
//            if (dc.matches(chenkTenString) || ten.matches(chenkTenString)) {
//                JOptionPane.showMessageDialog(this, "tên và địa chỉ không thể là số");
//                return null;
//            }
            if (!sdt.matches(checkSDT)) {
                JOptionPane.showMessageDialog(this, "SDT không đúng ");
                return null;
            }
            String hoaDon = null;
            ArrayList<HoaDonViewModel> hd = this.PBH.getAllHD();
            for (HoaDonViewModel h : hd) {
                if (h.getIdHoaDon().equals(idhd)) {
                    hoaDon = h.getIdHoaDon();
                }
            }
            String HoaDonCT = null;
            ArrayList<HoaDonCTViewModel> hdct = this.PBH.getAllHDCT();
            for (HoaDonCTViewModel h : hdct) {
                if (h.getIDCTSP().equals(IdSp)) {
                    h.getIDHDCT();
                }
            }
            String GoiBH = null;
            ArrayList<GoiBaoHanhviewModel> gbh = this.GBH.getAll();
            for (GoiBaoHanhviewModel g : gbh) {
                if (g.getTen().equals(GBH)) {
                    GoiBH = g.getId();
                }
            }
            PhieuBaoHanhViewModels pbhvm = new PhieuBaoHanhViewModels(idString, hoaDon, GoiBH, HoaDonCT, ten, bd, kt, tt, dc, sdt, GBH);
            return pbhvm;
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "ngày phải là kiểu yyyy-MM-dd với yyyy là năm, MM là tháng, dd là ngày và phải được nối"
                    + "với nhau bằng dấu - ");
            ex.printStackTrace();
            return null;
        }
    }

    public void Loadcbb() {
        ArrayList<GoiBaoHanhviewModel> list = this.GBH.getAll();
        cbbGoiBaoHanh.removeAllItems();
        for (GoiBaoHanhviewModel p : list) {
            cbbGoiBaoHanh.addItem(p.getTen());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtDC;
    private javax.swing.JButton btnChonSP;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbGoiBaoHanh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel jlbIDHD;
    private javax.swing.JRadioButton rdoCho;
    private javax.swing.JRadioButton rdoOk;
    private javax.swing.JLabel txtBatDau;
    private javax.swing.JLabel txtHD;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtKetThuc;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JLabel txtSP;
    private javax.swing.JTextField txtTen;
    private javax.swing.JLabel txtTrangT;
    // End of variables declaration//GEN-END:variables
}
