import java.util.Scanner;

public class Bai7 {

	public Bai7() {
		// TODO Auto-generated constructor stub
	}

	public static double tong(double n) {
		if (n == 1) {
			return 1;
		}
		return tong(n - 1) + n;
	}

	public static double tinh(double n) {
		if (n == 1) {
			return 1;
		}
		return tinh(n - 1) + (1 / tong(n));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("mời nhập số n : ");
		double n = Double.parseDouble(scan.nextLine());
		System.out.println("kết quả là : " + tinh(n));
	}

}
