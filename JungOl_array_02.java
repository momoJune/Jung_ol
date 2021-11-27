package jung_ol_if;

public class JungOl_array_02 {

	public static void main(String[] args) {
		 int[] num = new int[10];
	      num = new int[]{1,2,3,4,5,6,7,8,9,10};
	      
	      for (int i = 0; i < num.length; i++) {
	         System.out.print(num[i]);
	         if(i<num.length-1) System.out.print(" ");
	      }
	}

}
