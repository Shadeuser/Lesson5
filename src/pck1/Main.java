package pck1;

import java.security.spec.ECParameterSpec;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Employee employee = new Employee("Иванов Иван Иваонович", "Грузчик", "ivan@ivanov.ru", "+7-965-175-3545", 15000, 29);

        Employee[] arEmployee = {
            new Employee("Новиков Владимир Владимирович", "Водитель", "novikov@mail.ru", "+7-950-747-3129", 20000, 47),
            new Employee("Галкина Галина Петрововна", "Бухгалтер", "galkina@mail.ru", "+7-961-849-2354", 25000, 50),
            new Employee("Огоньков Илья Борисович", "Проектировщик", "ogonkov@mail.ru", "7-955-345-4576", 40000, 35),
            new Employee("Возников Сергей Александрович", "Директор", "voznikov@mail.ru", "7-950-351-6472", 70000, 37),
            new Employee("Триадов Сергей Иванович", "Начальник отдела", "triada@mail.ru", "7-980-375-2333", 55000, 41)
        };




        for(Employee emp : arEmployee) {
            if (emp.getAge() > 40 ) {
                emp.getInfo();
                System.out.println();
            }

        }
    }

}
