import java.util.Scanner;

public class Bai6 {

	public Bai6() {
		// TODO Auto-generated constructor stub
	}

	public static long tinh(int x, long n) {
		if (n == 1) {
			return (long) Math.pow(x, n);
		}
		return tinh(x, n - 1) + (long) Math.pow(x, n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("nhập số x : ");
		int x = Integer.parseInt(scan.nextLine());
		System.out.println("nhập số n : ");
		long n = Long.parseLong(scan.nextLine());
		System.out.println("kết quả là :" + tinh(x, n));
	}

}
