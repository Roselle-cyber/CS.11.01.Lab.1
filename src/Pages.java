import java.util.Scanner;
public class Pages {
    public static void main(String[] args) {
        // I created a Scanner to read user's input of age number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        // variable age represents users' answer using scanner to check
        int age = scanner.nextInt();
        // calculating pages to read after scanning user's input
        int pagesToRead = 100 - age;
        System.out.println(age + "-year olds should read at least " + pagesToRead + " pages before giving up on a book.");

    }
}
