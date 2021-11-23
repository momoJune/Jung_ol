/* 
*   입력예​
	

    출력예
	
	
	
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_26 
{
	
	public static void main(String[] args) 
	{
		   Scanner sc = new Scanner(System.in);
		      
		      int num = sc.nextInt(); 
		      int num1 = sc.nextInt();
		      
		      for(int i =1; i <=num; i++){
		         for(int k = 1;k <=num1; k++){
		        	 System.out.print(i*k);
		            if(k<num1) System.out.print(" ");
		         }
		         System.out.println();
		      }
			
	}

}

