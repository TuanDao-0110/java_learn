import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*/
 * Mục Đích: tạo Ds giáo viên
 * Người Tạo:
 * Ngày:
 * Version:
 */
public class DanhSachGiaoVien {
	public ArrayList<GiaoVien> list;

	public DanhSachGiaoVien() {

		this.list = new ArrayList<GiaoVien>();
	}

	public ArrayList<GiaoVien> getDs() {
		return list;
	}

	public void setDs(ArrayList<GiaoVien> list) {
		this.list = list;
	}
public void xuat () {
	for ( GiaoVien i : this.list) {
		
		i.xuat();
	}
}
	public void taoDulieu() {
		try {
			FileReader reader = new FileReader("src/task1.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] listInfo = line.split(" # ");

				// Kiá»ƒm tra lÃ  trÆ°á»Ÿng phÃ²ng hay nhÃ¢n viÃªn thÆ°á»ng
				
					GiaoVien gv = new GiaoVien(listInfo[1], Integer.parseInt(listInfo[2]), listInfo[3], listInfo[4],
							Integer.parseInt(listInfo[5]), listInfo[6]);
					this.list.add(gv);
				
			}
			// Táº¡o dá»¯ liá»‡u cho má»—i nhÃ¢n sá»±

			// ThÃªm nhÃ¢n sá»± vÃ o list

			reader.close();// ÄÃ³ng táº­p tin
		} catch (

		IOException e) {
			e.printStackTrace();
		}
	}
}
