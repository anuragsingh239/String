import java.util.Scanner;

// Java program for Naive Pattern Searching
public class Pattern_searching_naive {
    public static void search(String txt, String pat)
    {
        int M = pat.length();
        int N = txt.length();
        for (int i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++)
                if (txt.charAt(i + j) != pat.charAt(j))
                    break;

            if (j == M)
                System.out.println("Pattern found at index " + i);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter full string : ");
        String txt = sc.nextLine();
        System.out.print("Enter pattern to check : ");
        String pat =sc.nextLine();
        search(txt, pat);
    }
}

