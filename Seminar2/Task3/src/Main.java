/*Дан следующий код, исправьте его там,
где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}

*/

public class Main {

    // Так как мы выполнили обработку возможно возникающих ошибок, то прописывание throws Exception, является излишним
    // Потому что теперь нет сценариев при которых метод main может упасть с ошибкой
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 1;

        }
        // Так как массив данных задан и он не заводится через ввод от пользователя, мы точно знаем, что все данные массива корректны
        // В связи с этим у нас не может произойти NullPointerException, так как отсутствует элемент null
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        // Согласно иерархии наследования класс Throwable включает в себя все виды ошибок,
        // а так как в блоке try-catch обработка ошибок определяется порядком определения catch блоков, то необходимо идти от частного к общему
        // поэтому блок Throwable должен идти последним
        catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    // При работе с данным методов, мы не работаем с файлами, а следовательно здесь не могут возникать ошибки, такие как FileNotFoundException
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);

    }
}


