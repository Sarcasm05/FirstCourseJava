package main.java.profession.level1.lesson5;

public class HomeTaskFive {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Рустам", "Разработчик", "123113@mail.com", "243897243897243",160, 22 );
        employees[1] = new Employee("Дима", "Тестировщик", "fasawwe@mail.com", "11117243", 80 ,25 );
        employees[2] = new Employee("Леша", "Аналитик", "asfggg3@mail.com", "132421443897243", 120 ,41 );
        employees[3] = new Employee("Катя", "Архитектор", "vcxbvc@mail.com", "2438972438923412312", 300 ,32 );
        employees[4] = new Employee("Никита", "Технолог", "lkjjasdkds@mail.com", "25325436691231235553", 158 ,55 );

        for (Employee person: employees) {
            if (person.getAge() > 40) {
                person.printInfo();
                System.out.println();
            }
        }
    }
}
