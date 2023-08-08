/*Разработайте программу, которая выбросит Exception, 
когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, 
что пустые строки вводить нельзя. */
import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {

        run();
    }

    private static void run() {

    Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Здравствуйте, что вы хотели?");

            String input = sc.nextLine();

            if (input.equals("")) {
                System.err.println("Нельзя вводить пустую строку!");
            } else {
                break;
            }
        }
    }
}