package org.example;

public class Student {
    private String id;
    private String name;

    @Override
    public String toString() {
        return "Student : " + id + " - " + name;
    }

    public Student(){

    }

    //Constructor가 하나라도 있으면 Java가 자동으로 만들어주지 않는다.
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
