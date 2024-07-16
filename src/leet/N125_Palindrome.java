package leet;

public class N125_Palindrome {
    public static void main(String[] args) {
        System.out.println(new N125_Palindrome().isPalindrome("abba"));
        System.out.println(new N125_Palindrome().isPalindrome("race a car"));
        System.out.println(new N125_Palindrome().isPalindrome(" "));
        System.out.println(new N125_Palindrome().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(new N125_Palindrome().isPalindrome(".,"));
        System.out.println(new N125_Palindrome().isPalindrome("0P"));
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < s.length() && !isCharacter(s.charAt(left))) {
                left++;
            }

            while (right > 0 && !isCharacter(s.charAt(right))) {
                right--;
            }

            if (right > 0 && left < s.length() && s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private boolean isCharacter(char c){
        return Character.isAlphabetic(c) || Character.isDigit(c);
    }
}
