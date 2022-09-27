import java.util.Scanner;

public class Bai5 {

	public Bai5() {
		// TODO Auto-generated constructor stub
	}
	public static double tinh(double n) {
		if (n == 1) {
			return 1 /(n*(n  +1));
		}
		return tinh(n - 1) + (1 / (n*(n  +1)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("nhập số n ");
		double n = Double.parseDouble(scan.nextLine());
		System.out.println("kêt quả là : " + tinh(n));

	}

}
