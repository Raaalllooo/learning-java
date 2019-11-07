import java.util.Scanner;

public class task6 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println ("Input your first string:");
        String firstStr = input.nextLine();
        System.out.println ("Input your second string:");
        String secondStr = input.nextLine();
        char []secondCh = secondStr.toCharArray();
        String finalString = firstStr;
        for (int i=0; i<secondStr.length(); i++){
            finalString = finalString.replaceAll(String.valueOf(secondCh[i]),"");
        }
        System.out.println(finalString);
    }
}
