
/*/
 * Ngày Tháng : 17/09/2021.
 * Tên Tác Giả : Tuấn.
 * Mục Đích: Tạo và quản lý danh sách nhân viên.
 * Version : 1.0.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ListDSNV {
	// 1. attribution.
	ArrayList<QuanLyNhanVien> ListNV;

	// 2. getter vs setter.
	public ArrayList<QuanLyNhanVien> getListNV() {
		return ListNV;
	}

	public void setListNV(ArrayList<QuanLyNhanVien> listNV) {
		ListNV = listNV;
	}

	// 3. constructor khởi tạo .

	public ListDSNV() {
		// TODO Auto-generated constructor stub
		thietLapDefault();
	}

	public void thietLapDefault() {
		this.ListNV = new ArrayList<QuanLyNhanVien>();
	}

	// 4. nhập và xuất ;
	

	public void themNV(QuanLyNhanVien nv) {
		
			this.ListNV.add(nv);
		
	}

	public void xuatNV() {
		for (QuanLyNhanVien nv : this.ListNV) {
			nv.xuat();
		}
	}

	// 5. business method
	// tạo 1 danh sách dữ liệu giả ;
	public void nhapGia() {
		QuanLyNhanVien nv = new QuanLyNhanVien("01", "Phong", "120 Lê Văn Sỹ", 1, 16000);
		this.ListNV.add(nv);
		nv = new QuanLyNhanVien("02", "hong", "120 Phú Mỹ", 1.4, 16000);
		this.ListNV.add(nv);
		nv = new QuanLyNhanVien("03", "Trung", "140 Hoàng Văn Thụ", 1.5, 16000);
		this.ListNV.add(nv);
		nv = new QuanLyNhanVien("04", "Phú", "1 Phan Đăng Lưu", 1.4, 16000);
		this.ListNV.add(nv);
		nv = new QuanLyNhanVien("05", "Quốc", "180 Phú Hưng", 1.4, 16000);
		this.ListNV.add(nv);
		nv = new QuanLyNhanVien("06", "Bá", "20 Lê Thị Riêng", 1.2, 16000);
		this.ListNV.add(nv);
		nv = new QuanLyNhanVien("07", "Hoàng", "10 Lý Chính Thắng", 1.1, 16000);
		this.ListNV.add(nv);
		nv = new QuanLyNhanVien("08", "Đào", "21 Nam Kì Khởi Nghĩa", 1.3, 16000);
		this.ListNV.add(nv);
		nv = new QuanLyNhanVien("09", "Lộc", "19 Hoàng Văn Thụ", 0.5, 16000);
		this.ListNV.add(nv);
		nv = new QuanLyNhanVien("10", "Kì", "90 Kì Đồng", 0.8, 16000);
		this.ListNV.add(nv);
		nv = new QuanLyNhanVien("11", "Trung", "99 Đương", 1.2, 16000);
		this.ListNV.add(nv);
		nv = new QuanLyNhanVien("12", "Long", "18 Lê Văn Hưu", 1.4, 16000);
		this.ListNV.add(nv);
		nv = new QuanLyNhanVien("01", "Phong", "120 Lê Văn Sỹ", 1, 16000);
		this.ListNV.add(nv);
		nv = new QuanLyNhanVien("01", "Phong", "120 Lê Văn Sỹ", 1, 16000);
		this.ListNV.add(nv);
		nv = new QuanLyNhanVien("01", "Phong", "120 Lê Văn Sỹ", 1, 16000);
		this.ListNV.add(nv);
		nv = new QuanLyNhanVien("01", "Phong", "120 Lê Văn Sỹ", 1, 16000);
		this.ListNV.add(nv);
		nv = new QuanLyNhanVien("01", "Phong", "120 Lê Văn Sỹ", 1, 16000);
		this.ListNV.add(nv);

	}
	// lấy phương thức tính tổng lương
	public void luongNv () {
		for ( QuanLyNhanVien nv : this.ListNV) {
			nv.tinhTongLuong();
		}
	}

// tạo method tính tổng lương của cả công ty
	public void tongLuongCuaCTY() {
		float tong = 0;
		for (QuanLyNhanVien nv : this.ListNV) {
			
			tong += nv.getTongLuong();
		}
		System.out.println("Tổng Lương của Công Ty là: " + tong);
	}

// tạo danh sách nhân viên có lương cao nhất
	public ArrayList<QuanLyNhanVien> listNhanVienLuongCaoNhat() {
		ArrayList<QuanLyNhanVien> list = new ArrayList<QuanLyNhanVien>();
		// gọi khởi tạo 1 object nvMax để bắt đầu so sánh;

		QuanLyNhanVien nvMax = this.ListNV.get(0);
		// gọi index là giá trị của nhân viên có lương cao nhất đầu tiên
		int index = 0;
		for (int i = 0; i < this.ListNV.size(); i++) {
			if (nvMax.tinhTongLuong() < this.ListNV.get(i).tinhTongLuong()) {
				nvMax = this.ListNV.get(index);
				index = i;
			}

		}
		// sau khi tìm được index ta bắt đầu so sánh để add và listNV có lương cao nhất.
		for (int i = index; i < this.ListNV.size(); i++) {
			if (this.ListNV.get(i).tinhTongLuong() == nvMax.tinhTongLuong()) {
				list.add(this.ListNV.get(i));
			}
		}
		return list;
	}

// hàm xuất các list tìm được 
	public void xuatList(ArrayList<QuanLyNhanVien> list) {
		for (QuanLyNhanVien sv : list) {
			sv.xuat();
		}
	}
}
