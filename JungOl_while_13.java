/* 하나의 정수를 입력받아 1부터 입력받은 정수까지의 짝수를 
 * 차례대로 출력하는 프로그램을 작성하시오.
   입력되는 정수는 50이하이다.

*   입력​
	10

    출력예
	2 4 6 8 10
	
	
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_13 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1;
		
		for(num1 = 1; num1 <= num; ++num1)
		{
			if(num<0 || num>50)break;
			if(num1%2==0)
			{
				System.out.print(num1);
				if(num1 <num) System.out.print(" ");
			}
			
		}
			
	}

}

