package Lesson1;

// public class program {
//     public static void main(String[] args) {
        // System.out.println("Hello world!!!"); //система выводит на экран 

        // String s = " 2";
        // System.out.println(s);  

        // String a = null; 
        // System.out.println(a);

        // short age = 10;
        // int salary = 123456;
        // System.out.println(age);
        // System.out.println(salary);

        // float e = 2.7f;
        // double pi = 3.1415;
        // System.out.println(e);
        // System.out.println(pi);

        // char ch = '2';
        // System.out.println(ch);
        // System.out.println(Character.isDigit(ch)); //true

        // char cha = 123;
        // System.out.println(cha);
        // System.out.println(Character.isDigit(cha)); //true
        // cha = 'a';
        // System.out.println(ch);
        // System.out.println(Character.isDigit(cha)); //false

        // boolean flag1 = 123 <= 234;
        // System.out.println(flag1);   //true
        // boolean flag2 = 123 >= 234 || flag1;
        // System.out.println(flag2);   //true
        // boolean flag3 = flag1 ^ flag2;
        // System.out.println(flag3);   //true

        // boolean f = true && false;
        // System.out.println(f);

        // String msg = "Hello world!";
        // System.out.println(msg);

        // var a = 123;
        // System.out.println(a); // 123
        // var d = 123.456;
        // System.out.println(d); // 123.456
        // System.out.println(getType(a)); // Integer
        // System.out.println(getType(d)); // Double
        // d = 1022;
        // System.out.println(d); // 1022

        // int i = 123;
        // System.out.println(Integer.MAX_VALUE);
        
        // String s = "qwerty";
        // System.out.println(s.charAt(1));

        // int a = 123;
        // a++;
        // System.out.println(a);

        // int a = 123;
        // System.out.println(a++);
        // System.out.println(a);

        // int a = 123;
        // System.out.println(++a);
        // System.out.println(a);

        // boolean f = 123 < 234;
        // System.out.println(f);

        // Побидовый сдвиг
        // int a = 18; //1000
        // a = a << 1;
        // System.out.println(a << 1);
        //1000 -> свдвигаем на один бит влево -> 10000

        // int a = 5; //101
        // int b = 2; //010
        // System.out.println(a | b); //111 | - или
        // int a = 5; //101
        // int b = 2; //010
        // System.out.println(a & b); //000 & - и
        // int a = 5; //101
        // int b = 2; //010
        // System.out.println(a ^ b); //111    | - разделительное или

        // boolean a = true;
        // boolean b = true;
        // System.out.println(a & b);
        // System.out.println(a && b);

        // String s = "qwer"; // 4, 0...3
        // boolean b = s.length() >= 5 && s.charAt(4) == '1'; 
        // System.out.println(b);

        // &, && - и (работает тогда, когда оба истинно)
        // String s = "qwwe1"; // 5, 0...4
        // boolean b = s.length() >= 5 && s.charAt(4) == '1'; 
        // System.out.println(b);

        // String s = "qwe1"; // 4, 0...3
        // boolean b = s.length() >= 5 & s.charAt(4) == '1'; 
        // System.out.println(b);

        // |, || - или (работает тогда, когда хотя бы одно истинно)
        // String s = "qwwe1"; // 4, 0...3
        // boolean b = s.length() >= 5 || s.charAt(4) == '1'; 
        // System.out.println(b);
        
        // Массивы.
        // int[] arr = new int[10]; //задаём длину массивы (изначально все цифры по умолчанию нули)
        // System.out.println(arr.length); //10
        // arr[3] = 18;
        // System.out.println(arr[3]);

        // int[] arr = new int[] { 1, 2, 3, 4, 5}; //задаём массив, с пользовательскими цифрами, длину массива задавать не надо, её Java сам определит) 
        // System.out.println(arr.length); //5
        // System.out.println(arr[3]);

        // Многомерные массивы.
        // int[] arr[] = new int[3][5]; //задаём количество строк (3) и столбцов(5)
        // for (int[] line : arr) {
        //     for (int item : line) {
        //         System.out.printf("d", item);
        //     }
        //     System.out.println();
        // }

        // int [][] arr = new int[3][5];
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         System.out.printf("d", arr[i][j]);
        //     }   \

        // Преобразования.
    //     int i = 123; double d = i;
    //     System.out.println(i); // 123
    //     System.out.println(d); // 123.0
    //     d = 3.1415; i = (int)d; 
    //     System.out.println(d); // 3.1415
    //     System.out.println(i); // 3
    //     d = 3.9415; i = (int)d; 
    //     System.out.println(d); // 3.9415
    //     System.out.println(i); // 3
    //     byte b = Byte.parseByte("123"); 
    //     System.out.println(b); //123
    //     b = Byte.parseByte("1234");
    //     System.out.println(b); // NumberFormatException: Value out of range
    //     // тип данных byte позволяет хранить данные только от 0 до 255
    //     }
    // }
    // static String getType(Object o){
    //     return o.getClass().getSimpleName();
    //     }

    // Получение данных из терминала
// import java.util.Scanner; //(чтобы забрать что-то из терминала, нужно снчала импортировать java.util.Scanner)
// public class Program {
//     public static void main(String[] args) {
        // Scanner iScanner = new Scanner(System.in); // определяем переменную класса Scanner, а в качестве аргумента System.in
        // System.out.printf("name : ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // iScanner.close();

        // Некоторые примитивы
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // int x = iScanner.nextInt();
        // System.out.printf("double a: ");
        // double y = iScanner.nextDouble();
        // System.out.printf("%d + %f = %f", x, y, x + y);
        // iScanner.close();

        // Проверка на соответствие получаемого типа
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        // int i = iScanner.nextInt();
        // System.out.println(i);
        // iScanner.close();

        // Форматированный вывод
        // int a = 1, b = 2;
        // int c = a + b;
        // String res = a + " + " + b + " = " + c;
        // System.out.println(res);

        // String s = "qwe";
        // int a = 123;
        // String q = s + a;
        // System.out.println(q);

        // Виды спецификаторов
        // %d: целочисленных значений
        // %x: для вывода шестнадцатеричных чисел
        // %f: для вывода чисел с плавающей точкой
        // %e: для вывода чисел в экспоненциальной форме,
        // например, 3.1415e+01
        // %c: для вывода одиночного символа
        // %s: для вывода строковых значений
        // float pi = 3.1415f;
        // System.out.printf("%f\n", pi);   // 3.141500
        // System.out.printf("%.2f\n", pi);   // 3.14
        // System.out.printf("%.3f\n", pi);   // 3.141
        // System.out.printf("%e\n", pi);   // 3,141500e+00
        // System.out.printf("%.2e\n", pi);   // 3,14e+00
        // System.out.printf("%.3e\n", pi);   // 3,141e+00

        // Область видимости переменных
        // У переменных существует понятие «область видимости».
        // Если переменную объявили внутри некоторого блока фигурных скобок { },
        // то снаружи этого блока переменная будет недоступна.
        // int b = 111;
        // {
        //     int a = 222;
        //     System.out.println(a + b);
        // }
        // int a = 132;
        // System.out.println(a);

        // Функции и методы
        // Функции и методы — это технически одно и то же. Функции могут
        // не принадлежать классам, а методы принадлежат.
        // В java все функции являются методами.
        // Описание
        // Вызов
        // Возвращаемое значение
        // Рекурсия
//     }
// }
// public class program {
//     static void sayHi() {
//     System.out.println("hi!");
//     }
//     static int sum(int a, int b) {
//     return a+b;
//     }
//     static double factor(int n) {
//     if(n==1)return 1;
//     return n * factor(n-1);
//     }
//     public static void main(String[] args) {
//     sayHi(); // hi!
//     System.out.println(sum(1, 3)); // 4
//     System.out.println(factor(5)); // 120.0
//     }}
   
// public class program {
//     public static void main (String[] args) {
//         lib.sayHi();
//     }
// }
   
// Управляющие конструкции:
// условный оператор
// public class Program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//             c = a;
//         } else {
//             c = b;
//         }
//         System.out.println(c);
//     }
// }
// Сокращенная форма
// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c = 0;
//         if (a > b) c = a;
//         if (b > a) c = b;
//         System.out.println(c);
//         }
//    }
// Тернарные оператор
// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b; // если а > b , вернется a, если нет, то b
//         System.out.println(min);
//         }
//    }

// Оператор выбора
// public class program {
//     public static void main(String[] args) {
//         int text = 5;
//         switch (text) {
//             case 1: 
//                 System.out.println("a");         
//                 break;
//             case 2: 
//                 System.out.println("b");         
//                 break;
//             case 3: 
//             case 4: 
//                 System.out.println("c");         
//                 break;
//             default:
//                 System.out.println("mistake");
//                 break;
//         }       
//     }    
// }
   
// Циклы
// Цикл — это многократное выполнение одинаковой
// последовательности действий.
// В java доступны следующие циклы:
// ● цикл while;
// ● цикл do while;
// ● цикл for; и его модификация for in

// Цикл while
// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;
//         while (value != 0) {
//             value /= 10;
//             count++;
//         }
//         System.out.println(count);     
//     }
// }

// Цикл do while

// public class program {

//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;
//         do {
//         value /= 10;
//         count++;
//         } while (value != 0);
//         System.out.println(count);

//     }
// }

// Циклы
// continue, break
// Операторы для управления циклами — continue и break.
// Выполнение следующей итерации цикла — continue.
// Прерывание текущей итерации цикла — break.
// * ближайшего к оператору
/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//             for (int i = 0; i <= 10; i++) {
//                 if (i % 2 == 0) {
//                 //     continue;
//                 // System.out.println(i); //  1 3 5 7 9
//                        break;
//                 }
//                 System.out.println(i); //  0
//             }
//     }
// }


// Оператор цикла for

// public class program {

//     public static void main(String[] args) {
//         int s = 0;
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(i);
//             s += i;
//         }
//         System.out.println(s);
//     }
// }

// Вложенные циклы
// public class program {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("* ");
//         }
//         System.out.println();
//     }
//     // * * * * *
//     // * * * * *
//     // * * * * *
//     // * * * * *
//     // * * * * *
//     }
//    }

// for :
// Работает только для коллекций
// public class Program {
//     public static void main(String[] args) {
//         int arr[] = new int[10];
//         for (int item : arr) {
//             System.out.printf("%d ", item);
//         }
//         System.out.println();
//     }
// }

// Работа с файлами
// Создание и запись\ дозапись
// import java.io.FileWriter;
// import java.io.IOException;
// public class Program {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     } 
// }
