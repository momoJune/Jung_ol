/*문자열 "~!@#$^&*()_+|" 를 출력하는 함수를 작성하고 정수를 입력받아 
 * 입력받은 수만큼 함수를 호출하는 프로그램을 작성하시오.
 * 주의 : 문자열을 잘 확인하세요. ('%'이 없음)
 * 문자열을 복사해서 출력해도 됩니다.
 * 
	입력 예
	3
 * 출력 예
	~!@#$^&*()_+|
	~!@#$^&*()_+|
	~!@#$^&*()_+|
 */
package jung_ol_if;

import java.util.Scanner;

public class JungOl_func03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		funct01(num);	
}
	
	public static void funct01(int num){
		for(int i=1;i<=num;i++)
		System.out.println("~!@#$^&*()_+|");
	}
	
	

}
