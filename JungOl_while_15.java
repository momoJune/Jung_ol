/* 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 
 * 개수를 각각 출력하는 프로그램을 작성하시오.
 * 
*   입력​
	10 15 36 99 100 19 46 88 87 13

    출력예
	Multiples of 3 : 4
	Multiples of 5 : 3
	
	
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_15 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int i;
		int odd = 0;
		int even =0;
		
		for (i = 1; i <=10;++i)
		{
			num = sc.nextInt();
			if(num%3==0) ++odd;
			if(num%5==0) ++even;
			
		}
		System.out.println("Multiples of 3 : "+ odd);
		System.out.println("Multiples of 5 : "+ even);
	}

}

