/*/
 * Mục Đích: tạo subClass cho Đất
 * Người Tạo: 
 * Ngày:
 * Version:
 */
public class DatLoaiBC extends Dat {

	public DatLoaiBC(String maDat, String ngayThangNam, float donGia, String loaiDat, float dienTich, float thanhTien) {
		super(maDat, ngayThangNam, donGia, loaiDat, dienTich, thanhTien);
		// TODO Auto-generated constructor stub
	}

	public DatLoaiBC() {
		// TODO Auto-generated constructor stub
	}

	public DatLoaiBC(String maDat, String ngayThangNam, float donGia, String loaiDat, float dienTich) {
		super(maDat, ngayThangNam, donGia, loaiDat, dienTich);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void xuat() {
	// TODO Auto-generated method stub
System.out.println("Đất: loại B/C ");	super.xuat(); System.out.println("\t"+loaiDat);
}
	@Override
	public void tinhTien() {
		// TODO Auto-generated method stub
		this.thanhTien = this.dienTich * this.donGia;
	}

}
