import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*/
 * Mục Đích:
 * Người Tạo:
 * Ngày:
 * Version
 */
public class DS {
	public ArrayList<HoaDon> ds;

	public DS(ArrayList<HoaDon> ds) {
		super();
		this.ds = ds;
	}

	public DS() {
		this.ds = new ArrayList<HoaDon>();
	}

	public ArrayList<HoaDon> getDs() {
		return ds;
	}

	public void setDs(ArrayList<HoaDon> ds) {
		this.ds = ds;
	}

	public void xuat() {
		for (HoaDon i : this.ds) {
			i.tinhTien();
			i.xuat();
			System.out.println("\n");
		}
	}

	public void taoDuLie() {
		try {
			String string = "src/task.txt";
			FileReader reader = new FileReader(string);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] listInfo = line.split(" # ");
				HoaDon hd;
				if (Integer.parseInt(listInfo[2]) > 30) {
					hd = new HoaDonTheoNgay(listInfo[0], Float.parseFloat(listInfo[1]), Integer.parseInt(listInfo[2]));
					this.ds.add(hd);
				} else if (Integer.parseInt(listInfo[2]) <=30){
					hd = new HoaDonTieng(listInfo[0], Float.parseFloat(listInfo[1]), Integer.parseInt(listInfo[2]));
					this.ds.add(hd);

				}

			}
			reader.close();// Ã„ÂÃƒÂ³ng tÃ¡ÂºÂ­p tin
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
