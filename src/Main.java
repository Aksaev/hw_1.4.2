public class Main {
    public static void main(String[] args) {
//        System.out.println("Домашнее задание - 1");
//        hw1_Task1();
//        hw1_Task2();
//        hw1_Task3();
        System.out.println("Домашнее задание - 2");
//        hw2_Task1();
//        hw2_Task2();
        hw2_Task3();
//
//        System.out.println("Домашнее задание - 3");

    }

    // Домашнее задание - 1
    // Задание 1
    public static void hw1_Task1() {
        System.out.println("Задание 1");

        int salary = 2_459_000;
        int total = 0;
        int month = 0;

        while (total < salary) {
            total = total + salary / 100;
            month++;
        }
        System.out.println("Месяц №_" + month + ", Сумма накоплений равна " + total + " рублей.");
        System.out.println("--------");
    }

    // Задание 2
    public static void hw1_Task2() {
        System.out.println("Задание 2");

        int i = 1;

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");

        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n--------");
    }

    // Задание 3
    public static void hw1_Task3() {
        System.out.println("Задание 3");

        int population = 12_000_000;
        int birthRate = population / 1000 * 17;
        int mortality = population / 1000 * 8;
        int year = 0;

        while (year < 10) {
            population = population + birthRate - mortality;
            year++;
        }
        System.out.println("Год " + year + ", численность населения составляет " + population + " человек." );
        System.out.println("--------");
    }

    // Домашнее задание - 2
    // Задание 1
    public static void hw2_Task1() {
        System.out.println("Задание 4");

        int depositAmount = 15_000;
        int depositBank = depositAmount / 100 * 7; // 7%
        int total = 12_000_000;
        int month = 0;

        while (depositAmount <= total) {
            depositAmount = depositAmount + depositBank;
            month++;
            System.out.println("Месяц №_" + month + ", сумма накоплений равна " + depositAmount + " рублей.");
        }
        System.out.println("--------");
    }

    // Задание 2
    public static void hw2_Task2() {
        System.out.println("Задание 4");

        int depositAmount = 15_000;
        int depositBank = depositAmount / 100 * 7; // 7%
        int total = 12_000_000;
        int month = 0;

        while (depositAmount < total) {
            depositAmount = depositAmount + depositBank;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц №_" + month + ", сумма накоплений равна " + depositAmount + " рублей.");
            }
        }
        System.out.println("--------");
    }

    // Задание 3
    public static void hw2_Task3() {
        System.out.println("Задание 3");

        int deposit = 15_000;
        int total = 0;
        int percent = 0;
        int total1 = 0;
        int year = 9;
        int yearInMonths = 9 * 12;
        int month = 0;

        for (int i = 0; i < 3; i++) {
            month++;
            percent = deposit / 100 * 7;
            total = deposit + percent;

            deposit = deposit + (deposit * deposit / 100 * 7) / 100;
            System.out.println(deposit);
            //System.out.println("Месяц " + month + ", сумма накоплений равна " + total1 + " рублей.");
        }
        System.out.println("--------");
    }


}
