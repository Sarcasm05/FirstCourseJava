package com.company;

public class Main {
    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {
        //2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        int a = 0;
        long b = 1;
        short j = 12;
        float pi = 3.14f;
        double e = 2.718281;
        char c = 'x';
        byte d = 2;
        boolean positive = true;
        String firstString = "New String";

        pi = calculate(1.4f, 2.5f, 3.6f,4.7f);
        positive = isSumInRange(4, 5); // x < 10
        positive = isSumInRange(4, 6); // x = 10
        positive = isSumInRange(14, 6); // x = 20
        positive = isSumInRange(13, 8); // x > 20
        positive = isSumInRange(13, 5); // 10 <= x <= 20
        isPositiveOrNegativePrint(1);
        isPositiveOrNegativePrint(-1);
        positive = isPositiveOrNegative(2);
        positive = isPositiveOrNegative(-2);
        greeting("Гейб");
        isLeapYear(2020);
        isLeapYear(2021);
        isLeapYear(2024);
        isLeapYear(2400);
    }

    //3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float calculate(float a, float b, float c, float d) {
            return a * (b + (c / d));
    }

    //4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
    // от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean isSumInRange(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void isPositiveOrNegativePrint(int x){
        if (x >= 0){
            System.out.println("Вы передали положительное число");
        } else {
            System.out.println("Вы передали отрицательное число");
        }
    }

    //6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    // если число отрицательное, и вернуть false если положительное.
    public static boolean isPositiveOrNegative(int x){
        return x < 0;
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void greeting(String name){
        System.out.println("Привет, " + name + "!");
    }

    //8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void isLeapYear(int year){
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)){
            System.out.println(year + " високосный год");
        }else {
            System.out.println(year + " не високосный год");
        }
    }
}
