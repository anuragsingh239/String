import java.util.Scanner;

public class Subsequence_of_otherString {
    static boolean checkSubsequence(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        if(n<m){
            return false;
        }
        int j=0;
        for(int i=0;i<n&&j<m;i++){
            if(str1.charAt(i)==str2.charAt(j)){
                j++;
            }
        }
        return (j==m);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String strr1=sc.nextLine();
        System.out.print("Enter second String: ");
        String strr2=sc.nextLine();
        System.out.println( checkSubsequence(strr1,strr2));
    }
}
