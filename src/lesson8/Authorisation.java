package lesson8;

import java.util.Scanner;

public class Authorisation {
    private String correctLogin = "helen";
    private String correctPass = "qaz1wsx2";
    private String login = "";
    private String password = "";
    public int numberOfTask = 0;
    public String someNumber = "";

    public void authorisation() {
        System.out.println("Please, enter your login: ");
        login = getSomeString();

        if (login.equals(correctLogin)) {
            System.out.println("The login is correct. Please enter the password: ");
            password = getSomeString();
        } else {
            System.out.println("You've entered the wrong login. Please, try again later.");
            System.exit(0);
        }
        if (password.equals(correctPass)) {
            System.out.println("The password is correct. Please, choose the number of task: ");
            numberOfTask = getNumber();
        } else {
            System.out.println("You've entered the wrong password. Please, try again later.");
            System.exit(0);
        }
    }

    public static String getSomeString() {
        String someString;
        Scanner scanner = new Scanner(System.in);
        someString = scanner.nextLine();
        return someString;
    }

    public static int getNumber() {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        return number;
    }

    public static boolean checkInt(String someString) {
        boolean result = true;
        try {
            int i = Integer.parseInt(someString.trim());
        }
        catch (NumberFormatException exception) {
            exception.getMessage();
            result = false;
        }
        return result;
    }
}
