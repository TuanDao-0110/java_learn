import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*/
 * Mục Đích: tạo danh sách cho toàn trường;
 * Người tạo: 
 * Ngày:
 * Version:
 */
public class DanhSachToanTruong {
//1.Attribute: 
	public ArrayList<ThanhVien> list;
	private DanhSachGiaoVien dsGiaoVien;
	private DanhSachHocSinh dsHocSinh;
	private float DiemTBMax;
//2. setters vs getter:

	public ArrayList<ThanhVien> getList() {
		return list;
	}

	public float getDiemTBMax() {
		return DiemTBMax;
	}

	public DanhSachHocSinh getDsHocSinh() {
		return dsHocSinh;
	}

	public void setDsHocSinh(DanhSachHocSinh dsHocSinh) {
		this.dsHocSinh = dsHocSinh;
	}

	public DanhSachGiaoVien getDsGiaoVien() {
		return dsGiaoVien;
	}

	public void setDsGiaoVien(DanhSachGiaoVien dsGiaoVien) {
		this.dsGiaoVien = dsGiaoVien;
	}

	public void setList(ArrayList<ThanhVien> list) {
		this.list = list;
	}

	public DanhSachToanTruong(ArrayList<ThanhVien> list, DanhSachGiaoVien dsGiaoVien, DanhSachHocSinh dsHocSinh) {
		super();
		this.list = list;
		this.dsGiaoVien = dsGiaoVien;
		this.dsHocSinh = dsHocSinh;
	}

//3. constructors:

	public DanhSachToanTruong() {
		this.dsGiaoVien = new DanhSachGiaoVien();
		this.dsHocSinh = new DanhSachHocSinh();
		this.list = new ArrayList<ThanhVien>();
	}

//4. nhập xuất: 
	public void nhap(Scanner scan) {
		GiaoVien gv = new GiaoVien();
		HocSinh hs = new HocSinh();
		boolean flag = true;
		do {

			System.out.println("mời Nhập số 1. Cho Giáo Viên or 2.Cho học Sinh");
			int n = Integer.parseInt(scan.nextLine());
			switch (n) {
			case 1:
				gv.nhap(scan);
				this.list.add(gv);
				flag = false;
				break;
			case 2:
				hs.nhap(scan);
				this.list.add(hs);
				flag = true;
				break;
			default:
				break;
			}
		} while (flag);
	}

	public void xuat() {
		for (ThanhVien i : this.list) {
			i.xuat();
		}
	}

//5. business method:
	// 5.1 tạo dữ liệu giả;
	public void taoDanhSachToanTruong() {
		this.dsGiaoVien.taoDulieu();
		for (GiaoVien i : dsGiaoVien.getDs()) {
			i.tinhThamNiem();
			this.list.add(i);

		}
		this.dsHocSinh.taoDulieu();
		for (HocSinh k : this.dsHocSinh.getList()) {
			k.tinhTB();
			k.xepLoaiHS();
			this.list.add(k);
		}
	}

//5.2 phương thức tính số năm giảng dạy cho Giáo viên
	public void thamNiem() {
		for (ThanhVien i : this.list) {
			if (i instanceof GiaoVien) {
				((GiaoVien) i).tinhThamNiem();
			}
		}
	}

//5.3 phương thức tìm ra Giáo vien có thâm niên cao nhất
	public void timGiaoVienThamNienNhat() {
		GiaoVien gv = this.dsGiaoVien.getDs().get(0);
		for (GiaoVien i : this.dsGiaoVien.getDs()) {
			if (gv.getThamNien() < i.getThamNien()) {
				gv = i;
			}
		}
		System.out.println("Gíao viên có thâm niên nhất là : ");
		gv.xuat();
	}

	// 5.4 tìm giáo viên có thâm niên trên 5 năm và thuộc khối tự nhiên
	public void timGiaoVienKhoiTuNhie() {
		System.out.println("Danh sách các giáo viên thâm niên trên 5 năm và thuộc khối tự nhiên là :");
		for (GiaoVien i : this.dsGiaoVien.getDs()) {
			if (i.getThamNien() > 5 && i.getChuyenMon().equalsIgnoreCase("Tự Nhiên")) {
				i.xuat();
			}
		}
	}

//5.5. tính điểm trung bình của học sinh : 
	// 5.6 tính điểm trung bình cao nhất của học sinh
	public void timDiemTBMax() {
		HocSinh hs = this.dsHocSinh.getList().get(0);
		for (HocSinh i : this.dsHocSinh.getList()) {
			if (hs.getDiemTrungBinh() < i.getDiemTrungBinh()) {
				hs = i;
			}
		}
		System.out.println("Điểm TB cao nhất Là:" + hs.diemTrungBinh);
		this.DiemTBMax = hs.diemTrungBinh;
	}

	public void xuatDSHSCoDiemTBMax() {
		System.out.println("Danh sách HS có Điểm TB cao Nhất");
		for (HocSinh i : this.dsHocSinh.getList()) {
			if (i.getDiemTrungBinh() == DiemTBMax) {
				i.xuat();
			}
		}
	}

//5.7 thực hiện xắp sếp và suất theo quickSort
	public void xepTheoQuicSort(DanhSachHocSinh list, int low, int high) {
		if (this.list == null || list.getList().size() == 0) {
			return;
		}
		if (low >= high) {
			return;
		}
//		int middle = 0 + (high - 0) / 2;
		float pivot = list.getList().get(high).getDiemTrungBinh();
		int i = low, j = high;
		while (i <= j) {
			while (list.getList().get(i).getDiemTrungBinh() > pivot) {
				i++;
			}
			while (list.getList().get(j).getDiemTrungBinh() < pivot) {
				j--;
			}
			if (i <= j) {
				Collections.swap(list.getList(), i, j);
				i++;
				j--;
			}
		}
		if (low < j) {
			xepTheoQuicSort(list, low, j);
		}
		if (high > i) {
			xepTheoQuicSort(list, i, high);
		}
	}

	public void thucHienQuickSort() {
		this.xepTheoQuicSort(this.dsHocSinh, 0, this.dsHocSinh.getList().size() - 1);

	}

	public void xuatTheoThuTuDTB() {
		this.thucHienQuickSort();
		this.dsHocSinh.xuat();
	}

//5.8 thưc hiện sắp xếp tên học sinh theo Bubble sort:
	public void xuatTheoTen() {
		int i, j;
		for (i = 0; i < this.dsHocSinh.getList().size() - 1; i++) {
			for (j = this.dsHocSinh.getList().size() - 1; j > i; j--) {
				if (this.dsHocSinh.getList().get(j).getHoTen().codePointAt(0) < this.dsHocSinh.getList().get(i)
						.getHoTen().codePointAt(0)) {
					Collections.swap(this.dsHocSinh.getList(), i, j);
				}
			}
		}
		this.dsHocSinh.xuat();
	}

}
