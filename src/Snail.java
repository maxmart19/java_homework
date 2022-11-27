import java.util.Scanner;

public class Snail {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how far does the snail rise: ");
        int a = scanner.nextInt();
        System.out.println("Enter how far does the snail slide down: ");
        int b = scanner.nextInt();
        System.out.println("Enter height of the tree ");
        int h = scanner.nextInt();
        int temp;
        int days;
        if(a > b && a > 0 && b > 0 && h > 0){
            temp = a - b;
            days = h / temp;
            System.out.println("Snail will reach top in " + days + " days");
        }
        else{
            System.out.println("Impossible");
        }
    }
}