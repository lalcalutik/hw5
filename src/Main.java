public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Задача 1");
        byte  clientOS = 1;
        int   clientDeviceYear = 2016;

        switch (clientOS) {
            case 0: {
                System.out.println("«Установите версию приложения для iOS по ссылке»");
            }
            break;
            case 1: {
                System.out.println("«Установите версию приложения для Android по ссылке»");
            }
            break;
            default:
                System.out.println("У Вашего устройства обнаружена неподдерживаемая OS");
        }

    }
    public static void task2() {
        System.out.println("Задача 2");
        byte  clientOS = 0;
        int   clientDeviceYear = 2015;

        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("«Установите облегченную версию приложения для iOS по ссылке»");
                } else {
                    System.out.println("«Установите версию приложения для iOS по ссылке»");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("«Установите облегченную версию приложения для Android по ссылке»");
                } else {
                    System.out.println("«Установите версию приложения для Android по ссылке»");
                }
                break;
            default:
                System.out.println("У Вашего устройства обнаружена неподдерживаемая OS");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2021;
        boolean everyFourthYear = (year % 4) == 0;
        boolean everyHundredthYear = (year % 100) == 0;
        boolean everyFourHundredthYear = (year % 400) == 0;

        if (everyFourthYear && !everyHundredthYear) {
            System.out.println(year + " год является високосным");
        } else if (everyHundredthYear && everyFourHundredthYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        byte minimalDeliveryTime = 1;
        boolean distanceWithin20km = deliveryDistance < 20;
        boolean distanceBetween20And60km = deliveryDistance >=20 && deliveryDistance < 60;
        boolean distanceBetween60And100km = deliveryDistance >=60 && deliveryDistance <= 100;
        boolean distanceOver100km = deliveryDistance > 100;

        if (distanceWithin20km) {
            System.out.println("Потребуется дней: " + minimalDeliveryTime);
        } else if (distanceBetween20And60km) {
            System.out.println("Потребуется дней: " + (minimalDeliveryTime + 1));
        } else if (distanceBetween60And100km) {
            System.out.println("Потребуется дней: " + (minimalDeliveryTime + 2));
        } else if (distanceOver100km) {
            System.out.println("Доставки нет");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte monthNumber = 12;


        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                    System.out.println("Зима");
                    break;
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                    System.out.println("Весна");
                    break;
                case 4:
                    System.out.println("Весна");
                    break;
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                    System.out.println("Лето");
                    break;
                case 7:
                    System.out.println("Лето");
                    break;
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                    System.out.println("Осень");
                    break;
                case 10:
                    System.out.println("Осень");
                    break;
                case 11:
                    System.out.println("Осень");
                    break;
                case 12:
                    System.out.println("Зима");
                    break;
            }

        } else {
            System.out.println("Такого месяца не существует");
        }
    }
}