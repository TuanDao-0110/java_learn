import java.util.Scanner;

/*
 *Mục Đích: tạo file xử lý:
 */
public class XuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		DanhSachToanTruong ds = new DanhSachToanTruong();
		ds.taoDanhSachToanTruong();
		doMenu(ds, scan);


	};

	public static void doMenu(DanhSachToanTruong ds, Scanner scan) {
	
		boolean flag = true;
		do {
			System.out.println("1.Mời Nhập");
			System.out.println("2.Xuất Giáo Viên Có Thâm Niên Nhất");
			System.out.println("3.Xuất Giấo Viên >5 năm vs thuộc khối tự nhiên");
			System.out.println("4.Tìm điểm trung bình cao nhất");
			System.out.println("5.Tìm Hs Có điêm TB cao nhất");
			System.out.println("6.Xuất DS Toàn trường bao gồm cả xếp loại cho học sinh");
			System.out.println("7. sắp xép HS Có điểm trung bình cao nhất");
			System.out.println("8.sắp sếp HS theo tên");
			System.out.println("0. Để thoát");
			int n = Integer.parseInt(scan.nextLine());
			switch (n) {
			case 1:
				ds.nhap(scan);
				break;
			case 2:
				ds.thamNiem();
				ds.timGiaoVienThamNienNhat();
				break;
			case 3:
				ds.timGiaoVienKhoiTuNhie();
				break;
			case 4:
				ds.timDiemTBMax();
				ds.xuatDSHSCoDiemTBMax();
				break;
			case 5:
				ds.xuatDSHSCoDiemTBMax();
				break;
			case 6:
				ds.xuat();
				break;
			case 7:
				ds.xuatTheoThuTuDTB();
				break;
			case 8:
				ds.xuatTheoTen();
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("nhập sai cú pháp");
				break;
			}
		} while (flag);
	}
}
