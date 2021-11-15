 /*  국어 영어 수학 컴퓨터 과목의 점수를 정수로 입력받아서 총점과 
  * 평균을 구하는 프로그램을 작성하시오. (단 평균의 소수점 이하는 버림 한다.)
 
 *입력 예 
 * 70 95 63 100
 * 
 * 출력 예

    sum 328
	avg 82
*/
package jung_ol_oper;

import java.util.Scanner;

public class JungOl_oper_09 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d,sum,avg;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		sum = a+b+c+d;
		avg = sum/4;
		
		System.out.println("sum "+ sum);
		System.out.printf("avg " + avg);
		
		
	}

}