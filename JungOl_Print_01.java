	/*다음과 같이 출력되는 프로그램을 작성하라.
 	(각 요소들은 10칸씩 공간을 확보하여 오른쪽으로 정렬하여 출력한다.)
 	
 	<출력 예>
 	
 	  item   count     price  //10칸의 공간 오른쪽 정렬
       pen      20       100
      note       5        95
    eraser     110        97
    
	*/

package jung_ol;

public class JungOl_Print_01 
{

	public static void main(String[] args) 
	{
		
		String item = "item", count = "count", price = "price";
		String pen = "pen", note = "note", eraser = "eraser";
		
		int num = 100;
		
		System.out.printf("%10s%10s%10s\n", item, count, price);
		System.out.printf("%10s%10d%10d\n", pen, num-80, num);
		System.out.printf("%10s%10d%10d\n", note, num-95, num-5);
		System.out.printf("%10s%10d%10d", eraser, num+10, num-3);
		
		
	}

}
