import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //FRONTPAGE
        int register;
        int login;
        int exit;
        int Savings;
        int Current;

        //REGISTRATION
        String name = "";
        String Pin = "";
        int sC;
        int cC;


        //LOGIN
        final String uLog = "johndoe";
        final String uPin = "1234";
        String upin = "";
        String ulog = "";


        //ACCOUNT
        int eChoice;
        int aChoice;

        //SAVINGS
        final double sMin = 1000;
        final double wLimit = 20000;
        final double interest = 0.30;
        double iDeposit = 0;

        //CURRENT
        final int cMin = 5000;


        //BALANCE OPERATIONS
        double Balance = sMin + iDeposit;


        //MAIN MENU
        System.out.println("Welcome to the Multi-Tier Bank Account Management System!");
        System.out.println("1. Register Account");
        System.out.println("2. Login Account");
        System.out.println("3. Exit");

        System.out.print("Enter your choice: ");
        int rChoice = sc.nextInt();
        if (rChoice == 1) {

            //REGISTRATION

            System.out.println("Enter a username: ");
            name = sc.nextLine().toLowerCase();
            sc.nextLine();

            System.out.println("Enter a 4-digit pin: ");
            Pin = sc.nextLine();
            //put limter

            System.out.println("Choose account type: ");
            System.out.println("1. Savings");
            System.out.println("2. Current");

            System.out.println("Enter you choice: ");
            aChoice = sc.nextInt();

            if (aChoice == 1) {

                //SAVINGS
                System.out.println("Enter your initial deposit amount: ");
                iDeposit = sc.nextInt();
                if (iDeposit >= sMin) {
                    System.out.println("Registration Successful!");
                } else if (iDeposit < sMin) {
                    System.out.println("Invalid deposit. Minimum balance for a Savings account is 1000.");
                } else if (!sc.hasNextInt()) {
                    System.out.println("Error!");
                }


            } else if (aChoice == 2) {

                //CURRENT
                System.out.println("Enter your initial deposit amount: ");
                iDeposit = sc.nextInt();
                if (iDeposit >= sMin) {
                    System.out.println("Registration Successful!");
                } else if (iDeposit < sMin) {
                    System.out.println("Invalid deposit. Minimum balance for a Savings account is 1000.");
                } else if (!sc.hasNextInt()) {
                    System.out.println("Error!");
                }

            } else if (!sc.hasNextInt()) {
                System.out.println("INVALID INPUT");
                return;
            }


        } else if (rChoice == 2) {

            //LOGIN

            System.out.println("Enter your username: ");
            ulog = sc.nextLine().toLowerCase();
            sc.nextLine();

            System.out.println("Enter your 4-digit pin: ");
            upin = sc.nextLine();





                if (!ulog.equals(uLog) && !upin.equals(uPin)) {
                    for (int i = 0; i < 3; i++) {
                    System.out.println("Invalid username or password. Please try again.");
                    String tryagain = sc.nextLine().toLowerCase();
                    return;
                    }
                }else if (ulog.equals(uLog) && upin.equals(uPin)) {
                    System.out.println("Login Successful! ");

                    System.out.println("Welcome" + name);
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit Money");
                    System.out.println("3. Withdraw Money");
                    System.out.println("4. Calculate Interest(Savings Only)");
                    System.out.println("5. Logout");

                    System.out.println("Enter your choice: ");
                    int lChoice = sc.nextInt();
                    if (lChoice == 1) {
                        System.out.println("Your available balance is: " + Balance);
                        return;
                    } else if (lChoice == 2) {
                        System.out.println("Enter amount to deposit: ");
                        double dAmount = sc.nextDouble();
                        dAmount += Balance;
                    } else if (lChoice == 3) {
                        System.out.println("Enter amount to withdraw: ");
                        double dWithAmount = sc.nextDouble();
                        dWithAmount -= Balance;
                    } else if (lChoice == 4) {
                        double tInterest = Balance * interest * 1;
                        System.out.println("Your total interest is: " + tInterest);
                    } else if (lChoice == 5) {
                        System.out.println("Logout Successful! ");
                        return;
                    }

                }


            }
        } else if (rChoice == 3) {
                System.out.println("Thank you!");
                return;
            } else if (rChoice < 3) {
                System.out.println("Invalid input.");
            }
        }

        //METHOD

//    static boolean pin(int num) {
//        if (num.length() != 4 || !num.matches("\\d{4}")) {
//            return false;
//
//
//        }
//
//    }
    }