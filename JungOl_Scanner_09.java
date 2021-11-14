/* 실수 2개와 한 개의 문자를 입력 받아 출력하되 실수는 반올림하여 소수 둘째자리까지 출력하는 프로그램을작성하시오.
   (C, C++, Java 의 경우 실수는 "double"로 선언하세요.)
 * 	
 * 입력 예
 *  12.2536
	526.129535
	A
 * 
 * 출력 예	
 *  12.25
	526.13
	A
 */

package jung_ol_scanner;

import java.util.Scanner;

public class JungOl_Scanner_09 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		double num,num1;
		String a;
		
		num = sc.nextDouble();
		num1= sc.nextDouble();
		a = sc.next();
		
		System.out.println(String.format("%.2f\n%.2f\n%s",num,num1,a));
		
		
	}

}
