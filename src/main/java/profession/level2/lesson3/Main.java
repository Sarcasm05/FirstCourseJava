package main.java.profession.level2.lesson3;

/*
1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер
телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще
дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.).
Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().
 */


import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ваня","Помидор","Ваня","Огурец", "Ваня"));
        Map<String, Integer> map = countWords(list);
        for (Map.Entry<String, Integer> pair: map.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        System.out.println();

        PhoneBook book = new PhoneBook();
        book.add("Иванов", "+7823513");
        book.add("Иванов", "+533334");
        book.add("Сидоров", "+523513");
        book.add("Сидоров", "+13212352");

        book.get("Иванов");
        book.get("Сидоров");
    }

    public static HashMap<String, Integer> countWords(ArrayList<String> list){
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for (String s: list){
            result.put(s, Collections.frequency(list, s));
        }
        return result;
    }
}
