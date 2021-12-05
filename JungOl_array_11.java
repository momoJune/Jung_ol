package jung_ol_if;
/*100개의 정수를 입력받을 수 있는 배열을 선언한 후 정수를 차례로 입력 받다가 -1이 입력되면 입력을 
 * 중단하고 -1을 제외한 마지막 세 개의 정수를 출력하는 프로그램을 작성하시오.
 *  (입력받은 정수가 -1을 제외하고 3개 미만일 경우에는 -1을 제외하고 입력받은 정수를 모두 출력한다.)
 * 
	입력 예
	30 20 10 60 80 -1
 	출력 
	10 60 80
 */		           
import java.util.Scanner;		

public class JungOl_array_11 {
	public static void main(String[] args) {//12 13  -1
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];
		int i;
		for(i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
			if(num[i]==-1) {
				if(i>2 && i<=num.length) System.out.printf("%d %d %d",num[i-3],num[i-2],num[i-1]);
				else if(i==2)System.out.printf("%d %d",num[i-2],num[i-1]);
				else if(i==1)System.out.printf("%d",num[i-1]);
			}
					
		}
	}
}

