/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import Services.impl.CPUServive;
import Services.impl.ChiTietSPServive;
import Services.impl.DongSPServive;
import Services.impl.HangServive;
import Services.impl.HeDieuHanhServive;
import Services.impl.ImeiServive;
import Services.impl.ManHinhServive;
import Services.impl.MauSacServive;
import Services.impl.MyComBoBox;
import Services.impl.PinServive;
import Services.impl.RamServive;
import Services.impl.RomServive;
import Services.impl.SanPhamServive;
import ViewModels.CPU_VM;
import ViewModels.ChiTietSP_VM;
import ViewModels.DongSP_VM;
import ViewModels.Hang_VM;
import ViewModels.HeDieuHanh_VM;
import ViewModels.ImageRenderer;
import ViewModels.Imei_VM;
import ViewModels.MauSac_VM;
import Viewmodels.ManHinh_VM;
import Viewmodels.Pin_VM;
import Viewmodels.Ram_VM;
import Viewmodels.Rom_VM;
import Viewmodels.SanPham_VM;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class FrameQuanLySanPham extends javax.swing.JPanel {

  private File file;
    private int countClickOnTable = 0;
    private ChiTietSPServive chiTietSPServive = new ChiTietSPServive();
    private MyComBoBox myComBoBox;
    private CPUServive cPUServive = new CPUServive();
    private RamServive ramServive = new RamServive();
    private DongSPServive dongSPServive = new DongSPServive();
    private HangServive hangServive = new HangServive();
    private HeDieuHanhServive heDieuHanhServive = new HeDieuHanhServive();
    private ManHinhServive manHinhServive = new ManHinhServive();
    private MauSacServive mauSacServive = new MauSacServive();
    private PinServive pinServive = new PinServive();
    private RomServive romServive = new RomServive();
    private SanPhamServive sanPhamServive = new SanPhamServive();
    private ImeiServive imeiServive = new ImeiServive();

    private ChiTietSP_VM chiTietSP_VMff;

    public ChiTietSP_VM getChiTietSP_VM() {
        return chiTietSP_VMff;
    }

    public void setChiTietSP_VM(ChiTietSP_VM chiTietSP_VM) {
        this.chiTietSP_VMff = chiTietSP_VM;
    }
    
    private ManHinhChinh manHinhChinh;
    
    public FrameQuanLySanPham(ManHinhChinh manHinhChinh) {
        initComponents();
        this.manHinhChinh = manHinhChinh;
        loadComBoBoxCPU();
        loadComBoBoxRam();
        loadComBoBoxdong();
        loadComBoBoxhang();
        loadComBoBoxhdh();
        loadComBoBoxMH();
        loadComBoBoxMS();
        loadComBoBoxRom();
        loadComBoBoxPin();
        loadComBoBoxSP();
        loadTable();
        loadTableDeleted();
    }

private void loadTable() {
        DecimalFormat decimalFormat = new DecimalFormat("###,###,### VND");
        DefaultTableModel dtm = (DefaultTableModel) this.tblSanPhamCT.getModel();
        dtm.setRowCount(0);
        List<ChiTietSP_VM> list = this.chiTietSPServive.getAllChiTietSPs();
        for (ChiTietSP_VM chiTietSP_VM : list) {
            Object[] row = {
                chiTietSP_VM.getStt(),
                new ImageIcon(chiTietSP_VM.getHinhAnh()),
                chiTietSP_VM.getMaSoSP(),
                chiTietSP_VM.getSanPham().getTenSP() + " " + chiTietSP_VM.getMauSac().getTenMS(),
                chiTietSP_VM.getLoai() == 0 ? "Mới" : "Cũ",
                chiTietSP_VM.getRam().getDungLuongRam(),
                chiTietSP_VM.getRom().getDungLuongRom(),
                chiTietSP_VM.getSoLuong(),
                decimalFormat.format(chiTietSP_VM.getGiaBan()),};
            dtm.addRow(row);
            this.tblSanPhamCT.getColumnModel().getColumn(1).setCellRenderer(new ImageRenderer());
        }

    }

    private void loadTableDeleted() {
        DecimalFormat decimalFormat = new DecimalFormat("###,###,### VND");
        DefaultTableModel dtm = (DefaultTableModel) this.tblSanPhamCTNB.getModel();
        dtm.setRowCount(0);
        List<ChiTietSP_VM> list = this.chiTietSPServive.getAllDeleteChiTietSPs();
        for (ChiTietSP_VM chiTietSP_VM : list) {
            Object[] row = {
                chiTietSP_VM.getStt(),
                new ImageIcon(chiTietSP_VM.getHinhAnh()),
                chiTietSP_VM.getMaSoSP(),
                chiTietSP_VM.getSanPham().getTenSP() + " " + chiTietSP_VM.getMauSac().getTenMS(),
                chiTietSP_VM.getLoai() == 0 ? "Mới" : "Cũ",
                chiTietSP_VM.getRam().getDungLuongRam(),
                chiTietSP_VM.getRom().getDungLuongRom(),
                chiTietSP_VM.getSoLuong(),
                decimalFormat.format(chiTietSP_VM.getGiaBan()),};
            dtm.addRow(row);
            this.tblSanPhamCTNB.getColumnModel().getColumn(1).setCellRenderer(new ImageRenderer());
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPhamCT = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        anh = new javax.swing.JLabel();
        bccTenSP = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtGiaNhap = new javax.swing.JTextField();
        txtGiaBan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bccImei = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MaSSP = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JLabel();
        cu = new javax.swing.JRadioButton();
        moi = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        Rom = new javax.swing.JComboBox<>();
        ram = new javax.swing.JComboBox<>();
        dong = new javax.swing.JComboBox<>();
        hang = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cpucbb = new javax.swing.JComboBox<>();
        Pin = new javax.swing.JComboBox<>();
        MauSac = new javax.swing.JComboBox<>();
        manHinh = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        hdh = new javax.swing.JComboBox<>();
        jButton21 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPhamCTNB = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));
        jPanel1.setRequestFocusEnabled(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 600));

        tblSanPhamCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Hình Ảnh", "Mã SP", "Tên", "Loại", "Ram", "Rom", "Số Lượng", "Giá Bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPhamCT.setRowHeight(120);
        tblSanPhamCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamCTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblSanPhamCTMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPhamCT);

        jButton1.setText("Tìm");

        jButton2.setText("ScanQR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        anh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        anh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anhMouseClicked(evt);
            }
        });

        jLabel2.setText("Tên Sản Phẩm:");

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Giá Nhập:");

        jLabel4.setText("Giá Bán:");

        jLabel5.setText("Danh Sách Imei:");

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setText("Số Lượng:");

        jButton5.setText("Thêm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Sửa");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Ngừng bán");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton11.setText("Xóa From");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã Sản Phẩm:");

        MaSSP.setBackground(new java.awt.Color(204, 204, 204));

        txtSoLuong.setBackground(new java.awt.Color(204, 204, 204));

        buttonGroup1.add(cu);
        cu.setText("Cũ");

        buttonGroup1.add(moi);
        moi.setText("Mới");
        moi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(cu)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(bccImei, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(MaSSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(anh, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bccTenSP, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(moi))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addGap(53, 53, 53)
                                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(anh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MaSSP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bccTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bccImei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(11, 11, 11)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(moi)
                        .addComponent(cu)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton11))
                .addGap(35, 35, 35))
        );

        jLabel7.setText("Ram");

        ram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ramActionPerformed(evt);
            }
        });

        dong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dongActionPerformed(evt);
            }
        });

        hang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hangActionPerformed(evt);
            }
        });

        jLabel8.setText("CPU");

        manHinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manHinhActionPerformed(evt);
            }
        });

        jButton8.setText("Thêm mới");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Thêm mới");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Thêm mới");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton15.setText("Thêm mới");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Thêm mới");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("Thêm mới");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("Thêm mới");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("Thêm mới");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel9.setText("Rom");

        jLabel10.setText("Dòng");

        jLabel11.setText("Hãng");

        jLabel12.setText("Pin");

        jLabel13.setText("Màu Sắc");

        jLabel14.setText("Màn Hình");

        jLabel16.setText("Hệ Điều Hành");

        jButton21.setText("Thêm mới");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel16)
                                            .addComponent(hdh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ram, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(cpucbb, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(65, 65, 65)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Rom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12)
                                            .addComponent(Pin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(65, 65, 65)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dong, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13)
                                            .addComponent(MauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(157, 157, 157)
                                        .addComponent(jLabel9)
                                        .addGap(160, 160, 160)
                                        .addComponent(jLabel10)))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hang, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(manHinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(manHinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpucbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton16)
                            .addComponent(jButton17)
                            .addComponent(jButton18))))
                .addGap(14, 14, 14)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hdh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sản phẩm", jPanel1);

        tblSanPhamCTNB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Hình Ảnh", "Mã SP", "Tên", "Loại", "Ram", "Rom", "Số Lượng", "Giá Bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPhamCTNB.setRowHeight(120);
        tblSanPhamCTNB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamCTNBMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSanPhamCTNB);

        jButton12.setText("Hoàn Lại");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(899, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton12)
                .addContainerGap(580, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addGap(0, 37, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sản Phẩm Ngừng Kinh Doanh", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
   public void loadComBoBoxCPU() {
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) this.cpucbb.getModel();
        List<CPU_VM> list = this.cPUServive.getAllCpus();
        cpucbb.removeAllItems();
        for (CPU_VM cpu_vm : list) {
            myComBoBox = new MyComBoBox(cpu_vm.getIdCPU(), cpu_vm.getTenCPU());
            dcm.addElement(myComBoBox);
        }
    }

    public void loadComBoBoxRam() {
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) this.ram.getModel();
        List<Ram_VM> list = this.ramServive.getAllRams();
        ram.removeAllItems();
        for (Ram_VM ram_VM : list) {
            myComBoBox = new MyComBoBox(ram_VM.getIdRam(), ram_VM.getDungLuongRam());
            dcm.addElement(myComBoBox);
        }
    }

    public void loadComBoBoxRom() {
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) this.Rom.getModel();
        List<Rom_VM> list = this.romServive.getAllRoms();
        Rom.removeAllItems();
        for (Rom_VM ram_VM : list) {
            myComBoBox = new MyComBoBox(ram_VM.getIdRom(), ram_VM.getDungLuongRom());
            dcm.addElement(myComBoBox);
        }
    }

    public void loadComBoBoxdong() {
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) this.dong.getModel();
        List<DongSP_VM> list = this.dongSPServive.getAlldDongSP();
        dong.removeAllItems();
        for (DongSP_VM dongSP_VM : list) {
            myComBoBox = new MyComBoBox(dongSP_VM.getIdDongSP(), dongSP_VM.getTenDongSP());
            dcm.addElement(myComBoBox);
        }
    }

    public void loadComBoBoxhang() {
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) this.hang.getModel();
        List<Hang_VM> list = this.hangServive.getAllhHangs();
        hang.removeAllItems();
        for (Hang_VM hang_VM : list) {
            myComBoBox = new MyComBoBox(hang_VM.getIdHang(), hang_VM.getTenHang());
            dcm.addElement(myComBoBox);
        }
    }

    public void loadComBoBoxhdh() {
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) this.hdh.getModel();
        List<HeDieuHanh_VM> list = this.heDieuHanhServive.getAllhHeDieuHanhs();
        hdh.removeAllItems();
        for (HeDieuHanh_VM heDieuHanh_VM : list) {
            myComBoBox = new MyComBoBox(heDieuHanh_VM.getIdHDH(), heDieuHanh_VM.getTenHDH());
            dcm.addElement(myComBoBox);
        }
    }

    public void loadComBoBoxMH() {
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) this.manHinh.getModel();
        List<ManHinh_VM> list = this.manHinhServive.getAllmaHinhs();
        manHinh.removeAllItems();
        for (ManHinh_VM manHinh_VM : list) {
            myComBoBox = new MyComBoBox(manHinh_VM.getIdMH(), manHinh_VM.getTenMH());
            dcm.addElement(myComBoBox);
        }
    }

    public void loadComBoBoxMS() {
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) this.MauSac.getModel();
        List<MauSac_VM> list = this.mauSacServive.getAllMauSacs();
        MauSac.removeAllItems();
        for (MauSac_VM mauSac_VM : list) {
            myComBoBox = new MyComBoBox(mauSac_VM.getIdMS(), mauSac_VM.getTenMS());
            dcm.addElement(myComBoBox);
        }
    }

    public void loadComBoBoxPin() {
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) this.Pin.getModel();
        List<Pin_VM> list = this.pinServive.getAllPin();
        Pin.removeAllItems();
        for (Pin_VM pin_VM : list) {
            myComBoBox = new MyComBoBox(pin_VM.getIdPin(), pin_VM.getDungLuongPin());
            dcm.addElement(myComBoBox);
        }
    }

    public void loadComBoBoxSP() {
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) this.bccTenSP.getModel();
        List<SanPham_VM> list = this.sanPhamServive.getAllSanPhams();
        bccTenSP.removeAllItems();
        for (SanPham_VM sanPham_VM : list) {
            myComBoBox = new MyComBoBox(sanPham_VM.getIdSP(), sanPham_VM.getTenSP());
            dcm.addElement(myComBoBox);
        }
    }

    public void loadComBoBoxImei() {
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) this.bccImei.getModel();
        List<Imei_VM> list = this.imeiServive.getAllImeis();
        bccImei.removeAllItems();
        for (Imei_VM imei_VM : list) {
            myComBoBox = new MyComBoBox(imei_VM.getiDImei(), imei_VM.getImei());
            dcm.addElement(myComBoBox);
        }
        int sl = bccImei.getItemCount();
        this.txtSoLuong.setText(Integer.toString(sl));
    }

    public void loadComBoBoxImeiofSP(String idsp) {
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) this.bccImei.getModel();
        List<Imei_VM> list = this.imeiServive.getAllImeisofSP(idsp);
        bccImei.removeAllItems();
        for (Imei_VM imei_VM : list) {
            myComBoBox = new MyComBoBox(imei_VM.getiDImei(), imei_VM.getImei());
            dcm.addElement(myComBoBox);
            int sl = bccImei.getItemCount();
            this.txtSoLuong.setText(Integer.toString(sl));
        }
    }

    private ChiTietSP_VM data() {
        String maSoSP = this.MaSSP.getText();
        myComBoBox = (MyComBoBox) this.ram.getSelectedItem();
        String idRam = myComBoBox.idString();
        myComBoBox = (MyComBoBox) this.Rom.getSelectedItem();
        String idRom = myComBoBox.idString();
        myComBoBox = (MyComBoBox) this.dong.getSelectedItem();
        String idDongSP = myComBoBox.idString();
        myComBoBox = (MyComBoBox) this.hang.getSelectedItem();
        String idHang = myComBoBox.idString();
        myComBoBox = (MyComBoBox) this.manHinh.getSelectedItem();
        String idManHinh = myComBoBox.idString();
        myComBoBox = (MyComBoBox) this.cpucbb.getSelectedItem();
        String idCPU = myComBoBox.idString();
        myComBoBox = (MyComBoBox) this.Pin.getSelectedItem();
        String idPin = myComBoBox.idString();
        myComBoBox = (MyComBoBox) this.MauSac.getSelectedItem();
        String idMauSac = myComBoBox.idString();
        myComBoBox = (MyComBoBox) this.hdh.getSelectedItem();
        String idHDH = myComBoBox.idString();
        myComBoBox = (MyComBoBox) this.bccTenSP.getSelectedItem();
        String idSP = myComBoBox.idString();
        Double giaNhap = Double.parseDouble(this.txtGiaNhap.getText());
        Double giaBan = Double.parseDouble(this.txtGiaBan.getText());
        int soLuong = Integer.parseInt(this.txtSoLuong.getText());
        int loai = 0;
        String idCTSP = null;
        List<ChiTietSP_VM> list = this.chiTietSPServive.getAllChiTietSPs();
        for (ChiTietSP_VM chiTietSP_VM : list) {
            if (chiTietSP_VM.getMaSoSP().equals(maSoSP)) {
                idCTSP = chiTietSP_VM.getiDCTSP();
            }
        }
        String pathAnh = this.file.getAbsolutePath();
        if (this.cu.isSelected()) {
            loai = 1;
        }

        ChiTietSP_VM chiTietSP_VM = new ChiTietSP_VM(loai, maSoSP,
                idCTSP, new SanPham_VM(idSP), new HeDieuHanh_VM(idHDH), new Hang_VM(idHang),
                new DongSP_VM(idDongSP), new CPU_VM(idCPU), new Rom_VM(idRom), new Ram_VM(idRam),
                new MauSac_VM(idMauSac), new ManHinh_VM(idManHinh), new Pin_VM(idPin),
                pathAnh, loai, soLuong, giaNhap, giaBan);

        return chiTietSP_VM;
    }
    private void tblSanPhamCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamCTMouseClicked
        countClickOnTable++;
        int row = this.tblSanPhamCT.getSelectedRow();
        if (row < 0) {
            return;
        }
        ImageIcon anhPath = new ImageIcon(this.tblSanPhamCT.getValueAt(row, 1).toString());
        String maSSP = this.tblSanPhamCT.getValueAt(row, 2).toString();
        String soLuong = this.tblSanPhamCT.getValueAt(row, 7).toString();
        String loai = this.tblSanPhamCT.getValueAt(row, 4).toString();
        if (loai.equals("Cũ")) {
            this.cu.setSelected(true);
        } else {
            this.moi.setSelected(true);
        }
        String id = null;
        SanPham_VM tenSP = null;
        Ram_VM ram_VM = null;
        Rom_VM rom = null;
        MauSac_VM mauSac = null;
        ManHinh_VM manHinh = null;
        DongSP_VM dongSP = null;
        Pin_VM Pin = null;
        CPU_VM cpu = null;
        HeDieuHanh_VM hdh = null;
        Hang_VM hang = null;
        double giaNN = 0;
        double giaBan = 0;
        List<ChiTietSP_VM> list = this.chiTietSPServive.getAllChiTietSPs();
        for (ChiTietSP_VM chiTietSP_VM : list) {
            if (chiTietSP_VM.getMaSoSP().equals(maSSP)) {
                id = chiTietSP_VM.getiDCTSP();
                tenSP = new SanPham_VM(0, chiTietSP_VM.getSanPham().getIdSP(),
                    null, chiTietSP_VM.getSanPham().getTenSP());
                ram_VM = new Ram_VM(0, chiTietSP_VM.getRam().getIdRam(),
                    null, chiTietSP_VM.getRam().getDungLuongRam());
                rom = new Rom_VM(0, chiTietSP_VM.getRom().getIdRom(), null,
                    chiTietSP_VM.getRom().getDungLuongRom());
                mauSac = new MauSac_VM(0, chiTietSP_VM.getMauSac().getIdMS(),
                    null, chiTietSP_VM.getMauSac().getTenMS());
                manHinh = new ManHinh_VM(0, chiTietSP_VM.getManHinh().getIdMH(),
                    null, chiTietSP_VM.getManHinh().getTenMH());
                dongSP = new DongSP_VM(0, chiTietSP_VM.getDongSP().getIdDongSP(),
                    null, chiTietSP_VM.getDongSP().getTenDongSP());
                Pin = new Pin_VM(0, chiTietSP_VM.getPin().getIdPin(),
                    null, chiTietSP_VM.getPin().getDungLuongPin());
                cpu = new CPU_VM(0, chiTietSP_VM.getCpu().getIdCPU(),
                    null, chiTietSP_VM.getCpu().getTenCPU());
                hdh = new HeDieuHanh_VM(0, chiTietSP_VM.getHeDieuHanh()
                    .getIdHDH(), null, chiTietSP_VM.getHeDieuHanh().getTenHDH());
                hang = new Hang_VM(0, chiTietSP_VM.getHang().getIdHang(),
                    null, chiTietSP_VM.getHang().getTenHang());
                giaNN = chiTietSP_VM.getGiaNhap();
                giaBan = chiTietSP_VM.getGiaBan();

            }
        }
        this.loadComBoBoxImeiofSP(id);
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) this.bccTenSP.getModel();
        dcm.setSelectedItem(new MyComBoBox(tenSP.getIdSP(), tenSP.getTenSP()));
        dcm.setSelectedItem(new MyComBoBox(tenSP.getIdSP(), tenSP.getTenSP()));
        DefaultComboBoxModel dcm1 = (DefaultComboBoxModel) this.ram.getModel();
        dcm1.setSelectedItem(new MyComBoBox(ram_VM.getIdRam(), ram_VM.getDungLuongRam()));
        DefaultComboBoxModel dcm2 = (DefaultComboBoxModel) this.Rom.getModel();
        dcm2.setSelectedItem(new MyComBoBox(rom.getIdRom(), rom.getDungLuongRom()));
        DefaultComboBoxModel dcm3 = (DefaultComboBoxModel) this.dong.getModel();
        dcm3.setSelectedItem(new MyComBoBox(dongSP.getIdDongSP(), dongSP.getTenDongSP()));
        DefaultComboBoxModel dcm4 = (DefaultComboBoxModel) this.hang.getModel();
        dcm4.setSelectedItem(new MyComBoBox(hang.getIdHang(), hang.getTenHang()));
        DefaultComboBoxModel dcm5 = (DefaultComboBoxModel) this.cpucbb.getModel();
        dcm5.setSelectedItem(new MyComBoBox(cpu.getIdCPU(), cpu.getTenCPU()));
        DefaultComboBoxModel dcm6 = (DefaultComboBoxModel) this.Pin.getModel();
        dcm6.setSelectedItem(new MyComBoBox(Pin.getIdPin(), Pin.getDungLuongPin()));
        DefaultComboBoxModel dcm7 = (DefaultComboBoxModel) this.MauSac.getModel();
        dcm7.setSelectedItem(new MyComBoBox(mauSac.getIdMS(), mauSac.getTenMS()));
        DefaultComboBoxModel dcm8 = (DefaultComboBoxModel) this.manHinh.getModel();
        dcm8.setSelectedItem(new MyComBoBox(manHinh.getIdMH(), manHinh.getTenMH()));
        DefaultComboBoxModel dcm9 = (DefaultComboBoxModel) this.hdh.getModel();
        dcm9.setSelectedItem(new MyComBoBox(hdh.getIdHDH(), hdh.getTenHDH()));
        file = new File(this.tblSanPhamCT.getValueAt(row, 1).toString());
        this.anh.setIcon(anhPath);
        this.txtGiaNhap.setText(Double.toString(giaNN));
        this.txtGiaBan.setText(Double.toString(giaBan));
//        this.txtSoLuong.setText(soLuong);
        this.MaSSP.setText(maSSP);
    }//GEN-LAST:event_tblSanPhamCTMouseClicked

    private void tblSanPhamCTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamCTMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSanPhamCTMouseEntered

    private void anhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anhMouseClicked
        JFileChooser fChooser = new JFileChooser();
        int chosed = fChooser.showOpenDialog(this.getRootPane());
        if (chosed != JFileChooser.APPROVE_OPTION) {
            return;
        }

        file = fChooser.getSelectedFile();
        if (!file.exists()) {
            JOptionPane.showMessageDialog(this, "Ảnh không tồn tại");
            return;
        }

        ImageIcon icon = new ImageIcon(file.getAbsolutePath());
        this.anh.setIcon(icon);
    }//GEN-LAST:event_anhMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FrameSanPham sanPham = new FrameSanPham(this);
        sanPham.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        sanPham.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        FrameImei imei = new FrameImei(this);
        imei.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        imei.setLocationRelativeTo(null);
        imei.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        ChiTietSP_VM chiTietSP_VM = this.data();
        int execute;
        if (chiTietSP_VM == null) {
            return;
        }
        if (countClickOnTable > 0) {
            this.chiTietSPServive.themImei(chiTietSP_VM);
            this.chiTietSPServive.sua(chiTietSP_VM);
            execute = 1;
        } else {
            execute = this.chiTietSPServive.them(chiTietSP_VM);
        }

        if (execute == 1) {
            JOptionPane.showMessageDialog(this, "Thành Công");
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại");
            this.imeiServive.xoaImei();
        }

        loadComBoBoxImei();
        manHinhChinh.loadTbaleSP();
        loadTable();
        clear();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int row = this.tblSanPhamCT.getSelectedRow();
        if (row < 0) {
            return;
        }
        ChiTietSP_VM chiTietSP_VM = this.data();
        if (chiTietSP_VM == null) {
            return;
        }
        int sua = this.chiTietSPServive.sua(chiTietSP_VM);
        if (sua == 1) {
            JOptionPane.showMessageDialog(this, "Thành Công");
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại");
        }

        loadTable();
         manHinhChinh.loadTbaleSP();
        clear();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int row = this.tblSanPhamCT.getSelectedRow();
        if (row < 0) {
            return;
        }
        ChiTietSP_VM chiTietSP_VM = this.data();
        if (chiTietSP_VM == null) {
            return;
        }
        int ngungBan = this.chiTietSPServive.xoaTT(chiTietSP_VM);
        if (ngungBan == 1) {
            JOptionPane.showMessageDialog(this, "Thành Công");
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại");
        }

        loadTable();
        loadTableDeleted();
         manHinhChinh.loadTbaleSP();
        clear();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        clear();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void moiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moiActionPerformed

    private void ramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ramActionPerformed

    }//GEN-LAST:event_ramActionPerformed

    private void dongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dongActionPerformed

    private void hangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hangActionPerformed

    private void manHinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manHinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manHinhActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        FrameRom rom = new FrameRom(this);
        rom.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        rom.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        FrameDongSP cPU = new FrameDongSP(this);
        cPU.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cPU.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        FrameHang hang = new FrameHang(this);
        hang.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        hang.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        FrameRam cPU = new FrameRam(this);
        cPU.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cPU.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        FrameCPU cPU = new FrameCPU(this);
        cPU.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cPU.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        FramePin pin = new FramePin(this);
        pin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pin.setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        FrameMauSac mauSac = new FrameMauSac(this);
        mauSac.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mauSac.setVisible(true);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        FrameManHinh manHinh = new FrameManHinh(this);
        manHinh.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        manHinh.setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        FrameHDH hDH = new FrameHDH(this);
        hDH.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        hDH.setVisible(true);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void tblSanPhamCTNBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamCTNBMouseClicked
        int row = this.tblSanPhamCTNB.getSelectedRow();
        if (row < 0) {
            return;
        }
        String maSSP = this.tblSanPhamCTNB.getValueAt(row, 2).toString();
        String id = null;
        SanPham_VM tenSP = null;
        Ram_VM ram_VM = null;
        Rom_VM rom = null;
        MauSac_VM mauSac = null;
        ManHinh_VM manHinh = null;
        DongSP_VM dongSP = null;
        Pin_VM Pin = null;
        CPU_VM cpu = null;
        HeDieuHanh_VM hdh = null;
        Hang_VM hang = null;
        double giaNN = 0;
        double giaBan = 0;
        int loai = 0;
        int soLuong = 0;
        List<ChiTietSP_VM> list = this.chiTietSPServive.getAllDeleteChiTietSPs();
        for (ChiTietSP_VM chiTietSP_VM : list) {
            if (chiTietSP_VM.getMaSoSP().equals(maSSP)) {
                id = chiTietSP_VM.getiDCTSP();
                tenSP = new SanPham_VM(0, chiTietSP_VM.getSanPham().getIdSP(),
                    null, chiTietSP_VM.getSanPham().getTenSP());
                ram_VM = new Ram_VM(0, chiTietSP_VM.getRam().getIdRam(),
                    null, chiTietSP_VM.getRam().getDungLuongRam());
                rom = new Rom_VM(0, chiTietSP_VM.getRom().getIdRom(), null,
                    chiTietSP_VM.getRom().getDungLuongRom());
                mauSac = new MauSac_VM(0, chiTietSP_VM.getMauSac().getIdMS(),
                    null, chiTietSP_VM.getMauSac().getTenMS());
                manHinh = new ManHinh_VM(0, chiTietSP_VM.getManHinh().getIdMH(),
                    null, chiTietSP_VM.getManHinh().getTenMH());
                dongSP = new DongSP_VM(0, chiTietSP_VM.getDongSP().getIdDongSP(),
                    null, chiTietSP_VM.getDongSP().getTenDongSP());
                Pin = new Pin_VM(0, chiTietSP_VM.getPin().getIdPin(),
                    null, chiTietSP_VM.getPin().getDungLuongPin());
                cpu = new CPU_VM(0, chiTietSP_VM.getCpu().getIdCPU(),
                    null, chiTietSP_VM.getCpu().getTenCPU());
                hdh = new HeDieuHanh_VM(0, chiTietSP_VM.getHeDieuHanh()
                    .getIdHDH(), null, chiTietSP_VM.getHeDieuHanh().getTenHDH());
                hang = new Hang_VM(0, chiTietSP_VM.getHang().getIdHang(),
                    null, chiTietSP_VM.getHang().getTenHang());
                giaNN = chiTietSP_VM.getGiaNhap();
                giaBan = chiTietSP_VM.getGiaBan();
                loai = chiTietSP_VM.getLoai();
                soLuong = chiTietSP_VM.getSoLuong();

            }
        }
        ChiTietSP_VM chiTietSP_VM = new ChiTietSP_VM(0, maSSP, id,
            tenSP, hdh, hang, dongSP,
            cpu, rom, ram_VM, mauSac, manHinh, Pin,
            this.tblSanPhamCT.getValueAt(row, 1).toString(), loai, soLuong, giaBan, giaBan);
        file = new File(this.tblSanPhamCT.getValueAt(row, 1).toString());
        this.setChiTietSP_VM(chiTietSP_VM);
    }//GEN-LAST:event_tblSanPhamCTNBMouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int row = this.tblSanPhamCTNB.getSelectedRow();
        if (row < 0) {
            return;
        }
        ChiTietSP_VM chiTietSP_VM = this.getChiTietSP_VM();
        if (chiTietSP_VM == null) {
            return;
        }
        int sua = this.chiTietSPServive.hoanLai(chiTietSP_VM);
        if (sua == 1) {
            JOptionPane.showMessageDialog(this, "Thành Công");
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại");
        }

        loadTable();
        loadTableDeleted();
         manHinhChinh.loadTbaleSP();
        clear();
    }//GEN-LAST:event_jButton12ActionPerformed
private void clear() {
        this.bccTenSP.setSelectedIndex(0);
        this.hdh.setSelectedIndex(0);
        this.MauSac.setSelectedIndex(0);
        this.cpucbb.setSelectedIndex(0);
        this.hang.setSelectedIndex(0);
        this.dong.setSelectedIndex(0);
        this.Rom.setSelectedIndex(0);
        this.ram.setSelectedIndex(0);
        this.Pin.setSelectedIndex(0);
        this.txtGiaBan.setText("");
        this.txtGiaNhap.setText("");
        this.txtSoLuong.setText("");
        this.anh.setIcon(null);
        this.moi.setSelected(true);
        this.MaSSP.setText("");
        this.bccImei.removeAllItems();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MaSSP;
    private javax.swing.JComboBox<String> MauSac;
    private javax.swing.JComboBox<String> Pin;
    private javax.swing.JComboBox<String> Rom;
    private javax.swing.JLabel anh;
    private javax.swing.JComboBox<String> bccImei;
    private javax.swing.JComboBox<String> bccTenSP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cpucbb;
    private javax.swing.JRadioButton cu;
    private javax.swing.JComboBox<String> dong;
    private javax.swing.JComboBox<String> hang;
    private javax.swing.JComboBox<String> hdh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> manHinh;
    private javax.swing.JRadioButton moi;
    private javax.swing.JComboBox<String> ram;
    private javax.swing.JTable tblSanPhamCT;
    private javax.swing.JTable tblSanPhamCTNB;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtGiaNhap;
    private javax.swing.JLabel txtSoLuong;
    // End of variables declaration//GEN-END:variables
}
