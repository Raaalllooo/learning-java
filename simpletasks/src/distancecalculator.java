import java.util.Scanner;

public class distancecalculator {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double meters = sc.nextInt();
         double hoursTaken = sc.nextInt();
         double minutesTaken = sc.nextInt();
         double secondsTaken = sc.nextInt();
         System.out.println ("Input your values in order: meters passed, hours, minutes and seconds taken divided by whitespace:");
         /*System.out.println (meters);
         System.out.println (hoursTaken);
         System.out.println (minutesTaken);
         System.out.println (secondsTaken);
         */
         //double minutes = hoursTaken * 60 + minutesTaken + secondsTaken/60;
         double seconds = hoursTaken * 3600 + minutesTaken * 60 + secondsTaken;
         double hours = hoursTaken + (minutesTaken/60) + (secondsTaken/3600);
         //System.out.println (hours);
         double kilometers = meters / 1000;
         double miles = meters / 1609;
         double metersPerSecond = meters / seconds;
         double kilometresPerHours = kilometers / hours;
         double milesPerHours = miles / hours;
         System.out.println ("Your speed in meters/second - " + metersPerSecond);
         System.out.println ("Your speed in kilometres/hour - " + kilometresPerHours);
         System.out.println ("Your speed in miles/hours - " + milesPerHours);
     }
}
