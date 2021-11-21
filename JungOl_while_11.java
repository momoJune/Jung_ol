/* 문자를 입력받아서 입력받은 문자를 
 * 20번 반복하여 출력하는 프로그램을 작성하시오.
*   입력예​
	A

    출력예
	AAAAAAAAAAAAAAAAAAAA
	
	
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_11 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		
			String chr = sc.next();
			int i;
			for(i = 1; i<=20; ++i)
			{
			
				System.out.print(chr);
			}
			
	}

}

