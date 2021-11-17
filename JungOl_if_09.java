/* 3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중
 *  최소값을 출력하는 프로그램을 작성하시오.
 *
   입력 예 
	18 -5 10
   출력 예
   -5
*/

package jung_ol_if;

import java.util.Scanner;

public class JungOl_if_09 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num  = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int min;
		
		min = (num < num1 ? num : num1);
		min = (min < num2 ? min : num2);
		System.out.println(min);
		sc.close();
	}

}
