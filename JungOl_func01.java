/*반지름의 길이를 전달받아 넓이를 출력하는 함수를 작성하고 반지름의 
 * 길이를 입력받아 함수를 호출하여 넓이를 출력하는 프로그램을 작성하시오.
단, 원주율(π)은 3.14로 하고 반올림하여 소수 둘째자리까지 출력한다. 
원의 넓이 = 반지름(r) * 반지름(r)​ * 원주율(π)​이다.
 * 
	입력 예
	10
 * 출력 예
	314.00
 */
package jung_ol_if;

import java.util.Scanner;

public class JungOl_func01 {
	
	public static void circle(int r) {
		float print = r * r * 3.14f;
		System.out.printf("%.2f", print);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		circle(r);
	}
	

}
