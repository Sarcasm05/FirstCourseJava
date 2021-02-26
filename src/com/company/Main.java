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

        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        array = new byte[]{0};
        byte min = array[0], max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }else if (array[i] < min){
                min = array[i];
            }
        }
    }
    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    // если в массиве есть место, в котором сумма левой и правой части массива равны.
    public static boolean checkBalance(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (counter + arr [i] == sum / 2)
                return true;
            counter += arr[i];
        }
        return false;
    }

    //7. **** Написать метод, которому на вход подается одномерный массив и число n
    // (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
    // Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    public static int[] shiftElementsArray(int[] arr, int n){
        int buff, currIndex, goingIndex;

        for (int i = 0; i < divisor(n, arr.length); i++) {
            buff = arr[i];
            currIndex = i;
            if (n > 0) {
                while (true){
                    goingIndex = currIndex + n;
                    if (goingIndex >= arr.length){
                        goingIndex -= arr.length;
                    }
                    if (goingIndex == i){
                        break;
                    }
                    arr[currIndex] = arr[goingIndex];
                    currIndex = goingIndex;
                }
            }else if (n < 0){
                while (true){
                    goingIndex = currIndex + n;
                    if (goingIndex < 0){
                        goingIndex += arr.length;
                    }
                    if (goingIndex == i){
                        break;
                    }
                    arr[currIndex] = arr[goingIndex];
                    currIndex = goingIndex;
                }
            }
        }
        return arr;

    }

    //Наибольший общий делитель, алгоритм Евклида
    public static int divisor(int x, int y){
        if (y == 0){
            return 0;
        }else {
            return divisor(y, x % y);
        }
    }
}
