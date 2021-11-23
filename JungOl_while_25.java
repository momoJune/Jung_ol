/* 
*   입력예​
	

    출력예
	
	
	
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_25 
{
	
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 
		 int num = sc.nextInt();
		 int num1 = sc.nextInt();
		 int temp, sum = 0, count = 0;
		 double avg = 0;
		 
		 if(num>num1) {
			 temp = num1;
			 num1 = num;
			 num = temp;
		 }
		 
		 	for(;num<=num1;num++) {
		 		if(num%3==0 || num%5==0) {
		 			sum += num;
		 			count++;
		 			avg = (double)(sum)/count;
		 		}
		 	}
		 	System.out.printf("sum : %d\n", sum);
		 	System.out.printf("avg : %.1f", avg);
		 
      sc.close();
	}

}

