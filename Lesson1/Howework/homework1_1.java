// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)


package Lesson1.Howework;

import java.util.Scanner;                             //импортируем сканнер

public class homework1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       //добавляем сканнер
        System.out.print("Введите число n: ");     //Выводим сообщение на консоль
        int n = input.nextInt();                      //то что считывается с консоле, записывается в переменную int n 
                                                      //(перед переменной обязательно указывать класс переменной int, float и т.д.)      
        int triangularNum = 0;                        //создаём переменную суммы всех чисел от 1 до n
        for (int i = 1; i <= n; i++) {                //пробегаемся от 1 до n
            triangularNum += i;                       //складываем предыдущее число со следуюшим
        }
        
        System.out.println("Треугольное число, числа" + n + "равняется" + triangularNum);   //выводим на экран, используем "" и +, чтобы соединить текст и значаения переменных
    }
}