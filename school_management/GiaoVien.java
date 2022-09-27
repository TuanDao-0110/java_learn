import java.util.Scanner;

/*/
 * Mục Đích: SubClass for supperClass ThanhVien
 * Người Tạo: 
 * Ngày:
 * Version:
 */
public class GiaoVien extends ThanhVien {
//1.Attribute;
	public int namBatDauDay;
	public String chuyenMon;
	
	public int thamNien;
	final int NAM_HIEN_TAI = 2021;
//2.get vs setters:

	public int getNamBatDauDay() {
		return namBatDauDay;
	}
	
	public void setThamNien(int thamNien) {
		this.thamNien = thamNien;
	}

	public int getThamNien() {
		return thamNien;
	}

	public void setNamBatDauDay(int namBatDauDay) {
		this.namBatDauDay = namBatDauDay;
	}

	public String getChuyenMon() {
		return chuyenMon;
	}

	public void setChuyenMon(String chuyenMon) {
		this.chuyenMon = chuyenMon;
	}

//3.Constructors:
	public GiaoVien(String hoTen, int namSinh, String noiSinh, String diaChi, int nambatdau, String chuyenmon) {
		super(hoTen, namSinh, noiSinh, diaChi);
		// TODO Auto-generated constructor stub
		this.namBatDauDay = nambatdau;
		this.chuyenMon = chuyenmon;
	}

	public GiaoVien(String hoTen, int namSinh, String noisinh, String diaChi, int namBatDauDay, String chuyenMon,
		int thamNien) {
	super(hoTen, namSinh, noisinh, diaChi);
	this.namBatDauDay = namBatDauDay;
	this.chuyenMon = chuyenMon;
	this.thamNien = thamNien;
}

	public GiaoVien() {
		// TODO Auto-generated constructor stub
	}
//4. nhập xuất; 

	@Override
	public void nhap(Scanner scan) {
		// TODO Auto-generated method stub
		super.nhap(scan);
		System.out.println("Mời Nhập năm bắt đầu dạy:");
		this.namBatDauDay = Integer.parseInt(scan.nextLine());
		boolean flag = true;
		do {
			System.out.println("Mời Nhập 1.Chuyên Môn tự nhiên và 2. Xã Hội:");
			int n = Integer.parseInt(scan.nextLine());
			if (n == 1) {
				this.chuyenMon = "Tự Nhiên";
				flag = false;
			} else if (n == 2) {
				this.chuyenMon = "Xã Hội";
				flag = false;
			}
		} while (flag);
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.println("\t Năm Bắt Đầu Dạy:" + this.namBatDauDay + "\t Chuyên Môn: " + this.chuyenMon + "\t Thâm niêm: "+ this.thamNien+" năm");
	}
public void tinhThamNiem() {
	this.thamNien =this.NAM_HIEN_TAI- this.namBatDauDay; 
}
}
