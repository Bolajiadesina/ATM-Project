
package classactivities.basic;

import java.util.Scanner;


public class Atm {

    private double balance;
    private Scanner scanner;
    private int pin;
    private int userPin;

    public Atm() {
        balance = 5000;
        scanner = new Scanner(System.in);
        pin = 1234;
            menu();
    }

    private void menu() {
        System.out.println("Welcome To CAPITAN Bank");
        askForPin();
        
        

        System.out.println("Menu");
        System.out.println("Press 1 Withdraw");
        System.out.println("Press 2 Deposit");
        System.out.println("Press 3 Balance");
        System.out.println("Press 4 Exit");
        System.out.println("Enter Input");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                withdraw();
                break;

            case 2:
                transfer();
                break;

            case 3:
                checkBalance();
                break;

            case 4:
                System.exit(0);

                break;
            default:
                System.out.println("Invalid Option");
                menu();
                break;

        }
        operation();
    }

    public void initializeAtm() {
        menu();
    }

    private void withdraw() {
        System.out.println("Enter Amount");
        int amount = scanner.nextInt(); 
        if (amount > balance){
            System.out.println("Insufficient funds");
        }else {
        
        balance -= amount;
            System.out.println("Take your cash");
        }

    }

    private void deposit() {

    }

    private boolean isCorrectPin() {
        return pin == userPin;
    }

    private void askForPin() {
        System.out.println("Enter Pin");
        userPin = scanner.nextInt();
        if (!isCorrectPin()) {
            askForPin();
        }
    }

    private void checkAmount() {

    }

    private void checkBalance() {
        System.out.println("Your Account Balance Is :" + balance);

    }

    private void transfer() {
        System.out.println("Enter Reciever Account Number");
        int account = scanner.nextInt();
        System.out.println("Enter reciever Name");
        String name = scanner.next();
        System.out.println("Enter Amount You Want To Be Deposit");
        int amount = scanner.nextInt();
        if (amount > balance) {
            System.out.println("Insuffient Balance");
        } else {

            System.out.println("Transfer " + amount + "to \n Account Name: " + name + "\n Account number " + account);
            System.out.println("Press 1 to Confirm");
            System.out.println("Press 2 to terminate");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    balance -= amount;

                    break;
                case 2:

                    break;
            }
            System.out.println("Transaction Successful");
        }
    }

    private void operation() {
        System.out.println("Do you want to perform another Operation? Y/N");
        String con = scanner.next().toLowerCase();
        if (con.equals("y")) {
            menu();
        }
        System.out.println("Thanks for banking with us. Exiting App");

    }

    private void dipsplayAccountType() {

        System.out.println("Select Account Type");
        System.out.println("Press 1 Saving");
        System.out.println("Press 2 Current");
        int enter = scanner.nextInt();
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Atm  am= new Atm ();
        am.initializeAtm();
        
    }

}
