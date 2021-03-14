package main.java.profession.level1.lesson6;
/*
Создать классы Собака и Кот с наследованием от класса Животное.
Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
плавание: кот не умеет плавать, собака 10 м.).
* Добавить подсчет созданных котов, собак и животных.
*/

public abstract class Animal {
    protected String name;
    protected static int counter = 0;

    public Animal(String name) {
        this.name = name;
        counter++;
    }

    protected static void printCountAnimals(){
        System.out.println("Вы создали " + counter + " животных");
    };

    protected void run(int length){
        System.out.println(name + " пробежал " + length + " м");
    }

    protected void swim(int length){
        System.out.println(name + " пропыл " + length + " м");
    }

}

