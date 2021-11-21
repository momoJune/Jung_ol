/* 100 이하의 정수를 입력받아서 입력받은 정수부터 100까지의 합을 
 * 출력하는 프로그램을 작성하시오.
 * 
*   입력​
	95

    출력예
	585
	
	
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_14 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int i;
		int sum = 0;
		
		for(i = num; i <= 100 ; ++i )
		{
			if(num<0 || num >100)break;
			sum += i;
		}
		
		System.out.println(sum);
		
			
	}

}

