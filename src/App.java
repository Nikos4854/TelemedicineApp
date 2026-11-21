import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        HeartRateMonitor monitor = new HeartRateMonitor();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Εισάγετε τους παλμούς σας (bpm): ");
        int bpm = scanner.nextInt();

        String status = monitor.evaluateBpm(bpm);
        System.out.println("Κατάσταση: " + status);

        scanner.close();
    }
}