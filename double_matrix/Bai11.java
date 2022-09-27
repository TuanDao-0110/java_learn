import java.util.Scanner;

public class Bai11 {

	public Bai11() {
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

	// kiểm tra xem một cột ma trận có tăng hay không ?
	public static void tangDan(int a[][], int soDong, int soCot) {
		boolean flag = false;
		for (int i = 0; i < soCot; i++) {

			for (int j = 0; j < soDong - 1; j++) {
				if (a[j][i] > a[j + 1][i]) {
					flag = true;
					break;

				}

			}
			if (flag == true) {
				System.out.println("Cột "+i+" của mảng không tăng dần");
			} else {
				System.out.println("Cột "+i+" của mảng tăng dần");
			}
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
		tangDan(a, soDong, soCot);
	}

}
