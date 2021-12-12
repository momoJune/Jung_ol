
package jung_ol_if;

import java.util.Scanner;

public class JungOl_func04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(maxi(num,num1,num2));
	}
	
	public static int maxi(int a, int b, int c) {
		int temp;
		if(a>b) {
			temp = a;
			a = b;
			b = temp;
		}
		if(b>c) {
			temp = b;
			b = c;
			c = temp;
		}
		return c;
	}

}
