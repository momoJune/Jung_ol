/* 정수를 계속 입력받다가 100 이상의 수가 입력이 되면 
 * 마지막 입력된 수를 포함하여 합계와 평균을 출력하는 프로그램을 작성하시오.

(평균은 반올림하여 소수 첫째자리까지 출력한다.)
* ​
* 입력 예​
1 2 3 4 5 6 7 8 9 10 100
출력 예
155
14.1
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_05 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int score;
		int sum = 0;
		int avg;
		int subCount = 0;
		
		do
		{
			score = sc.nextInt();
			sum = sum + score;
			subCount = ++subCount; 
		
		}while(score < 100);
		
		double answer = (double)(sum)/subCount;
			
		System.out.println(sum);
		System.out.println(String.format("%.1f",answer));
		
	      
	}

}

