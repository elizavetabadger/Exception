/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.A*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
            numFloat();
    }
    
    private static float numFloat() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Ведите дробное число:");
                String input = scanner.nextLine();
                // Стандартный метод parseFloat согласно документации может привести к двум ошибкам
                // NumberFormatException и NullPointerException
                // В нашем случае, при чтении мы получис входной элемент от клиента, поэтому ошибки NullPointerException произойти не может, а значит не надо обрабатывать данный сценврий
                // Зато может произойти NumberFormatException, так как пользователь может ввести, например строку "abc", которую невозожно представить в формете дробного числа - следовать надо обработать данную ошибку в try-catch
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели что-то не то");
            }
        }
    }
}