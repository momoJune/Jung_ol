/* 키를 입력받아 출력하는 프로그램을 작성하라.
	(입력할때 "height = " 문장을 먼저 출력하고 키를 입력 받아야 합니다.)
 * 	
 * 입력 예
 * height = 170
 * 
 * 출력 예	
 * Your height is 170cm.

 */

package jung_ol_scanner;

import java.util.Scanner;

public class JungOl_Scanner_06 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int height;
		
		System.out.print("height = ");
		 height = sc.nextInt();
		 System.out.println("Your height is " +height+"cm.");
		
	}

}
