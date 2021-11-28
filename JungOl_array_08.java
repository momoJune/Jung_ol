package jung_ol_if;
/*10개의 정수를 입력받아 100 미만의 수 중 가장 큰 수와 100 이상의
 *수 중 가장 작은 수를 출력하는 프로그램을 작성하시오.
(입력되는 정수의 범위는 1이상 10,000 미만이다. 만약 해당하는 수가 
없을 때에는 100 을 출력한다.)
 * 
	입력 예
	88 123 659 15 443 1 99 313 105 48
 	출력 
	99 105
	
	100 미만의 수로 입력 가능한 범위는 1~99, 100 이상의 수로 입력
	 가능한 범위는 100~9999 이다. 

	입력값보다 큰수(작은수)를 초기값으로 정하고 작업이 끝난 후 초기값이 
	그대로 있다면 해당하는 수가 없는 것이다.
 */		           
import java.util.Scanner;		

public class JungOl_array_08 {
	public static void main(String[] args) {
		
		int [] num = new int[10];
		int min = 0;
		int max =10000;
		int min1 = 100; 
		int max1 = 100;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
			
			if(num[i]<1 && num[i]>9999) break; //입력범위 1~9999 가 아니면 종료
		}
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>0 && num[i]<100) { // num[i] 1~99 
				if(num[i]> min) {
					min = num[i]; 
					min1 = min;
				}
			}
			else if(num[i]>=100 && num[i]<10000) { // num[i] 100~9999
					if(num[i]<max) {
						max = num[i]; 
						max1 = max;
					}
				}
			
		}
		System.out.print(min1 +" "+max1);
	}	
}
