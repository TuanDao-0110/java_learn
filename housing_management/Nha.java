/*/
 * Mục Đích: tạo ra supperClass Nhà
 * Người Tạo:
 * Ngày:
 * Version:
 */
public class Nha extends Dat {
	
	public Nha(String maDat, String ngayThangNam, float donGia, String loaiDat, float dienTich, float thanhTien) {
		super(maDat, ngayThangNam, donGia, loaiDat, dienTich, thanhTien);
		// TODO Auto-generated constructor stub
	}

	public Nha() {
		// TODO Auto-generated constructor stub
	}

	public Nha(String maDat, String ngayThangNam, float donGia, String loaiDat, float dienTich,String diaChi) {
		super(maDat, ngayThangNam, donGia, loaiDat, dienTich);
		// TODO Auto-generated constructor stub
		this.diaChi = diaChi;
	}
	@Override
	public void xuat() {
	// TODO Auto-generated method stub
System.out.println("Nhà: Cao Cấp ");	super.xuat(); System.out.println(this.diaChi);
}
	@Override
	public void tinhTien() {
		// TODO Auto-generated method stub
		this.thanhTien = this.dienTich *this.donGia;
	}

}
