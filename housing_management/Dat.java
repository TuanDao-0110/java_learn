import java.util.Scanner;

/*
 * Mục Đích: tạo supperclass cho quản lý giao dịch đất
 * Người tạo:
 * Ngày:
 * Version:
 */
public abstract class Dat {
	// 1. tạo Attributes;
	protected String maDat;
	protected String ngayThangNam;
	protected float donGia;
	protected String loaiDat;
	protected float dienTich;
	protected float thanhTien;
	protected String diaChi;

	// 2 tạo setter vs getter
	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getMaDat() {
		return maDat;
	}

	public void setMaDat(String maDat) {
		this.maDat = maDat;
	}

	public String getNgayThangNam() {
		return ngayThangNam;
	}

	public void setNgayThangNam(String ngayThangNam) {
		this.ngayThangNam = ngayThangNam;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	public float getDienTich() {
		return dienTich;
	}

	public void setDienTich(float dienTich) {
		this.dienTich = dienTich;
	}

	public float getThanhTien() {
		return thanhTien;
	}

	// 3. tạo constructors:
	public Dat(String maDat, String ngayThangNam, float donGia, String loaiDat, float dienTich, float thanhTien) {
		super();
		this.maDat = maDat;
		this.ngayThangNam = ngayThangNam;
		this.donGia = donGia;
		this.loaiDat = loaiDat;
		this.dienTich = dienTich;
		this.thanhTien = thanhTien;
	}

	public Dat() {

	}

	public Dat(String maDat, String ngayThangNam, float donGia, String loaiDat, float dienTich) {
		super();
		this.maDat = maDat;
		this.ngayThangNam = ngayThangNam;
		this.donGia = donGia;
		this.loaiDat = loaiDat;
		this.dienTich = dienTich;

	}
//4. nhập và xuất: 
	public void xuat () {
		System.out.print("Mã Đất:"+ this.maDat+"\tNgày Tháng Năm:"+ this.ngayThangNam+"\t  Đơn Giá:"+ this.donGia+ "\t Diẹn Tích:"+this.dienTich+ "\t Thành Tiền:"+ this.thanhTien);
	}
//5. method 
public abstract	void tinhTien(); 
}
