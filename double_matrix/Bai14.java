import java.util.Scanner;

public class Bai14 {

	public Bai14() {
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
	// tìm mảng có giá trị xuất hiện nhiều nhất là bao nhiêu :

	public static int[][] giaTri(int a[][], int soDong, int soCot) {
		int b[][] = a;
		int c[][] = new int[soDong][soCot];
		for (int x = 0; x < soDong; x++) {
			for (int y = 0; y < soCot; y++) {

				for (int i = 0; i < soDong; i++) {
					for (int j = 0; j < soCot; j++) {
						if (a[x][y] == b[i][j]) {
							c[x][y]++;
						}
					}
				}
			}
		}
		return c;
	}

// tìm giá trị lớn nhất trong mảng phụ 
	public static int giaTriLonNhat(int c[][], int soDong, int soCot) {
		int giaTriLonNhat = 0;
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if (c[i][j] > giaTriLonNhat) {
					giaTriLonNhat = c[i][j];
				}
			}
		}
		return giaTriLonNhat;
	}

	// xuất ra số có được xuất hiện nhiều nhất trong mảng
	public static void soDuocXuatHienNhieuNhat(int a[][], int c[][], int soDong, int soCot, int giaTriLonNhat) {

		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if (c[i][j] == giaTriLonNhat) {
					System.out.println("giá trị :" + a[i][j] + " có số lần lập lại lớn nhất là :" + c[i][j]);
					break;
				}
			}
		}
	}

// cách 2 thử chuyển về mảng 1 chiều ; 
	public static int[] mang1Chieu(int a[][], int soDong, int soCot) {
		int[] mangMoi = new int[soCot * soDong];
		int i = 0;
		for (int x = 0; x < soDong; x++) {
			for (int y = 0; y < soCot; y++) {
				mangMoi[i++] = a[x][y];
			}
		}

		return mangMoi;
	}

// xuất mảng 1 chiều : 
	public static void xuatMang1Chieu(int mangMoi[]) {
		for (int i : mangMoi) {
			System.out.print(i + "\t");
		}
	}
// từ mảng 1 chiều ta sẽ tính được có bao nhiêu số xuất nhiều nhất trong mảng 

	public static void soXuatHienNhieuNhat(int mangMoi[]) {
		int b[] = new int[mangMoi.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (mangMoi[i] == mangMoi[j] && j < i) {
					break;
				}
				if (mangMoi[i] == mangMoi[j] && j >= i) {
					b[i]++;
				}
			}

		}
		int soLonNhat = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] > soLonNhat) {
				soLonNhat = b[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] == soLonNhat) {
				System.out.println("Phần tử xuất hiện nhiều nhất là : " + mangMoi[i] + " với số lần xuất hiện là : "
						+ b[i] + " lần");
			}
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
		System.out.println("\n");
		System.out.println("mảng 1 chiều mới là : ");

		giaTri(a, soDong, soCot);
		int mangMoi[] = mang1Chieu(a, soDong, soCot);
		xuatMang1Chieu(mangMoi);
		System.out.println("\n");
//		int c[][] = giaTri(a, soDong, soCot);
//		int giaTriLonNhat = giaTriLonNhat(c, soDong, soCot);
//		soDuocXuatHienNhieuNhat(a, c, soDong, soCot, giaTriLonNhat);
		soXuatHienNhieuNhat(mangMoi);
	}

}
