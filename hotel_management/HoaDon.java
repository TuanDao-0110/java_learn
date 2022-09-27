/*/
 * Mục đích: tạo supperclass 
 * Người tạo: 
 * Ngày:
 * Version:
 */
public class HoaDon {
// Attribute
	protected String maHoaDon;
	protected String ngay;
	protected String ten;
	protected String maPhong;
	protected float donGia;
	protected int gioThue;
	protected float thanhTien;
 // setter vs getter
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public String getNgay() {
		return ngay;
	}
	public void setNgay(String ngay) {
		this.ngay = ngay;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public int getGioThue() {
		return gioThue;
	}
	public void setGioThue(int gioThue) {
		this.gioThue = gioThue;
	}
	public float getThanhTien() {
		return thanhTien;
	}
//3. constructors:
	public HoaDon(String maHoaDon, String ngay, String ten, String maPhong, float donGia, int gioThue) {
		super();
		this.maHoaDon = maHoaDon;
		this.ngay = ngay;
		this.ten = ten;
		this.maPhong = maPhong;
		this.donGia = donGia;
		this.gioThue = gioThue;
	}
	public HoaDon() {
		
	}
	
public HoaDon(String maHoaDon, float donGia, int gioThue) {
		super();
		this.maHoaDon = maHoaDon;
		this.donGia = donGia;
		this.gioThue = gioThue;
	}
//4. xuat : 
	public void xuat () {
		System.out.print("\t Mã: "+ this.maHoaDon+ "\t Ngày: "+ this.ngay+ "\t Tên: "+ this.ten+ "\t Mã Phòng: "+ this.maPhong+ "\t Giờ Thuê: "+ this.gioThue+"\t Thành tiền: "+ this.thanhTien);
	}
public void tinhTien() {
}
}
