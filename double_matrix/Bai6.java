import java.util.Scanner;

public class Bai6 {

	public Bai6() {
		// TODO Auto-generated constructor stub
	}

	// nhập n :
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("nhập giá trị >1 ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	// nhập mảng 2 chiều :
	public static int[][] taoMang(int soDong, int soCot, Scanner scan) {
		int[][] a = new int[soDong][soCot];
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.println("a[" + i + "]" + "[" + j + "] =");
				a[i][j] = Integer.parseInt(scan.nextLine());
			}
		}
		return a;

	}

	// xuất mảng 2 chiều :
	public static void xuatMang(int a[][], int soDong, int soCot) {
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

// kiểm tra xem  mảng 2 chiều có toàn số âm hay không ?
	public static void soDuong(int a[][], int soDong, int soCot) {
		boolean flag = false;
		for (int i = 0; i < soDong; i++) {

			for (int j = 0; j < soCot; j++) {
				if (a[i][j] < 0) {
					flag = true;
					break;

				}

			}

		}
		if (flag == true) {
			System.out.println("Mảng có sô âm");
		} else {
			System.out.println("Mảng có số toàn số dương");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int soDong = nhapN(scan);
		int soCot = nhapN(scan);
		int a[][] = taoMang(soDong, soCot, scan);
		System.out.println("Giá trị mảng A là : ");
		xuatMang(a, soDong, soCot);

		System.out.println("\n");
		soDuong(a, soDong, soCot);
	}

}
