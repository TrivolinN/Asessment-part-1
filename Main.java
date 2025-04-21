import java.util.Scanner;

//Part one in console temporarily

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login Register = new Login();
        String Username;
        String Password;
        String phoneNumber;
        //Beginning of registration


        System.out.print(" Please enter your first Name:");
        String firstName = scanner.nextLine();
        Register.firstName= firstName;

        System.out.print("Please enter your Surname:");
        String Surname = scanner.nextLine();
        Register.Surname= Surname;


//Username entry and verification

        System.out.print("To begin your Registration please enter a Username:");
        while (true) {
            Username = scanner.nextLine();
            Register.Username = Username;
            if (Register.checkUserName(Username)) {
                System.out.println(" Username successfully captured ");
                break;
            } else {
                System.out.println(" Username incorrectly formated , Username must include and underscore and must be no longer than 5 characters in length");
            }
        }

//Password entry and verification
        System.out.print("Create and Enter a password");
        while (true) {
            Password = scanner.nextLine();
            Register.Password = Password;
            if (Register.checkPasswordComplexity(Password)) {
                System.out.println("Password successfully captured");
                break;
            } else {
                System.out.println("password is incorrectly formatted please ensure the password contains at least eight characters, a capital letter,a number and a special character");
            }
        }


//Phone number entry and verification
        System.out.print("Please enter  your cellphone number: ");
        while (true) {
            phoneNumber = scanner.nextLine();
            Register.phoneNumber = phoneNumber;
            if (Register.checkPhonenumber()) {
                System.out.println("Your number has been captured ");
                break;
            } else {
                System.out.println("Number incorrectly formatted or does not contain the international code (+27)");
            }
        }
        System.out.println(Register.registerUser());
        //Beginning of login

        System.out.println("You are ready to login");
        //Login
        System.out.print("Enter your Username: ");
        String usernameLog = scanner.nextLine();

        System.out.print(" Enter your Password :");
        String passwordLog = scanner.nextLine();


        boolean loggedIn = Register.loginUser(usernameLog, passwordLog);
        if (loggedIn) {
            System.out.println(" login successful");
        } else {
            System.out.println(" Login failed");
        }
        System.out.print(Register.returnLoginStatus(loggedIn));

//Reference
 //OpenAI (2025) ChatGPT [AI chatbot]. Available at: https://chat.openai.com/ (Accessed: 20 April 2025).
    }


}






















