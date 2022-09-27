import java.util.Scanner;

/*/
 * Mục đích: tạo lớp supperClass để quản ly 
 * Người tạo:
 * Ngày:
 * Version:
 */
public class ThanhVien {
// 1. Attributes:

	protected String hoTen;
	protected int namSinh;
	protected String noiSinh;
	protected String diaChi;

//2. getters vs setters	
	public String getHoTen() {
		return hoTen;

	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getNoiSinh() {
		return noiSinh;
	}

	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

//3. contructors: 
	public ThanhVien(String hoTen, int namSinh, String noisinh, String diaChi) {
		super();
		this.hoTen = hoTen; 
		this.namSinh = namSinh;
		this.noiSinh = noisinh;
		this.diaChi = diaChi;
	}

	public ThanhVien() {

	}

//4.nhập+ xuất : 
	public void xuat() {
		System.out.print("Tên:" + this.hoTen + "\t Năm Sinh: " + this.namSinh + "\t Nơi Sinh:" + this.noiSinh
				+ "\t Địa Chỉ: " + this.diaChi);
	}

	public void nhap(Scanner scan) {
		System.out.println("Mời nhập Tên:");
		this.hoTen = scan.nextLine();
		System.out.println("Mời Nhập Năm Sinh:");
		this.namSinh = Integer.parseInt(scan.nextLine());
		System.out.println("Mời Nhập Địa Chỉ:");
		this.diaChi = scan.nextLine();
		System.out.println("Mời Nhập nơi Sinh:");
		this.noiSinh = scan.nextLine();

	}
}
