package jung_ol_if;
/*10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 
 * 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오.
   평균은 반올림하여 소수첫째자리까지 출력한다.
	입력 예
	95 100 88 65 76 89 58 93 77 99
 	출력 
	sum : 446
	avg : 78.8
 */		           
import java.util.Scanner;		

public class JungOl_array_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int oddSum = 0;
		int evenSum	= 0;
		float avg = 0;
		
		for(int i=0;i<num.length;i++) {
			num[i]= sc.nextInt();
			if(i%2!=0) oddSum+=num[i];
			else { evenSum += num[i];
				avg = (float)(evenSum)/(num.length/2);
			}
			
		}
		System.out.println("sum : "+oddSum);
		System.out.println("avg : "+avg);
	}	
}
