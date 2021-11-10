/* 다음과 같이 출력되는 프로그램을 작성하라.
 * 출력 예
 * My height
   170
   My weight
   68.600000
   
 */


package jung_ol;

public class JungOl_Print_07 
{

	public static void main(String[] args) 
	{
		double weight = 68.6;
		
		System.out.println("My height");
		System.out.println(170);
		System.out.println("My weight");
		System.out.printf("%f", weight);
	}

}
