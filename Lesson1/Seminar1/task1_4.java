// Напишите метод, который находит самую длинную строку 
// общего префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".

package Lesson1.Seminar1;

public class task1_4 {
    public static void main(String[] args) {
        String[] arr = new String[]{"abc", "abcdefg", "abcde", "accdefffff", "dfabcthrq"}; //создаём массив строк
        String temp = ""; //создаём пустую строку temp
        String pref = "abc"; //создаём строку-префикс со вложенной строкой
        for (int i = 0; i < arr.length; i++) {        //перебираем все элементы массива
            if (arr[i].contains(pref)) {              //если arr[i] содержит pref
                if (temp.length() < arr[i].length()) {//если длина строки arr[i] больше, чем длина строки temp
                    temp = arr[i];                    //то temp заменяем на arr[i] 
                }
            }
        }
        System.out.println(temp);
    }
}
