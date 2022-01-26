package lesson8;

public class Tasks {

    public static void main(String[] args) {
        Authorisation login = new Authorisation();
        String someNumber;

        login.authorisation();

        switch (login.numberOfTask) {
            case 1:
                System.out.println("Let's check your number if it is even or odd. Enter the number: ");
                someNumber = login.getSomeString();
                if (login.checkInt(someNumber)) {
                    Even even = new Even();
                    even.checkEven(Integer.parseInt(someNumber));
                    break;
                } else {
                    System.out.println("You've entered not the number. Sorry");
                    System.exit(0);
                }
                break;
            case 2:
                System.out.println("Let's check if it is the Armstrong number. Enter the number: ");
                someNumber = login.getSomeString();
                if (login.checkInt(someNumber)) {
                    Armstrong armstrong = new Armstrong();
                    armstrong.checkArmstrong(someNumber);
                    break;
                } else {
                    System.out.println("You've entered not the number. Sorry");
                    System.exit(0);
                }
                break;
            case 3:
                Fibonacci x = new Fibonacci();
                x.checkFibonacci();
        }
    }
}

