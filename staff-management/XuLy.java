import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		thucHien(scan);

	}

	private static void doMenu() {
		System.out.println("1. Mời Chọn Thêm Nhân Viên:");
		System.out.println("2. Mời Chọn Xuất Nhân Viên:");
		System.out.println("3. Mời Chọn Xuất Tổng Lương Công Ty:");
		System.out.println("4. Mời Chọn Xuất Danh Sách Nhân Viên Lương Cao Nhất:");
		System.out.println("0. Thoát");
	}

	private static void thucHien(Scanner scan) {
		ListDSNV ds = new ListDSNV();

		boolean flag = true;
		// nhập giả 1 loạt biến
		ds.nhapGia();
		// tính tổng lương của danh sách đang có
		ds.luongNv();

		do {
			doMenu();
			int n = Integer.parseInt(scan.nextLine());
			switch (n) {
			case 1:
				QuanLyNhanVien nv1 = new QuanLyNhanVien();
				nv1.nhap(scan);
				ds.themNV(nv1);
				break;
			case 2:
				ds.xuatNV();
				break;
			case 3:
				ds.tongLuongCuaCTY();
				break;
			case 4:
				ArrayList<QuanLyNhanVien> nv = ds.listNhanVienLuongCaoNhat();
				for (QuanLyNhanVien i : nv) {
					i.xuat();
				}
				break;
			case 0:
				flag = false;
				break;
			default:
				break;
			}

		} while (flag);
	}
}
