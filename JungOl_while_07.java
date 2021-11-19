/* 정수를 입력받아 1부터 입력받은 정수까지를 
 * 차례대로 출력하는 프로그램을 작성하시오.

*   입력예​
	5
    출력예
    1 2 3 4 5
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_07 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
	     int num = sc.nextInt();
	     int num1 = 1;
	     
	     	while(num1<=num)
		    {
	     		System.out.print(num1);
	     		++num1;
		    	 if(num1<=num)
		    	 System.out.print(" ");
		    		 
		    	 
		    }
	     
	}

}

