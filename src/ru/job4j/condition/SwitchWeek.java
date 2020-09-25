package ru.job4j.condition;

public class SwitchWeek {

    public static String nameOfDay(int day) {
        String name = new String("Ошибка");
        if (day < 1 && day > 7) {
            return name;
        } else {
            switch (day) {
                case 1:
                    name = "Monday";
                    break;
                case 2:
                    name = "Tuesday";
                    break;
                case 3:
                    name = "Wednesday";
                    break;
                case 4:
                    name = "Thursday";
                    break;
                case 5:
                    name = "Friday";
                    break;
                case 6:
                    name = "Saturday";
                    break;
                case 7:
                    name = "Sunday";
                    break;
            }
        }
        return name;
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(0));
    }
}
