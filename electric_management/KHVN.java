/*/
 * Mục đích: tạo subClass cho supperclass KhachHang;
 * Người Tạo: 
 * Ngày:
 * Version:
 */
public class KHVN extends KhachHang {
//1 Attribute:
	public String doiTuong;
	public int dinhMuc;

	// 2.setter vs getters
	public String getDoiTuong() {
		return doiTuong;
	}

	public void setDoiTuong(String doiTuong) {
		this.doiTuong = doiTuong;
	}

	public int getDinhMuc() {
		return dinhMuc;
	}

	public void setDinhMuc(int dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
//3.constructors:

	public KHVN(String maKH, String hoTen, String ngay, int soLuong, float donGia, float thanhTien) {
		super(maKH, hoTen, ngay, soLuong, donGia, thanhTien);
		// TODO Auto-generated constructor stub
	}

	

	public KHVN(String maKH, String hoTen, String ngay, String thang, String nam, int soLuong, float donGia,String doituong,int dinhmuc) {
		super(maKH, hoTen, ngay, thang, nam, soLuong, donGia);
		// TODO Auto-generated constructor stub
	this.doiTuong = doituong; 
	this.dinhMuc = dinhmuc;
	}
	public KHVN() {
		// TODO Auto-generated constructor stub
	}

// getter vs setter:
	@Override

	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.println("\t Đối Tượng:" + this.doiTuong + "\t Định Mức:" + this.dinhMuc);
	}

	@Override
	public void tinhThanhTien() {
		// TODO Auto-generated method stub
		if (this.soLuong <= this.dinhMuc) {
			this.thanhTien = this.soLuong * this.donGia;

		} else {
			this.soLuong = (int) (this.donGia * this.soLuong + (this.dinhMuc - this.soLuong) * this.donGia * 2.5);
		}
	}

}
