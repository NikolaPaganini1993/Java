package Lesson1.Seminar1;

import java.time.LocalDate;
import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        System.out.println("Hello world");
        
        Scanner iScanner = new Scanner(System.in);
        String name = iScanner.nextLine(); // работа с пользователем
        System.out.printf("Привет, %s ", name); // просит тебя написать имя в консоле
        iScanner.close();
        System.out.println(); // пустая строка

        int[] arr1 = new int[10]; // массивы
        int[] arr2 = new int[] {1, 2, 3, 4, 5};
        System.out.printf("Вывод на консоль по индексу, %d, %d", arr1[3], arr2[0]);

        System.out.println(LocalDate.now());
    }    
}
