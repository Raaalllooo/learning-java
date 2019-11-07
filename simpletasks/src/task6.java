//import java.util.Arrays;
import java.util.Scanner;

public class task6 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println ("Input your first string:");
        String firstStr = input.nextLine();
        //char []firstCh = firstStr.toCharArray();
        System.out.println ("Input your second string:");
        String secondStr = input.nextLine();
        char []secondCh = secondStr.toCharArray();
        //char []letters = new char[256];
        String finalString = firstStr;
        //System.out.println (Arrays.toString(firstCh));
        //System.out.println (Arrays.toString(secondCh));
        /*
        for (int i = 0; i<secondStr.length(); i++){
            letters[secondStr.charAt(i)]++;
        }
        System.out.println("\nThe new string is: ");
        for (int i = 0; i<firstStr.length(); i++){
            if (letters[firstStr.charAt(i)] == 0)
                System.out.print(firstStr.charAt(i));
        }
         */
        for (int i=0; i<secondStr.length(); i++){
            finalString = finalString.replaceAll(String.valueOf(secondCh[i]),"");
        }
        //finalString = finalString.replaceAll("\\s+","");
        System.out.println(finalString);
    }
}
