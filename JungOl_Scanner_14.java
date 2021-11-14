/* 실수의 yard(야드)를 입력받아 cm(센티미터)로 환산하여 
 * 입력값과 환산한 값을 출력 예와 같이 소수 둘째자리에서 반올림하여 
 * 첫째자리까지 출력하는 프로그램을 작성하시오. (단 1야드 = 91.44cm로 한다.)  
   입력은 "yard? "라고 먼저 출력하고, 실수를 입력받는다.  실수는 "double"로 한다.
 * 	
 * 입력 예
 * yard? 10.1
 * 
 * 출력 예	
 * 10.1yard = 923.5cm
 */

package jung_ol_scanner;

import java.util.Scanner;

public class JungOl_Scanner_14 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		double yar,yar1;
		
		System.out.print("yard? ");
		
		yar = sc.nextDouble();
		
		yar1 = yar* 91.44;
		
		System.out.println(String.format("%.1fyard = %.1fcm",yar, yar1));
		
		
	}

}
