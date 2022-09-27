import java.util.Scanner;

/*/
 * Mục Đích:
 * 
 */
public class XuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		DsGiaoDich ds = new DsGiaoDich();
		ds.taoDulieu();
		
		ds.xuat();
		ds.tinhGiaoDich();
		ds.xuatTBTienGiaoDichDat();
	}

}
