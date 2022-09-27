/*/
 * Mục Đích: Tạo supperClass;
 * Người Tạo: 
 * Ngày:
 * Version:
 */
public abstract class KhachHang {
// Attribute;
	protected String maKH;
	protected String hoTen;
	protected String ngay;
	protected String thang;
	protected String nam;
	protected int soLuong;
	protected float donGia;
	protected float thanhTien;

// Setter vs getter;
	
	public String getMaKH() {
		return maKH;
	}

	public  String getThang() {
		return thang;
	}

	public void setThang(String thang) {
		this.thang = thang;
	}

	public String getNam() {
		return nam;
	}

	public void setNam(String nam) {
		this.nam = nam;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgay() {
		return ngay;
	}

	public void setNgay(String ngay) {
		this.ngay = ngay;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public float getThanhTien() {
		return thanhTien;
	}

	// constructors;
	public KhachHang(String maKH, String hoTen, String ngay, int soLuong, float donGia, float thanhTien) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.ngay = ngay;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.thanhTien = thanhTien;
	}

	public KhachHang(String maKH, String hoTen, String ngay,String thang,String nam, int soLuong, float donGia) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}

	public KhachHang() {

	}

	// xuat
	public void xuat() {
		System.out.print("Mã khách hàng:" + this.maKH + "\t họ tên: " + this.hoTen + "\t ngày: " + this.ngay + "\t tháng:"+ this.thang
				+ "\t số lượng: " + this.soLuong + "\t đơn giá: " + this.donGia + "\t thành tiền: " + this.thanhTien);

	}

	public abstract void tinhThanhTien();
}
