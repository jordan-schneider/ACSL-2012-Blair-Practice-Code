import java.util.Scanner;

public class Prob1 {

	public static String toBase8(int input){
		String s = "";
		while(input > 0){
			s = (input%8) + s;
			input = (int) Math.floor(input / 8);
		}
		return s;
	}
	
	public static String orderDigit(String input){
		input = input.trim();
		char[] digits = new char[input.length()];
		digits = input.toCharArray();
		char[] sortedDigits = new char[input.length()];
		int sortDigitIndex = 0;
		for(int i=0; i<input.length(); i++){
			int minASCII = Integer.MAX_VALUE;
			int minIndex = -1;
			for(int j=0; j<input.length(); j++){
				if((int) digits[j] < minASCII){
					minASCII = (int) digits[j];
					minIndex = j;
				}
			}
			digits[minIndex] = 'z';
			sortedDigits[sortDigitIndex] = (char) minASCII;
			sortDigitIndex++;
		}
		String ordered = "";
		for(int i=0; i<input.length(); i++){
			ordered = ordered + sortedDigits[i];
		}
		return ordered;
	}
	
	public static int toBase10(String input){
		char[] digits = input.toCharArray();
		int[] numDigits = new int[input.length()];
		for(int i=0; i<input.length(); i++){
			numDigits[i] = Integer.parseInt(digits[i]+"");
		}
		int sum10 = 0;
		for(int i=0; i<input.length(); i++){
			sum10 += Math.pow(8, i)*numDigits[input.length()-i-1];
		}
		return sum10;
	}
	
	public static boolean isOrdered(String input){
		String orderedString = orderDigit(input);
		boolean isOrdered = false;
		if(orderedString.equals(input)){
			isOrdered = true;
		}
		return isOrdered;
	}
	
	/**
	 * @param args
	 * @author Dennis Zhao
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		for(int i=1; i<=5; i++){
			System.out.print("Input number: ");
			int input = kboard.nextInt();
			kboard.nextLine();
			
			String p1 = toBase8(input);
			//System.out.println("a"+p1);
			String q1 = orderDigit(p1);
			//System.out.println("b"+q1);
			int p1Num10 = toBase10(p1);
			//System.out.println("c"+p1Num10);
			int q1Num10 = toBase10(q1);
			//System.out.println("d"+q1Num10);
			int dif1_10 = p1Num10 - q1Num10;
			String dif1_8 = toBase8(dif1_10);
			//System.out.println("e"+dif1_8);
			
			if(isOrdered(dif1_8)){
				System.out.print("Output: ");
				System.out.println(dif1_10);
			}
			else{
				String p2 = dif1_8;
				String q2 = orderDigit(p2);
				int p2Num10 = toBase10(p2);
				int q2Num10 = toBase10(q2);
				int dif2_10 = p2Num10 - q2Num10;
				String dif2_8 = toBase8(dif2_10);
				//System.out.println("f"+dif2_8);
				
				if(isOrdered(dif2_8)){
					System.out.print("Output: ");
					System.out.println(dif2_10);
				}
				else{
					String p3 = dif2_8;
					String q3 = orderDigit(p3);
					int p3Num10 = toBase10(p3);
					int q3Num10 = toBase10(q3);
					int dif3_10 = p3Num10 - q3Num10;
					String dif3_8 = toBase8(dif3_10);
					
					if(isOrdered(dif3_8)){
						System.out.print("Output: ");
						System.out.println(dif3_10);
					}
					else{
						String p4 = dif3_8;
						String q4 = orderDigit(p4);
						int p4Num10 = toBase10(p4);
						int q4Num10 = toBase10(q4);
						int dif4_10 = p4Num10 - q4Num10;
						String dif4_8 = toBase8(dif4_10);
						
						if(isOrdered(dif4_8)){
							System.out.print("Output: ");
							System.out.println(dif4_10);
						}
						else{
							String p5 = dif4_8;
							String q5 = orderDigit(p5);
							int p5Num10 = toBase10(p5);
							int q5Num10 = toBase10(q5);
							int dif5_10 = p5Num10 - q5Num10;
							System.out.print("Output: ");
							System.out.println(dif5_10);
						}
					}
				}
			}
		}
		
	}
}
