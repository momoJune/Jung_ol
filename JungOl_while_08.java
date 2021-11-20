/* 0 이상의 정수들이 공백으로 구분되어 반복적으로 주어진다.
0이 입력되면 반복문을 멈추고 그 전까지 입력받은 수들에 대하여
홀수의 개수와 짝수의 개수를 출력하는 프로그램을 작성하시오.
*   입력예​
	9 7 10 5 33 65 0

    출력예
    odd : 5
	even : 1
*/

package jung_ol_if;

import java.util.Scanner;


public class JungOl_while_08 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num;
		int evenNum=0;
		int oddNum=0;
		    do
		    {
		    	num = sc.nextInt();
		    	
		    	if(num%2==0)
		    	{
		    	if(num!=0)++evenNum;
		    	}
		    	else
		    	{
		    		++oddNum;
		    	}
		    }
		    while(num != 0);
		    
		    System.out.println("odd : "+ oddNum);
		    System.out.println("even : "+ evenNum);
	}

}

