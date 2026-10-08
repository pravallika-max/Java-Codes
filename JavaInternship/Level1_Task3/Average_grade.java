import java.util.Scanner;
public class Average_grade{

    public static void main(String[] args) {
        double sum = 0,average;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of grades: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number of grades.");
            sc.close();
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grade " + i + ": ");
            sum += sc.nextDouble();
        }
        average = sum / n;
        System.out.println("Average Grade: " + average);
        sc.close();
    }
}
