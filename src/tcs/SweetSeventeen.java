package tcs;


public class SweetSeventeen {
    public static void main(String[] args) {
        String s = "23GF";
        String chars = "ZABCDEFGabcdefg";
        
        int decimal = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch>='a' && ch<='g') || (ch>='A' && ch<='G')) {
                decimal += (Math.pow(17, s.length()-i-1)*(chars.indexOf(ch)+9));
            } else if (Character.isDigit(ch)) {
                decimal += (Math.pow(17, s.length()-i-1))* (Integer.parseInt(ch+""));
            } else {
                System.out.println("invalid");
            }
        }
        System.out.println(decimal);
    }
}
