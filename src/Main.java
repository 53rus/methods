public class Main {
    public static void printSeparator(){
        System.out.println("____________________");
    }

    public static int checkYear(int a) {
        if (a % 4 == 0 && a % 100 != 0  || a % 400 == 0)
            return 0;
        else
            return 1;
    }

    public static int checkOS(int os , int year) {
        int iOS = 0;
        int android = 1;
        if (os == iOS && year <= 2015) {
            return 1;
        }
        else if (os == iOS && year > 2015) {
            return 2;
        }
        else if (os == android && year <= 2015) {
            return 3;
        }
         else if (os == android && year > 2015) {
                   }
        return 4;
    }

    public static int checkDelivery(int distance) {
        if (distance >= 0 && distance < 20) {
            return 1;
        } else if (distance >= 20 && distance < 60) {
            return 2;
        } else if (distance >= 60 && distance < 100) {
            return 3;
        } else if (distance >= 100) {
        }
        return 0;

    }


    public static void main(String[] args) {
        System.out.println("Task1");
        int year = 1965;
        int currentYear = checkYear(year);
        if(currentYear == 0) {
            System.out.println(year + " год является високосным");
        }else {
            System.out.println(year + " год не является високосным");
            printSeparator();
        }
        System.out.println("Task2");
        int clientDeviceYear = 2016;
        int clientOs = 0;
        int resultOfCheck = checkOS(clientOs , clientDeviceYear);
        if (resultOfCheck == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (resultOfCheck == 2) {
            System.out.println("Установите версию приложения для iOS по ссылк");
        } else if (resultOfCheck == 3) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (resultOfCheck == 4) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        printSeparator();
        System.out.println("Task3");
        int deliveryDistance = 111;
        int deliveryDay = checkDelivery(deliveryDistance);
        if (deliveryDay == 0) {
            System.out.println("Доставка не осуществляется на расстояние  " + deliveryDistance + " км");
        } else {
            System.out.println("Потребуется " + deliveryDay + " день для доставки на расстояние " + deliveryDistance + " км");
        }
        printSeparator();
    }
}