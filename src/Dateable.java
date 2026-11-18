import java.util.Scanner;
public class Dateable {
    public static void main(String[] args) {
        // I created a Scanner to read user's input of age number
        Scanner scanner = new Scanner(System.in);
        // Asking for their age
        System.out.println("Please enter your age: ");
        // variable age represents users' answer using scanner to check
        int age = scanner.nextInt();
        int youngestAge = 7 + (age / 2);
        System.out.println(age + "-year olds should date somebody who is at least " + youngestAge + " years old.");

    }
}
