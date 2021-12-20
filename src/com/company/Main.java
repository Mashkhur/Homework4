package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого мужчины");
        String man = scanner.next();

        System.out.println("Введите имя второго мужчины");
        String man2 = scanner.next();

        System.out.println("Введите имя третего мужчины");
        String man3 = scanner.next();

        System.out.println("Введите имя четвертого мужчины");
        String man4 = scanner.next();

        System.out.println("Введите имя пятого мужчины");
        String man5 = scanner.next();

        ArrayList<String> men = new ArrayList<>();
        men.add("Барс");
        men.add("Алияр");
        men.add("Акыл");
        men.add("Миша");
        men.add("Рома");

        System.out.println(men);

        System.out.println("Введите имя первого женшины");
        String woman1 = scanner.next();

        System.out.println("Введите имя второго женшины");
        String woman2 = scanner.next();

        System.out.println("Введите имя третего женшины");
        String woman3 = scanner.next();

        System.out.println("Введите имя четвертого женшины");
        String woman4 = scanner.next();

        System.out.println("Введите имя пятого женшины");
        String woman5 = scanner.next();

        ArrayList<String> women = new ArrayList<>();
        women.add("Мээргуль");
        women.add("Алия");
        women.add("Настя");
        women.add("Камила");
        women.add("Бегимай");

        Collections.reverse(women);

        men.addAll(women);

        ArrayList<String> people = new ArrayList<>();
        int countMen = 0;
        int countWomen = 0;

        for (int i = 0; i < (men.size()); i++) {
            if ((i % 2) == 0){
                people.add(men.get(countMen));
                countMen++;
            }else {
                people.add(women.get(countWomen));
                countWomen++;
            }
        }
        System.out.println("Список С" + people);

        people.sort(Comparator.comparing(String :: length));

        System.out.println("Отсортированный список" + people);
    }
}
