import java.util.Scanner;

/*/
 * Ngày Tháng : 17/9/2021.
 * Tác Giả : Tuấn. 
 * Mục Đích : lập đối tượng quản lý nhân viên. 
 * Version : 1.0.
 */
public class QuanLyNhanVien {
//1. attribution; 
	public String maNV;
	public String hoTen;
	public String ngaySinh;
	public String diaChi;
	public double heSoLuongCoBan;
	public double luongCoBan;
	private double tongLuong;
	private Float tongLuongCaCongTy;
	private double luongcoban2;
//2. setter vs getter;

	public String getMaNV() {
		return maNV;
	}

	public Float getTongLuongCaCongTy() {
		return tongLuongCaCongTy;
	}

	public void setTongLuongCaCongTy(Float tongLuongCaCongTy) {
		this.tongLuongCaCongTy = tongLuongCaCongTy;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Float getHeSoLuongCoBan() {
		return (float) heSoLuongCoBan;
	}

	public void setHeSoLuongCoBan(Float heSoLuongCoBan) {
		this.heSoLuongCoBan = heSoLuongCoBan;
	}

	public Float getLuongCoBan() {
		return (float) luongCoBan;
	}

	public void setLuongCoBan(Float luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public Float getTongLuong() {
		return (float) tongLuong;
	}

	public void setTongLuong(Float tongLuong) {
		this.tongLuong = tongLuong;
	}

//3 . khỏi tạo hàm 
	public QuanLyNhanVien() {
		// TODO Auto-generated constructor stub
	}

	public QuanLyNhanVien(String manv, String hoten, String diachi, double hesoluongcoban, double luongcoban) {
		this.maNV = manv;
		this.hoTen = hoten;
		this.diaChi = diachi;
		this.heSoLuongCoBan = hesoluongcoban;
		luongcoban2 = luongcoban;
		this.luongCoBan = luongcoban;
	}

//4.input vs output; 
	public void nhap(Scanner scan) {
		System.out.println("Mời Nhập Họ và Tên:");
		this.hoTen = scan.nextLine();
		System.out.println("Mời Nhập Mã NV:");
		this.maNV = scan.nextLine();
		System.out.println("Mời Nhập Địa Chỉ:");
		this.diaChi = scan.nextLine();
		System.out.println("Mời Nhập Hệ Số Lương Cơ Bản:");
		this.heSoLuongCoBan = Float.parseFloat(scan.nextLine());
		System.out.println("Mời Nhập Lương Cơ Bản:");
		this.luongCoBan = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println(
				"Họ Tên: " + this.hoTen + "\t Mã Nhân Viên:" + this.maNV + "\t Địa Chỉ:" + this.diaChi + "\t Hệ Số Lương Là:"
						+ this.heSoLuongCoBan + "\t Lương Cơ Bản Là:" + this.luongCoBan + "\t Tổng Lương:" + this.tongLuong+" VND");
	}

//5. khỏi tạo bussiness method 
	public float tinhTongLuong() {
		return (float) (this.tongLuong = this.heSoLuongCoBan * this.luongCoBan);
	}

}
