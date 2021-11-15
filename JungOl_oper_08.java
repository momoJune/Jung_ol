 /*  3개의 정수를 입력 받아 첫 번째 수가 가장 크면 1 아니면 0을 출력하고 
  * 세 개의 수가 모두 같으면 1 아니면 0을 출력하는 프로그램을 작성하시오.

   (JAVA는 1이면 true, 0이면 false를 출력한다.)
 
 *입력 예 
 * 10 9 9
 * 
 * 출력 예

   true false
*/
package jung_ol_oper;

import java.util.Scanner;

public class JungOl_oper_08 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		a =sc.nextInt();
		b =sc.nextInt();
		c =sc.nextInt();
		boolean max = (a > b && a > c), same = (a==b || a==c);
		
		System.out.println(max+ " "+ same);
	}

}