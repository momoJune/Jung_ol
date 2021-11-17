/* 남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인이라고 하자.
   성별('M', 'F')과 나이를 입력받아 "MAN"(성인남자), "WOMAN"(성인여자), 
   "BOY"(미성년남자), "GIRL"(미성년여자)을 구분하여 출력하는 프로그램을 작성하시오.
 * 
 *
   입력 예 
   F 15

   출력 예
   GIRL
*/

package jung_ol_if;

import java.util.Scanner;

public class JungOl_if_06 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String sex = sc.next(); //M , F 입력
		int age = sc.nextInt(); // 나이 입력
		
		if(sex .equals("M"))  					
		{
			if(age>=18)						
			{
				System.out.println("Man");	
			}
			else
			{
				System.out.println("BOY");	
			}
		}
		
		else 
			if(sex .equals("F"))
			{
				if(age>=18)						
				{
					System.out.println("WOMAN");	
				}
				else
				{
					System.out.println("GIRL");	
				}
			}
		sc.close();
	}

}
