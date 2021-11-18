/* 100 이하의 양의 정수만 입력된다.
while 문을 이용하여 1부터 입력받은 정수까지의 
합을 구하여 출력하는 프로그램을 작성하시오.

* 입력 예​
	10
  출력 예
  55
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_03 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		int num1;
		
		num1 = num - 1;
		
		sum = num +num1;
		
			while(num1>=1)
		{
				--num1;
			sum = sum + num1;
		}
			System.out.println(sum);
	}

}

