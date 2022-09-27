import java.util.Scanner;

public class Bai7 {

	public Bai7() {
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

// tìm giá trị đầu tiên thuộc đoạn [x;y] cho trước 
	public static int giaTri(int a[], int x, int y) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < y && a[i] > x) {
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
		System.out.println("nhập số x trong đoạn [x;y] muốn cho");
		int x = Integer.parseInt(scan.nextLine());
		System.out.println("nhập số y trong đoạn [x;y] muốn cho");
		int y = Integer.parseInt(scan.nextLine());

		int index = giaTri(a, x, y);
		if (index != -1) {
			System.out.println("Giá trị đầu tiền thuộc đoạn [x;y] là :" + " với vị trí là : " + index
					+ " có giá trị là : " + a[index]);
		} else {
			System.out.println("Không có giá trị nào của mảng a thuộc đoạn [x;y]");
		}
	}

}
