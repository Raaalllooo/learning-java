import java.util.Scanner;

public class replacechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Input your first and second strings divided by:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char[] ch1 = new char[256];
        for (int i = 0; i < str2.length(); i++)
            ch1[str2.charAt(i)]++;
        System.out.println("\nThe new string is: ");
        for (int i = 0; i < str1.length(); i++) {
            if (ch1[str1.charAt(i)] == 0)
                System.out.print(str1.charAt(i));
        }
    }
}
