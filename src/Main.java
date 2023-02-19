import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание 4");

        System.out.println("Задание 1");
        int rub = 1000000;
        System.out.println(rub);
        byte apple = 100;
        System.out.println(apple);
        short lison = 10000;
        System.out.println(lison);
        long life = 1000000000L;
        System.out.println(life);
        float pi = 3.14f;
        System.out.println(pi);
        double year = 3.15;
        System.out.println(year);

        System.out.println("Задание 2");

        float guru = 27.12f;
        System.out.println(guru);
        long look = 987678965549L;
        System.out.println(look);
        double like = 2.786;
        System.out.println(like);
        short li = 569;
        System.out.println(li);
        short di = -159;
        System.out.println(di);
        int hiPi = 27897;
        System.out.println(hiPi);
        byte ni = 67;
        System.out.println(ni);

        System.out.println("Задание 3");

        byte ludmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        short papers = 480;
        int totalStudents = ludmila + anna + ekaterina;
        int totalList = papers / totalStudents;
        System.out.println("На каждого ученика рассчитано " + totalList + " листов бумаги.");

        System.out.println("Задание 4");

        byte pro = 16;
        byte time = 2;
        int oneTime = pro / time;
        byte min = 20;
        int twenty = min * oneTime;
        byte hour = 60;
        byte hours = 24;
        int day = (oneTime * hour) * hours;
        byte three = 3;
        int threeDay = day * three;
        byte month = 30;
        int oneMonth = day * month;

        System.out.println("За 20 минут машина произвела " + twenty + " штук бутылок.");
        System.out.println("За сутки машина произвела " + day + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + threeDay + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + oneMonth + " штук бутылок.");

        System.out.println("Задание 5");

        byte white = 2;
        byte brown = 4;
        byte pot = 120;
        int oneClass = white + brown;
        int klass = pot / oneClass;
        int whitePot = white * klass;
        int brownPot = brown * klass;
        System.out.println("В школе, где " + klass + " классов, нужно " + whitePot + " банок белой краски и " + brownPot + " банок коричневой краски.");

        System.out.println("Задание 6");

        byte fiveBanana = 5;
        byte banana = 80;
        int totalBanana = fiveBanana * banana;
        short milk = 105 * 2;
        short ice = 100 * 2;
        short eggs = 4 * 70;
        int wtGr = eggs + ice + milk + totalBanana;
        int grPerKg = 1000;
        float weightKg = wtGr / (float)grPerKg;
        System.out.println("Вес спортзавтрака равен " + wtGr + " грамм");
        System.out.println("Вес спортзавтрака равен " + weightKg + " килограмм");

        System.out.println("Задание 7");

        short numberOne = 250;
        short numberTwo = 500;
        byte weight = 7;
        short weightGr = 1000;
        int totalGr = weightGr * weight;
        int optionOne = totalGr / numberOne;
        int optionTwo = totalGr / numberTwo;
        int optionOneTwo = optionTwo + optionOne;
        int average = optionOneTwo / 2;
        System.out.println("Спортсмену нужно " + optionOne + " дней, если он будет терять каждый день по " + numberOne + " грамм.");
        System.out.println("Спортсмену нужно " + optionTwo + " дней, если он будет терять каждый день по " + numberTwo + " грамм.");
        System.out.println("Спортсмену нужно " + average + " дней в среднем, чтобы добиться результата похудения.");

        System.out.println("Задание 8");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        byte oneYear = 12;
        double percent = 0.1;
        double mashaPercent = masha * percent;
        double denisPercent = denis * percent;
        double kristinaPercent = kristina * percent;
        double newMasha = masha + mashaPercent;
        double newDenis = denis + denisPercent;
        double newKristina = kristina + kristinaPercent;
        double moy = mashaPercent * oneYear;
        double doy = denisPercent * oneYear;
        double koy = kristinaPercent * oneYear;
        System.out.println("Маша теперь получает " + newMasha + " рублей. Годовой доход вырос на " + moy + " рублей.");
        System.out.println("Денис теперь получает " + newDenis + " рублей. Годовой доход вырос на " + doy + " рублей.");
        System.out.println("Кристина теперь получает " + newKristina + " рублей. Годовой доход вырос на " + koy + " рублей.");












    }
}
