import java.util.Scanner;

/*Mục Đích: supClass cho Thành Viên;
 * Người tạo:
 *Ngày:
 *Version:
 */
public class HocSinh extends ThanhVien {
//1. Attribute:
	private String xepLoai;
	public float diemToan;
	public float diemLy;
	public float diemHoa;
	public float diemTrungBinh;
//2. getter vs setters:

	public float getDiemToan() {
		return diemToan;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

//3. constructors:
	public HocSinh(String hoTen, int namSinh, String noiSinh, String diaChi, float diemtoan, float diemly,
			float diemhoa) {
		super(hoTen, namSinh, noiSinh, diaChi);
		// TODO Auto-generated constructor stub
		this.diemToan = diemtoan;
		this.diemHoa = diemhoa;
		this.diemLy = diemly;
	}

	public HocSinh() {
		// TODO Auto-generated constructor stub
	}

//4. nhap xuất;
	@Override
	public void nhap(Scanner scan) {
		// TODO Auto-generated method stub
		super.nhap(scan);
		System.out.println("Nhập Điểm Toán:");
		this.diemToan = Integer.parseInt(scan.nextLine());
		this.diemHoa = Integer.parseInt(scan.nextLine());
		this.diemLy = Integer.parseInt(scan.nextLine());
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.println("\t Điểm Toán: " + this.diemToan + "\t Điểm Hóa: " + this.diemHoa + "\t Điểm Lý: "
				+ this.diemLy + "\t Điểm Trung Bình là: " + this.diemTrungBinh + "\t xếp loại:"+ this.xepLoai);
	}

	public void tinhTB() {
		this.diemTrungBinh = ((this.diemHoa + this.diemToan + this.diemLy) / 3);
	}

	public void xepLoaiHS() {
		if (this.diemTrungBinh < 5) {
			this.xepLoai = "Yếu";
		} else if (this.diemTrungBinh < 7 && this.diemTrungBinh >= 5) {
			this.xepLoai = "Trung Bình";
		} else if (this.diemTrungBinh >= 7 && this.diemTrungBinh < 8) {
			this.xepLoai = "Khá";
		}else if (this.diemTrungBinh>=8 && this.diemTrungBinh<9) {
			this.xepLoai = "Giỏi";
		}else {
			this.xepLoai = "Xuất Sắc";
		}
	}
}
