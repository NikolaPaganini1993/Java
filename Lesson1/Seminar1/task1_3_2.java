// Задать целочисленный массив состоящий из элементов 0 и 1.
// С помощью цикла заменить 0 на 1 и 1 на 0.
package Lesson1.Seminar1;
import java.util.Random;
public class task1_3_2 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
            System.out.println(arr[i]);            
        }
    }    
}