/* Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        nullStr();
    }
    public static String nullStr() throws Exception {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Ведите строку:");
            String string = scanner.nextLine();
            return string;
        } catch () {
            System.out.println(e.getMessage());
        }
        if (string.equals("")){
            throw new Exception ("<Бнннн>");
        }
    }
}