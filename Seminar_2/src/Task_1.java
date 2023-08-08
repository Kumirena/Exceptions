//package Seminar_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить
к падению приложения, вместо этого, необходимо повторно запросить
у пользователя ввод данных.
*/

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите число с плавающей точкой или целое число");
        Scanner scanner = new Scanner(System.in);
        boolean isFloat = false;
        while (!isFloat) {
            try {
                float x = Float.parseFloat(scanner.nextLine());
                isFloat = true;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число");
            }
        }
        System.out.println("Ввели верное число!");
        }

    }