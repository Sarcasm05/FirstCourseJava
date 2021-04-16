package main.java.profession.level2.lesson2;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(int i, int j){
        super("Нельзя преобразовать строку с индексом [" + i + "][" + j +"] в Integer");
    }
}
