//Anagram means two string conatin same letter with same frequency.
import java.lang.reflect.Array;
import java.util.Arrays;

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

        System.out.println(checkAnagram("aacbd","cbada"));
    }
}
