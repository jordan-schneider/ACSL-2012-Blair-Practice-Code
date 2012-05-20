package Senior;
import java.util.Scanner;


public class Problem2 {

	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int a,b,k;
		String inp;
		String inps[];
		int num;
		int count;
		String ns;
		
		while (true) {
			System.out.println("Enter input:");
			inp = cin.nextLine();
			inps = inp.split(",");
			a = Integer.parseInt(inps[0]);
			b = Integer.parseInt(inps[1]);
			k = Integer.parseInt(inps[2]);
			count = 0;
			
			for (int n = 0; n<18; n++) {
				for (int m = 0; m<18; m++) {
					num = (int) (Math.pow(a,n) * Math.pow(b,m));
					if (num <=99999 && num>=10000) {
						ns = Integer.toString(num);
						for (int i=0; i<5; i++) {
							if (ns.substring(i,i+1).equals(Integer.toString(k))) count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}
