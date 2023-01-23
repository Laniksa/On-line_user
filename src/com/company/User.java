package com.company;

public class User {
    private String name;
    private String surname;
    private String email;

    public User(String name, String surname,String email){
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String toString(){
        return "on-line пользователь: " +
                "Номер:"+Main.count +
                "Имя: " + name +
                "Фамилия: " + surname +
                "Email: " + email;
    }

}
