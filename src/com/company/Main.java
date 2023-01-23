package com.company;

public class Main {
    public static int count = 0;
    //public static int
    public static int maxUser = 10;
    public static User listUser[] = new User[maxUser];

    public static void addListUser(User tempUser){
        listUser [count] = tempUser;
        count++;
        for(int i = 0; i < count; i++){
            //System.out.println();

            //System.out.println(tempUser.toString());
            System.out.println(User.toString(listUser[i]));

        }
        return;
    }

//    public static void info(User users[]){
//        for(int i = 0; i < count; i++){
//            System.out.println(User.toString(listUser[i]));
//        }
//    }


    public static void main(String[] args) {
        User user1 = new User("Мария","Сидорова","sidorava@mail.ru");
        User user2 = new User("Иван", "Петров", "petrov@mail.u");
        User user3 = new User("Антон", "Вареников", "varenikov@mail.u");

        addListUser(user1);
        addListUser(user2);
        addListUser(user3);


        //info(listUser);


    }
}
