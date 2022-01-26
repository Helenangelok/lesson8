package lesson8;

public class Fibonacci {
    Authorisation login = new Authorisation();

    public void checkFibonacci () {
        System.out.println("How many items of Fibonacci numbers would you like to see? ");
        int number = login.getNumber();
        System.out.println("Here are your " + number + " items of Fibonacci numbers: ");
        int [] numbers = new int[number];
        numbers [0] = 0;
        numbers [1] = 1;
        System.out.print(numbers [0] + ", " + numbers [1]);

        for (int i = 2; i < number; i++) {
            numbers [i] = numbers[i-1] + numbers [i-2];
            System.out.print(", " + numbers [i]);
        }
    }
}
