/* 나이를 입력받아 20살 이상이면 "adult"라고 출력하고 그렇지 않으면 몇 년후에 
 * 성인이 되는지를 "○ years later"라는 메시지를 출력하는 프로그램을 작성하시오.
 * 
 *
   입력 예
   18

   출력 예
   2 years later
*/

package jung_ol_if;

import java.util.Scanner;

public class JungOl_if_03 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		if(age>=20)
		{
			System.out.println("adult");
		}
		else 
		{
			System.out.println(20-age + " years later");
		}
		
		sc.close();
	}

}
