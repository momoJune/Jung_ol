/* 10부터 20까지의 숫자를 차례대로 출력하는 
 * 프로그램을 작성하시오.for문을 사용하세요.
	

    출력예
	10 11 12 13 14 15 16 17 18 19 20
	
	
*/

package jung_ol_if;


public class JungOl_while_12 
{
	
	public static void main(String[] args) 
	{
		
		int num;
			
		for(num=10; num <=20 ; ++num)
		{
			System.out.print(num);
			if(num <20)System.out.print(" ");
		}
	}

}

