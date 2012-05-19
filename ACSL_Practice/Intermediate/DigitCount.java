import java.util.*;

public class DigitCount {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[90000];
        for (int i = 0; i < 10; i++) {
            System.out.print("Input a. ");
            int a = scan.nextInt();
            scan.nextLine();
            System.out.print("Input b. ");
            int b = scan.nextInt();
            scan.nextLine();
            System.out.print("Input k. ");
            int k = scan.nextInt();
            String kString = "";
            kString = kString + Integer.toString(k);
            char kChar = kString.charAt(0);
            scan.nextLine();
            int counter = 0;
            int largestAVal = (int) (Math.log(99999) / Math.log(a));
            for (int n = 0; n <= largestAVal; n++) {
                for (int m = 0; m <= 17; m++) {
                    int currentNum = (int) (Math.pow(a, n) * Math.pow(b, m));
                    if (currentNum >= 10000 && currentNum <= 99999) {
                        nums[counter] = currentNum;
                        counter++;
                    }
                }
            }
            int digitCounter = 0;
            for (int j = 0; j < counter; j++) {
                String numString = Integer.toString(nums[j]);
                for (int l = 0; l < numString.length(); l++) {
                    if (numString.charAt(l) == kChar) {
                        digitCounter++;
                    }
                }
            }
            System.out.println("\n" + digitCounter);
        }
    }
}