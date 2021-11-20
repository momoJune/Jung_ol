/* 삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고, 
 * "Continue? "에서 하나의 문자를 입력받아 그 문자가 'Y' 나 'y' 
 * 이면 작업을 반복하고 다른 문자이면 종료하는 프로그램을 작성하시오.

(넓이는 반올림하여 소수 첫째자리까지 출력한다.)​

* 
* 입출력 예​
	Base = 11
	Height = 5
	Triangle width = 27.5
	Continue? Y
	Base = 10
	Height = 10
	Triangle width = 50.0
	Continue? N
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_02 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int base, height;
		double width;
		String str = "";
		
		do
		{
			System.out.print("Base = ");
			base = sc.nextInt();
			System.out.print("Height = ");
			height = sc.nextInt();
			
			width = (double)(base*height)/2;
			
			System.out.printf("Triangle width = %.1f\n", width);
			
			System.out.print("Continue? ");
			str = sc.next();
			
		}while(str.equalsIgnoreCase("Y"));
		
	}

}

