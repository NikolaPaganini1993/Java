// 2. Вывести все простые числа от 1 до 1000

package Lesson1.Howework;

public class homework1_2 {
  public static void main(String[] args) {
      for (int i = 2; i <= 1000; i++) {              //перебираем все числа от 2 (т.к. первое простое число 2) до 1000
          boolean proverka = true;                   //задаём переменную proverka, она будет отвечать на вопрос, простое перед нами число или нет 
          for (int j = 2; j <= Math.sqrt(i); j++) {  //Мы используем цикл for для итерации от 2 до квадратного корня из текущего числа i
              if (i % j == 0) {                      //если i делится на j без остатка
                proverka = false;                    //тогда ставит проверку на отметку Ложь
                  break;                             //заканчиваем с j
              }
          }
          if (proverka) {                            //если proverka True
              System.out.print(i + " ");             //то выводим i с пробелами
          }
      }
  }
}