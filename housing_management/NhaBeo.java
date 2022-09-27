/*/
 * Mục Đích: tạo subClass cho Dat
 * Người Tạo: 
 * Ngày: 
 * Version:
 */
public class NhaBeo extends Dat {

	public NhaBeo(String maDat, String ngayThangNam, float donGia, String loaiDat, float dienTich, float thanhTien) {
		super(maDat, ngayThangNam, donGia, loaiDat, dienTich, thanhTien);
		// TODO Auto-generated constructor stub
	}

	public NhaBeo() {
		// TODO Auto-generated constructor stub
	}

	public NhaBeo(String maDat, String ngayThangNam, float donGia, String loaiDat, float dienTich,String diaChi) {
		super(maDat, ngayThangNam, donGia, loaiDat, dienTich);
		// TODO Auto-generated constructor stub
		this.diaChi = diaChi;
	}
	@Override
	public void xuat() {
	// TODO Auto-generated method stub
System.out.println("Nhà: Loại Thường ");	super.xuat();System.out.println("\t"+ this.diaChi);
}
	@Override
	public void tinhTien() {
		// TODO Auto-generated method stub
		double d = 0.9;
		this.thanhTien = (float) (this.dienTich *this.donGia*d);
	}


}
