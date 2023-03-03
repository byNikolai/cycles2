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


    public static void task1 () {
        System.out.println("Задача 1");
        int month = 0;
        int i = 0;
        int goal = 2_459_000;
        int savingsPerMonth = 15_000;
        while(month < goal){
            month = month + savingsPerMonth;
            i++;
        }
        System.out.println("Месяц, " + i + " сумма накоплений равна " + month + " рублей");
    }


    public static void task2 () {
        System.out.println("Задача 2");
        int start = 1;
        while (start <= 10){
            System.out.print( start + " ");
            start++;
        }
        System.out.println(" ");
        for (int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }


    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int  birthRate = 17;
        int deathRate = 8;
        int populationSegment = 1_000;
        int years = 0;
        while(years < 10){
            population = population + (birthRate  * population / populationSegment) - (deathRate * population / populationSegment);
            years++;
            System.out.println("Год " + years + " ,численность населения составляет " + population);
        }


    }


    public static void task4 () {
        System.out.println("Задача 4");
        int total = 15_000;
        float bankPercent = 0.07F;
        int months = 0;
        int goal = 12_000_000;
        while (total < goal){
            System.out.println(total);
            total = (int) (total + (total * bankPercent));
            months ++;
        }
        System.out.println(months + " months needed");
    }


    public static void task5 () {
        System.out.println("Задача 5");
        int total = 15_000;
        float bankPercent = 0.07F;
        int months = 0;
        int goal = 12_000_000;
        while (total < goal) {
            total = (int) (total + (total * bankPercent));
            months++;
            if (months % 6 == 0) {
                System.out.println(total);
            }
        }
        System.out.println(months + " months needed");
    }


    public static void task6 () {
        System.out.println("Задача 6");
        int total = 15_000;
        float bankPercent = 0.07F;
        int monthsTotal = 9 * 12;
        int months = 0;
        while (months <= monthsTotal) {
            total = (int) (total + (total * bankPercent));
            months++;
            if (months % 6 == 0) {
                System.out.println(total);
            }}
    }




    public static void task7 () {
        System.out.println("Задача 7");
        int firstFriday = 5;
        int daysInWeek = 7;
        int daysCount = 1;
        while (daysCount < 31){
            daysCount++;


            if (daysCount == firstFriday){
                System.out.println("its Friday " + daysCount + "th. Report needed!");
                firstFriday = firstFriday + daysInWeek;
            }
        }
    }


    public static void task8 () {
        System.out.println("Задача 8");
        int before200 = 1823;
        int after100 = 2123;
        int cometFrequency = 79;
        int yearCount = before200;
        while (yearCount < after100){
            yearCount++;
            if (yearCount % cometFrequency == 0){
                System.out.println(yearCount);
            }
        }
    }
}
