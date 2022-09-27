import java.util.Scanner;

public class Bai15 {

	public Bai15() {
		// TODO Auto-generated constructor stub
	}

	// nhập n :
	public static int nhapN(Scanner scan) {
		int n;
		do {

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

// check thử  mảng có phải mảng thưa hay không 
	public static void mangThua(int a[][], int soDong, int soCot) {
		int soKhong = 0;
		int soKhacKhong = 0;
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if (a[i][j] == 0) {
					soKhong++;
				} else {
					soKhacKhong++;
				}
			}
		}
		if (soKhong > soKhacKhong) {
			System.out.println("Ma trận a là ma trận thưa ");
		} else {
			System.out.println("Ma trận a không phải là ma trận thưa ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập số dòng ");
		int soDong = nhapN(scan);
		System.out.println("Nhập số cột ");
		int soCot = nhapN(scan);
		int a[][] = taoMang(soDong, soCot, scan);
		System.out.println("Giá trị mảng A là : ");
		xuatMang(a, soDong, soCot);

		System.out.println("\n");
		mangThua(a, soDong, soCot);
	}

}
