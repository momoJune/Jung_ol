/* 한 개의 정수를 입력받아 양수(positive integer)인지 음수(negative number)
 * 인지 출력하는 작업을 반복하다가 0이 입력되면 종료하는 프로그램을 작성하시오.

* 입출력예의 진한글씨는 출력값입니다.
* ​
* 입출력 예​
number? 10
positive integer /
number? -10
negative number/
number? 0
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_04 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("number? ");
			int num = sc.nextInt();
				if(num==0)break;
				System.out.println(num>0 ? "positive integer" : "negative number"); 
			
		}
	      
	}

}
