package lesson8;

public class Armstrong {

    public void checkArmstrong(String someNumber) {
        int armstrong = 0;
        int x;
        char [] numbersChar = someNumber.toCharArray();
        for (int i = 0; i < numbersChar.length; i++) {
            x = (int) Math.pow(Integer.parseInt(String.valueOf(numbersChar[i])), numbersChar.length);
            armstrong += x;
        }
        if (armstrong == Integer.parseInt(someNumber)) {
            System.out.println("Your number is an Armstrong number!");
        } else {
            System.out.println("Your number is not an Armstrong number.");
        }
    }
}
