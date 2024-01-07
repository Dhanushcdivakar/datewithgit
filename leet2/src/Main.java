// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int input =121;
        Boolean isPalindromeResult=isPalindrome(input);
                if(isPalindromeResult){
                    System.out.println("true");
                }else{
                    System.out.println("false");
                }

    }
    public  static boolean isPalindrome(int x) {
        int n = x;
        long rev = 0;
        if (x < 0) return false;
        while (x > 0) {
            rev = (rev * 10) + (x % 10);
            x /= 10;
        }
        if (rev == n) return true;
        return false;
    }

}
