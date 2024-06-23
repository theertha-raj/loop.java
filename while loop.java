import java.util.Scanner;
public class With{
    public static void main(String[] args) {
        int balance = 10000; // Starting balance
        int withdrawAmount = 2000; // Amount to withdraw each time
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Starting balance: Rs. " + balance);
        
        while (balance >= withdrawAmount) {
            System.out.println("Withdraw Rs. " + withdrawAmount);
            balance -= withdrawAmount; // Deduct the withdrawal amount
            
            System.out.println("Remaining balance: Rs. " + balance);
            System.out.print("Press Enter to withdraw again, or type 'quit' to exit: ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("quit")) {
                break; // Exit the loop if the user wants to quit
            }
        }
        
        System.out.println("Transaction complete.");
        scanner.close();
    }
}
