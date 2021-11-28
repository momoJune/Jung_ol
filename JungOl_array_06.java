package jung_ol_if;
/*10개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 
 * 프로그램을 작성하시오.(입력받을 정수는 1000을 넘지 않는다.)
 * 
	입력 예
	5 10 8 55 6 31 12 24 61 2 //10 8 55 5 6 31 12 24 5 2
 	출력 
	2
 */		// 4 7 1 9 2             
import java.util.Scanner;		

public class JungOl_array_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int min=0;
		
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
			if(num[i]>1000)break;
		}
		for(int j=0;j<num.length-1;j++) { 
			if(num[j]<num[j+1]) {
				min = num[j];
				num[j] = num[j+1];
				num[j+1] = min;
			}
			else {min = num[j+1];
			}
		}
		
		System.out.println(min); 
	}
}
