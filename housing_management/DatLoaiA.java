/*?
 *Mục Đích: subclass cho Dat
 *Người Tạo:
 *Ngày
 *Version:
 */
public class DatLoaiA extends Dat {
	//1.Attributes
 
 //2.constructor
	public DatLoaiA(String maDat, String ngayThangNam, float donGia, String loaiDat, float dienTich, float thanhTien) {
		super(maDat, ngayThangNam, donGia, loaiDat, dienTich, thanhTien);
		// TODO Auto-generated constructor stub
	}

	public DatLoaiA() {
		// TODO Auto-generated constructor stub
	}

	public DatLoaiA(String maDat, String ngayThangNam, float donGia, String loaiDat, float dienTich) {
		super(maDat, ngayThangNam, donGia, loaiDat, dienTich);
		// TODO Auto-generated constructor stub
	}
// 
	@Override
		public void xuat() {
		// TODO Auto-generated method stub
	System.out.println("Đất: loại A ");	super.xuat(); System.out.println(this.loaiDat);
	}
	@Override
	public void tinhTien() {
		// TODO Auto-generated method stub
this.thanhTien = (float) (this.donGia * this.dienTich * 1.5);
	}

}
