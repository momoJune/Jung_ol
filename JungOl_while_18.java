/* 구구단의 일부를 다음과 같이 출력하는 프로그램을 작성하시오.
 * 곱셈의 결과는 오른쪽으로 맞추어 출력을 하고 결과값 사이의 
 * 공백은 3칸으로 한다.

   출력형식 예) 2_*_1_=__2___ (_는 공백을 나타내는 것임)​
	
    출력예
	2 * 1 =  2   2 * 2 =  4   2 * 3 =  6   2 * 4 =  8   2 * 5 = 10
	3 * 1 =  3   3 * 2 =  6   3 * 3 =  9   3 * 4 = 12   3 * 5 = 15
	4 * 1 =  4   4 * 2 =  8   4 * 3 = 12   4 * 4 = 16   4 * 5 = 20
	
*/
 
package jung_ol_if;



public class JungOl_while_18 
{
	
	public static void main(String[] args) 
	{
		int i;
		int j=2;
		int k=1;
		int v=2;
		
		for(i = 1; i <=5; ++i)
		{
			for(i = 1; i <=5; ++i)
			{
			System.out.printf("%d * %d =%3d",j,k,j*k);
			if(i<5)System.out.print("   ");
			++k;
			}
				System.out.println();
				if(j<4)
				{
					i=1;
					k=1;
					++v;
					j=v;
				}
			
		}
		
			
	}

}

