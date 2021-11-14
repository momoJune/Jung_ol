/* 두 개의 정수를 입력 받아 곱과 몫을 출력하시오.
   (먼저 입력 받는 수가 항상 크며 입력되는 두 정수는 1이상 500이하이다.)
 * 	
 * 입력 예
 * 16 5
 * 
 * 출력 예	
 * 16 * 5 = 80
   16 / 5 = 3
 */

package jung_ol_scanner;

import java.util.Scanner;

public class JungOl_Scanner_07 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int num, num1;
		num  = sc.nextInt();
		num1 = sc.nextInt();
		
		System.out.printf("%d * %d = %d\n",num, num1, num*num1);
		System.out.printf("%d / %d = %d", num, num1, num/num1);
	}

}
