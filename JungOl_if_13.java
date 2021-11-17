/* 년도를 입력받아 윤년(leap year)인지 
 * 평년(common year)인지 판단하는 프로그램을 작성하시오.
 *
   입력 예  
   2008
   출력 예
   leap year
*/

package jung_ol_if;

import java.util.Scanner;

public class JungOl_if_13 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(year%400==0 || year%4==0 && year%100 != 0)
			System.out.println("leap year");
		else
			System.out.println("common year");
		
		
		
		sc.close();
	}

}

