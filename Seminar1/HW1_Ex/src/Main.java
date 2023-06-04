import java.util.*;
/* Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
public static int sum2d(String[][] arr) {
int sum = 0;
for (int i = 0; i < arr.length; i++) {
for (int j = 0; j < 5; j++) {
int val = Integer.parseInt(arr[i][j]);
sum += val;
}
}
return sum;
}

Можно получить исключения типа Throwable и Exception. По крайней мере я так поняла.
 */

/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
* Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.*/

public class Main {
    public static void main(String[] args) {
        int[] array1 = {12, 7, 9, 44, 18, 7, 42, 16, 1};
        int[] array2 = {0, 1, 2, 3, 3, 2, 1, 2, 3};
        System.out.println("Первый массив " + Arrays.toString(array1));
        System.out.println("Второй массив " + Arrays.toString(array2));
        System.out.println("Разница двух  массивов " + differenceArray(array1, array2));
    }
    public static ArrayList<Integer> differenceArray(int[] a1, int[] a2) {
        ArrayList<Integer> res = new ArrayList<>();
        int min = Math.min(a1.length, a2.length);
        int max = Math.max(a1.length, a2.length);
        if (min < 1) {
            throw new RuntimeException("Один из массивов пуст");
        }
        if (min < max) {
            throw new RuntimeException("Длинны массивов не равны!");
        }
        for (int i = 0; i < min; i++) {
            res.add(a1[i] - a2[i]);
        }
        return res;
    }
}