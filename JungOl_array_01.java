package jung_ol_if;

import java.util.Scanner;

public class JungOl_array_01 {

	public static void main(String[] args) {
		      String[] str = new String[10];
		      Scanner sc = new Scanner(System.in);
		      
		      for (int i = 0; i < str.length; i++) {
		         str[i] = sc.next();
		      }
		      for(String s : str) {
		         System.out.print(s);
		      }
	}

}
