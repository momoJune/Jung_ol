/* 정수를 입력받아 0 이면 "zero" 양수이면 "plus" 
 * 음수이면 "minus" 라고 출력하는 프로그램을 작성하시오.
 *
   입력 예  
   0
   출력 예
   zero
*/

package jung_ol_if;

import java.util.Scanner;

public class JungOl_if_12 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num==0) System.out.println("zero");
		else if(num < 0)System.out.println("minus");
		else
		{
			System.out.println("plus");
		}
		sc.close();
	}

}
