import java.util.Scanner;

public class Bai3 {
	final static int min = -50;
	final static int max = 50;

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
				a[i][j] = min + (int) (Math.random() * ((max - min) + 1));

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

// tìm số Duong đầu tiên trong mảng 2 chiều : 
	public static void soDuong(int a[][], int soDong, int soCot) {
		boolean flag;
		for (int i = 0; i < soDong; i++) {
			flag = false;
			int soChan = 0;
			for (int j = 0; j < soCot; j++) {
				if (a[i][j] > 0) {
					soChan = a[i][j];
					flag = true;
					break;

				}

			}
			if (flag == true) {
				System.out.println("hàng " + i + " có số dương đầu tiên là : " + soChan);
			} else {
				System.out.println("hàng " + i + " không có số dương ");
			}
		}
	}

	public Bai3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhập số dòng : ");
		int soDong = nhapN(scan);
		System.out.println("nhập số Cột :");
		int soCot = nhapN(scan);
		int a[][] = taoMang(soDong, soCot, scan);
		xuatMang(a, soDong, soCot);
		soDuong(a, soDong, soCot);

	}

}
