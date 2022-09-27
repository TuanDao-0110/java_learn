/*/
 * Mục Đích:
 * Người tạo:
 * Ngày:
 * Version
 */
public class HoaDonTieng extends HoaDon {

	public HoaDonTieng() {
		// TODO Auto-generated constructor stub
	}
	public HoaDonTieng(String maHoaDon, float donGia, int gioThue) {
		super(maHoaDon, donGia, gioThue);
		// TODO Auto-generated constructor stub
	}
@Override
public void xuat() {
	// TODO Auto-generated method stub
	System.out.print("Hóa Đơn theo giờ:");
	super.xuat();
}
@Override
public void tinhTien() {
	// TODO Auto-generated method stub
	super.tinhTien();
	if ( this.gioThue >24 && this.gioThue <=30) {
		this.thanhTien = this.donGia * 24;
	}else {
		
			this.thanhTien = this.gioThue * this.donGia;
		}
}
}
