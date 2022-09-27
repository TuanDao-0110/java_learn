import java.util.Scanner;

public class Bai8 {

	public Bai8() {
		// TODO Auto-generated constructor stub
	}

	public static int dem(int n) {
		if (n < 10) {
			return 1;
		}
		return dem(n / 10) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println(98 / 10);
		System.out.println("Mời nhập n : ");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println("kết quả là : " + dem(n));

	}

}
