package jung_ol_if;

import java.util.Scanner;

public class JungOl_array_05 {

	public static void main(String[] args) {
		double[] avg = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		Scanner sc = new Scanner(System.in);
		
		int ban  = sc.nextInt()-1;
		int ban1 = sc.nextInt()-1;
		int sum;
		System.out.println((double)(avg[ban]+avg[ban1]));
	}

}
