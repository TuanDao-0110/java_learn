import java.util.Scanner;

public class Bai5 {

	public Bai5() {
		// TODO Auto-generated constructor stub
	}

	final static int min = -100;
	final static int max = 100;

// tạo hàm : 
	public static int[] taoMang(Scanner scan) {
		int n;

		System.out.println("Mời nhập chiều dài của hàm: ");
		n = Integer.parseInt(scan.nextLine());

		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = min + (int) (Math.random() * ((max - min) + 1));
		}
		return a;
	}

// xuất mảng : 
	public static void xuatMang(int a[]) {
		for (int i : a) {
			System.out.print(i + "\t");
		}
	}

	// tìm số các số nguyên gần nhất nhập từ x
	public static void soGanNhat(int a[], int x) {
		int khoangCach = Math.abs((a[0] - x));
		for (int i = 1; i < a.length; i++) {
			int tam = a[i] - x;
			if (Math.abs(tam) < khoangCach) {
				khoangCach = Math.abs(tam);
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (Math.abs(a[i] - x) == khoangCach) {
				System.out.println("Số gần nhất với " + x + " là : " + a[i] + "\t");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a[] = taoMang(scan);
		xuatMang(a);

		System.out.println("\n");
		System.out.println("Nhập số x :");
		int x = Integer.parseInt(scan.nextLine());
		soGanNhat(a, x);
	}

}
