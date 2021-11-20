/* 0 이 입력될 때까지 정수를 계속 입력받아 
 * 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오.

*   입력예​
	1 2 3 4 5 6 7 8 9 10 0

    출력예
	5
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_10 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int count = 0;
		do
		{
			num = sc.nextInt();
			
			if(num%3!=0)
			{
				if(num%5!=0) ++count;
			}
			
		}while(num!=0);
		
		System.out.println(count);
	}

}

