package com.company.hometask3;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        String aIanswer = words[rand.nextInt(words.length)];
        System.out.println("Игра УГАДАЙ СЛОВО!!!!!");
        System.out.println("Слово компьютера: " + aIanswer);
        int attemptCounter = 1;
        do {
            System.out.println("Введите слово не длиннее 15 символов только в нижнем регистре: ");
            String answer = input.next();
            if (aIanswer.equals(answer)){
                System.out.println("Вы угадали!");
                System.out.printf("Вы угадали с %d попытки!", attemptCounter);
                break;
            }else{
                int length;
                length = Math.min(aIanswer.length(), answer.length());
                System.out.println("Вы не угадали!");
                for (int i = 0; i < length; i++) {
                    if (aIanswer.charAt(i) == answer.charAt(i))
                        System.out.print(answer.charAt(i));
                    else System.out.print("#");
                }

                for (int i = 0; i < 15 - length; i++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            attemptCounter++;
        }while(true);
        input.close();
    }
}
