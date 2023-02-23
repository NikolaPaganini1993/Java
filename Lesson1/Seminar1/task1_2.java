// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.

package Lesson1.Seminar1;

public class task1_2 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,1,0,1,1,1}; // создаём массив
        int count = 0; 
        int temp = 0;
        for (int i = 0; i < arr1.length; i++) { // перебираем все i в массиве
            if (arr1[i] == 1) {     //если i = 1
                count += 1;         //тогда count + 1
            } else {                //иначе
                if (temp < count) { //если temp < count 
                    temp = count;   //заменяем temp на count
                }
                count = 0;          //и count делаем 0
            }
            if (temp < count) {     //если temp < count
                temp = count;       //заменяем temp на count
            }
        }
        System.out.println(temp);   //выводим temp
    } 
}
