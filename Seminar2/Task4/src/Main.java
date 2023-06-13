/* Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.*;
public class Main {

    public static void main(String[] args) {
        nullStr();
    }

    public static void nullStr() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Ведите строку:");
                String input = scanner.nextLine();
                // Когда пользователь ввел некоторое значение, мы проверяем равно ли оно пустой строке
                // В случае, если ввод пользователя равен пустой строке, то мы выбрасываем ошибку IllegalArgumentException
                if (input.equals("")) {
                    throw new IllegalArgumentException("Нельзя вводить пустую строку");
                }
                return;
            }
            // Далее мы перехватываем IllegalArgumentException в данном catch блоке и пишем сообщение ошибки пользователю
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}