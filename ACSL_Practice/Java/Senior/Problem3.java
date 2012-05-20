package Senior;
import java.util.ArrayList;
import java.util.Scanner;


public class Problem3 {

	private static int target;
	private static String num1;
	private static String num2;
	private static int finalSum;

	public static void main(String[] args){
		Scanner aScanner = new Scanner(System.in);
		while(true){
			finalSum = -1;
			System.out.println("Enter the input: ");
			String input = aScanner.nextLine();
			ArrayList<String> binaryArray = new ArrayList<String>();

			//parse the string for num1, num2 and the target number
			num1 = input.substring(0,input.indexOf(","));
			input = input.substring(input.indexOf(",")+1,input.length());
			num2 = input.substring(0,input.indexOf(","));
			input = input.substring(input.indexOf(",")+1,input.length());
			target = Integer.parseInt(input);

			//add 0s to shorter numbers
			if(num1.length()>num2.length()){
				while(num1.length()!= num2.length()){
					num2 = "0"+num2;
				}
			}else if(num1.length()<num2.length()){
				while(num1.length()!= num2.length()){
					num1 = "0"+num1;
				}
			}

			int binaryPlaceValue = num1.length()-1; //amount of digits in the binary
			for(int i = 1;i<Math.pow(2,num1.length()-1);i++){ //store binary digits
				String binaryRepresent = Integer.toBinaryString(i);
				if(binaryRepresent.length() != binaryPlaceValue){
					while(binaryRepresent.length() != binaryPlaceValue){
						binaryRepresent = "0"+binaryRepresent;
					}
				}
				binaryArray.add(binaryRepresent);
			}
			for(int i = 0; i<binaryArray.size();i++){
				String value = binaryArray.get(i);
				ArrayList<String> individualBinary = new ArrayList<String>();
				ArrayList<Integer> parts1 = new ArrayList<Integer>();
				ArrayList<Integer> parts2 = new ArrayList<Integer>();
				int numSections = 1;
				for(int j = 0; j<value.length();j++){
					if(value.substring(j,j+1).equals("1")){
						numSections++;
					}
				}
				for(int j = 0;j<Math.pow(2,numSections);j++){ //store binary digits
					String binaryRepresent = Integer.toBinaryString(j);
					if(binaryRepresent.length() != numSections){
						while(binaryRepresent.length() != numSections){
							binaryRepresent = "0"+binaryRepresent;
						}
					}
					individualBinary.add(binaryRepresent);
				}
				int pointer = 0;
				for(int j = 0; j<value.length();j++){
					if(value.substring(j,j+1).equals("1")){
						parts1.add(Integer.parseInt(num1.substring(pointer,j+1)));
						parts2.add(Integer.parseInt(num2.substring(num2.length()-j-1,num2.length()-pointer)));
						pointer = j+1;
					}
				}
				parts1.add(Integer.parseInt(num1.substring(pointer,num1.length())));
				parts2.add(Integer.parseInt(num2.substring(0,num2.length()-pointer)));
				for(int j = 0; j<individualBinary.size();j++){
					String addBinary = individualBinary.get(j);
					int sum = 0;
					for(int k = 0; k<addBinary.length();k++){
						if(addBinary.substring(k,k+1).equals("1")){
							sum = sum + parts1.get(k);
						}else{
							sum = sum + parts2.get(k);
						}
					}
					if(sum<=target && sum>finalSum){
						finalSum = sum;
					}
				}
			}	

			System.out.println(finalSum);
		}
	}
}
