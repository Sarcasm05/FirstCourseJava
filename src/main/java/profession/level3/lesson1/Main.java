package main.java.profession.level3.lesson1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addItem(new Orange());
        orangeBox.addItem(new Orange());
        System.out.println(orangeBox.getWeight());
        Box<Apple> appleBox = new Box<>();
        appleBox.addItem(new Apple());
        appleBox.addItem(new Apple());
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
        //appleBox.addItem(new Apple());
        System.out.println(appleBox.compare(orangeBox));
        appleBox.pour(orangeBox);
        System.out.println(orangeBox.getWeight());

        /*
        String[] strArr = new String[]{"133","fsdddd","111", "233"};
        for (Object o: strArr) {
            System.out.print(o + " ");
        }
        System.out.println();
        swapArray(strArr, "133", "111");
        for (Object o: strArr) {
            System.out.print(o + " ");
        }
        System.out.println();

        ArrayList newArr = convertToArrayListArray(strArr);
        System.out.println(newArr.getClass().getTypeName());
        for (Object o: newArr) {
            System.out.print(o + " ");
        }
    */
    }

    public static  <T> void swapArray(T[] array, T el1, T el2){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(el1)){
                array[i] = el2;
            }else if (array[i].equals(el2)){
               array[i] = el1;
            }
        }
    }

    public static <T> ArrayList convertToArrayListArray(T[] arr){
        ArrayList newArr = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            newArr.add(arr[i]);
        }
        return newArr;
    }

}
