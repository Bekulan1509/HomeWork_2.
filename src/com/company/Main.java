package com.company;

//Домашнее задание

//Создать переменную по имени “name”, которая будет сохранять имя человека.
//Вторая переменная должна содержать возраст человека.
//Третья переменная  - температура на улице сегодня. Так же сохраняем её в переменную.
//Если возраст человека в диапазоне 20-45 лет и на улице температура меньше +30 градусов и больше -20 градусов,
// то можно идти гулять. Если человеку меньше 20 лет и температура больше 0 градусов и меньше 28 градусов можно гулять.
//если человеку больше 45 лет то можно гулять только когда температура больше -10 градусов и меньше 25 градусов


public class Main {

    public static void main(String[] args) {
        josoph();
        bekulan();
        brian();


    }

    public static void bekulan() {
        String name2 = "Bekulan";
        int age2 = 21;
        int temperature2 = 15;
        if (age2 > 20 && age2 < 45 && temperature2 < 25 && temperature2 > 0) {
            System.out.println(" На улице 15 градусов, " + name2 + " может погулять на улице,пусть только наденет теплую одежду😎");


        }

    }


    public static void brian() {
        String name = "Brian";
        int age = 18;
        int temperature = 27;
        if (age < 20 && temperature < 30 && temperature > -20) {

            System.out.println("На улице 27 градусов " + name + " может погулять на улице");

        }
    }

    public static void josoph() {

        String name3 = "Josoph";
        int age3 = 46;
        int temperature3 = 23;
        if (age3 > 45 && temperature3 > 0 && temperature3 < 25) {
            System.out.println("На улице 23 градусов " + name3 + " может погулять на улице");


        }

    }
}




