/**
 * The class is to test whether a string is a palindrome.
 */
public class Is_Palindrome {
    public static void main(String[] args){
        String s = "abcccba";
        if(Is_Palindrome(s)){
            System.out.println(s + " is a palindrome.");
        }else{
            System.out.println(s + " is not a palindrome.");
        }
    }

    public static boolean Is_Palindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
