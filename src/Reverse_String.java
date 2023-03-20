import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        char[]str=s.toCharArray();
        for (int i=str.length-1;i>=0;i--){
            System.out.print(str[i]);
        }

    }
}
