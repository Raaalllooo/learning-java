import java.util.Scanner;

class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Input your minutes value");
        int minutes = sc.nextInt();
        int numberOfMinutes = minutes;
        System.out.println (numberOfMinutes);
        int days = numberOfMinutes / 1440;
        System.out.println (days);
        int years = days / 365;
        int daysModulo = days % 365;
        //System.out.println (daysModulo);
        System.out.println (numberOfMinutes + " is approximately " + years + " years and " + daysModulo + " days");
    }
}