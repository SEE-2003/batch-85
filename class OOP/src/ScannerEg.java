import java.util.Scanner;

public class ScannerEg {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your DOB: ");
        String DOB = scanner.next();

        System.out.println("Enter your address: ");
        String address = scanner.next();

        System.out.println("Enter your mobile: ");
        int mobile = scanner.nextInt();

        System.out.println("\nUser Information: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("DOB: " + DOB);
        System.out.println("address: " +address);
        System.out.println("mobile number: " +mobile);

        scanner.close();
    }

}