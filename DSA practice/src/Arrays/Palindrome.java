package Arrays;

public class Palindrome {
    public static boolean isPalindrome(int num) {
        boolean isPalindrome = false;
        int rev = 0, digit = num, n = num;
        if (num < 0) {
            return false;
        } else if(num ==0){
           return true;
        } else if (num > 0) {
            do {
                digit = num % 10;
                rev = (rev * 10) + digit;
                num = num / 10;
            } while (num != 0);
            if (n == rev)
                isPalindrome = true;
            else
                return isPalindrome;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {


        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1234321));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(-121));
    }
}
