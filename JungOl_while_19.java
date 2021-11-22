/* 10 이하의 자연수 n을 입력받아 "JUNGOL​"을 n번 
 * 출력하는 프로그램을 작성하시오.
 * 
*   입력예 ​
	4

    출력예
	JUNGOL​
	JUNGOL​
	JUNGOL​
	JUNGOL​
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_19 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 1;
		
		while(i <= n)
		{
			System.out.println("JUNGOL");
			++i;
		}
			
	}

}

