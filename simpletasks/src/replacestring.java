import java.util.Scanner;

public class replacestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Input your first and second strings divided by:");
        String firstString = sc.nextLine();
        String secondString = sc.nextLine();
        char[] firstChar = new char[256];
        for (int i = 0; i < secondString.length(); i++)
            firstChar[secondString.charAt(i)]++;
        for (int i = 0; i < firstString.length(); i++) {
            if (firstChar[firstString.charAt(i)] == 0)
                System.out.print(firstString.charAt(i));
        }
        /*char[] charThree = new char[lengthMaximum];
        //char[] charFinal2 = new char[lengthMaximum];

        for(int i = 0; i < lengthMaximum; i++ ){
           for(int i2 = 0; i2 < lengthMaximum2; i2++){
               if (charFirst[i] == charSecond[i2]){
                   charThree[i] = charSecond[i2];
               }
            }
        }
        System.out.println (charThree);
        String fourString =  String.valueOf(charThree);
        fourString = fourString.replaceAll(String.valueOf((char) 0), "");
        char[] charFour = fourString.toCharArray();
        char[] charFive = new char[lengthMaximum];
        int lengthMaximum3 = charFour.length;
        for(int i3 = 0; i3 < lengthMaximum; i3++ ){
            for(int i4 = 0; i4 < lengthMaximum3; i4++){
                if (charFour[i3] != charFirst[i4]){
                    charFive[i3] = charFirst[i4];

                }
            }
        }
        System.out.println (charFive);
        String FiveString =  String.valueOf(charFive);
        FiveString = FiveString.replaceAll(String.valueOf((char) 0), "");

        //String finalString = firstString.replace(secondString,'');
        System.out.println (fourString);
        System.out.println (FiveString);

         */
    }
}
