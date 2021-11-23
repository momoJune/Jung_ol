/* 
*   입력예​
	

    출력예
	
	
	
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_27 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		      
		      int num = sc.nextInt(); 
		      
		      for(int i =1; i <=num; i++){
		         for(int k = 1;k <=num; k++){
//		        	 System.out.print("("+i+", "+k+")");
		        	 System.out.printf("(%d, %d)",i,k);
		            if(k<num) System.out.print(" ");
		         }
		         System.out.println();
		      }
		   
	}

}

