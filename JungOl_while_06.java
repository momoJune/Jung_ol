/* 정수를 입력받아서 3의 배수가 아닌 경우에는 아무 작업도 하지 않고 

3의 배수인 경우에는 3으로 나눈몫을 출력하는 작업을 반복하다가

-1이 입력되면 종료하는 프로그램을 작성하시오.

* 입출력예​
5
12
4
21
7
100
-1
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_06 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	     int num;
//	     
//	     num = sc.nextInt(); 
//	     
//	     while(num!=-1)
//	     {
//	    	 if(num%3==0)
//	    	 {
//	    		 System.out.println(num/3);	    		 
//	    	 }
//	    	 num = sc.nextInt(); 
//	    	
//	     }
		
		do
		{
			num = sc.nextInt(); 
			if(num%3==0)
			{
	    		 System.out.println(num/3);	    		 
	    	 }
			
		}
		 while(num!=-1);
	}

}

