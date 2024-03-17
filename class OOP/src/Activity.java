
import java.util.Scanner;
public class Activity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Student ID: ");
        int StudentID = scanner.nextInt();


        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Mark 1: ");
        int Mark1 = scanner.nextInt();

        System.out.print("Mark 2: ");
        int Mark2 = scanner.nextInt();

        System.out.print("Mark 3: ");
        int Mark3 = scanner.nextInt();

        System.out.print("Mark 4: ");
        int Mark4 = scanner.nextInt();

        int tot = Mark1+Mark2+Mark3+Mark4;
        double avg = tot/4;



        System.out.println("\nUser Information");
        System.out.println("Mark 1: "+ Mark1);
        System.out.println("Mark 2: "+ Mark2);
        System.out.println("Mark 3: "+ Mark3);
        System.out.println("Mark 4: "+ Mark4);
        System.out.println("total: "+ tot);
        System.out.println("Average: "+ avg);

        scanner.close();






    }





}
