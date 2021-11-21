/* 10 이하의 과목수 n이 주어진다.
정수로 주어진 n개 과목의 점수를 입력받아서 실수 평균을 구하여 출력하고 
평균이 80점이상이면 "pass", 80점 미만이면 "fail"이라고 출력하는 프로그램을 작성하시오.

평균은 반올림하여 소수 첫째자리까지 출력한다.
​
*   입력​
	4
	75 80 85 90

    출력예
	avg : 82.5
	pass
	
	
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_16 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		double avg=0;
		int sum = 0;
		int subject;
		int i;
		int subCount = sc.nextInt();
		
		for(i = 1; i <=subCount; ++i)
		{
			subject = sc.nextInt();
			sum += subject;
			avg = (double)(sum)/subCount;
		}
			System.out.println(String.format("avg : %.1f " , avg));
			
			if(avg>=80) System.out.println("pass");
			else System.out.println("fail");
	}

}

