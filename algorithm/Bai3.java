import java.util.Scanner;

public class Bai3 {

	public Bai3() {
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
// tìm gía trị dương nhỏ nhất  : 

	public static int giaTriDuongNhoNhat(int a[]) {
		int index = -1;
		int soDuong = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0 & a[i] > soDuong) {
				index = i;
				soDuong = a[i];

			}

		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a[] = taoMang(scan);
		xuatMang(a);
		System.out.println("\n");
		int index = giaTriDuongNhoNhat(a);
		if (index != -1) {
			System.out.println("Giá trị dương nhỏ nhất nằm ở vị trị là : " + index);
		} else {
			System.out.println("Không có giá trị dương ");
		}

	}

}
