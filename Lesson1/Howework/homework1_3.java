package Lesson1.Howework;

import java.util.Scanner;

public class homework1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = input.nextDouble();                           //Для работы с вещественными (дробными) числами в Java используется тип double

        System.out.print("Введите второе число: ");
        double num2 = input.nextDouble();                           //nextDouble считывает с консоли дробное число

        System.out.println("Введите операцию (+, -, *, /): ");
        char operator = input.next().charAt(0);              //Символы (тип char) Для хранения символов Java использует специальный тип char. 
                                                                    //char charAt(int index) возвращает значение char по указанному индексу. 
                                                                    //ставим index 0, так как у нас будет только один знак, и он будет 0 по индексу
        double result;                                              //вводим переменную с дробным значением

        switch(operator) {                                          //сравнием значение operator со значениями в кейсах
            case '+':                                               //если в кейсе + 
                result = num1 + num2;                               //то в результат заносим num1 + num2
                break;                                              //закрываем конструкцию switch-case
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:                                                //default - можно понимать, как все остальные случаи
                System.out.println("INVALID OPERATOR121W!");     //если этот случай настал выводим на экран собощение
                return;                                             //return возвращет нас обратно к выбору знака
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}