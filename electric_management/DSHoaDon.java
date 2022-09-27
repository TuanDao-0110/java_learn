import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*/
 * Mục đích:
 * Người Tạo:
 * Ngày:
 * Version:
 */
public class DSHoaDon {
	// Attributes:
	public ArrayList<KhachHang> ds;
	public int slNguoiVn;
	public int slNguoiNN;
	// setters vs getters:

	public int getSlNguoiVn() {
		return slNguoiVn;
	}

	public void setSlNguoiVn(int slNguoiVn) {
		this.slNguoiVn = slNguoiVn;
	}

	public int getSlNguoiNN() {
		return slNguoiNN;
	}

	public void setSlNguoiNN(int slNguoiNN) {
		this.slNguoiNN = slNguoiNN;
	}

	public ArrayList<KhachHang> getDs() {
		return ds;
	}

	public void setDs(ArrayList<KhachHang> ds) {
		this.ds = ds;
	}
	// constructors:

	public DSHoaDon(ArrayList<KhachHang> ds) {
		super();
		this.ds = ds;
	}

	public DSHoaDon() {
		this.ds = new ArrayList<KhachHang>();

	}

// xuat 
	public void xuat() {
		int k = 1;
		for (KhachHang i : this.ds) {
			System.out.print("Stt: " + k++ + "\t");
			i.tinhThanhTien();
			i.xuat();
		}
	}
// method 

	// 1. tính tổng cho từng loại kh
	public void tinhTongSoLuong() {
		int sLKHVN = 0;
		int slKHNN = 0;
		for (KhachHang i : this.ds) {
			if (i instanceof KHVN) {
				sLKHVN++;
			} else if (i instanceof KHNuocNgoai) {
				slKHNN++;
			}
		}
		this.slNguoiNN = slKHNN;
		this.slNguoiVn = sLKHVN;
		System.out.println("số lượng Khách hàng việt nam là: " + sLKHVN);
		System.out.println("số lượgn khách hàng nước ngoài là: " + slKHNN);
	}

//2 . tính trung bình thành tiền cho khác ngước ngoài
	public void tinhTB() {
		float tong = 0;
		for (KhachHang i : this.ds) {
			if (i instanceof KHNuocNgoai) {
				tong += i.thanhTien;
			}
		}
		System.out.println("Trung bình khách nước ngoài: " + tong / this.slNguoiNN);
	}

// 3. xuất hóa đơn tháng 9 : 
	public void xuatThang9() {
		System.out.println("Danh Sách KH tháng 9:");
		for (KhachHang i : this.ds) {
			if (i.thang.equalsIgnoreCase("9")) {
				i.xuat();
			}
		}
	}

	public void taoDuLie() {
		try {
			FileReader reader = new FileReader("src/DSNV.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] listInfo = line.split(" # ");
				KhachHang task;
				if (listInfo[0].equalsIgnoreCase("-1")) {
					task = new KHVN(listInfo[1], listInfo[2], listInfo[3], listInfo[4], listInfo[5],
							Integer.parseInt(listInfo[6]), Float.parseFloat(listInfo[7]), listInfo[8],
							Integer.parseInt(listInfo[9]));
					this.ds.add(task);
				} else if (listInfo[0].equalsIgnoreCase("-2")) {
					task = new KHNuocNgoai(listInfo[1], listInfo[2], listInfo[3], listInfo[4], listInfo[5],
							Integer.parseInt(listInfo[6]), Float.parseFloat(listInfo[7]), listInfo[8]);
					this.ds.add(task);
				}

			}
			reader.close();// ÄÃ³ng táº­p tin
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
