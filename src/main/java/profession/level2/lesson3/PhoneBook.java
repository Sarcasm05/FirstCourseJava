package main.java.profession.level2.lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, ArrayList> book;

    public PhoneBook(){
        this.book = new HashMap<String, ArrayList>();
    }

    public void add(String surname, String number){
        if (!book.containsKey(surname)){
            ArrayList<String> listNumbers = new ArrayList<String>();
            listNumbers.add(number);
            book.put(surname, listNumbers);
        }else {
            book.get(surname).add(number);
        }

    }

    public void get(String surname){
        StringBuilder stringBuilder = new StringBuilder();
        for (HashMap.Entry<String, ArrayList> pair: book.entrySet()){
            if (pair.getKey().contains(surname)){
                stringBuilder.append(surname + "\n");
                for (Object s : pair.getValue()) {
                    stringBuilder.append(s);
                    stringBuilder.append("\n");
                }
            }
        }
        System.out.println(stringBuilder.toString());
    }

}
