package jung_ol_if;
/*10개의 정수를 입력받아 홀수 번째 입력받은 정수의 합과 짝수 번째 입력받은 
 * 정수의 합을 출력하는 프로그램을 작성하시오.
 * 
	입력 예
	10 20 25 66 83 7 22 90 1 100
 	출력 
	odd : 141
	even : 283
	
 */		           
import java.util.Scanner;		

public class JungOl_array_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int even =0;
		int odd =0;
		
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
			if(i%2==0)odd += num[i];
			else even += num[i];
		}
		System.out.println("odd : " +odd );
		System.out.println("even : " +even );
		
	}	
}
