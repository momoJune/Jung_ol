/* 1번은 개, 2번은 고양이, 3번은 병아리로 정하고 번호를 
 * 입력하면 번호에 해당하는 동물을 영어로 출력하는 프로그램을 
 * 작성하시오.
해당 번호가 없으면 "I don't know."라고 출력한다.

개-dog

고양이-cat

병아리-chick​ 
 *
   입력 예
	Number? 2
   출력 예
   cat
*/

package jung_ol_if;

import java.util.Scanner;

public class JungOl_if_10 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number? ");
		
		int num = sc.nextInt();
		String anim = "";
		
		switch(num)
		{
		case 1 :
			anim = "dog";
			break;
			
		case 2 :
			anim = "cat";
			break;
			
		case 3 :
			anim = "chick";
			break;
			
		default :
			System.out.println("I don't know.");
		}
		System.out.printf("%s", anim);
		
		sc.close();
		
	}
	
}

		
