package jung_ol_if;
/*6명의 몸무게를 입력받아 몸무게의 평균을 출력하는 프로그램을 작성하시오.
출력은 반올림하여 소수 첫째자리까지로 한다.
 * 
	입력 예
	23.2 39.6 66.4 50.0 45.6 48.0
 	출력 
	45.5
 */		           
import java.util.Scanner;		

public class JungOl_array_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] num = new double[6];
		double sum = 0;
		double avg = 0;
			for(int i=0;i<num.length;i++) {
				num[i] = sc.nextDouble();
				sum += num[i];
			}
			avg = (double)(sum)/num.length;
			System.out.printf("%.1f",avg);
	}		
}

