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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public static String toString(User user){
        return "on-line пользователь: " +
                "Номер:" + Main.count +
                "Имя: " + user.getName() +
                "Фамилия: " + user.getSurname() +
                "Email: " + user.getEmail();
    }

}
