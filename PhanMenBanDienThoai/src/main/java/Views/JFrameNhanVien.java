package Views;

import Services.impl.NhanVienService;
import ViewModels.NhanVien_VM;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class JFrameNhanVien extends javax.swing.JFrame {

    private NhanVienService service;
    private NhanVien_VM nhanVien_VM;

    public void setNhanVien_VM(NhanVien_VM nhanVien_VM) {
        this.nhanVien_VM = nhanVien_VM;
    }

    public NhanVien_VM getNhanVien_VM() {
        return nhanVien_VM;
    }
    
    public JFrameNhanVien() {
        initComponents();
        this.service = new NhanVienService();
//        setLocationRelativeTo(null);
        this.loadTable();
        this.loadTable2();
    }

    private void loadTable() {

        DefaultTableModel dtm = (DefaultTableModel) this.tblbang.getModel();
        dtm.setRowCount(0);
        List<NhanVien_VM> list = this.service.getAllNhanVien();
        for (NhanVien_VM x : list) {
            dtm.addRow(new Object[]{
                x.getIDNV(),
                x.getMANV(),
                x.getHoVaTen(),
                x.getGioiTinh() == 1 ? "Nam" : "Nữ",
                x.getNgaySinh(),
                x.getDiaChi(),
                x.getSdt(),
                x.getChucVu() == 1 ? "Nhân Viên" : "Quản Lý",
                x.getMatKhau(),
                x.getTrangThai() == 1 ? "Nghỉ" : "Làm"

            });

        }
    }

    private void loadTable2() {

        DefaultTableModel dtm = (DefaultTableModel) this.tblbang1.getModel();
        dtm.setRowCount(0);
        List<NhanVien_VM> list = this.service.getAllNhanVienNghi();
        for (NhanVien_VM x : list) {
            dtm.addRow(new Object[]{
                x.getIDNV(),
                x.getMANV(),
                x.getHoVaTen(),
                x.getGioiTinh() == 1 ? "Nam" : "Nữ",
                x.getNgaySinh(),
                x.getDiaChi(),
                x.getSdt(),
                x.getChucVu() == 1 ? "Nhân Viên" : "Quản Lý",
                x.getMatKhau(),
                x.getTrangThai() == 1 ? "Nghỉ" : "Làm"

            });

        }
    }

    private NhanVien_VM data() {

        String id = txtId.getText();
        String ma = txtMa.getText();
        String ht = txtHt.getText();
        int gt = rdoNam.isSelected() ? 1 : 0;
        String NS = txtNs.getText();
        String dc = txtDc.getText();

        String sdt = this.txtSdt.getText();
        int CV = rdoNV.isSelected() ? 1 : 0;
        String MK = txtMK.getText();

        NhanVien_VM nv = new NhanVien_VM(id, ma, ht, gt,
                NS, dc, sdt, CV, MK, 0);

        if (this.checksdt(sdt) == false || !(sdt.trim().length() == 10)) {
            JOptionPane.showMessageDialog(this, " Sdt không hợp lệ !");
            return null;
        }

        return nv;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblbang = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtHt = new javax.swing.JTextField();
        txtNs = new javax.swing.JTextField();
        txtDc = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        rdoNV = new javax.swing.JRadioButton();
        RdoQL = new javax.swing.JRadioButton();
        txtTK = new javax.swing.JTextField();
        txtId = new javax.swing.JLabel();
        btnTK = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtMK = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblbang1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Quan Ly Nhan Vien");

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnThem.setText("Insert");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jButton1.setText("Nghỉ Việc");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSua.setText("Update");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnThem)
                .addGap(18, 18, 18)
                .addComponent(btnSua)
                .addGap(18, 18, 18)
                .addComponent(btnClear)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        tblbang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDNV", "MANV", "Ho va ten", "Gioi Tinh", "Ngay sinh", "Dia chi", "Sdt", "Chuc vu", "Mat khau", "Trang thai"
            }
        ));
        tblbang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblbang);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("IDNV");

        jLabel3.setText("MANV");

        jLabel4.setText("Ho va ten");

        jLabel5.setText("Gioi tinh");

        jLabel6.setText("Ngay sinh");

        jLabel7.setText("Dia chi");

        jLabel8.setText("Sdt");

        jLabel9.setText("Chuc vu");

        txtDc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDcActionPerformed(evt);
            }
        });

        txtSdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSdtActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");
        rdoNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNamActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nu");

        buttonGroup2.add(rdoNV);
        rdoNV.setText("Nhan vien");

        buttonGroup2.add(RdoQL);
        RdoQL.setText("Quan ly");

        txtId.setText("0");

        btnTK.setText("Search");
        btnTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKActionPerformed(evt);
            }
        });

        jLabel12.setText("Mat khau ");

        txtMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSdt)
                            .addComponent(txtDc)
                            .addComponent(txtNs)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rdoNV, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(RdoQL, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 533, Short.MAX_VALUE))
                            .addComponent(txtMK)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnTK))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMa, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtHt)
                            .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTK, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(85, 85, 85))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addContainerGap(863, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTK, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtId))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtHt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdoNV)
                        .addComponent(RdoQL)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel13.setText("Nhân Viên Đi Làm");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 78, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(415, 415, 415))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(440, 440, 440)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(462, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(390, 390, 390)
                    .addComponent(jLabel14)
                    .addContainerGap(318, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Quản Lý Nhân Viên", jPanel1);

        tblbang1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDNV", "MANV", "Ho va ten", "Gioi Tinh", "Ngay sinh", "Dia chi", "Sdt", "Chuc vu", "Mat khau", "Trang thai"
            }
        ));
        tblbang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbang1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblbang1);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("Quan Ly Nhan Vien");

        jButton2.setText("Hoàn Lại");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 479, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(415, 415, 415))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addContainerGap())))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addGap(35, 35, 35)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nhân Viên Đã Nghỉ Làm", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKActionPerformed
        // TODO add your handling code here:
        String tenn = txtTK.getText().trim();
        if (tenn.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên cần tìm");
            return;
        }
        DefaultTableModel dtm = (DefaultTableModel) tblbang.getModel();
        dtm.setRowCount(0);
        int count = 0;
        for (NhanVien_VM x : service.getAllNhanVien()) {
            if (x.getMANV().contains(tenn)) {
                Object[] obj = {
                    x.getIDNV(),
                    x.getMANV(),
                    x.getHoVaTen(),
                    x.getGioiTinh() == 1 ? "Nam" : "Nữ",
                    x.getNgaySinh(),
                    x.getDiaChi(),
                    x.getSdt(),
                    x.getChucVu() == 1 ? "Nhân Viên" : "Quản Lý",
                    x.getMatKhau(),
                };
                dtm.addRow(obj);
                count = 1;
            }
        }
        if (count == 0) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy");
        }
    }//GEN-LAST:event_btnTKActionPerformed

    private void rdoNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNamActionPerformed

    private void txtSdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSdtActionPerformed

    private void txtDcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDcActionPerformed

    private void tblbangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbangMouseClicked
        int row = this.tblbang.getSelectedRow();

        if (row == -1) {
            return;
        }

        txtId.setText(tblbang.getValueAt(row, 0).toString());
        txtMa.setText(tblbang.getValueAt(row, 1).toString());
        txtHt.setText(tblbang.getValueAt(row, 2).toString());
        String gt = tblbang.getValueAt(row, 3).toString();

        if (gt.equalsIgnoreCase("Nam")) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        txtNs.setText(tblbang.getValueAt(row, 4).toString());
        txtDc.setText(tblbang.getValueAt(row, 5).toString());
        txtSdt.setText(tblbang.getValueAt(row, 6).toString());
        String cv = tblbang.getValueAt(row, 7).toString();
        if (cv.equalsIgnoreCase("Nhân Viên")) {
            rdoNV.setSelected(true);
        } else {
            RdoQL.setSelected(true);
        }
        txtMK.setText(tblbang.getValueAt(row, 8).toString());
        String trangThai = tblbang.getValueAt(row, 9).toString();


    }//GEN-LAST:event_tblbangMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (checkForm()) {
            NhanVien_VM nv = this.data();

            if (service.Update(nv) != null) {
                JOptionPane.showMessageDialog(this, "Sửa thành công !");
                this.loadTable();
                this.loadTable2();
                this.clear();
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại !");
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (checkForm()) {
            NhanVien_VM nv = this.data();

            if (service.Add(nv) != null) {
                JOptionPane.showMessageDialog(this, "Thêm thành công !");
                this.loadTable();
                this.clear();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại !");
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblbang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbang1MouseClicked
        int row = this.tblbang1.getSelectedRow();

        if (row == -1) {
            return;
        }

        String id = tblbang1.getValueAt(row, 0).toString();
        String ma = tblbang1.getValueAt(row, 1).toString();
        String hoVaTen = tblbang1.getValueAt(row, 2).toString();
        int gt = tblbang1.getValueAt(row, 3) == "Nam" ? 0:1;
        String ngaySinh = tblbang1.getValueAt(row, 4).toString();
        String diaChi = tblbang1.getValueAt(row, 5).toString();
        String sDT = tblbang1.getValueAt(row, 6).toString();
        int cv = tblbang1.getValueAt(row, 7).toString() == "NhanVien" ? 0:1;
        String passWord = tblbang1.getValueAt(row, 8).toString();
        String trangThai = tblbang1.getValueAt(row, 9).toString();

        this.setNhanVien_VM(new NhanVien_VM(id, ma, hoVaTen,
                gt, ngaySinh, diaChi, sDT, cv,
                passWord, 1));
    }//GEN-LAST:event_tblbang1MouseClicked

    private void txtMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMKActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        this.clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = this.tblbang.getSelectedRow();
        if (row < 0) {
            return;
        }
        NhanVien_VM nhanVien_VM = this.data();
        if (nhanVien_VM == null) {
            return;
        }
        if (service.nghiViec(nhanVien_VM) != null) {
            JOptionPane.showMessageDialog(this, " thành công !");
            this.loadTable();
            this.loadTable2();
            this.clear();
        } else {
            JOptionPane.showMessageDialog(this, " thất bại !");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int row = this.tblbang1.getSelectedRow();
        if (row < 0) {
            return;
        }
        NhanVien_VM nhanVien_VM = this.getNhanVien_VM();
        if (nhanVien_VM == null) {
            return;
        }
        if (service.hoanLai(nhanVien_VM) != null) {
            JOptionPane.showMessageDialog(this, " thành công !");
            this.loadTable();
            this.loadTable2();
            this.clear();
        } else {
            JOptionPane.showMessageDialog(this, " thất bại !");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void clear() {

        this.txtId.setText("");
        this.txtMa.setText("");
        this.txtHt.setText("");
        this.rdoNam.setSelected(true);
        this.txtNs.setText("");
        this.txtDc.setText("");
        this.txtSdt.setText("");
        this.rdoNV.setSelected(true);
        this.txtMK.setText("");

    }

    private boolean checksdt(String n) {
        String so = n.trim();
        String regex = "^0{1}[0-9]+";
        return so.matches(regex);
    }

    public boolean checkForm() {
        if (txtMa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống mã");
            return false;
        }
        if (txtHt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống họ tên");
            return false;
        }

        if (txtNs.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống ngày sinh");
            return false;
        }
        if (txtDc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống địa chỉ");
            return false;
        }

        if (txtSdt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống sdt");
            return false;
        }

        return true;

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RdoQL;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTK;
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdoNV;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblbang;
    private javax.swing.JTable tblbang1;
    private javax.swing.JTextField txtDc;
    private javax.swing.JTextField txtHt;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtMK;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNs;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTK;
    // End of variables declaration//GEN-END:variables
}
