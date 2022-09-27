import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DanhSachHocSinh {
	public ArrayList<HocSinh> list;

	public ArrayList<HocSinh> getList() {
		return list;
	}

	public void setList(ArrayList<HocSinh> list) {
		this.list = list;
	}

	public DanhSachHocSinh() {
		this.list = new ArrayList<HocSinh>(); // TODO Auto-generated constructor stub
	}

	public void xuat() {
		for (HocSinh i : this.list) {
			i.xuat();
		}
	}

	public void taoDulieu() {
		try {
			FileReader reader = new FileReader("src/task.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] listInfo = line.split(" # ");

				// Kiá»ƒm tra lÃ  trÆ°á»Ÿng phÃ²ng hay nhÃ¢n viÃªn thÆ°á»ng

				HocSinh hs = new HocSinh();
				hs.setHoTen(listInfo[1]);
				hs.setNamSinh(Integer.parseInt(listInfo[2]));
				hs.setNoiSinh(listInfo[3]);
				hs.setDiaChi(listInfo[4]);
				hs.setDiemHoa(Float.parseFloat((listInfo[5])));
				hs.setDiemLy(Float.parseFloat(listInfo[6]));
				hs.setDiemToan(Float.parseFloat(listInfo[7]));
				
				this.list.add(hs);

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
