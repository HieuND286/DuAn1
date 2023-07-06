/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Services.impl.ChiTietSPServive;
import Services.impl.HoaDonCTServiec;
import Services.impl.HoaDonService;
import Services.impl.KhachHangService;
import Services.impl.MyComBoBox;
import Services.impl.MyComBoBoxMHC;
import Services.impl.NhanVienService;
import ViewModels.ChiTietSP_VM;
import ViewModels.HoaDon_VM;
import ViewModels.Hoa_Don_CT_VM;
import ViewModels.ImageRenderer;
import ViewModels.KhachHang_VM;
import ViewModels.NhanVien_VM;
import Viewmodels.SanPham_VM;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author admin
 */
public class ManHinhChinh extends javax.swing.JFrame {

    private FrameQuanLySanPham frameQuanLySanPham = new FrameQuanLySanPham(this);
    private FrameQuanLyNhanVien jFrameNhanVien = new FrameQuanLyNhanVien();
    private FrameKhachHang frameKhachHang = new FrameKhachHang(this);
    private FrameDotKhuyenMai frameDotKhuyenMai = new FrameDotKhuyenMai(this);
    private FramePBH pBH = new FramePBH(this);
    private FrameLogin login;
//    private FrameBanHang frameBanHang = new FrameBanHang(this);
    private KhachHangService khachHangService = new KhachHangService();
    private ChiTietSPServive chiTietSPServive = new ChiTietSPServive();
    private FrameDonGiaos donGiaos = new FrameDonGiaos(this);
    private MyComBoBoxMHC myComBoBox;
    private NhanVien_VM nhanVien_VM1;
    private String idHDForHDCT;
    private HoaDonService hoaDonService = new HoaDonService();
    private HoaDonCTServiec hoaDonCTServiec = new HoaDonCTServiec();
    private int count = 0;
    private DecimalFormat decimalFormattt = new DecimalFormat("###,###,### VND");

    private double tongTienHD;

    public void setNhanVien_VM1(NhanVien_VM nhanVien_VM) {
        this.nhanVien_VM1 = nhanVien_VM;
    }

    public NhanVien_VM getNhanVien_VM1() {
        return nhanVien_VM1;
    }

    public ManHinhChinh(FrameLogin login) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.login = login;
        this.setForm(PanelBH);
        Image image = Toolkit.getDefaultToolkit().createImage(
                "F:\\WorkSpace\\PhanMenBanDienThoai\\src\\main\\java\\Img"
                + "\\icons8-iphone-se-100.png");
        this.setIconImage(image);
        this.setTitle("Phần Mền Bán Điện Thoại");
        setLocationRelativeTo(null);
        LocalDate today = LocalDate.now();
        this.anh.setIcon(new ImageIcon(login.getNhanVien_VM().getHinhAnh()));
        loadComBoBoxKH();
        loadTbaleSP();
        loadTbaleHD();
    }

    private ManHinhChinh() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void loadHDCT(String id) {
        DecimalFormat decimalFormat = new DecimalFormat("###,###,### VND");
        DefaultTableModel dtm = (DefaultTableModel) this.tblHDCT.getModel();
        dtm.setRowCount(0);
        List<Hoa_Don_CT_VM> list = this.hoaDonCTServiec.getAllHDCT(id);
        for (Hoa_Don_CT_VM hoa_Don_CT_VM : list) {
            Object[] row = {
                hoa_Don_CT_VM.getStt(),
                new ImageIcon(hoa_Don_CT_VM.getImei_VM().getChiTietSP_VM().getHinhAnh()),
                hoa_Don_CT_VM.getImei_VM().getChiTietSP_VM().getMaSoSP(),
                hoa_Don_CT_VM.getImei_VM().getChiTietSP_VM().getSanPham().getTenSP(),
                hoa_Don_CT_VM.getSoLuong(),
                decimalFormat.format(hoa_Don_CT_VM.getImei_VM().getChiTietSP_VM().getGiaBan()),
                decimalFormat.format(hoa_Don_CT_VM.getSoLuong() * hoa_Don_CT_VM.getImei_VM().getChiTietSP_VM().getGiaBan()),};
            dtm.addRow(row);
            this.tblHDCT.getColumnModel().getColumn(1).setCellRenderer(new ImageRenderer());
        }

    }

    public void loadComBoBoxKH() {
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) this.cbbKH.getModel();
        ArrayList<KhachHang_VM> list = this.khachHangService.getAllKhacHang();
        cbbKH.removeAllItems();
        for (KhachHang_VM khachHang_VM : list) {
            myComBoBox = new MyComBoBoxMHC(khachHang_VM.getId(),
                    khachHang_VM.getHoTen(),
                    khachHang_VM.getSdt());
            dcm.addElement(myComBoBox);
        }
    }

    public void loadTbaleSP() {
        DecimalFormat decimalFormat = new DecimalFormat("###,###,### VND");
        DefaultTableModel dtm = (DefaultTableModel) this.tblSanPhamCT.getModel();
        dtm.setRowCount(0);
        List<ChiTietSP_VM> list = this.chiTietSPServive.getAllChiTietSPs();
        for (ChiTietSP_VM chiTietSP_VM : list) {
            Object[] row = {
                chiTietSP_VM.getStt(),
                new ImageIcon(chiTietSP_VM.getHinhAnh()),
                chiTietSP_VM.getMaSoSP(),
                chiTietSP_VM.getSanPham().getTenSP(),
                chiTietSP_VM.getSoLuong(),
                decimalFormat.format(chiTietSP_VM.getGiaBan())
            };
            dtm.addRow(row);
            this.tblSanPhamCT.getColumnModel().getColumn(1).setCellRenderer(new ImageRenderer());
        }

    }

    public void loadTbaleHD() {
        DecimalFormat decimalFormat = new DecimalFormat("###,###,### VND");
        DefaultTableModel dtm = (DefaultTableModel) this.tblHD.getModel();
        dtm.setRowCount(0);
        List<HoaDon_VM> list = this.hoaDonService.getAllHD();
        for (HoaDon_VM hoaDon_VM : list) {
            Object[] row = {
                hoaDon_VM.getStt(),
                hoaDon_VM.getMa(),
                hoaDon_VM.getNhanVien_VM().getHoVaTen(),
                hoaDon_VM.getKhachHang_VM().getHoTen(),
                hoaDon_VM.getNgayTao(),
                hoaDon_VM.getTinhTrang() == 0 ? "Chưa thanh toán" : "Đã Thanh Toán"
            };
            dtm.addRow(row);
        }

    }

    private void setForm(JComponent com) {
        this.Conten.removeAll();
        this.Conten.setLayout(new BorderLayout());
        this.Conten.add(com);
        this.Conten.validate();
        this.Conten.repaint();
        this.Conten.revalidate();
    }

    private boolean isQuanLy() {
        return login.getNhanVien_VM().
                getChucVu() == 1 ? false : true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        anh = new javax.swing.JLabel();
        banHang = new javax.swing.JLabel();
        sanPham = new javax.swing.JLabel();
        khachHang = new javax.swing.JLabel();
        nhanVien = new javax.swing.JLabel();
        DonGiao = new javax.swing.JLabel();
        PBH = new javax.swing.JLabel();
        DKM = new javax.swing.JLabel();
        thongke = new javax.swing.JLabel();
        hoaDon = new javax.swing.JLabel();
        Conten = new javax.swing.JPanel();
        PanelBH = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbbKH = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txthovatenNV = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tch = new javax.swing.JRadioButton();
        ship = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtGC = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtphiship = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtkd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtTienDH = new javax.swing.JLabel();
        txtttsp = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        NgayTao1 = new javax.swing.JLabel();
        txtmaHD = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        thuorthieu1 = new javax.swing.JLabel();
        thuaorthieu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHD = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHDCT = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPhamCT = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        anh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        banHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        banHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banHang.setText("Bán Hàng");
        banHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                banHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                banHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                banHangMouseExited(evt);
            }
        });

        sanPham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sanPham.setText("Sản Phẩm");
        sanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sanPhamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sanPhamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sanPhamMouseExited(evt);
            }
        });

        khachHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        khachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        khachHang.setText("Khách Hàng");
        khachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khachHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                khachHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                khachHangMouseExited(evt);
            }
        });

        nhanVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nhanVien.setText("Nhân Viên");
        nhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhanVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nhanVienMouseExited(evt);
            }
        });

        DonGiao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DonGiao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DonGiao.setText("Đơn Giao");
        DonGiao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DonGiaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DonGiaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DonGiaoMouseExited(evt);
            }
        });

        PBH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PBH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PBH.setText("Phiếu Bảo Hành");
        PBH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PBHMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PBHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PBHMouseExited(evt);
            }
        });

        DKM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DKM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DKM.setText("Đợt Khuyến Mại");
        DKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DKMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DKMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DKMMouseExited(evt);
            }
        });

        thongke.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        thongke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thongke.setText("Thống Kê");
        thongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                thongkeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                thongkeMouseExited(evt);
            }
        });

        hoaDon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hoaDon.setText("Hóa Đơn");
        hoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hoaDonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hoaDonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(anh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(banHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(khachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DonGiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PBH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(thongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(hoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(anh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(banHang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(khachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DonGiao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PBH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DKM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        Conten.setPreferredSize(new java.awt.Dimension(1004, 705));
        Conten.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelBH.setPreferredSize(new java.awt.Dimension(1004, 681));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Khách Hàng :");

        cbbKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbKHActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Nhân Viên :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Nhận Hàng:");

        buttonGroup1.add(tch);
        tch.setText("Tại cửa hàng");

        buttonGroup1.add(ship);
        ship.setText("ship");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Ghi Chú :");

        txtGC.setColumns(20);
        txtGC.setRows(5);
        jScrollPane4.setViewportView(txtGC);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Ngày Tạo :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Khách Đưa :");

        txtkd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtkdMouseClicked(evt);
            }
        });
        txtkd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtkdKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Tổng tiền sản phẩm:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Phí Ship :");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Tổng Tiền Đơn Hàng :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Mã Hóa Đơn :");

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jButton5.setText("Làm Mới");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);

        jButton2.setText("Tạo Hóa Đơn");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton4.setText("Thanh Toán");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);

        thuorthieu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        thuorthieu1.setText("Còn Thiều :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtmaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtphiship, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTienDH, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(thuaorthieu, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(cbbKH, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txthovatenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtNgayTao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(tch)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ship))
                                            .addComponent(txtkd, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtttsp, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(thuorthieu1)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(NgayTao1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addGap(43, 43, 43)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtmaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txthovatenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tch)
                        .addComponent(ship)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtkd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtttsp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtphiship, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTienDH, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(thuorthieu1)
                    .addComponent(thuaorthieu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(394, Short.MAX_VALUE)
                    .addComponent(NgayTao1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(242, 242, 242)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setText("Hóa Đơn");

        tblHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã", "Tên NV", "Khách Hàng", "Ngày Tạo", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHD.setPreferredSize(new java.awt.Dimension(550, 10000));
        tblHD.setRowHeight(30);
        tblHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblHDMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(tblHD);

        tblHDCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Hình ảnh", "Mã", "Tên ", "Số Lương", "Giá", "Tông Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHDCT.setRowHeight(100);
        tblHDCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHDCTMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblHDCT);
        if (tblHDCT.getColumnModel().getColumnCount() > 0) {
            tblHDCT.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        jLabel2.setText("Sản Phẩm Của Hóa Đơn");

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblSanPhamCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Hình Ảnh", "Mã", "Tên", "Số Lượng", "Giá Bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPhamCT.setPreferredSize(new java.awt.Dimension(550, 300));
        tblSanPhamCT.setRowHeight(100);
        tblSanPhamCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamCTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblSanPhamCTMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPhamCT);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setText("Sản Phẩm ");

        javax.swing.GroupLayout PanelBHLayout = new javax.swing.GroupLayout(PanelBH);
        PanelBH.setLayout(PanelBHLayout);
        PanelBHLayout.setHorizontalGroup(
            PanelBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBHLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelBHLayout.createSequentialGroup()
                        .addGroup(PanelBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelBHLayout.createSequentialGroup()
                                .addGroup(PanelBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        PanelBHLayout.setVerticalGroup(
            PanelBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelBHLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Conten.add(PanelBH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 646));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Conten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Conten, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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

    private void banHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banHangMouseEntered
        this.banHang.setForeground(Color.white);
    }//GEN-LAST:event_banHangMouseEntered

    private void banHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banHangMouseExited
        this.banHang.setForeground(Color.black);
    }//GEN-LAST:event_banHangMouseExited

    private void sanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sanPhamMouseEntered
        this.sanPham.setForeground(Color.white);
    }//GEN-LAST:event_sanPhamMouseEntered

    private void sanPhamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sanPhamMouseExited
        this.sanPham.setForeground(Color.black);
    }//GEN-LAST:event_sanPhamMouseExited

    private void nhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhanVienMouseEntered
        this.nhanVien.setForeground(Color.white);
    }//GEN-LAST:event_nhanVienMouseEntered

    private void nhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhanVienMouseExited
        this.nhanVien.setForeground(Color.black);
    }//GEN-LAST:event_nhanVienMouseExited

    private void khachHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachHangMouseEntered
        this.khachHang.setForeground(Color.white);
    }//GEN-LAST:event_khachHangMouseEntered

    private void khachHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachHangMouseExited
        this.khachHang.setForeground(Color.black);
    }//GEN-LAST:event_khachHangMouseExited

    private void hoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoaDonMouseEntered
        this.hoaDon.setForeground(Color.white);
    }//GEN-LAST:event_hoaDonMouseEntered

    private void hoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoaDonMouseExited
        this.hoaDon.setForeground(Color.black);
    }//GEN-LAST:event_hoaDonMouseExited

    private void DonGiaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DonGiaoMouseEntered
        this.DonGiao.setForeground(Color.white);
    }//GEN-LAST:event_DonGiaoMouseEntered

    private void DonGiaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DonGiaoMouseExited
        this.DonGiao.setForeground(Color.black);
    }//GEN-LAST:event_DonGiaoMouseExited

    private void PBHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PBHMouseEntered
        this.PBH.setForeground(Color.white);
    }//GEN-LAST:event_PBHMouseEntered

    private void PBHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PBHMouseExited
        this.PBH.setForeground(Color.black);
    }//GEN-LAST:event_PBHMouseExited

    private void DKMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DKMMouseEntered
        this.DKM.setForeground(Color.white);
    }//GEN-LAST:event_DKMMouseEntered

    private void DKMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DKMMouseExited
        this.DKM.setForeground(Color.black);
    }//GEN-LAST:event_DKMMouseExited

    private void thongkeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongkeMouseEntered
        this.thongke.setForeground(Color.white);
    }//GEN-LAST:event_thongkeMouseEntered

    private void thongkeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongkeMouseExited
        this.thongke.setForeground(Color.black);
    }//GEN-LAST:event_thongkeMouseExited

    private void sanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sanPhamMouseClicked
        this.setForm(frameQuanLySanPham);
    }//GEN-LAST:event_sanPhamMouseClicked

    private void nhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhanVienMouseClicked
        if (isQuanLy()) {
            this.setForm(jFrameNhanVien);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn Không có "
                    + "quyền sử dụng chức năng này");
        }

    }//GEN-LAST:event_nhanVienMouseClicked

    private void khachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khachHangMouseClicked
        this.setForm(frameKhachHang);
    }//GEN-LAST:event_khachHangMouseClicked

    private void banHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banHangMouseClicked
        this.setForm(PanelBH);
    }//GEN-LAST:event_banHangMouseClicked

    private void hoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoaDonMouseClicked

    }//GEN-LAST:event_hoaDonMouseClicked

    public String getIdHDForHDCT() {
        return idHDForHDCT;
    }

    public void setIdHDForHDCT(String idHDForHDCT) {
        this.idHDForHDCT = idHDForHDCT;
    }

    private void tblHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHDMouseClicked
        int row = this.tblHD.getSelectedRow();
        if (row < 0) {
            return;
        }
        String idHD = null;
        String idKH = null;
        String sDT = null;
        int hinhThucNhaHang = 0;
        String ghiChu = null;
        String ma = this.tblHD.getValueAt(row, 1).toString();
        List<HoaDon_VM> list = this.hoaDonService.getAllHD();
        for (HoaDon_VM hoaDon_VM : list) {
            if (hoaDon_VM.getMa().equals(ma)) {
                idHD = hoaDon_VM.getId();
                idKH = hoaDon_VM.getKhachHang_VM().getId();
                sDT = hoaDon_VM.getKhachHang_VM().getSdt();
                hinhThucNhaHang = hoaDon_VM.getHinhThucNhan();
                ghiChu = hoaDon_VM.getMoTa();
            }
        }
        loadHDCT(idHD);
        String tenNV = this.tblHD.getValueAt(row, 2).toString();
        String tenKH = this.tblHD.getValueAt(row, 3).toString();
        String ngayTao = this.tblHD.getValueAt(row, 4).toString();
        String tinhTrang = this.tblHD.getValueAt(row, 5).toString();
        if (hinhThucNhaHang == 0) {
            this.tch.setSelected(true);
        } else {
            this.ship.setSelected(true);
        }
        this.txtGC.setText(ghiChu);
        this.txtNgayTao.setText(ngayTao);
        this.txthovatenNV.setText(tenNV);
        this.txtmaHD.setText(ma);
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) this.cbbKH.getModel();
        dcm.setSelectedItem(new MyComBoBoxMHC(idKH, tenKH, sDT));
        this.setIdHDForHDCT(idHD);
        tienHoaDon(idHD);
    }//GEN-LAST:event_tblHDMouseClicked
    public void tienHoaDon(String idHD) {
        double tongTienSP = 0;
        double tongTienCua1SP = 0;
        double phiShip = 0;
        int htnh = 0;
        List<HoaDon_VM> list = this.hoaDonService.getAllHD();
        for (HoaDon_VM hoaDon_VM : list) {
            if (hoaDon_VM.getId().equals(idHD)) {
                htnh = hoaDon_VM.getHinhThucNhan();
            }

        }
        List<Hoa_Don_CT_VM> list1 = this.hoaDonCTServiec.getAllHDCT(idHD);
        for (Hoa_Don_CT_VM hoa_Don_CT_VM : list1) {
            tongTienCua1SP = hoa_Don_CT_VM.getSoLuong() * hoa_Don_CT_VM.getImei_VM().getChiTietSP_VM().getGiaBan();
            tongTienSP += tongTienCua1SP;
        }
        phiShip = htnh == 0 ? 0 : 15000;
        this.txtttsp.setText(decimalFormattt.format(tongTienSP));
        this.txtphiship.setText(decimalFormattt.format(phiShip));
        tongTienHD = tongTienSP + phiShip;
        this.txtTienDH.setText(decimalFormattt.format(tongTienHD));
    }
    private void tblHDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHDMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblHDMouseEntered

    private void cbbKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbKHActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrameThemNhanhKH frameThemNhanhKH = new FrameThemNhanhKH(this, frameKhachHang);
        frameThemNhanhKH.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameThemNhanhKH.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        HoaDon_VM hoaDon_VM = this.data();
        if (hoaDon_VM == null) {
            return;
        }
        int exe = this.hoaDonService.them(hoaDon_VM);
        if (exe == 1) {
            JOptionPane.showMessageDialog(this, "Thành Công");
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại");
        }
        loadTbaleHD();
        clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        clear();
    }//GEN-LAST:event_jButton5ActionPerformed
    private String idSanPham;

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    private double giaOfSanPham;

    public double getGiaOfSanPham() {
        return giaOfSanPham;
    }

    public void setGiaOfSanPham(double giaOfSanPham) {
        this.giaOfSanPham = giaOfSanPham;
    }

    private void tblSanPhamCTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamCTMouseEntered
        int row = this.tblSanPhamCT.getSelectedRow();
    }//GEN-LAST:event_tblSanPhamCTMouseEntered

    private void tblSanPhamCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamCTMouseClicked

        int rowHD = this.tblHD.getSelectedRow();
        if (rowHD < 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn hóa đơn");
            return;
        }
        int rowSP = this.tblSanPhamCT.getSelectedRow();
        if (rowSP < 0) {
            return;
        }
        ++count;
        String ma = this.tblSanPhamCT.getValueAt(rowSP, 2).toString();
        String idCTSP = null;
        double giaBan = 0;
        List<ChiTietSP_VM> list = this.chiTietSPServive.getAllChiTietSPs();
        for (ChiTietSP_VM chiTietSP_VM : list) {
            if (chiTietSP_VM.getMaSoSP().equals(ma)) {
                idCTSP = chiTietSP_VM.getiDCTSP();
                giaBan = chiTietSP_VM.getGiaBan();
            }
        }
        if (count % 2 == 0) {
            FrameThemImeiSPChoHD frameThemImeiSPChoHD = new FrameThemImeiSPChoHD(this);
            frameThemImeiSPChoHD.setLocationRelativeTo(null);
            frameThemImeiSPChoHD.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frameThemImeiSPChoHD.setVisible(true);
            count = 0;
        }
        this.setIdSanPham(idCTSP);
        this.setGiaOfSanPham(giaBan);
    }//GEN-LAST:event_tblSanPhamCTMouseClicked

    private void tblHDCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHDCTMouseClicked
        int row = this.tblHDCT.getSelectedRow();
        if (row < 0) {
            return;
        }
        FrameImeiOfHoaDon imeiOfHoaDon = new FrameImeiOfHoaDon(this);
        imeiOfHoaDon.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        imeiOfHoaDon.setLocationRelativeTo(null);
        imeiOfHoaDon.setVisible(true);
    }//GEN-LAST:event_tblHDCTMouseClicked

    private void txtkdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkdKeyReleased
        double tkd = Double.parseDouble(this.txtkd.getText());
        this.thuaorthieu.setText(decimalFormattt.format((tongTienHD - tkd)));
        if (tkd > tongTienHD) {
            this.thuorthieu1.setText("Tiền Thừa :");
            this.thuaorthieu.setText(decimalFormattt.format((tongTienHD - tkd) * (-1)));
        }
    }//GEN-LAST:event_txtkdKeyReleased

    private void txtkdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtkdMouseClicked
        int row = this.tblHD.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Bạn Chưa chon hóa đơn");
            return;
        }
    }//GEN-LAST:event_txtkdMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int row = this.tblHD.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Bạn Chưa chon hóa đơn");
            return;
        }
        HoaDon_VM hoaDon_VM = this.data();
        if (hoaDon_VM == null) {
            return;
        }
        if (this.txtkd.getText() == null) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhâ tiền khách đưa");
            return;
        }
        if (Double.parseDouble(this.txtkd.getText()) < tongTienHD) {
            JOptionPane.showMessageDialog(this, "Tiền Khách đưa không đủ");
            return;
        }
        int exe = this.hoaDonService.thanhToan(hoaDon_VM);
        if (exe == 1) {
            JOptionPane.showMessageDialog(this, "Thành Công");
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại");
        }
        loadTbaleHD();
        clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void DKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DKMMouseClicked
        this.setForm(frameDotKhuyenMai);
    }//GEN-LAST:event_DKMMouseClicked

    private void PBHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PBHMouseClicked
        this.setForm(pBH);
    }//GEN-LAST:event_PBHMouseClicked

    private void DonGiaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DonGiaoMouseClicked
          this.setForm(donGiaos);
    }//GEN-LAST:event_DonGiaoMouseClicked
    private HoaDon_VM data() {
        String maHD = this.txtmaHD.getText();
        String idHD = null;
        List<HoaDon_VM> list = this.hoaDonService.getAllHD();
        for (HoaDon_VM hoaDon_VM : list) {
            if (hoaDon_VM.getMa().equals(maHD)) {
                idHD = hoaDon_VM.getId();
            }
        }
        myComBoBox = (MyComBoBoxMHC) this.cbbKH.getSelectedItem();
        String idKH = myComBoBox.idString();
        String tenNV = login.getNhanVien_VM().getHoVaTen();
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String ngayTao = today.format(formatter);
        String ghiChu = this.txtGC.getText();
        int htn = this.tch.isSelected() ? 0 : 1;
        HoaDon_VM hoaDon_VM = new HoaDon_VM(0, idHD, maHD,
                new NhanVien_VM(login.getNhanVien_VM().getIDNV()),
                new KhachHang_VM(idKH), ngayTao, null,
                0, ghiChu, htn);

        return hoaDon_VM;
    }

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
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManHinhChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Conten;
    private javax.swing.JLabel DKM;
    private javax.swing.JLabel DonGiao;
    private javax.swing.JLabel NgayTao1;
    private javax.swing.JLabel PBH;
    private javax.swing.JPanel PanelBH;
    private javax.swing.JLabel anh;
    private javax.swing.JLabel banHang;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbKH;
    private javax.swing.JLabel hoaDon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel khachHang;
    private javax.swing.JLabel nhanVien;
    private javax.swing.JLabel sanPham;
    private javax.swing.JRadioButton ship;
    private javax.swing.JTable tblHD;
    private javax.swing.JTable tblHDCT;
    private javax.swing.JTable tblSanPhamCT;
    private javax.swing.JRadioButton tch;
    private javax.swing.JLabel thongke;
    private javax.swing.JLabel thuaorthieu;
    private javax.swing.JLabel thuorthieu1;
    private javax.swing.JTextArea txtGC;
    private javax.swing.JLabel txtNgayTao;
    private javax.swing.JLabel txtTienDH;
    private javax.swing.JLabel txthovatenNV;
    private javax.swing.JTextField txtkd;
    private javax.swing.JLabel txtmaHD;
    private javax.swing.JLabel txtphiship;
    private javax.swing.JLabel txtttsp;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        this.cbbKH.setSelectedIndex(0);
        this.txtmaHD.setText("");
        this.txthovatenNV.setText("");
        this.tch.setSelected(true);
        this.txtGC.setText("");
        this.txtNgayTao.setText("");
        this.txtkd.setText("");
        this.txtttsp.setText("");
        this.txtphiship.setText("");
        this.txtTienDH.setText("");
    }

}
