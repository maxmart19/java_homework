import java.util.Scanner;
public class godutch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total amount: ");
        int totAmount = scanner.nextInt();
        System.out.println("Enter how many friends: ");
        int friends = scanner.nextInt();
        int sum;

        if (totAmount < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else if (friends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        } else {
            sum = totAmount / friends;
            sum = sum + sum / 10;
            System.out.println(sum);
        }
    }
}