 /*  두 정수를 입력받아서 나눈 몫과 나머지를 
  * 다음과 같은 형식으로 출력하는 프로그램을 작성하시오.
 
 *입력 예 
 * 35 10
 * 
 * 출력 예

   35 / 10 = 3...5
*/
package jung_ol_oper;

import java.util.Scanner;

public class JungOl_oper_10 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a +" / "+ b + " = " +(a/b)+"..."+(a%b));
		
		
	}

}