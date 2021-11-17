/* 두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 
 * 아니면 "C" 라고 출력하는 프로그램을 작성하시오.
 * 
 *
   입력 예 
   4.3 3.5					4.0 2.9

   출력 예
   B						C
*/

package jung_ol_if;

import java.util.Scanner;

public class JungOl_if_05 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();
		double num1 = sc.nextDouble();
		
		if(num >= 4.0 && num1 >= 4.0) System.out.println("A");
		else if(num >= 3.0 && num1 >= 3.0)System.out.println("B");
		else 
		{
			System.out.println("C");
		}
			
		
		
	}

}
