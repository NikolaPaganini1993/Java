package Lesson1.Seminar1;

import java.util.Scanner; 

public class task1_1 {
    public static void main(String[] args) {      // main
        Scanner iScanner = new Scanner(System.in); //создаём сканер, который потом считывает введенную инфу
        String name = iScanner.nextLine(); // работа с пользователем
        System.out.printf("Привет, %s ", name); // просит тебя написать имя в консоле
        iScanner.close();
    }   
}
