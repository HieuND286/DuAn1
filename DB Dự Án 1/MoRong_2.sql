delete from CHiTietSP where ID = 'B5475278-38F4-4FEE-97BA-D758B7C4B94A'
select * from CHiTietSP
insert into CHiTietSP (MaSSP)
values('1')
delete from Imei
where TinhTrang = 0

insert into HOA_DON (ID,IDNV,IDKH,MA,NGAY_TAO,TINH_TRANG,MO_TA,HinhThucNhan)
values (?,?,?,?,?,?,?,?)

update HOA_DON
set IDNV = ?,IDKH  = ?,MA  = ? ,NGAY_TAO  = ?,TINH_TRANG  = ?,MO_TA  = ?,HinhThucNhan  = ?
where ID = ?

select HOA_DON.ID,HOA_DON.MA,HOA_DON.NGAY_TAO,HOA_DON.TINH_TRANG,HOA_DON.HinhThucNhan,
NhanVien.IDNV,NhanVien.HoVaTen,KhachHang.IDKH,KhachHang.HOTEN,KhachHang.SDT,HOA_DON.MO_TA
from HOA_DON left join NhanVien on HOA_DON.IDNV = NhanVien.IDNV left  join KhachHang on HOA_DON.IDKH = KhachHang.IDKH
where TINH_TRANG = 0

select 
from HOA_DON_CT join Imei on HOA_DON_CT.


select CHiTietSP.ID,CHiTietSP.MaSSP,CHiTietSP.SoLuong,
 CHiTietSP.Hinhanh,CHiTietSP.GiaNhap,CHiTietSP.GiaBan,CHiTietSP.TinhTrang,
 SanPham.ID,SanPham.Ma,SanPham.Ten,HeDieuHanh.ID,HeDieuHanh.Ma,HeDieuHanh.Ten,
 Hang.ID,Hang.Ma,Hang.Ten,DongSP.ID,DongSP.Ma,DongSP.Ten,CPU.ID,CPU.Ma,CPU.Ten,
 Rom.ID,Rom.Ma,Rom.DUNGLUONG,Ram.ID,Ram.MA,Ram.DUNGLUONG,MauSac.ID,MauSac.Ma,MauSac.Ten,
 ManHinh.ID,ManHinh.Ma,ManHinh.Ten,Pin.ID,Pin.Ma,Pin.DungLuong,CHiTietSP.TinhTrang
 from CHiTietSP join SanPham on CHiTietSP.IDSP = SanPham.ID
     join HeDieuHanh on CHiTietSP.IDHDH = HeDieuHanh.ID
	 join Hang on CHiTietSP.IDHNG = Hang.ID
	 join DongSP on DongSP.ID = CHiTietSP.IDDongSP
	 join CPU on CHiTietSP.IDCPU = CPU.ID
     join Rom on CHiTietSP.IDRom = Rom.ID
	 join Ram on CHiTietSP.IDRam = Ram.ID
     join MauSac on CHiTietSP.IDMS = MauSac.ID
     join ManHinh on CHiTietSP.IDMH = ManHinh.ID
     join Pin on CHiTietSP.IDPin = Pin.ID
where CHiTietSP.TinhTrang = 0


update CHiTietSP
set SoLuong = 10

alter trigger updateTinhTrang2 on HOA_DON_CT
after update, insert
as
begin
     if((select COUNT(ID) from inserted)>0)
	 begin
	     update Imei
		 set TinhTrang = 2
		 where Imei.ID in (select IDimei from inserted)
		 print('chay')
	 end
	 print('ko chay')
end
create trigger updateTinhTrang on Imei 
after update , insert
as
begin
    if((select COUNT(ID) from inserted where IDCTSP is not null)>0)
	begin
	     update Imei
		 set TinhTrang = 1
		 where IDCTSP is not null and TinhTrang = 0
	end
end

alter trigger addIDCTSP on CHiTietSP
after update , insert
as
begin
    if((select COUNT(ID) from inserted)>0)
	begin
	     update Imei
		 set IDCTSP = (select ID from inserted)
		 where TinhTrang = 0
	end
end
create trigger DeleteHDCT on HOA_DON_CT
after update , delete
as
begin
    if((select COUNT(ID) from deleted )>0)
	begin
	     update Imei
		 set TinhTrang = 1
		 where Imei.ID in (select deleted.IDimei from deleted )

	end
end
create trigger ThanhToan on HOA_DON
after update , insert
as
begin
    if((select COUNT(ID) from deleted where TinhTrang = 1 )>0)
	begin
	     update Hoa
		 set TinhTrang = 1
		 where Imei.ID in (select deleted.IDimei from deleted )

	end
end
insert into NhanVien (MANV,HoVaTen,GioiTinh,NgaySinh,DiaChi,Sdt,MatKhau)
values ('NV1','Kien',1,'2003/7/19','Hà Nội','0987654321','123')

select * from ChiTie

update HOA_DON
set TINH_TRANG = 1
where HOA_DON.ID = ?