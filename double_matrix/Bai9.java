import java.util.Scanner;

public class Bai9 {

	public Bai9() {
		// TODO Auto-generated constructor stub
	}

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

	// tính tổng các giá trị lẻ trên 1 cột :
	public static void tongSoLeCot(int a[][], int soDong, int soCot) {
		int tong = 0;
		for (int i = 0; i < soCot; i++) {

			for (int j = 0; j < soDong; j++) {
				if (a[j][i] % 2 != 0) {
					tong += a[j][i];

				}

			}

			System.out.println("tổng số nguyên của cột " + i + " là : " + tong);
			tong = 0;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("nhập số dòng : ");
		int soDong = nhapN(scan);
		System.out.println("nhập số Cột :");
		int soCot = nhapN(scan);
		int a[][] = taoMang(soDong, soCot, scan);
		xuatMang(a, soDong, soCot);
		tongSoLeCot(a, soDong, soCot);
	}

}
