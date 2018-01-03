package com.firestore.joseph.firestorefirsttry;

/**
 * Created by joseph on 03/01/18.
 */

public class Student {
    int age;
    String capital;
    String firstName;
    String lastName;
    int ph;


    public Student() {
    }

    public Student(int age, String capital, String firstName, String lastName, int ph) {
        this.age = age;
        this.capital = capital;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ph = ph;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPh() {
        return ph;
    }

    public void setPh(int ph) {
        this.ph = ph;
    }
}
