import java.util.Scanner;

public class Bai1 {


	public Bai1() {
		// TODO Auto-generated constructor stub
	}

// tính tổng 
	public static double tong(double n) {
		
		if (n == 1) {
			return  (1 /(n +1));
		}
	return tong( n -1)+ n/ (n +1);		
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("nhập n ");
		double n =  Double.parseDouble(scan.nextLine());
		System.out.println(tong(n));

	}

}
