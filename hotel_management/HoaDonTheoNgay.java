/*/
 * Mục Đích: subClass;
 * Người tạo:
 * Ngày:
 * Version:
 */
public class HoaDonTheoNgay extends HoaDon {

	public HoaDonTheoNgay(String maHoaDon, String ngay, String ten, String maPhong, float donGia, int gioThue) {
		super(maHoaDon, ngay, ten, maPhong, donGia, gioThue);
		// TODO Auto-generated constructor stub
	}

	public HoaDonTheoNgay() {
		// TODO Auto-generated constructor stub
	}

	public HoaDonTheoNgay(String maHoaDon, float donGia, int gioThue) {
		super(maHoaDon, donGia, gioThue);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		System.out.print("Hóa Đơn Theo Ngày:");
		super.xuat();

	}

	@Override
	public void tinhTien() {
		// TODO Auto-generated method stub
		this.thanhTien = this.donGia * 24 *(this.gioThue/24);
	}
}
