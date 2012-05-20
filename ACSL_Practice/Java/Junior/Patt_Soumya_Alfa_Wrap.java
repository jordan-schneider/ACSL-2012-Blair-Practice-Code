public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(char y) {

        y = computer('A');
        System.out.println(y);
    }

    public static char computer(char A) {

        int b=0;
       char[] alphabet = { 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

       for (int i=0;i<26;i++) {
           if ( A == alphabet[i]) {
               b = i+1;
           }
       }

       if (1<=b && b>=5) {
           b = b*2;

       }
       if (6<=b && b>=10 ) {
           b = (b%3)*5;
       }
       if (11<=b && b>=15 ) {
           b = ((b-( b%4))/4)*8;

       }
       if (16<=b && b>=20) {
           b = ((b-b%10) + (b%10));
       }
       if (21<=b && b==26 ) {
           for ( int n=b-1; n==1; n--) {
               if (b%n==0) {
                   b=(b&n)*2;
               }
           }
       }
       int x = b%26;
       System.out.print(alphabet[x]);
       return alphabet[x];
        






















    }
}


