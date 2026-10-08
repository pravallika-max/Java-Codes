import java.util.*;

public class Palindrome_Checker{
    public static void main(String[] args){
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("******** Palindrome Checker *********");
        System.out.print("Enter a word or phrase: ");
        input = sc.nextLine();
        isPalindrome(input);
        sc.close();
        
    }
    public static void isPalindrome(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left  = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                System.out.print("It is not  a Palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.print("It is a Palindrome");
    }
}