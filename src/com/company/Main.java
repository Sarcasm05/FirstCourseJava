package com.company;

public class Main {
    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        byte[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (byte i = 0; i < array.length; i++){
            if (array[i] == 0){
                array[i] = 1;
            }else{
                array[i] = 0;
            }
        }

        //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        array = new byte[8];
        for (byte i = 0; i < array.length; i++ ){
            if (i == 0){
                array[i] = 0;
            }else {
                array[i] = (byte) (array[i-1] + 3);
            }
        }

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        array = new byte[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (byte i = 0; i < array.length; i++){
            if (array[i] < 6)
                array[i] *= 2;
        };
        
        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и с помощью цикла(-ов)
        // заполнить его диагональные элементы единицами;
        int m = 9;
        int[][] matrix = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == j ) || (i + j == m - 1)){
                    matrix[i][j] = 1;
                }else{
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }

        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        //array = new byte[]{1, 5, 3, -6, 11, 4, -4, 2, 4, 8, 9, 1};
        array = new byte[]{0};
        System.out.println(array.length);
        byte min = array[0], max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }else if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("max = " + max + " min = " + min);

        int[] testArr = new int[]{2, 2, 2, 1, 2, 2, 10, 1};
        boolean testFlag = checkBalance(testArr);
        System.out.println(testFlag);

    }
    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    // если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    // граница показана символами ||, эти символы в массив не входят.
    public static boolean checkBalance(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        int counter = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (counter + arr [i] == sum / 2)
                return true;
            counter += arr[i];
        }
        return false;
    }

    public static void shiftElementsArray(int[] arr, int n){

    }
    //7. **** Написать метод, которому на вход подается одномерный массив и число n
    // (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
    // Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.
}
