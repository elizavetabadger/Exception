/*Если необходимо, исправьте данный код
(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}*/


public class Main {
    public static void main(String[] args) {
        try {
            int d = 1;
            int intArray[] = {1, -2, 3, 4, 5};
            float catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
        // При выполнении деления на 0, может произойти ошибка ArithmeticException, поэтому необходимо её обработать
        catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
        // При работе с массивами, мы можем случай запросить элемент из несуществующей ячейки массива (например отрицательный номер ячейки или очень большой номер)
        // В таком случае происходит ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Такого элемента нет");
        }
    }
}