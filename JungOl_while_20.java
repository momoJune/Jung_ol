/*  100 이하의 두 개의 정수를 입력받아 작은 수부터 큰 수까지 
 *  차례대로 출력하는 프로그램을 작성하시오.
*   입력예​
	10 5

    출력예
	5 6 7 8 9 10
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_20 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		
		if(num<num1) 
		{
			while(num<=num1)
			{
				if(num >100 || num1 > 100) break;
				System.out.print(num);
				if(num<num1)System.out.print(" ");
				++num;
			}
		}
		else
		{
			while(num1<=num)
			{
			if(num >100 || num1 > 100) break;
			System.out.print(num1);
			if(num1<num)System.out.print(" ");
			++num1;
			}
		}
			
	}

}

