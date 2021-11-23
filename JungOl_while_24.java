/* 
*   입력예​
	

    출력예
	
	
	
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_24 
{
	
	public static void main(String[] args) 
	{
		
		   Scanner sc = new Scanner(System.in);
		      
		      int num = sc.nextInt();
		      
		      for(int i = 1;i<=10;i++)
		      {
		         System.out.print(num*i);
		         if(i<10)System.out.print(" ");
		      }
			
	}

}

