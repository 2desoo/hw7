public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task1() {
        int salary = 15_000, total = 0, months = 0;
        while (total < 2_459_000) {
            total = total + salary;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + total + " рублей.");
        }
    }

    private static void task2() {
        int a = 1, b = 10;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (; b >= 1; b--) {
                System.out.print(b + " ");
        }
        System.out.println();
    }

    private static void task3() {
        int population = 12_000_000;
        double deathRate = 8.0/1000, birthRate = 17.0/1000;
        for (int year = 1; year <= 10; year++) {
            int births =(int) (population * birthRate);
            int deaths =(int) (population * deathRate);
            population += births - deaths;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    private static void task4() {
        int sum = 15000, percent = 7, months = 0, total = 0;
        while (total <= 12_000_000) {
            total = total + sum;
            total = total + (total * percent/100);
            months++;
            System.out.println("Месяц " + months + ". Сумма накоплений составляет " + total);
        }
    }

    private static void task5() {
        int sum = 15000, percent = 7, months = 0, total = 0;
        while (total <= 12_000_000) {
            total = total + sum;
            total = total + (total * percent / 100);
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ". Сумма накоплений составляет " + total);
            }
        }
    }

    private static void task6() {
        int sum = 15000, percent = 7, months = 1, total = 0, year = 9, monthsInYear = 12;
        int totalMonths = year * monthsInYear;
        for (; months <= totalMonths; months++) {
            total = total + sum;
            total = total + (total * percent / 100);
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ". Сумма накоплений составляет " + total);
            }
        }
    }

    private static void task7() {
        int friday = 5, dayInMonths = 31;
        for (; friday <= dayInMonths; friday++) {
            if (friday % 7 == 0) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт");
            }
        }
    }

    private static void task8() {
        int thisYear = 2023, lastYear = thisYear - 200, afterYear = thisYear + 100, comet = 79;
        int yearCounter = 0;
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        int j = 0;
//        while (j < 10) {
//            System.out.println(j);
//            j++;
//        }
//        for (int i = 0; i <= afterYear; i += comet) {
//            if (i >= lastYear) {
//                System.out.println(i);
//            }
//        }
        while (yearCounter <= afterYear) {
            if (yearCounter >= lastYear) {
                System.out.println(yearCounter);
            }
            yearCounter += comet;
        }
    }
}