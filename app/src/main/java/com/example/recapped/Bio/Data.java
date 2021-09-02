package com.example.recapped.Bio;

public class Data {
    private String name;
    private  String hobbies;

    public Data(String name, String hobbies) {
        this.name = name;
        this.hobbies = hobbies;
    }
    public Data() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }


}
