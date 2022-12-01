package org.example;

public class Person {
    private final String name;
    private final int age;
    private final int salary;
    private Gender gender;
    public Person(String name, int age, int salary, Gender gender){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getSalary(){
        return salary;
    }
    public Gender getGender() { return  gender; }
}
