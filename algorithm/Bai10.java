import java.util.Scanner;

public class Bai10 {

	public Bai10() {
		// TODO Auto-generated constructor stub
	}

	final static int min = -10000;
	final static int max = 10000;

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

	// cho giá trị -1 nếu không có số nguyên nào lớn 2020
	public static int soLon(int a[]) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 2020) {
				index = i;
				break;
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
		int index = soLon(a);

		if (index != -1) {
			System.out.println("Số đầu tiên lớn hớn 2020 là : " + a[index]);
		} else {
			System.out.println("Không có số nào lớn hơn 2020.");
		}
	}

}
