import java.util.*;
public class InputData {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите Ваши данные через пробел (Ф.И.О, дату рождения - dd.mm.yyyy, номер телефона, пол - f/m ) : ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Вы ввели не все данные, поробуйте еще раз.");
            } else System.out.println("Слишком много данных, попробуйте еще раз.");
        }

    }
}
