package Junior;

import java.util.Scanner;

public class Schneider_Jordan_Alfa_Wrap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char input;
		for(int i=0;i<5;i++){
		//while(true){
			input=(sc.nextLine().toUpperCase().charAt(0));
			int value = input-64;
			if (value >0&&value<6){
				value *=2;
			}
			else if (value > 5 && value < 11){
				value = (value % 3) * 5;
			}
			else if (value > 10 && value < 16){
				value = (int)(value/4)*8;
			}
			else if (value > 15 && value < 21){
				value = (value%10 + ((int)(value/10)))*10;
			}
			else{
				for(int j=2;j<value;j++){
					if (value%j==0){
						value /= j;
						j=1;
					}
				}
				value*=12;
			}
			value = (value%26);
			if(value==0)value=26;
			System.out.println(Character.toChars(value+64));
		}
	}
}