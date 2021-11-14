/* 세 개의 실수를 입력 받아 반올림하여 소수 셋째 자리까지 
 * 출력하는 프로그램을 작성하시오.
 * 	
 * 입력 예
 *  1.2568
	95.21438
	526.851364
 * 
 * 출력 예	
 *  1.257
	95.214
	526.851
 */

package jung_ol_scanner;

import java.util.Scanner;

public class JungOl_Scanner_08 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		double num,num1,num2;
		
		num = sc.nextDouble();
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		System.out.printf("%.3f\n%.3f\n%.3f", num, num1, num2);
	}

}
