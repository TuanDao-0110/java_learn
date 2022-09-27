import java.util.Scanner;

public class Bai6 {

	public Bai6() {
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

// tìm gái đoạn chứa gía trị nhỏ nhất và bé nhât : 
	public static void timKiem(int a[]) {
		int min = 0;
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Vậy khoảng " + "[" + min + ";" + max + "] chứa tất cả giá trị mảng 1 chiều a");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a[] = taoMang(scan);
		xuatMang(a);

		System.out.println("\n");
		timKiem(a);
	}

}
