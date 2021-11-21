/* 아래와 같이 출력되는 프로그램을 작성하시오.
*   ​
	

    출력예
    2 3 4 5 6
	3 4 5 6 7
	4 5 6 7 8
	5 6 7 8 9
	6 7 8 9 10
	
	
	
*/

package jung_ol_if;



public class JungOl_while_17 
{
	
	public static void main(String[] args) 
	{
		
		int i;
		int j=2;
		int s = 2; //3
		
		for(i=1; i <=5 ; ++i)
		{
			
			for(i=1; i <=5 ; ++i)
			{
				System.out.print(j);
				if(i<5)System.out.print(" ");
				++j;
			}
			System.out.println();
			if(j<=10)
			{
			i=1;
			++s;
			j=s;
			}
			
		}
			
	}

}

