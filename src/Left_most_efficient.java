import java.util.Scanner;

public class Left_most_efficient {
   static int leftMost(String str){
       int []count=new int[256];
       for(int i=0;i<str.length();i++){
           count[str.charAt(i)]++;
       }
       for(int i=0;i<str.length();i++){
           if(count[str.charAt(i)]>1){
               return i;
           }
       }return -1;
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        System.out.println(leftMost(s));
    }
}
