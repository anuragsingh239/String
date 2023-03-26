//Anagram means two string conatin same letter with same frequency.
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram_naiveSolution {
    static boolean checkAnagram(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        char []a1=s1.toCharArray();
        Arrays.sort(a1);
        s1=new String(a1);
        char []a2=s2.toCharArray();
        Arrays.sort(a2);
        s2=new String(a2);
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string : ");
        String str1=sc.nextLine();
        System.out.print("Enter second string : ");
        String str2=sc.nextLine();
        System.out.println(checkAnagram(str1,str2));
    }
}
