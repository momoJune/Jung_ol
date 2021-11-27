package jung_ol_if;

import java.util.Scanner;

public class JungOl_array_04 {

	public static void main(String[] args) {
	      int[] num = new int[100];
	      int count = 0;
	      int minus = 2;
	      Scanner sc = new Scanner(System.in);
	      
	      for (int i = 0; i < num.length; i++) {
	         num[i] = sc.nextInt();
	         count++;
	         if(num[i]==0)break;
	      }
	      for(int i= count-1;i>0;i--) {
	         System.out.print(num[count-minus]);
	         if(i>1)System.out.print(" ");
	      minus++;
	      }
	}

}
