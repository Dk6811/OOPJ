import java.util.Scanner;

public class menuexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1 - Say Hello");
            System.out.println("2 - print a number");
            System.out.println("3 - Exit");
            System.out.println("Enter your choice :");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello,user!");
                    break;
                case 2:
                    System.out.println("Enter a number to print :");
                    int num = sc.nextInt();
                    System.out.println("You entered:"+num);
                    break;
                case 3:
                    System.out.println("Exiting program.Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.please try again.");
            }
            
        }
    }
    
}

