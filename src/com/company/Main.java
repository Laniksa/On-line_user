package com.company;

public class Main {
    public static int count = 0;
    public static int maxUser = 10;
    public static User listUser[] = new User[maxUser];

    public static void addListUser(User tempUser){
        listUser [count] = tempUser;
        count++;
        for(int i = 0; i <= count; i++){
            System.out.println(tempUser.toString());
        }
    }

//    public String info(User users[]){
//        for(int i = 0; i <= count; i++){
//            System.out.println(toString());
//        }
//
//        return
//    }


    public static void main(String[] args) {
        User user1 = new User("Мария","Сидорова","sidorava@mail.ru");
        User user2 = new User("Иван", "Петров", "petrov@mail.u");

        addListUser(user1);
        addListUser(user2);


    }
}
