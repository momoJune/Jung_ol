 /* 두 개의 정수를 입력받아서 다음과 같이 4가지 관계연산자의 결과를 출력하시오.
    이때 입력받은 두 정수를 이용하여 출력하시오.
    (JAVA는 1이면 true, 0이면 false를 출력한다.)
 * 입력 예 
 * 4 5
 * 
 * 출력 예
 *  4 > 5 --- 0
	4 < 5 --- 1
	4 >= 5 --- 0
	4 <= 5 --- 1
*/
package jung_ol_oper;

import java.util.Scanner;

public class JungOl_oper_06 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num, num1;
		num =sc.nextInt();
		num1 =sc.nextInt();
		
		System.out.println(num + " > " + num1 + " --- " + (num > num1 ? "1" : "0"));
		System.out.println(num + " < " + num1 + " --- " + (num < num1 ? "1" : "0"));
		System.out.println(num + " >= " + num1 + " --- " + (num >= num1 ? "1" : "0"));
		System.out.println(num + " <= " + num1 + " --- " + (num <= num1 ? "1" : "0"));
		
		
	}

}