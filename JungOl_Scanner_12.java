/* 세 개의 정수를 입력받아 합과 평균을 출력하는 
 * 프로그램을 작성하시오.
 * (단 평균은 소수 이하를 버림하여 정수 부분만 출력한다.)
 * 	
 * 입력 예
 * 20 50 100
 * 
 * 출력 예	
 *  sum = 170
	avg = 56	
 */

package jung_ol_scanner;

import java.util.Scanner;

public class JungOl_Scanner_12 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println("sum = "+ (a+b+c));
		System.out.println("avg = "+ ((a+b+c)/3));
	}

}
