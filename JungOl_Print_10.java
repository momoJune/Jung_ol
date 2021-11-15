/* 다음 "출력 예"와 같이 출력하는 프로그램을 작성하시오.
 * 출력 예
 * 
   My name is Hong
 */


package jung_ol;

public class JungOl_Print_10 
{

	public static void main(String[] args) 
	{
		String[] a = {"Seoul", "10,312,545", "+91,375"};
		String[] b = {"Pusan", "3,567,910", "+5,868"};
		String[] c = {"Incheon", "2,758,296", "+64,888"};
		String[] d = {"Daegu", "2,511,676", "+17,230"};
		String[] e = {"Gwangju","1,454,636","+29,774"};
		
		
		
		System.out.printf("%15s%15s%15s\n", a);
		System.out.printf("%15s%15s%15s\n", b);
		System.out.printf("%15s%15s%15s\n", c);
		System.out.printf("%15s%15s%15s\n", d);
		System.out.printf("%15s%15s%15s", e);
	}

}
