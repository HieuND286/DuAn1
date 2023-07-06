/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DomainModels.SanPham_DM;
import DomainModels.SanPhamKM;
import Services.impl.DotKhuyenMaiService;
import Services.impl.SanPhamKMService;
import Services.impl.SanPhamServive;
import ViewModels.DotKhuyenMai_VM;
import ViewModels.SanPhamKM_VM;
import ViewModels.SanPhamKM_VM;
import Viewmodels.SanPham_VM;

/**
 *
 * @author Admin
 */
public class DotKhuyenMai extends javax.swing.JFrame {

    private static DotKhuyenMaiService dotKhuyenMaiService = new DotKhuyenMaiService();
    private static SanPhamServive sanPhamService = new SanPhamServive();
    private static SanPhamKMService sanPhamKMService = new SanPhamKMService();

    public DotKhuyenMai() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel2.setVisible(false);
        loadTableKhuyenMai();
        loadTableSanPham();
    }

    public void loadTableKhuyenMai() {
        DefaultTableModel dtm = (DefaultTableModel) this.tblGiamGia.getModel();
        dtm.setRowCount(0);
        List<DotKhuyenMai_VM> list = dotKhuyenMaiService.getAllDotKhuyenMais();
        for (DotKhuyenMai_VM dotKhuyenMai_VM : list) {
            Object[] row = {
                dotKhuyenMai_VM.getLoaiMa(),
                dotKhuyenMai_VM.getTenKM(),
                dotKhuyenMai_VM.getMaVoucher(),
                dotKhuyenMai_VM.getGiaTri(),
                dotKhuyenMai_VM.getTrangThai() == 0 ? "Dang dien ra" : "sap dien ",
                dotKhuyenMai_VM.getNgaybatDau(),
                dotKhuyenMai_VM.getNgayKetThuc(),};
            dtm.addRow(row);
        }
    }

    public void loadTableSanPham() {
        DefaultTableModel dtm = (DefaultTableModel) this.tblSanPham.getModel();
        dtm.setRowCount(0);
        List<SanPham_VM> listsp = sanPhamService.getAllSanPhamss();
        for (SanPham_VM sanPham : listsp) {
            Object[] row = {
                sanPham.getIdSP(),
                sanPham.getTenSP(),};
            dtm.addRow(row);
        }

    }

    //tìm kiếm người học theo keyword rồi đổ list người học vào bảng
    //nếu không có keywork trong ô tìm kiếm thì đổ toàn bộ người học trong CSDL vào bảng
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGiamGia = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbbLoaiMa = new javax.swing.JComboBox<>();
        txtTenMa = new javax.swing.JTextField();
        txtMaVoucher = new javax.swing.JTextField();
        txtMucGiamGia = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        txtHangSp = new javax.swing.JLabel();
        cbbSanPham = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtFind = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        ccNgayBatDau = new com.toedter.calendar.JDateChooser();
        ccNgayKetThuc = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("Giảm Giá");

        jLabel2.setText("Danh Sách Mã Giảm GIá");

        jLabel3.setText("Tạo Mã Giảm GIá toàn shop hoặc giảm giá sản phẩm để thu hút khách hàng");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 204));
        jLabel4.setText("Tất Cả");

        tblGiamGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Loại Mã", "Tên Mã", "Mã Voucher", "Giảm Giá", "Tình Trạng", "Ngày Bắt Đầu", "Ngày Kết Thúc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGiamGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGiamGiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGiamGia);
        if (tblGiamGia.getColumnModel().getColumnCount() > 0) {
            tblGiamGia.getColumnModel().getColumn(0).setResizable(false);
            tblGiamGia.getColumnModel().getColumn(1).setResizable(false);
            tblGiamGia.getColumnModel().getColumn(2).setResizable(false);
            tblGiamGia.getColumnModel().getColumn(3).setResizable(false);
            tblGiamGia.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel5.setText("Loại Mã");

        jLabel6.setText("Tên Mã");

        jLabel7.setText("Mã Voucher");

        jLabel8.setText("Ngày Bắt Đầu");

        jLabel9.setText("Ngày Kết Thúc");

        jLabel10.setText("Mức Giảm Giá");

        cbbLoaiMa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giảm Giá Toàn Shop", "Giảm Giá theo Sản Phẩm" }));
        cbbLoaiMa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbLoaiMaItemStateChanged(evt);
            }
        });
        cbbLoaiMa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbLoaiMaMouseClicked(evt);
            }
        });
        cbbLoaiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLoaiMaActionPerformed(evt);
            }
        });
        cbbLoaiMa.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbbLoaiMaPropertyChange(evt);
            }
        });

        txtMaVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaVoucherActionPerformed(evt);
            }
        });

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Tên", "Chọn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSanPham);

        txtHangSp.setText("Hãng SP");

        cbbSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Iphone", "SamSung" }));
        cbbSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbSanPhamMouseClicked(evt);
            }
        });
        cbbSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSanPhamActionPerformed(evt);
            }
        });

        jLabel12.setText("Tìm Kiếm");

        txtFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFindKeyPressed(evt);
            }
        });

        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHangSp, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbSanPham, 0, 199, Short.MAX_VALUE)
                    .addComponent(txtFind))
                .addGap(35, 35, 35)
                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHangSp)
                    .addComponent(cbbSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );

        btnadd.setText("Thêm");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbLoaiMa, 0, 193, Short.MAX_VALUE)
                            .addComponent(txtTenMa)
                            .addComponent(txtMaVoucher)
                            .addComponent(txtMucGiamGia)
                            .addComponent(ccNgayBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ccNgayKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnadd)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbbLoaiMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTenMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtMaVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(ccNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(ccNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtMucGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadd))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 136, Short.MAX_VALUE))
        );

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

    private void txtMaVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaVoucherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaVoucherActionPerformed

    private void cbbLoaiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLoaiMaActionPerformed
        // Lấy giá trị được chọn trong JComb


    }//GEN-LAST:event_cbbLoaiMaActionPerformed

    private void cbbLoaiMaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbLoaiMaItemStateChanged
        // TODO add your handling code here:
        int i = cbbLoaiMa.getSelectedIndex();
        // Kiểm tra giá trị được chọn và hiển thị/ẩn bảng tương ứng
        if (i == 1) {
            // Hiển thị bảng
            loadTableSanPham();
            jPanel2.setVisible(true);
        } else {
            jPanel2.setVisible(false); // Ẩn bảng
        }

    }//GEN-LAST:event_cbbLoaiMaItemStateChanged

    private void cbbLoaiMaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbbLoaiMaPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_cbbLoaiMaPropertyChange

    private void tblGiamGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGiamGiaMouseClicked
        int row = this.tblGiamGia.getSelectedRow();
        if (row < 0) {
            return;
        }
        String loaiMa = this.tblGiamGia.getValueAt(row, 0).toString();
        String tenMa = this.tblGiamGia.getValueAt(row, 1).toString();
        String maVoucher = this.tblGiamGia.getValueAt(row, 2).toString();
        String giamGia = this.tblGiamGia.getValueAt(row, 3).toString();
        String ngayBD = this.tblGiamGia.getValueAt(row, 5).toString();
        String ngayKT = this.tblGiamGia.getValueAt(row, 6).toString();

        this.cbbLoaiMa.setSelectedItem(loaiMa);
        this.txtTenMa.setText(tenMa);
        this.txtMaVoucher.setText(maVoucher);
        this.txtMucGiamGia.setText(giamGia);


    }//GEN-LAST:event_tblGiamGiaMouseClicked

    private void cbbSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSanPhamActionPerformed
        // TODO add your handling code here:
        //lấy 1 Object được chọn từ combobox
        //có thể điền và lấy 1 Object từ combobox
        loadTableSanPham();

    }//GEN-LAST:event_cbbSanPhamActionPerformed

    private void txtFindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindKeyPressed
//        // TODO add your handling code here:
//        String hangsp = txtFind.getText();
//        //kết nối nội dung bảng (model) với thùng chứa bảng
//        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
//        model.setRowCount(0);   //đưa số dòng bảng về 0 (xóa bảng)
//        try {
//            
//            //tìm người học theo keywork
//            //nếu ko có keywork thì sẽ là tất cả người họ
//
//            List<SanPham_VM> list = sanPhamService.getSanPhambyTen(hangsp);
//
//            //đưa list tìm được lên bảng
//            for (SanPham_VM km : list) {
//                Object[] row = {
//                    km.getId(),
//                    km.getTen(),};
//                model.addRow(row);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_txtFindKeyPressed
    public void settrang() {
        txtMaVoucher.setText("");
        txtTenMa.setText("");
    }
   
    public void insert() {

        String cbo = cbbLoaiMa.getSelectedItem().toString();
        if (cbo.equals("Giảm Giá Toàn Shop")) {
            List<SanPham_VM> listSanPham = sanPhamService.getAllSanPhams();
            DotKhuyenMai_VM dotKhuyenMai = new DotKhuyenMai_VM();
            dotKhuyenMai.setTenKM(txtTenMa.getText());
            String selectedOption = (String) cbbLoaiMa.getSelectedItem();
            dotKhuyenMai.setLoaiMa(selectedOption);
            dotKhuyenMai.setMaVoucher(txtMaVoucher.getText());
            dotKhuyenMai.setGiaTri(Integer.parseInt(txtMucGiamGia.getText()));
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String dateTime = (String) formatter.format(ccNgayBatDau.getDate());
            String dateTime1 = (String) formatter.format(ccNgayKetThuc.getDate());
            dotKhuyenMai.setNgaybatDau(java.sql.Date.valueOf(dateTime));
            dotKhuyenMai.setNgayKetThuc(java.sql.Date.valueOf(dateTime1));

            System.out.println(dateTime1);
            dotKhuyenMaiService.add(dotKhuyenMai);
            loadTableKhuyenMai();
        } else {
            DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
                        DefaultTableModel modelGiamGia = (DefaultTableModel) tblGiamGia.getModel();
            List<SanPham_VM> listSanPham = sanPhamService.getAllSanPhams();
            DotKhuyenMai_VM dotKhuyenMai = new DotKhuyenMai_VM();
            dotKhuyenMai.setTenKM(txtTenMa.getText());
            String selectedOption = (String) cbbLoaiMa.getSelectedItem();
            dotKhuyenMai.setLoaiMa(selectedOption);
            dotKhuyenMai.setMaVoucher(txtMaVoucher.getText());
            dotKhuyenMai.setGiaTri(Integer.parseInt(txtMucGiamGia.getText()));
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String dateTime = (String) formatter.format(ccNgayBatDau.getDate());
            String dateTime1 = (String) formatter.format(ccNgayKetThuc.getDate());
            dotKhuyenMai.setNgaybatDau(java.sql.Date.valueOf(dateTime));
            dotKhuyenMai.setNgayKetThuc(java.sql.Date.valueOf(dateTime1));

            System.out.println(dateTime1);
            dotKhuyenMaiService.add(dotKhuyenMai);
            loadTableKhuyenMai();
            List<DotKhuyenMai_VM> list = dotKhuyenMaiService.getAllDotKhuyenMais();
            String id = list.get(0).getIdDKM();
            
            for(int  i = 0; i < model.getRowCount(); i++) {
                String x = model.getValueAt(i, 2).toString();
                if (x.equalsIgnoreCase("true")){
                    SanPhamKM_VM km = new SanPhamKM_VM();
                    SanPham_VM sp = new SanPham_VM();
                    DotKhuyenMai_VM dkm = new DotKhuyenMai_VM();
                    dkm.setIdDKM(id);
                    sp.setIdSP(model.getValueAt(i, 0).toString());
                    km.setSanPham(sp);
                     km.setDotKhuyenMai(dkm);
                    sanPhamKMService.add(km);
                }
            }

        }
    }
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:

        insert();
        loadTableKhuyenMai();
//        if (utilityHelper.checkDate(txtNgayBatDau) && utilityHelper.checkDate(txtNgayKetThuc)) {
//            if (utilityHelper.checkNullText(txtTenMa)) {
//                 if (utilityHelper.checkNullText(txtMucGiamGia)) {
//                  
//                 }
//            }
//        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void cbbLoaiMaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbLoaiMaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbLoaiMaMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
         
        // TODO add your handling code here:
        String hangsp = txtFind.getText();
        //kết nối nội dung bảng (model) với thùng chứa bảng
        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);   //đưa số dòng bảng về 0 (xóa bảng)
        try {
            
            //tìm người học theo keywork
            //nếu ko có keywork thì sẽ là tất cả người họ

            List<SanPham_VM> list = sanPhamService.getSanPhambyTen(hangsp);

            //đưa list tìm được lên bảng
            for (SanPham_VM km : list) {
                Object[] row = {
                    km.getIdSP(),
                    km.getTenSP(),};
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void cbbSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbSanPhamMouseClicked
        String selectdProduct = cbbSanPham.getSelectedItem().toString();
        if (selectdProduct.equals("Iphone")) {
            
        }
    }//GEN-LAST:event_cbbSanPhamMouseClicked

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
            java.util.logging.Logger.getLogger(DotKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DotKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DotKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DotKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DotKhuyenMai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnadd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbLoaiMa;
    private javax.swing.JComboBox<String> cbbSanPham;
    private com.toedter.calendar.JDateChooser ccNgayBatDau;
    private com.toedter.calendar.JDateChooser ccNgayKetThuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblGiamGia;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtFind;
    private javax.swing.JLabel txtHangSp;
    private javax.swing.JTextField txtMaVoucher;
    private javax.swing.JTextField txtMucGiamGia;
    private javax.swing.JTextField txtTenMa;
    // End of variables declaration//GEN-END:variables
}
