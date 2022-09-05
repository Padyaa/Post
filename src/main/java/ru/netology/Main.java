package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Andrey";
        post.surname = "Poderechin";
        post.patronymic = "Sergeevich";
        post.phone = "+7-(777)-777-77-77";
        post.passport = "1111-11111111";
        post.subscription = true;
        post.birthday = new FromDate();
        post.birthday.day = 12;
        post.birthday.month = 3;
        post.birthday.year = 1999;
    }
}
