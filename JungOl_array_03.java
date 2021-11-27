package jung_ol_if;

import java.util.Scanner;

public class JungOl_array_03 {

	public static void main(String[] args) {
	      String[] chr = new String[10];
	      Scanner sc= new Scanner(System.in);

	      for (int i = 0; i < chr.length; i++) {
	         chr[i] = sc.next();
	      }
	      System.out.printf("%s %s %s",chr[0],chr[3],chr[6]);
	}

}
