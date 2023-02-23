// Во фразе "Добро пожаловать на курс по Java" 
// переставить слова в обратном порядке.

package Lesson1.Seminar1;

import java.util.Arrays;

public class task1_5 {
    public static void main(String[] args) {
        String my_str = "Добро пожаловать на курс по Java"; //создаём массив из строк
        String [] arr = my_str.split(" ");           //разделяем строку на элементы, разделителем является пробел
        String temp = "";                                   //создаём пустую строку с именем temp
        for (int i = 0; i < arr.length/2; i++) {            //пробегаемся до середины массива, так как если мы переставим одну половину, то вторую уже не надо
            temp = arr[i];                                  //назначаем переменной temp значение arr[i]
            arr[i] = arr[arr.length - 1 - i];               //arr[i] назначаем на место arr[arr.length - 1 - i], например arr[0] = arr[6 - 1 - 0], arr[0] ставим на место arr[5]
            arr[arr.length -1 - i] = temp;                  //назначаем на место arr[arr.length -1 - i] переменную temp
        }
        my_str = String.join(" ", arr);           //в нашу строку mt_str вставляем, соединненые через пробел, элементы массива arr
        System.out.println(my_str);                         //выводим строку my_str
        // System.out.println(Arrays.toString(arr));
    }
}
