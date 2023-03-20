import java.util.Scanner;

public class Palindrome {
    static boolean IsPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if((str.charAt(start)!=(str.charAt(end)))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String to check whether string is palindrome or not: ");
        String s=sc.nextLine();
        if(IsPalindrome(s)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
