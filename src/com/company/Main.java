package com.company;

public class Main {
    public static int count = 0;
    public static int numberUser = 0;
    public static int maxUser = 10;
    public static User listUser[] = new User[maxUser];

    public static User[] addListUser(User tempUser){
        listUser [numberUser] = tempUser;
        numberUser++;
        return listUser;
    }

    public static void info(User users[]){

        for(int i = 0; i < numberUser; i++){
            count++;
            System.out.println(User.toString(listUser[i]));
        }

    }


    public static void main(String[] args) {
        User user1 = new User("Мария","Сидорова","sidorava@mail.ru");
        User user2 = new User("Иван", "Петров", "petrov@mail.u");
        User user3 = new User("Антон", "Вареников", "varenikov@mail.u");

        addListUser(user1);
        addListUser(user2);
        addListUser(user3);


        info(listUser);


    }
}
