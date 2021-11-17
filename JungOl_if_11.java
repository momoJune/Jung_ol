/* 두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.
 *
   입력 예 
   50 85
   출력 예
   35
*/

package jung_ol_if;

import java.util.Scanner;

public class JungOl_if_11 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		
		System.out.println((num < num1 ? num1 : num)-(num < num1 ? num : num1));
		
		sc.close();
	}

}
