/* 자연수 n을 입력받고 1부터 홀수를 차례대로 더해나가면서 
 * 합이 n 이상이면 그 때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오.
 
	입력 예
	100
	출력 예
	10 100*/
package jung_ol_if;

import java.util.Scanner;

public class JungOl_while_28 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int evenSum = 0;
		int evenCount = 0;
		
		for(int i=1;i>0;i=i+2) {
			evenSum += i;
			evenCount++;
			if(evenSum>=n)break;
		}
		System.out.println(evenCount+" "+ evenSum);
	}
}


