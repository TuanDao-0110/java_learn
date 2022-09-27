import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*/
 * Mục Đích: tạo Danh sách 
 * Người tạo :
 * Ngày:
 * Version:
 */
public class DsGiaoDich {
	public ArrayList<Dat> ds;

	public ArrayList<Dat> getDs() {
		return ds;
	}

	public void setDs(ArrayList<Dat> ds) {
		this.ds = ds;
	}

	public DsGiaoDich(ArrayList<Dat> ds) {
		super();
		this.ds = ds;
	}

	public DsGiaoDich() {
		this.ds = new ArrayList<Dat>();
	}

//xuat
	public void xuat() {
		for (Dat i : this.ds) {
			i.tinhTien();
			i.xuat();
			System.out.println("\n");
		}
	}

// tính số lượng giao dịch cho từng loại
	public void tinhGiaoDich() {
		int datThuong = 0;
		int datCaoCap = 0;
		int nhaCaoCap = 0;
		int nhathuong = 0;
		for (Dat i : this.ds) {
			if (i instanceof DatLoaiA) {
				datCaoCap++;
			} else if (i instanceof DatLoaiBC) {
				datThuong++;
			} else if (i instanceof Nha) {
				nhaCaoCap++;
			} else if (i instanceof NhaBeo) {
				nhathuong++;
			}
		}
		System.out.println("Giao dịch đất thường là : " + datThuong + " Giao dịch đất loại A: " + datCaoCap
				+ "Giao dịch nhà cao cấp:" + nhaCaoCap + "Giao dịch nhà thường là: " + nhathuong);
	}
	
	public void xuatTBTienGiaoDichDat() {
		int count = 0;
		int Tb = 0;
		for (Dat i : this.ds) {
			if (i instanceof DatLoaiA || i instanceof DatLoaiBC) {
				count++;
				Tb += i.thanhTien;
			}
		}
		System.out.println("Trung Bình Thành Tiền Giao Dịch Đất là:" + Tb / count);
	}

	public void taoDulieu() {
		try {
			FileReader reader = new FileReader("src/Ds.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] listInfo = line.split(" # ");
				 		
				if (listInfo[0].equalsIgnoreCase("-1")) {
					Dat	task = new DatLoaiBC(listInfo[1], listInfo[2], Float.parseFloat(listInfo[3]), listInfo[4],
							Float.parseFloat(listInfo[5]));
						this.ds.add(task);
				} 
				else if (listInfo[0].equalsIgnoreCase("-2")) {
					Dat task = new DatLoaiA(listInfo[1], listInfo[2], Float.parseFloat(listInfo[3]), listInfo[4],
							Float.parseFloat(listInfo[5]));
					 this.ds.add(task);
				}
				else if (listInfo[0].equalsIgnoreCase("-3")) {
					Dat	task = new Nha(listInfo[1], listInfo[2], Float.parseFloat(listInfo[3]), listInfo[4],
							Float.parseFloat(listInfo[5]), listInfo[6]);
						this.ds.add(task);
				} else if (listInfo[0].equalsIgnoreCase("-4")) {
					Dat	task = new NhaBeo(listInfo[1], listInfo[2], Float.parseFloat(listInfo[3]), listInfo[4],
							Float.parseFloat(listInfo[5]), listInfo[6]);
						this.ds.add(task);
				}
				
				
			}
			reader.close();// Ã„ÂÃƒÂ³ng tÃ¡ÂºÂ­p tin
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
