import java.util.Scanner;

class minutestoyears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();
        Integer numberOfMinutes = new Integer(minutes);
        //System.out.println (numberOfMinutes);
        int days = numberOfMinutes / 1440;
        //System.out.println (days);
        int years = days / 365;
        int daysModulo = days % 365;
        //System.out.println (daysModulo);
        System.out.println (numberOfMinutes + " is approximately " + years + " years and " + daysModulo + " days");
    }
}