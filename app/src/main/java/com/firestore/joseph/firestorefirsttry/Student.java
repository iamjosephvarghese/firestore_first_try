package com.firestore.joseph.firestorefirsttry;

/**
 * Created by joseph on 03/01/18.
 */

public class Student {
    int age;
    Boolean capital;
    String firstName;
    String lastName;
    String ph;


    public Student() {
    }

    public Student(int age, Boolean capital, String firstName, String lastName, String ph) {
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

    public Boolean getCapital() {
        return capital;
    }

    public void setCapital(Boolean capital) {
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

    public String  getPh() {
        return ph;
    }

    public void setPh(String  ph) {
        this.ph = ph;
    }
}
