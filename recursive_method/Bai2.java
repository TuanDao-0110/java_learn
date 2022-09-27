import java.util.Scanner;

public class Bai2 {

	public Bai2() {
		// TODO Auto-generated constructor stub
	}

	public static double cang(double n) {
		if (n == 1) {
			return Math.sqrt(n);
		}
		return Math.sqrt(n+cang(n - 1) );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println(Math.sqrt(4));
		System.out.println("nhập số n ");
		double n = Double.parseDouble(scan.nextLine());
		System.out.println("số đó là : " + cang(n));
	}

}
