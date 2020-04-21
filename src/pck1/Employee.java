package pck1;

import java.sql.SQLOutput;

public class Employee {
    private String fullName;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;






    public Employee() {
        this.fullName = "no_name";
        this.post = "no_post";
        this.email = "no@email.ru";
        this.phone = "no_phone";
        this.salary = 0;
        this.age = 0;
    }


    /**
     *  Constructor required (String post, String email, String phone, int salary, int age)
     *  or empty
     */
    public Employee(String fullName, String post, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("Full name: " + this.fullName);
        System.out.println("Post: " + this.post);
        System.out.println("E-mail: " + this.email);
        System.out.println("Phone: " + this.phone);
        System.out.println("Salary:  " + this.salary);
        System.out.println("Age: " + this.age);

    }


    public String getFullName() {
        return fullName;
    }

    public String getPost() {
        return post;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
