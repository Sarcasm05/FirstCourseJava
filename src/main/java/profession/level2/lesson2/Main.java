package main.java.profession.level2.lesson2;

/*
Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).
Заметка: Для преобразования строки к числу используйте статический метод класса Integer:
Integer.parseInt(сюда_подать_строку);
Заметка: Если Java не сможет преобразовать входную строку (в строке число криво написано),
то будет сгенерировано исключение NumberFormatException.

 */

public class Main {
    public static void main(String[] args) {
        //String[][] arr = new String[4][4];
        String[][] arr = {{"1234","1234","1234","1234"},{"1234","1224","1534","1234"},{"1234","1234","1234","1234"},{"1234","1234","1234","1234"}};
        int sumArrInt = convertingIntAmountArr(arr);
        System.out.println("Сумма = " + sumArrInt);
    }

    public static int convertingIntAmountArr(String[][] array) {
        if (array.length != 4)
            throw new MyArraySizeException();

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4){
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try{
                    sum += Integer.parseInt(array[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;

    }
}


