/* 100 이하의 자연수 n을 입력받고 n개의 정수를 입력받아 
 * 평균을 출력하는 프로그램을 작성하시오.
(평균은 반올림하여 소수 둘째자리까지 출력하도록 한다.)   

*   입력예​
	3
	99 65 30

    출력예
	64.67
	
	
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_22 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i=1;
		int k;
		int sum = 0;
		double avg = 0;
		
		while(i<=n)
		{
			
			k= sc.nextInt();
			if(k>100)break;
			
			sum += k;
			avg = (double)(sum)/n;
			++i;
		}
		System.out.printf("%.2f", avg);
			
	}

}

