public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;

        float f = 1.0f;
        double d = 2.0;

        boolean bool = true;
        char c = 'C';

    }

    public static void task2() {
        double firstBoxer = 78.2;
        double secondBoxer = 82.7;
        double difference = Math.abs(firstBoxer - secondBoxer);
        double total = firstBoxer + secondBoxer;

        System.out.println(total);
        System.out.println(difference);

    }

    public static void task3() {
        int banana = 5;
        int bananaWeight = 80;
        int milk = 200 / 100;
        int milkWeight = 105;
        int icecream = 2;
        int icecreamWeight = 100;
        int eggs = 4;
        int eggsWeight = 70;
        int total = (banana * bananaWeight) + (milk * milkWeight) + (icecream * icecreamWeight) + (eggs * eggsWeight);
        int gramsInKg = 1000;
        double totalKgs = total / (gramsInKg * 1.0);
        System.out.println(totalKgs);

    }

    public static void task4() {
        int weight = 7;
        int gramsInKg = 1000;
        int weightInGrams = weight * gramsInKg;
        int minGramPerDay = 250;
        int maxGramPerDay = 500;
        int minDays = weightInGrams / maxGramPerDay;
        int maxDays = weightInGrams / minGramPerDay;
        double avgDays = (minDays + maxDays) / 2d;
        System.out.println("Min:" + minDays);
        System.out.println("Max:" + maxDays);
        System.out.println("Avg:" + avgDays);
    }

    public static void task5() {
        int percent = 10;
        double multiplier = percent / 100d;
        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;
        int mashaNewSalary = (int) (mashaSalary + (mashaSalary * multiplier));
        int denisNewSalary = (int) (denisSalary + (denisSalary * multiplier));
        int kristinaNewSalary = (int) (kristinaSalary + (kristinaSalary * multiplier));

        int mashaDifference = (mashaNewSalary - mashaSalary) * 12;
        int denisDifference = (mashaNewSalary - mashaSalary) * 12;
        int kristinaDifference = (kristinaNewSalary - kristinaSalary) * 12;
        System.out.println("Маша теперь получает" + mashaNewSalary + " рублей. Годовой доход вырос на" + mashaDifference + " рублей");
        System.out.println("Денис теперь получает" + denisNewSalary + " рублей. Годовой доход вырос на" + denisDifference + " рублей");
        System.out.println("Кристина теперь получает" + kristinaNewSalary + " рублей. Годовой доход вырос на" + kristinaDifference + " рублей");
    }


}
