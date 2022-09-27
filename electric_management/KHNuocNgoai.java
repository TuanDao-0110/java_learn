/*/
 * Mục Đích: subClass cho supperClass KhachHang;
 * Người Tạo:
 * Ngày:
 * Version:
 */
public class KHNuocNgoai extends KhachHang {
	// Attributes:
	public String quocTich;

//Setter vs getters
	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public KHNuocNgoai(String maKH, String hoTen, String ngay, int soLuong, float donGia, float thanhTien) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.ngay = ngay;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.thanhTien = thanhTien;
	}

	public KHNuocNgoai(String maKH, String hoTen, String ngay, String thang, String nam, int soLuong, float donGia,
			String quoctich) {
		super(maKH, hoTen, ngay, thang, nam, soLuong, donGia);
		// TODO Auto-generated constructor stub
		this.quocTich = quoctich;
	}

	public KHNuocNgoai() {
		// TODO Auto-generated constructor stub
	}

	@Override

	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.println("\t Quốc Tịch:" + this.quocTich);
	}

	@Override
	public void tinhThanhTien() {
		this.thanhTien = this.donGia * this.donGia;
	}

}
