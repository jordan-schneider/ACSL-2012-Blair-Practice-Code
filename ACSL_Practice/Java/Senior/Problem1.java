package Senior;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Problem1 {
	public static void main(String args[]) {
		Scanner aScanner = new Scanner(System.in);
		int result = 0;
		while(true){
			System.out.println("Enter the input: ");
			String p = aScanner.nextLine();
			p = toOctal(p);
			String q;
			for(int i = 0; i<5;i++){
				boolean test = true;
				q = "";
				ArrayList<Integer>sortThis = new ArrayList<Integer>();
				for(int j = 0; j<p.length();j++){
					sortThis.add(Integer.parseInt(p.substring(j,j+1)));
				}
				Collections.sort(sortThis);
				for(int j = 0; j<sortThis.size();j++){
					q = q + sortThis.get(j);
				}
				//p-q
				result = subtract(p,q);
				p = Integer.toOctalString(result);
				String last = p.substring(0,1);
				for(int j = 1; j<p.length();j++){
					if(Integer.parseInt(last)>Integer.parseInt(p.substring(j,j+1))){
						test = false;
					}
					last = p.substring(j,j+1);
				}
				if(test == true){
					break;
				}
			}
			System.out.println(Integer.parseInt(p,8));
		}
		
		
	}
	
	
	public static String toOctal(String p) {
		int k = Integer.parseInt(p);
		return Integer.toOctalString(k);
	}
	
	public static int subtract(String p,String q) {
		int pk = Integer.parseInt(p,8);
		int qk = Integer.parseInt(q,8);
		return pk-qk;
	}
}
