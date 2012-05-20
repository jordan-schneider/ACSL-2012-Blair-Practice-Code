import java.util.*;

public class Problem5 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		String inp;
		String st[];
		String hex = "0123456789ABCDEF";
		String x,y,z;
		String out;
		String a,b,c;
		
		while (true) {
			try {
				System.out.println("Enter the input: ");
				inp = cin.nextLine();
				inp = inp.toUpperCase();
				st = inp.split(",");
				
				x = "";
				y = "";
				z = "";
				for (int i=0; i<10; i++) {
					a = Integer.toBinaryString(hex.indexOf(st[0].charAt(i)));
					b = Integer.toBinaryString(hex.indexOf(st[1].charAt(i)));
					c = Integer.toBinaryString(hex.indexOf(st[2].charAt(i)));
					if (a.length()==3) { a = "0" + a; }
					if (a.length()==2) { a = "00" + a; }
					if (a.length()==1) { a = "000" + a; }
					if (b.length()==3) { b = "0" + b; }
					if (b.length()==2) { b = "00" + b; }
					if (b.length()==1) { b = "000" + b; }
					if (c.length()==3) { c = "0" + c; }
					if (c.length()==2) { c = "00" + c; }
					if (c.length()==1) { c = "000" + c; }
					x = x + a;
					y = y + b;
					z = z + c;
				}
				out = ""; // 1
				for (int i=0; i<40; i++) {
					if (x.charAt(i)=='1' || y.charAt(i)=='1') {
						out = out + "1";
					}
					else {
						out = out + "0";
					}
				}
				System.out.println(toHex(out));
				
				out = ""; // 2
				for (int i=0; i<40; i++) {
					if (and(y.charAt(i),z.charAt(i))) {
						out = out + "1";
					}
					else {
						out = out + "0";
					}
				}
				System.out.println(toHex(out));
				
				out = ""; // 3
				for (int i=0; i<40; i++) {
					if (x.charAt(i)=='1' && or(y.charAt(i),z.charAt(i))) {
						out = out + "1";
					}
					else {
						out = out + "0";
					}
				}
				System.out.println(toHex(out));
				
				out = ""; // 4
				for (int i=0; i<40; i++) {
					if (!(!and(x.charAt(i),y.charAt(i)) || z.charAt(i)=='1')) {
						out = out + "1";
					}
					else {
						out = out + "0";
					}
				}
				System.out.println(toHex(out));
				
				out = ""; // 5
				for (int i=0; i<40; i++) {
					if (!or(x.charAt(i),y.charAt(i)) == !or(y.charAt(i),z.charAt(i))) {
						out = out + "1";
					}
					else {
						out = out + "0";
					}
				}
				System.out.println(toHex(out));
			}
			catch (Exception e) {
				
			}
		}
	}
	
	public static boolean and(char a,char b) {
		return a=='1' && b=='1';
	}
	
	public static boolean or(char a,char b) {
		return a=='1' || b=='1';
	}
	
	public static String toHex(String k) {
		String hex = "0123456789ABCDEF";
		String out = "";
		
		for (int i=0; i<10; i++) {
			out = out + hex.charAt(Integer.parseInt(k.substring(i*4,i*4+4),2));
		}
		return out;
	}
}
