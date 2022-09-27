import java.util.Scanner;

public class Bai1 {

	public Bai1() {
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

// tìm vị trí của giá trị nhỏ nhất ; 
	public static void giaTriNhoNhat(int a[]) {
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[index]) {
				index = i;
			}
		}
		System.out.println("Vậy giá trị nhỏ nhất là : " + a[index] + " tại vị trị : " + index);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a[] = taoMang(scan);
		xuatMang(a);
		System.out.println("\n");
		giaTriNhoNhat(a);

	}

}
