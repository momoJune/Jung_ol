/* 0 부터 100 까지의 정수를 계속 입력받다가 범위를 벗어나는 수가 
 * 입력되면 그 이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램을 
 * 작성하시오.
(평균은 반올림하여 소수 첫째자리까지 출력한다.)

*   입력예​
	55 100 48 36 0 101

    출력예
	sum : 239
	avg : 47.8
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_09 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int score=sc.nextInt();
		int sum = 0;
		int subAcc=1;
		double avg =0;
		while(score>=0 && score<=100)
		{	
			sum += score;
			 avg = (double)(sum)/subAcc;
			++subAcc;
			
			score = sc.nextInt();
		}
		
		System.out.println("sum : "+ sum);
		System.out.println(String.format("avg : %.1f", avg));
		
	}

}

