/* 10개의 정수를 입력받아 입력받은 수들 중 짝수의 개수와 
 * 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오.
*   입력예​
	10 20 30 55 66 77 88 99 100 15

    출력예
	even : 6
	odd : 4
	
	
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_23 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i;
		int k;
		int even = 0;
		int odd = 0;
		for(i=1;i<=10;++i)
		{
			k = sc.nextInt();
			if(k%2==0) even++;
			else odd++;
		}
			System.out.println("even : "+even);
			System.out.println("odd : "+odd);
	}

}

